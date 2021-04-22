// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TrustedIdProviders. */
public interface TrustedIdProviders {
    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Store trusted identity provider list information.
     */
    PagedIterable<TrustedIdProvider> listByAccount(String resourceGroupName, String accountName);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Store trusted identity provider list information.
     */
    PagedIterable<TrustedIdProvider> listByAccount(String resourceGroupName, String accountName, Context context);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Store trusted identity provider.
     */
    TrustedIdProvider get(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Store trusted identity provider.
     */
    Response<TrustedIdProvider> getWithResponse(
        String resourceGroupName, String accountName, String trustedIdProviderName, Context context);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String trustedIdProviderName, Context context);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Store trusted identity provider.
     */
    TrustedIdProvider getById(String id);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Store trusted identity provider.
     */
    Response<TrustedIdProvider> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new TrustedIdProvider resource.
     *
     * @param name resource name.
     * @return the first stage of the new TrustedIdProvider definition.
     */
    TrustedIdProvider.DefinitionStages.Blank define(String name);
}