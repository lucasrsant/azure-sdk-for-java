// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.operationsmanagement.fluent.models.ManagementConfigurationInner;
import com.azure.resourcemanager.operationsmanagement.fluent.models.ManagementConfigurationPropertiesListInner;

/** An instance of this class provides access to all the operations defined in ManagementConfigurationsClient. */
public interface ManagementConfigurationsClient {
    /**
     * Retrieves the ManagementConfigurations list.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ManagementConfiguration response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagementConfigurationPropertiesListInner listBySubscription();

    /**
     * Retrieves the ManagementConfigurations list.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of ManagementConfiguration response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagementConfigurationPropertiesListInner> listBySubscriptionWithResponse(Context context);

    /**
     * Creates or updates the ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param parameters The parameters required to create OMS Solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the container for solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagementConfigurationInner createOrUpdate(
        String resourceGroupName, String managementConfigurationName, ManagementConfigurationInner parameters);

    /**
     * Creates or updates the ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param parameters The parameters required to create OMS Solution.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the container for solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagementConfigurationInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String managementConfigurationName,
        ManagementConfigurationInner parameters,
        Context context);

    /**
     * Deletes the ManagementConfiguration in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String managementConfigurationName);

    /**
     * Deletes the ManagementConfiguration in the subscription.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String managementConfigurationName, Context context);

    /**
     * Retrieves the user ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the container for solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagementConfigurationInner getByResourceGroup(String resourceGroupName, String managementConfigurationName);

    /**
     * Retrieves the user ManagementConfiguration.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param managementConfigurationName User Management Configuration Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the container for solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagementConfigurationInner> getByResourceGroupWithResponse(
        String resourceGroupName, String managementConfigurationName, Context context);
}