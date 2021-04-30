// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The representation of an edge module. */
@JsonFlatten
@Immutable
public class EdgeModuleEntityInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EdgeModuleEntityInner.class);

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Internal ID generated for the instance of the Video Analyzer edge
     * module.
     */
    @JsonProperty(value = "properties.edgeModuleId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID edgeModuleId;

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the edgeModuleId property: Internal ID generated for the instance of the Video Analyzer edge module.
     *
     * @return the edgeModuleId value.
     */
    public UUID edgeModuleId() {
        return this.edgeModuleId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}