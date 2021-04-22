// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.implementation;

import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.SkuAvailabilityInner;
import com.azure.resourcemanager.vmwarecloudsimple.models.SkuAvailability;

public final class SkuAvailabilityImpl implements SkuAvailability {
    private SkuAvailabilityInner innerObject;

    private final com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager;

    SkuAvailabilityImpl(
        SkuAvailabilityInner innerObject,
        com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String dedicatedAvailabilityZoneId() {
        return this.innerModel().dedicatedAvailabilityZoneId();
    }

    public String dedicatedAvailabilityZoneName() {
        return this.innerModel().dedicatedAvailabilityZoneName();
    }

    public String dedicatedPlacementGroupId() {
        return this.innerModel().dedicatedPlacementGroupId();
    }

    public String dedicatedPlacementGroupName() {
        return this.innerModel().dedicatedPlacementGroupName();
    }

    public int limit() {
        return this.innerModel().limit();
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public String skuId() {
        return this.innerModel().skuId();
    }

    public String skuName() {
        return this.innerModel().skuName();
    }

    public SkuAvailabilityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager() {
        return this.serviceManager;
    }
}