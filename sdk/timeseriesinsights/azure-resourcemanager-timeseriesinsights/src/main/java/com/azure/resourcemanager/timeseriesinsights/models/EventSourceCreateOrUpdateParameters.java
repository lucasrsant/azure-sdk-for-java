// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Parameters supplied to the Create or Update Event Source operation. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = EventSourceCreateOrUpdateParameters.class)
@JsonTypeName("EventSourceCreateOrUpdateParameters")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.EventHub", value = EventHubEventSourceCreateOrUpdateParameters.class),
    @JsonSubTypes.Type(name = "Microsoft.IoTHub", value = IoTHubEventSourceCreateOrUpdateParameters.class)
})
@Fluent
public class EventSourceCreateOrUpdateParameters extends CreateOrUpdateTrackedResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventSourceCreateOrUpdateParameters.class);

    /*
     * An object that represents the local timestamp property. It contains the
     * format of local timestamp that needs to be used and the corresponding
     * timezone offset information. If a value isn't specified for
     * localTimestamp, or if null, then the local timestamp will not be
     * ingressed with the events.
     */
    @JsonProperty(value = "localTimestamp")
    private LocalTimestamp localTimestamp;

    /**
     * Get the localTimestamp property: An object that represents the local timestamp property. It contains the format
     * of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't
     * specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     *
     * @return the localTimestamp value.
     */
    public LocalTimestamp localTimestamp() {
        return this.localTimestamp;
    }

    /**
     * Set the localTimestamp property: An object that represents the local timestamp property. It contains the format
     * of local timestamp that needs to be used and the corresponding timezone offset information. If a value isn't
     * specified for localTimestamp, or if null, then the local timestamp will not be ingressed with the events.
     *
     * @param localTimestamp the localTimestamp value to set.
     * @return the EventSourceCreateOrUpdateParameters object itself.
     */
    public EventSourceCreateOrUpdateParameters withLocalTimestamp(LocalTimestamp localTimestamp) {
        this.localTimestamp = localTimestamp;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventSourceCreateOrUpdateParameters withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventSourceCreateOrUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (localTimestamp() != null) {
            localTimestamp().validate();
        }
    }
}