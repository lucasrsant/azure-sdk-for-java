// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Timeline Query Errors. */
@Fluent
public final class TimelineError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TimelineError.class);

    /*
     * the query kind
     */
    @JsonProperty(value = "kind", required = true)
    private EntityTimelineKind kind;

    /*
     * the query id
     */
    @JsonProperty(value = "queryId")
    private String queryId;

    /*
     * the error message
     */
    @JsonProperty(value = "errorMessage", required = true)
    private String errorMessage;

    /**
     * Get the kind property: the query kind.
     *
     * @return the kind value.
     */
    public EntityTimelineKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: the query kind.
     *
     * @param kind the kind value to set.
     * @return the TimelineError object itself.
     */
    public TimelineError withKind(EntityTimelineKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the queryId property: the query id.
     *
     * @return the queryId value.
     */
    public String queryId() {
        return this.queryId;
    }

    /**
     * Set the queryId property: the query id.
     *
     * @param queryId the queryId value to set.
     * @return the TimelineError object itself.
     */
    public TimelineError withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * Get the errorMessage property: the error message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: the error message.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the TimelineError object itself.
     */
    public TimelineError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kind() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property kind in model TimelineError"));
        }
        if (errorMessage() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property errorMessage in model TimelineError"));
        }
    }
}
