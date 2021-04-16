// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.QuotasClient;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ResourceQuotaInner;
import com.azure.resourcemanager.machinelearningservices.fluent.models.UpdateWorkspaceQuotasResultInner;
import com.azure.resourcemanager.machinelearningservices.models.QuotaUpdateParameters;
import com.azure.resourcemanager.machinelearningservices.models.Quotas;
import com.azure.resourcemanager.machinelearningservices.models.ResourceQuota;
import com.azure.resourcemanager.machinelearningservices.models.UpdateWorkspaceQuotasResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class QuotasImpl implements Quotas {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QuotasImpl.class);

    private final QuotasClient innerClient;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    public QuotasImpl(
        QuotasClient innerClient,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public UpdateWorkspaceQuotasResult update(String location, QuotaUpdateParameters parameters) {
        UpdateWorkspaceQuotasResultInner inner = this.serviceClient().update(location, parameters);
        if (inner != null) {
            return new UpdateWorkspaceQuotasResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UpdateWorkspaceQuotasResult> updateWithResponse(
        String location, QuotaUpdateParameters parameters, Context context) {
        Response<UpdateWorkspaceQuotasResultInner> inner =
            this.serviceClient().updateWithResponse(location, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UpdateWorkspaceQuotasResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ResourceQuota> list(String location) {
        PagedIterable<ResourceQuotaInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new ResourceQuotaImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceQuota> list(String location, Context context) {
        PagedIterable<ResourceQuotaInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new ResourceQuotaImpl(inner1, this.manager()));
    }

    private QuotasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}