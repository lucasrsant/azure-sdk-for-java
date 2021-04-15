// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.fluent.LinksClient;
import com.azure.resourcemanager.customerinsights.fluent.models.LinkResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.LinkResourceFormat;
import com.azure.resourcemanager.customerinsights.models.Links;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LinksImpl implements Links {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinksImpl.class);

    private final LinksClient innerClient;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public LinksImpl(
        LinksClient innerClient, com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LinkResourceFormat get(String resourceGroupName, String hubName, String linkName) {
        LinkResourceFormatInner inner = this.serviceClient().get(resourceGroupName, hubName, linkName);
        if (inner != null) {
            return new LinkResourceFormatImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LinkResourceFormat> getWithResponse(
        String resourceGroupName, String hubName, String linkName, Context context) {
        Response<LinkResourceFormatInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, hubName, linkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LinkResourceFormatImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String hubName, String linkName) {
        this.serviceClient().delete(resourceGroupName, hubName, linkName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String hubName, String linkName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, hubName, linkName, context);
    }

    public PagedIterable<LinkResourceFormat> listByHub(String resourceGroupName, String hubName) {
        PagedIterable<LinkResourceFormatInner> inner = this.serviceClient().listByHub(resourceGroupName, hubName);
        return Utils.mapPage(inner, inner1 -> new LinkResourceFormatImpl(inner1, this.manager()));
    }

    public PagedIterable<LinkResourceFormat> listByHub(String resourceGroupName, String hubName, Context context) {
        PagedIterable<LinkResourceFormatInner> inner =
            this.serviceClient().listByHub(resourceGroupName, hubName, context);
        return Utils.mapPage(inner, inner1 -> new LinkResourceFormatImpl(inner1, this.manager()));
    }

    public LinkResourceFormat getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String linkName = Utils.getValueFromIdByName(id, "links");
        if (linkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'links'.", id)));
        }
        return this.getWithResponse(resourceGroupName, hubName, linkName, Context.NONE).getValue();
    }

    public Response<LinkResourceFormat> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String linkName = Utils.getValueFromIdByName(id, "links");
        if (linkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'links'.", id)));
        }
        return this.getWithResponse(resourceGroupName, hubName, linkName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String linkName = Utils.getValueFromIdByName(id, "links");
        if (linkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'links'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, hubName, linkName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String linkName = Utils.getValueFromIdByName(id, "links");
        if (linkName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'links'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, hubName, linkName, context);
    }

    private LinksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }

    public LinkResourceFormatImpl define(String name) {
        return new LinkResourceFormatImpl(name, this.manager());
    }
}