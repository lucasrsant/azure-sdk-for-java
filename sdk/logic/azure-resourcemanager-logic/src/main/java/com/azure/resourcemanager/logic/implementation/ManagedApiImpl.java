// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.resourcemanager.logic.fluent.models.ManagedApiInner;
import com.azure.resourcemanager.logic.models.ApiResourceProperties;
import com.azure.resourcemanager.logic.models.ManagedApi;
import java.util.Collections;
import java.util.Map;

public final class ManagedApiImpl implements ManagedApi {
    private ManagedApiInner innerObject;

    private final com.azure.resourcemanager.logic.LogicManager serviceManager;

    ManagedApiImpl(ManagedApiInner innerObject, com.azure.resourcemanager.logic.LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ApiResourceProperties properties() {
        return this.innerModel().properties();
    }

    public ManagedApiInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.logic.LogicManager manager() {
        return this.serviceManager;
    }
}