// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsPropertiesDescription;
import com.azure.resourcemanager.deviceprovisioningservices.models.IotDpsSkuInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The description of the provisioning service. */
@Fluent
public final class ProvisioningServiceDescriptionInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProvisioningServiceDescriptionInner.class);

    /*
     * The Etag field is *not* required. If it is provided in the response
     * body, it must also be provided as a header per the normal ETag
     * convention.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Service specific properties for a provisioning service
     */
    @JsonProperty(value = "properties", required = true)
    private IotDpsPropertiesDescription properties;

    /*
     * Sku info for a provisioning Service.
     */
    @JsonProperty(value = "sku", required = true)
    private IotDpsSkuInfo sku;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     *
     * @param etag the etag value to set.
     * @return the ProvisioningServiceDescriptionInner object itself.
     */
    public ProvisioningServiceDescriptionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the properties property: Service specific properties for a provisioning service.
     *
     * @return the properties value.
     */
    public IotDpsPropertiesDescription properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Service specific properties for a provisioning service.
     *
     * @param properties the properties value to set.
     * @return the ProvisioningServiceDescriptionInner object itself.
     */
    public ProvisioningServiceDescriptionInner withProperties(IotDpsPropertiesDescription properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Sku info for a provisioning Service.
     *
     * @return the sku value.
     */
    public IotDpsSkuInfo sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku info for a provisioning Service.
     *
     * @param sku the sku value to set.
     * @return the ProvisioningServiceDescriptionInner object itself.
     */
    public ProvisioningServiceDescriptionInner withSku(IotDpsSkuInfo sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public ProvisioningServiceDescriptionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProvisioningServiceDescriptionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model ProvisioningServiceDescriptionInner"));
        } else {
            properties().validate();
        }
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sku in model ProvisioningServiceDescriptionInner"));
        } else {
            sku().validate();
        }
    }
}
