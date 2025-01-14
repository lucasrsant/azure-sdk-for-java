// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describe the request properties needed to successfully pull from the server. */
@Fluent
public final class CodelessConnectorPollingRequestProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CodelessConnectorPollingRequestProperties.class);

    /*
     * Describe the endpoint we should pull the data from
     */
    @JsonProperty(value = "apiEndpoint", required = true)
    private String apiEndpoint;

    /*
     * Defines the rate limit QPS
     */
    @JsonProperty(value = "rateLimitQps")
    private Integer rateLimitQps;

    /*
     * The window interval we will use the pull the data
     */
    @JsonProperty(value = "queryWindowInMin", required = true)
    private int queryWindowInMin;

    /*
     * The http method type we will use in the poll request, GET or POST
     */
    @JsonProperty(value = "httpMethod", required = true)
    private String httpMethod;

    /*
     * The time format will be used the query events in a specific window
     */
    @JsonProperty(value = "queryTimeFormat", required = true)
    private String queryTimeFormat;

    /*
     * Describe the amount of time we should try and poll the data in case of
     * failure
     */
    @JsonProperty(value = "retryCount")
    private Integer retryCount;

    /*
     * The number of seconds we will consider as a request timeout
     */
    @JsonProperty(value = "timeoutInSeconds")
    private Integer timeoutInSeconds;

    /*
     * Describe the headers sent in the poll request
     */
    @JsonProperty(value = "headers")
    private Object headers;

    /*
     * Describe the query parameters sent in the poll request
     */
    @JsonProperty(value = "queryParameters")
    private Object queryParameters;

    /*
     * For advanced scenarios for example user name/password embedded in nested
     * JSON payload
     */
    @JsonProperty(value = "queryParametersTemplate")
    private String queryParametersTemplate;

    /*
     * This will be used the query events from a start of the time window
     */
    @JsonProperty(value = "startTimeAttributeName")
    private String startTimeAttributeName;

    /*
     * This will be used the query events from the end of the time window
     */
    @JsonProperty(value = "endTimeAttributeName")
    private String endTimeAttributeName;

    /**
     * Get the apiEndpoint property: Describe the endpoint we should pull the data from.
     *
     * @return the apiEndpoint value.
     */
    public String apiEndpoint() {
        return this.apiEndpoint;
    }

    /**
     * Set the apiEndpoint property: Describe the endpoint we should pull the data from.
     *
     * @param apiEndpoint the apiEndpoint value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }

    /**
     * Get the rateLimitQps property: Defines the rate limit QPS.
     *
     * @return the rateLimitQps value.
     */
    public Integer rateLimitQps() {
        return this.rateLimitQps;
    }

    /**
     * Set the rateLimitQps property: Defines the rate limit QPS.
     *
     * @param rateLimitQps the rateLimitQps value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withRateLimitQps(Integer rateLimitQps) {
        this.rateLimitQps = rateLimitQps;
        return this;
    }

    /**
     * Get the queryWindowInMin property: The window interval we will use the pull the data.
     *
     * @return the queryWindowInMin value.
     */
    public int queryWindowInMin() {
        return this.queryWindowInMin;
    }

    /**
     * Set the queryWindowInMin property: The window interval we will use the pull the data.
     *
     * @param queryWindowInMin the queryWindowInMin value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withQueryWindowInMin(int queryWindowInMin) {
        this.queryWindowInMin = queryWindowInMin;
        return this;
    }

    /**
     * Get the httpMethod property: The http method type we will use in the poll request, GET or POST.
     *
     * @return the httpMethod value.
     */
    public String httpMethod() {
        return this.httpMethod;
    }

    /**
     * Set the httpMethod property: The http method type we will use in the poll request, GET or POST.
     *
     * @param httpMethod the httpMethod value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * Get the queryTimeFormat property: The time format will be used the query events in a specific window.
     *
     * @return the queryTimeFormat value.
     */
    public String queryTimeFormat() {
        return this.queryTimeFormat;
    }

    /**
     * Set the queryTimeFormat property: The time format will be used the query events in a specific window.
     *
     * @param queryTimeFormat the queryTimeFormat value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withQueryTimeFormat(String queryTimeFormat) {
        this.queryTimeFormat = queryTimeFormat;
        return this;
    }

    /**
     * Get the retryCount property: Describe the amount of time we should try and poll the data in case of failure.
     *
     * @return the retryCount value.
     */
    public Integer retryCount() {
        return this.retryCount;
    }

    /**
     * Set the retryCount property: Describe the amount of time we should try and poll the data in case of failure.
     *
     * @param retryCount the retryCount value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withRetryCount(Integer retryCount) {
        this.retryCount = retryCount;
        return this;
    }

    /**
     * Get the timeoutInSeconds property: The number of seconds we will consider as a request timeout.
     *
     * @return the timeoutInSeconds value.
     */
    public Integer timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * Set the timeoutInSeconds property: The number of seconds we will consider as a request timeout.
     *
     * @param timeoutInSeconds the timeoutInSeconds value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * Get the headers property: Describe the headers sent in the poll request.
     *
     * @return the headers value.
     */
    public Object headers() {
        return this.headers;
    }

    /**
     * Set the headers property: Describe the headers sent in the poll request.
     *
     * @param headers the headers value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the queryParameters property: Describe the query parameters sent in the poll request.
     *
     * @return the queryParameters value.
     */
    public Object queryParameters() {
        return this.queryParameters;
    }

    /**
     * Set the queryParameters property: Describe the query parameters sent in the poll request.
     *
     * @param queryParameters the queryParameters value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withQueryParameters(Object queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    /**
     * Get the queryParametersTemplate property: For advanced scenarios for example user name/password embedded in
     * nested JSON payload.
     *
     * @return the queryParametersTemplate value.
     */
    public String queryParametersTemplate() {
        return this.queryParametersTemplate;
    }

    /**
     * Set the queryParametersTemplate property: For advanced scenarios for example user name/password embedded in
     * nested JSON payload.
     *
     * @param queryParametersTemplate the queryParametersTemplate value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withQueryParametersTemplate(String queryParametersTemplate) {
        this.queryParametersTemplate = queryParametersTemplate;
        return this;
    }

    /**
     * Get the startTimeAttributeName property: This will be used the query events from a start of the time window.
     *
     * @return the startTimeAttributeName value.
     */
    public String startTimeAttributeName() {
        return this.startTimeAttributeName;
    }

    /**
     * Set the startTimeAttributeName property: This will be used the query events from a start of the time window.
     *
     * @param startTimeAttributeName the startTimeAttributeName value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withStartTimeAttributeName(String startTimeAttributeName) {
        this.startTimeAttributeName = startTimeAttributeName;
        return this;
    }

    /**
     * Get the endTimeAttributeName property: This will be used the query events from the end of the time window.
     *
     * @return the endTimeAttributeName value.
     */
    public String endTimeAttributeName() {
        return this.endTimeAttributeName;
    }

    /**
     * Set the endTimeAttributeName property: This will be used the query events from the end of the time window.
     *
     * @param endTimeAttributeName the endTimeAttributeName value to set.
     * @return the CodelessConnectorPollingRequestProperties object itself.
     */
    public CodelessConnectorPollingRequestProperties withEndTimeAttributeName(String endTimeAttributeName) {
        this.endTimeAttributeName = endTimeAttributeName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (apiEndpoint() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property apiEndpoint in model CodelessConnectorPollingRequestProperties"));
        }
        if (httpMethod() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property httpMethod in model CodelessConnectorPollingRequestProperties"));
        }
        if (queryTimeFormat() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property queryTimeFormat in model"
                            + " CodelessConnectorPollingRequestProperties"));
        }
    }
}
