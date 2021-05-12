// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.verticals.agrifood.farming;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.experimental.http.DynamicRequest;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.util.serializer.ObjectSerializer;

/** Initializes a new instance of the TillageDataBaseClient type. */
@ServiceClient(builder = FarmBeatsClientBuilder.class)
public final class TillageDataBaseClient {
    private final String endpoint;

    private final String apiVersion;

    private final HttpPipeline httpPipeline;

    private final ObjectSerializer serializer;

    /**
     * Initializes an instance of TillageDataBaseClient client.
     *
     * @param endpoint The endpoint of your FarmBeats resource (protocol and hostname, for example:
     *     https://{resourceName}.farmbeats.azure.net).
     * @param apiVersion Api Version.
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializer The serializer to serialize an object into a string.
     */
    TillageDataBaseClient(String endpoint, String apiVersion, HttpPipeline httpPipeline, ObjectSerializer serializer) {
        this.endpoint = endpoint;
        this.apiVersion = apiVersion;
        this.httpPipeline = httpPipeline;
        this.serializer = serializer;
    }

    /**
     * Returns a paginated list of tillage data resources under a particular farm.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>minTillageDepth</td><td>Double</td><td>Minimum measured tillage depth (inclusive).</td></tr>
     *     <tr><td>maxTillageDepth</td><td>Double</td><td>Maximum measured tillage depth (inclusive).</td></tr>
     *     <tr><td>minTillagePressure</td><td>Double</td><td>Minimum pressure applied by a tillage implement (inclusive).</td></tr>
     *     <tr><td>maxTillagePressure</td><td>Double</td><td>Maximum pressure applied by a tillage implement (inclusive).</td></tr>
     *     <tr><td>sources</td><td>List&lt;String&gt;</td><td>Sources of the operation data.</td></tr>
     *     <tr><td>associatedBoundaryIds</td><td>List&lt;String&gt;</td><td>Boundary IDs associated with operation data.</td></tr>
     *     <tr><td>operationBoundaryIds</td><td>List&lt;String&gt;</td><td>Operation boundary IDs associated with operation data.</td></tr>
     *     <tr><td>minOperationStartDateTime</td><td>OffsetDateTime</td><td>Minimum start date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationStartDateTime</td><td>OffsetDateTime</td><td>Maximum start date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minOperationEndDateTime</td><td>OffsetDateTime</td><td>Minimum end date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationEndDateTime</td><td>OffsetDateTime</td><td>Maximum end date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minOperationModifiedDateTime</td><td>OffsetDateTime</td><td>Minimum modified date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationModifiedDateTime</td><td>OffsetDateTime</td><td>Maximum modified date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minArea</td><td>Double</td><td>Minimum area for which operation was applied (inclusive).</td></tr>
     *     <tr><td>maxArea</td><td>Double</td><td>Maximum area for which operation was applied (inclusive).</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>Ids of the resource.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>Names of the resource.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}".</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>Statuses of the resource.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             tillageDepth: {
     *                 unit: String
     *                 value: Double
     *             }
     *             tillagePressure: (recursive schema, see tillagePressure above)
     *             area: (recursive schema, see area above)
     *             source: String
     *             operationModifiedDateTime: OffsetDateTime
     *             operationStartDateTime: OffsetDateTime
     *             operationEndDateTime: OffsetDateTime
     *             attachmentsLink: String
     *             associatedBoundaryId: String
     *             operationBoundaryId: String
     *             farmerId: String
     *             id: String
     *             eTag: String
     *             status: String
     *             createdDateTime: OffsetDateTime
     *             modifiedDateTime: OffsetDateTime
     *             name: String
     *             description: String
     *             properties: {
     *                 String: Object
     *             }
     *         }
     *     ]
     *     skipToken: String
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param farmerId ID of the associated farmer.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest listByFarmerId(String farmerId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/tillage-data")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Returns a paginated list of tillage data resources across all farmers.
     *
     * <p><strong>Optional Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Optional Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Description</th></tr>
     *     <tr><td>minTillageDepth</td><td>Double</td><td>Minimum measured tillage depth (inclusive).</td></tr>
     *     <tr><td>maxTillageDepth</td><td>Double</td><td>Maximum measured tillage depth (inclusive).</td></tr>
     *     <tr><td>minTillagePressure</td><td>Double</td><td>Minimum pressure applied by a tillage implement (inclusive).</td></tr>
     *     <tr><td>maxTillagePressure</td><td>Double</td><td>Maximum pressure applied by a tillage implement (inclusive).</td></tr>
     *     <tr><td>sources</td><td>List&lt;String&gt;</td><td>Sources of the operation data.</td></tr>
     *     <tr><td>associatedBoundaryIds</td><td>List&lt;String&gt;</td><td>Boundary IDs associated with operation data.</td></tr>
     *     <tr><td>operationBoundaryIds</td><td>List&lt;String&gt;</td><td>Operation boundary IDs associated with operation data.</td></tr>
     *     <tr><td>minOperationStartDateTime</td><td>OffsetDateTime</td><td>Minimum start date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationStartDateTime</td><td>OffsetDateTime</td><td>Maximum start date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minOperationEndDateTime</td><td>OffsetDateTime</td><td>Minimum end date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationEndDateTime</td><td>OffsetDateTime</td><td>Maximum end date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minOperationModifiedDateTime</td><td>OffsetDateTime</td><td>Minimum modified date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>maxOperationModifiedDateTime</td><td>OffsetDateTime</td><td>Maximum modified date-time of the operation data, sample format: yyyy-MM-ddTHH:mm:ssZ (inclusive).</td></tr>
     *     <tr><td>minArea</td><td>Double</td><td>Minimum area for which operation was applied (inclusive).</td></tr>
     *     <tr><td>maxArea</td><td>Double</td><td>Maximum area for which operation was applied (inclusive).</td></tr>
     *     <tr><td>ids</td><td>List&lt;String&gt;</td><td>Ids of the resource.</td></tr>
     *     <tr><td>names</td><td>List&lt;String&gt;</td><td>Names of the resource.</td></tr>
     *     <tr><td>propertyFilters</td><td>List&lt;String&gt;</td><td>Filters on key-value pairs within the Properties object.
     * eg. "{testKey} eq {testValue}".</td></tr>
     *     <tr><td>statuses</td><td>List&lt;String&gt;</td><td>Statuses of the resource.</td></tr>
     *     <tr><td>minCreatedDateTime</td><td>OffsetDateTime</td><td>Minimum creation date of resource (inclusive).</td></tr>
     *     <tr><td>maxCreatedDateTime</td><td>OffsetDateTime</td><td>Maximum creation date of resource (inclusive).</td></tr>
     *     <tr><td>minLastModifiedDateTime</td><td>OffsetDateTime</td><td>Minimum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxLastModifiedDateTime</td><td>OffsetDateTime</td><td>Maximum last modified date of resource (inclusive).</td></tr>
     *     <tr><td>maxPageSize</td><td>Integer</td><td>Maximum number of items needed (inclusive).
     * Minimum = 10, Maximum = 1000, Default value = 50.</td></tr>
     *     <tr><td>skipToken</td><td>String</td><td>Skip token for getting next set of results.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             tillageDepth: {
     *                 unit: String
     *                 value: Double
     *             }
     *             tillagePressure: (recursive schema, see tillagePressure above)
     *             area: (recursive schema, see area above)
     *             source: String
     *             operationModifiedDateTime: OffsetDateTime
     *             operationStartDateTime: OffsetDateTime
     *             operationEndDateTime: OffsetDateTime
     *             attachmentsLink: String
     *             associatedBoundaryId: String
     *             operationBoundaryId: String
     *             farmerId: String
     *             id: String
     *             eTag: String
     *             status: String
     *             createdDateTime: OffsetDateTime
     *             modifiedDateTime: OffsetDateTime
     *             name: String
     *             description: String
     *             properties: {
     *                 String: Object
     *             }
     *         }
     *     ]
     *     skipToken: String
     *     nextLink: String
     * }
     * }</pre>
     *
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest list() {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/tillage-data")
                .setPathParam("Endpoint", endpoint)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Get a specified tillage data resource under a particular farmer.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     tillageDepth: {
     *         unit: String
     *         value: Double
     *     }
     *     tillagePressure: (recursive schema, see tillagePressure above)
     *     area: (recursive schema, see area above)
     *     source: String
     *     operationModifiedDateTime: OffsetDateTime
     *     operationStartDateTime: OffsetDateTime
     *     operationEndDateTime: OffsetDateTime
     *     attachmentsLink: String
     *     associatedBoundaryId: String
     *     operationBoundaryId: String
     *     farmerId: String
     *     id: String
     *     eTag: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * @param farmerId ID of the associated farmer resource.
     * @param tillageDataId ID of the tillage data resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest get(String farmerId, String tillageDataId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/tillage-data/{tillageDataId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("tillageDataId", tillageDataId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Creates or updates an tillage data resource under a particular farmer.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     tillageDepth: {
     *         unit: String
     *         value: Double
     *     }
     *     tillagePressure: (recursive schema, see tillagePressure above)
     *     area: (recursive schema, see area above)
     *     source: String
     *     operationModifiedDateTime: OffsetDateTime
     *     operationStartDateTime: OffsetDateTime
     *     operationEndDateTime: OffsetDateTime
     *     attachmentsLink: String
     *     associatedBoundaryId: String
     *     operationBoundaryId: String
     *     farmerId: String
     *     id: String
     *     eTag: String
     *     status: String
     *     createdDateTime: OffsetDateTime
     *     modifiedDateTime: OffsetDateTime
     *     name: String
     *     description: String
     *     properties: {
     *         String: Object
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * (recursive schema, see above)
     * }</pre>
     *
     * @param farmerId ID of the associated farmer.
     * @param tillageDataId ID of the tillage data resource.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest createOrUpdate(String farmerId, String tillageDataId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/tillage-data/{tillageDataId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("tillageDataId", tillageDataId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/merge-patch+json")
                .setHttpMethod(HttpMethod.PATCH);
    }

    /**
     * Deletes a specified tillage data resource under a particular farmer.
     *
     * @param farmerId ID of the associated farmer resource.
     * @param tillageDataId ID of the tillage data.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest delete(String farmerId, String tillageDataId) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/farmers/{farmerId}/tillage-data/{tillageDataId}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("farmerId", farmerId)
                .setPathParam("tillageDataId", tillageDataId)
                .addQueryParam("api-version", apiVersion)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.DELETE);
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             tillageDepth: {
     *                 unit: String
     *                 value: Double
     *             }
     *             tillagePressure: (recursive schema, see tillagePressure above)
     *             area: (recursive schema, see area above)
     *             source: String
     *             operationModifiedDateTime: OffsetDateTime
     *             operationStartDateTime: OffsetDateTime
     *             operationEndDateTime: OffsetDateTime
     *             attachmentsLink: String
     *             associatedBoundaryId: String
     *             operationBoundaryId: String
     *             farmerId: String
     *             id: String
     *             eTag: String
     *             status: String
     *             createdDateTime: OffsetDateTime
     *             modifiedDateTime: OffsetDateTime
     *             name: String
     *             description: String
     *             properties: {
     *                 String: Object
     *             }
     *         }
     *     ]
     *     skipToken: String
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest listByFarmerIdNext(String nextLink) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/{nextLink}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("nextLink", nextLink)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Get the next page of items.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value: [
     *         {
     *             tillageDepth: {
     *                 unit: String
     *                 value: Double
     *             }
     *             tillagePressure: (recursive schema, see tillagePressure above)
     *             area: (recursive schema, see area above)
     *             source: String
     *             operationModifiedDateTime: OffsetDateTime
     *             operationStartDateTime: OffsetDateTime
     *             operationEndDateTime: OffsetDateTime
     *             attachmentsLink: String
     *             associatedBoundaryId: String
     *             operationBoundaryId: String
     *             farmerId: String
     *             id: String
     *             eTag: String
     *             status: String
     *             createdDateTime: OffsetDateTime
     *             modifiedDateTime: OffsetDateTime
     *             name: String
     *             description: String
     *             properties: {
     *                 String: Object
     *             }
     *         }
     *     ]
     *     skipToken: String
     *     nextLink: String
     * }
     * }</pre>
     *
     * @param nextLink The nextLink parameter.
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest listNext(String nextLink) {
        return new DynamicRequest(serializer, httpPipeline)
                .setUrl("{Endpoint}/{nextLink}")
                .setPathParam("Endpoint", endpoint)
                .setPathParam("nextLink", nextLink)
                .addHeader("Accept", "application/json")
                .addHeader("Content-Type", "application/json")
                .setHttpMethod(HttpMethod.GET);
    }

    /**
     * Create an empty DynamicRequest with the serializer and pipeline initialized for this client.
     *
     * @return a DynamicRequest where customizations can be made before sent to the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DynamicRequest invoke() {
        return new DynamicRequest(serializer, httpPipeline);
    }
}