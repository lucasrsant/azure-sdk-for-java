// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.EntityQueryTemplateInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of all the entity query templates. */
@Fluent
public final class EntityQueryTemplateList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EntityQueryTemplateList.class);

    /*
     * URL to fetch the next set of entity query templates.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /*
     * Array of entity query templates.
     */
    @JsonProperty(value = "value", required = true)
    private List<EntityQueryTemplateInner> value;

    /**
     * Get the nextLink property: URL to fetch the next set of entity query templates.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: Array of entity query templates.
     *
     * @return the value value.
     */
    public List<EntityQueryTemplateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of entity query templates.
     *
     * @param value the value value to set.
     * @return the EntityQueryTemplateList object itself.
     */
    public EntityQueryTemplateList withValue(List<EntityQueryTemplateInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model EntityQueryTemplateList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
