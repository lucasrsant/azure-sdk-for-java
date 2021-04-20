// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mariadb.fluent.CheckNameAvailabilitiesClient;
import com.azure.resourcemanager.mariadb.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.mariadb.models.NameAvailabilityRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CheckNameAvailabilitiesClient. */
public final class CheckNameAvailabilitiesClientImpl implements CheckNameAvailabilitiesClient {
    private final ClientLogger logger = new ClientLogger(CheckNameAvailabilitiesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final CheckNameAvailabilitiesService service;

    /** The service client containing this operation class. */
    private final MariaDBManagementClientImpl client;

    /**
     * Initializes an instance of CheckNameAvailabilitiesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CheckNameAvailabilitiesClientImpl(MariaDBManagementClientImpl client) {
        this.service =
            RestProxy
                .create(CheckNameAvailabilitiesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MariaDBManagementClientCheckNameAvailabilities to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MariaDBManagementCli")
    private interface CheckNameAvailabilitiesService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.DBForMariaDB/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<NameAvailabilityInner>> execute(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") NameAvailabilityRequest nameAvailabilityRequest,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NameAvailabilityInner>> executeWithResponseAsync(
        NameAvailabilityRequest nameAvailabilityRequest) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (nameAvailabilityRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter nameAvailabilityRequest is required and cannot be null."));
        } else {
            nameAvailabilityRequest.validate();
        }
        final String apiVersion = "2018-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .execute(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            nameAvailabilityRequest,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<NameAvailabilityInner>> executeWithResponseAsync(
        NameAvailabilityRequest nameAvailabilityRequest, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (nameAvailabilityRequest == null) {
            return Mono
                .error(
                    new IllegalArgumentException("Parameter nameAvailabilityRequest is required and cannot be null."));
        } else {
            nameAvailabilityRequest.validate();
        }
        final String apiVersion = "2018-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .execute(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                nameAvailabilityRequest,
                accept,
                context);
    }

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<NameAvailabilityInner> executeAsync(NameAvailabilityRequest nameAvailabilityRequest) {
        return executeWithResponseAsync(nameAvailabilityRequest)
            .flatMap(
                (Response<NameAvailabilityInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NameAvailabilityInner execute(NameAvailabilityRequest nameAvailabilityRequest) {
        return executeAsync(nameAvailabilityRequest).block();
    }

    /**
     * Check the availability of name for resource.
     *
     * @param nameAvailabilityRequest The required parameters for checking if resource name is available.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a resource name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NameAvailabilityInner> executeWithResponse(
        NameAvailabilityRequest nameAvailabilityRequest, Context context) {
        return executeWithResponseAsync(nameAvailabilityRequest, context).block();
    }
}