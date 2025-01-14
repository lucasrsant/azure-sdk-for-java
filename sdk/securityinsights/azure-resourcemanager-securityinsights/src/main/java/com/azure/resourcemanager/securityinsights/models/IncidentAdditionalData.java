// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Incident additional data property bag. */
@Immutable
public final class IncidentAdditionalData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IncidentAdditionalData.class);

    /*
     * The number of alerts in the incident
     */
    @JsonProperty(value = "alertsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer alertsCount;

    /*
     * The number of bookmarks in the incident
     */
    @JsonProperty(value = "bookmarksCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer bookmarksCount;

    /*
     * The number of comments in the incident
     */
    @JsonProperty(value = "commentsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer commentsCount;

    /*
     * List of product names of alerts in the incident
     */
    @JsonProperty(value = "alertProductNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> alertProductNames;

    /*
     * The tactics associated with incident
     */
    @JsonProperty(value = "tactics", access = JsonProperty.Access.WRITE_ONLY)
    private List<AttackTactic> tactics;

    /**
     * Get the alertsCount property: The number of alerts in the incident.
     *
     * @return the alertsCount value.
     */
    public Integer alertsCount() {
        return this.alertsCount;
    }

    /**
     * Get the bookmarksCount property: The number of bookmarks in the incident.
     *
     * @return the bookmarksCount value.
     */
    public Integer bookmarksCount() {
        return this.bookmarksCount;
    }

    /**
     * Get the commentsCount property: The number of comments in the incident.
     *
     * @return the commentsCount value.
     */
    public Integer commentsCount() {
        return this.commentsCount;
    }

    /**
     * Get the alertProductNames property: List of product names of alerts in the incident.
     *
     * @return the alertProductNames value.
     */
    public List<String> alertProductNames() {
        return this.alertProductNames;
    }

    /**
     * Get the tactics property: The tactics associated with incident.
     *
     * @return the tactics value.
     */
    public List<AttackTactic> tactics() {
        return this.tactics;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
