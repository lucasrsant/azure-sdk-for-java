// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Connector Availability Status. */
@Fluent
public final class Availability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Availability.class);

    /*
     * The connector Availability Status
     */
    @JsonProperty(value = "status")
    private AvailabilityStatus status;

    /*
     * Set connector as preview
     */
    @JsonProperty(value = "isPreview")
    private Boolean isPreview;

    /**
     * Get the status property: The connector Availability Status.
     *
     * @return the status value.
     */
    public AvailabilityStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The connector Availability Status.
     *
     * @param status the status value to set.
     * @return the Availability object itself.
     */
    public Availability withStatus(AvailabilityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the isPreview property: Set connector as preview.
     *
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Set the isPreview property: Set connector as preview.
     *
     * @param isPreview the isPreview value to set.
     * @return the Availability object itself.
     */
    public Availability withIsPreview(Boolean isPreview) {
        this.isPreview = isPreview;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
