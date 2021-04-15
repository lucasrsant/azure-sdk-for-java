// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devspaces.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for types that supply values used to connect to container orchestrators. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = OrchestratorSpecificConnectionDetails.class)
@JsonTypeName("OrchestratorSpecificConnectionDetails")
@JsonSubTypes({@JsonSubTypes.Type(name = "Kubernetes", value = KubernetesConnectionDetails.class)})
@Immutable
public class OrchestratorSpecificConnectionDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrchestratorSpecificConnectionDetails.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}