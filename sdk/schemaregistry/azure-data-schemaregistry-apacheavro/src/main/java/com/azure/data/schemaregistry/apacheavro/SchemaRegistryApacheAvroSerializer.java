// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.schemaregistry.apacheavro;

import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.ObjectSerializer;
import com.azure.core.util.serializer.TypeReference;
import com.azure.data.schemaregistry.SchemaRegistryAsyncClient;
import com.azure.data.schemaregistry.models.SchemaFormat;
import com.azure.data.schemaregistry.models.SchemaProperties;
import org.apache.avro.Schema;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;

import static com.azure.core.util.FluxUtil.monoError;

/**
 * Schema Registry-based serializer implementation for Avro data format using Apache Avro.
 */
public final class SchemaRegistryApacheAvroSerializer implements ObjectSerializer {

    static final byte[] RECORD_FORMAT_INDICATOR = new byte[]{0x00, 0x00, 0x00, 0x00};
    static final int SCHEMA_ID_SIZE = 32;
    static final int RECORD_FORMAT_INDICATOR_SIZE = 4;

    private final ClientLogger logger = new ClientLogger(SchemaRegistryApacheAvroSerializer.class);
    private final SchemaRegistryAsyncClient schemaRegistryClient;
    private final AvroSerializer avroSerializer;
    private final SerializerOptions serializerOptions;

    /**
     * Creates a new instance.
     *
     * @param schemaRegistryClient Client that interacts with Schema Registry.
     * @param avroSerializer Serializer implemented using Apache Avro.
     * @param serializerOptions Options to configure the serializer with.
     */
    SchemaRegistryApacheAvroSerializer(SchemaRegistryAsyncClient schemaRegistryClient,
        AvroSerializer avroSerializer, SerializerOptions serializerOptions) {
        this.schemaRegistryClient = Objects.requireNonNull(schemaRegistryClient,
            "'schemaRegistryClient' cannot be null.");
        this.avroSerializer = Objects.requireNonNull(avroSerializer,
            "'avroSchemaRegistryUtils' cannot be null.");
        this.serializerOptions = Objects.requireNonNull(serializerOptions, "'serializerOptions' cannot be null.");
    }

    /**
     * Deserializes the {@code inputStream} into a strongly-typed object.
     *
     * @param inputStream The stream to read from.
     * @param typeReference Type reference of the strongly-typed object.
     * @param <T> Strongly typed object.
     *
     * @return The deserialized object. If {@code inputStream} is null then {@code null} is returned.
     *
     * @throws NullPointerException if {@code typeReference} is null.
     */
    @Override
    public <T> T deserialize(InputStream inputStream, TypeReference<T> typeReference) {
        return deserializeAsync(inputStream, typeReference).block();
    }

    /**
     * Deserializes the {@code inputStream} into a strongly-typed object.
     *
     * @param inputStream The stream to read from.
     * @param typeReference Type reference of the strongly-typed object.
     * @param <T> Strongly typed object.
     *
     * @return A Mono that completes with the deserialized object. If {@code inputStream} is null, then Mono completes
     *     with an empty Mono.
     *
     * @throws NullPointerException if {@code typeReference} is null.
     */
    @Override
    public <T> Mono<T> deserializeAsync(InputStream inputStream, TypeReference<T> typeReference) {
        if (inputStream == null) {
            return Mono.empty();
        }

        if (typeReference == null) {
            return monoError(logger, new NullPointerException("'typeReference' cannot be null."));
        }

        return Mono.fromCallable(() -> {
            byte[] payload = new byte[inputStream.available()];
            while (true) {
                if (inputStream.read(payload) == -1) {
                    break;
                }
            }
            return payload;
        })
            .flatMap(payload -> {
                if (payload.length == 0) {
                    return Mono.empty();
                }

                final ByteBuffer buffer = ByteBuffer.wrap(payload);
                final byte[] recordFormatIndicator = new byte[RECORD_FORMAT_INDICATOR_SIZE];

                buffer.get(recordFormatIndicator);

                if (!Arrays.equals(recordFormatIndicator, RECORD_FORMAT_INDICATOR)) {
                    return Mono.error(
                        new IllegalStateException("Illegal format: unsupported record format indicator in payload"));
                }

                final String schemaId = getSchemaIdFromPayload(buffer);

                return this.schemaRegistryClient.getSchema(schemaId)
                    .handle((registryObject, sink) -> {
                        byte[] payloadSchema = registryObject.getDefinition().getBytes(StandardCharsets.UTF_8);
                        int start = buffer.position() + buffer.arrayOffset();
                        int length = buffer.limit() - SCHEMA_ID_SIZE;
                        byte[] b = Arrays.copyOfRange(buffer.array(), start, start + length);

                        final T decode = avroSerializer.decode(b, payloadSchema, typeReference);
                        sink.next(decode);
                    });
            });
    }

    /**
     * Serializes the {@code object} into the {@code outputStream}.
     *
     * @param outputStream Output stream to write serialization of {@code object} to.
     * @param object The object to serialize into {@code outputStream}.
     *
     * @throws NullPointerException if {@code outputStream} or {@code object} is null.
     */
    @Override
    public void serialize(OutputStream outputStream, Object object) {
        serializeAsync(outputStream, object).block();
    }

    /**
     * Serializes the {@code object} into the {@code outputStream}.
     *
     * @param outputStream Output stream to write serialization of {@code object} to.
     * @param object The object to serialize into {@code outputStream}.
     *
     * @return A Mono that completes when the object has been serialized into the stream.
     *
     * @throws NullPointerException if {@code outputStream} or {@code object} is null.
     */
    @Override
    public Mono<Void> serializeAsync(OutputStream outputStream, Object object) {
        if (outputStream == null) {
            return monoError(logger, new NullPointerException("'outputStream' cannot be null."));
        }

        if (object == null) {
            return monoError(logger, new NullPointerException(
                "Null object, behavior should be defined in concrete serializer implementation."));
        }

        Schema schema;
        try {
            schema = AvroSerializer.getSchema(object);
        } catch (IllegalArgumentException exception) {
            return monoError(logger, exception);
        }

        final String schemaFullName = schema.getFullName();
        final String schemaString = schema.toString();

        return this.maybeRegisterSchema(serializerOptions.getSchemaGroup(), schemaFullName, schemaString)
            .handle((id, sink) -> {
                ByteBuffer recordFormatIndicatorBuffer = ByteBuffer
                    .allocate(RECORD_FORMAT_INDICATOR_SIZE)
                    .put(new byte[]{0x00, 0x00, 0x00, 0x00});
                ByteBuffer idBuffer = ByteBuffer
                    .allocate(SCHEMA_ID_SIZE)
                    .put(id.getBytes(StandardCharsets.UTF_8));
                try {
                    outputStream.write(recordFormatIndicatorBuffer.array());
                    outputStream.write(idBuffer.array());
                    outputStream.write(avroSerializer.encode(object));
                    sink.complete();
                } catch (IOException e) {
                    sink.error(new UncheckedIOException(e.getMessage(), e));
                }
            });
    }

    /**
     * If auto-registering is enabled, register schema against Schema Registry. If auto-registering is disabled, fetch
     * schema ID for provided schema. Requires pre-registering of schema against registry.
     *
     * @param schemaGroup Schema group where schema should be registered.
     * @param schemaName name of schema
     * @param schemaString string representation of schema being stored - must match group schema type
     *
     * @return string representation of schema ID
     */
    private Mono<String> maybeRegisterSchema(String schemaGroup, String schemaName, String schemaString) {
        if (serializerOptions.autoRegisterSchemas()) {
            return this.schemaRegistryClient
                .registerSchema(schemaGroup, schemaName, schemaString, SchemaFormat.AVRO)
                .map(SchemaProperties::getId);
        } else {
            return this.schemaRegistryClient.getSchemaProperties(
                schemaGroup, schemaName, schemaString, SchemaFormat.AVRO).map(properties -> properties.getId());
        }
    }

    /**
     * @param buffer full payload bytes
     *
     * @return String representation of schema ID
     */
    private static String getSchemaIdFromPayload(ByteBuffer buffer) {
        byte[] schemaGuidByteArray = new byte[SCHEMA_ID_SIZE];
        buffer.get(schemaGuidByteArray);

        return new String(schemaGuidByteArray, StandardCharsets.UTF_8);
    }
}

