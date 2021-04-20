// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.WorkItemConfigurationInner;
import com.azure.resourcemanager.applicationinsights.models.WorkItemCreateConfiguration;

/** An instance of this class provides access to all the operations defined in WorkItemConfigurationsClient. */
public interface WorkItemConfigurationsClient {
    /**
     * Gets the list work item configurations that exist for the application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkItemConfigurationErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list work item configurations that exist for the application.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkItemConfigurationInner> list(String resourceGroupName, String resourceName);

    /**
     * Gets the list work item configurations that exist for the application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.applicationinsights.models.WorkItemConfigurationErrorException thrown if the
     *     request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list work item configurations that exist for the application.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WorkItemConfigurationInner> list(String resourceGroupName, String resourceName, Context context);

    /**
     * Create a work item configuration for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigurationProperties Properties that need to be specified to create a work item configuration
     *     of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return work item configuration associated with an application insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkItemConfigurationInner create(
        String resourceGroupName, String resourceName, WorkItemCreateConfiguration workItemConfigurationProperties);

    /**
     * Create a work item configuration for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigurationProperties Properties that need to be specified to create a work item configuration
     *     of a Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return work item configuration associated with an application insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkItemConfigurationInner> createWithResponse(
        String resourceGroupName,
        String resourceName,
        WorkItemCreateConfiguration workItemConfigurationProperties,
        Context context);

    /**
     * Gets default work item configurations that exist for the application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return default work item configurations that exist for the application.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkItemConfigurationInner getDefault(String resourceGroupName, String resourceName);

    /**
     * Gets default work item configurations that exist for the application.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return default work item configurations that exist for the application.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkItemConfigurationInner> getDefaultWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Delete a work item configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigId The unique work item configuration Id. This can be either friendly name of connector as
     *     defined in connector configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String resourceName, String workItemConfigId);

    /**
     * Delete a work item configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigId The unique work item configuration Id. This can be either friendly name of connector as
     *     defined in connector configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String workItemConfigId, Context context);

    /**
     * Gets specified work item configuration for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigId The unique work item configuration Id. This can be either friendly name of connector as
     *     defined in connector configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified work item configuration for an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkItemConfigurationInner getItem(String resourceGroupName, String resourceName, String workItemConfigId);

    /**
     * Gets specified work item configuration for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigId The unique work item configuration Id. This can be either friendly name of connector as
     *     defined in connector configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified work item configuration for an Application Insights component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkItemConfigurationInner> getItemWithResponse(
        String resourceGroupName, String resourceName, String workItemConfigId, Context context);

    /**
     * Update a work item configuration for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigId The unique work item configuration Id. This can be either friendly name of connector as
     *     defined in connector configuration.
     * @param workItemConfigurationProperties Properties that need to be specified to update a work item configuration
     *     for this Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return work item configuration associated with an application insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkItemConfigurationInner updateItem(
        String resourceGroupName,
        String resourceName,
        String workItemConfigId,
        WorkItemCreateConfiguration workItemConfigurationProperties);

    /**
     * Update a work item configuration for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workItemConfigId The unique work item configuration Id. This can be either friendly name of connector as
     *     defined in connector configuration.
     * @param workItemConfigurationProperties Properties that need to be specified to update a work item configuration
     *     for this Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return work item configuration associated with an application insights resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkItemConfigurationInner> updateItemWithResponse(
        String resourceGroupName,
        String resourceName,
        String workItemConfigId,
        WorkItemCreateConfiguration workItemConfigurationProperties,
        Context context);
}