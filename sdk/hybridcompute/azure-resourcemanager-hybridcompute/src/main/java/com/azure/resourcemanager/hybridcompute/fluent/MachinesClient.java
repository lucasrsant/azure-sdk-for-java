// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcompute.fluent.models.MachineInner;
import com.azure.resourcemanager.hybridcompute.models.InstanceViewTypes;

/** An instance of this class provides access to all the operations defined in MachinesClient. */
public interface MachinesClient {
    /**
     * The operation to remove a hybrid machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the hybrid machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String machineName);

    /**
     * The operation to remove a hybrid machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the hybrid machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String machineName, Context context);

    /**
     * Retrieves information about the model view or the instance view of a hybrid machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the hybrid machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MachineInner getByResourceGroup(String resourceGroupName, String machineName);

    /**
     * Retrieves information about the model view or the instance view of a hybrid machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param machineName The name of the hybrid machine.
     * @param expand The expand expression to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a hybrid machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MachineInner> getByResourceGroupWithResponse(
        String resourceGroupName, String machineName, InstanceViewTypes expand, Context context);

    /**
     * Lists all the hybrid machines in the specified resource group. Use the nextLink property in the response to get
     * the next page of hybrid machines.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List hybrid machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MachineInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the hybrid machines in the specified resource group. Use the nextLink property in the response to get
     * the next page of hybrid machines.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List hybrid machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MachineInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the hybrid machines in the specified subscription. Use the nextLink property in the response to get the
     * next page of hybrid machines.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List hybrid machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MachineInner> list();

    /**
     * Lists all the hybrid machines in the specified subscription. Use the nextLink property in the response to get the
     * next page of hybrid machines.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List hybrid machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MachineInner> list(Context context);
}