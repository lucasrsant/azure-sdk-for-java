// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.fluent.models.KubeEnvironmentPatchResourceProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ARM resource for a KubeEnvironment when patching. */
@Fluent
public final class KubeEnvironmentPatchResource extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KubeEnvironmentPatchResource.class);

    /*
     * KubeEnvironmentPatchResource resource specific properties
     */
    @JsonProperty(value = "properties")
    private KubeEnvironmentPatchResourceProperties innerProperties;

    /**
     * Get the innerProperties property: KubeEnvironmentPatchResource resource specific properties.
     *
     * @return the innerProperties value.
     */
    private KubeEnvironmentPatchResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public KubeEnvironmentPatchResource withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Kubernetes Environment.
     *
     * @return the provisioningState value.
     */
    public KubeEnvironmentProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentErrors property: Any errors that occurred during deployment or deployment validation.
     *
     * @return the deploymentErrors value.
     */
    public String deploymentErrors() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentErrors();
    }

    /**
     * Get the internalLoadBalancerEnabled property: Only visible within Vnet/Subnet.
     *
     * @return the internalLoadBalancerEnabled value.
     */
    public Boolean internalLoadBalancerEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().internalLoadBalancerEnabled();
    }

    /**
     * Set the internalLoadBalancerEnabled property: Only visible within Vnet/Subnet.
     *
     * @param internalLoadBalancerEnabled the internalLoadBalancerEnabled value to set.
     * @return the KubeEnvironmentPatchResource object itself.
     */
    public KubeEnvironmentPatchResource withInternalLoadBalancerEnabled(Boolean internalLoadBalancerEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubeEnvironmentPatchResourceProperties();
        }
        this.innerProperties().withInternalLoadBalancerEnabled(internalLoadBalancerEnabled);
        return this;
    }

    /**
     * Get the defaultDomain property: Default Domain Name for the cluster.
     *
     * @return the defaultDomain value.
     */
    public String defaultDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultDomain();
    }

    /**
     * Get the staticIp property: Static IP of the KubeEnvironment.
     *
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.innerProperties() == null ? null : this.innerProperties().staticIp();
    }

    /**
     * Set the staticIp property: Static IP of the KubeEnvironment.
     *
     * @param staticIp the staticIp value to set.
     * @return the KubeEnvironmentPatchResource object itself.
     */
    public KubeEnvironmentPatchResource withStaticIp(String staticIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubeEnvironmentPatchResourceProperties();
        }
        this.innerProperties().withStaticIp(staticIp);
        return this;
    }

    /**
     * Get the arcConfiguration property: Cluster configuration which determines the ARC cluster components types. Eg:
     * Choosing between BuildService kind, FrontEnd Service ArtifactsStorageType etc.
     *
     * @return the arcConfiguration value.
     */
    public ArcConfiguration arcConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().arcConfiguration();
    }

    /**
     * Set the arcConfiguration property: Cluster configuration which determines the ARC cluster components types. Eg:
     * Choosing between BuildService kind, FrontEnd Service ArtifactsStorageType etc.
     *
     * @param arcConfiguration the arcConfiguration value to set.
     * @return the KubeEnvironmentPatchResource object itself.
     */
    public KubeEnvironmentPatchResource withArcConfiguration(ArcConfiguration arcConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubeEnvironmentPatchResourceProperties();
        }
        this.innerProperties().withArcConfiguration(arcConfiguration);
        return this;
    }

    /**
     * Get the appLogsConfiguration property: Cluster configuration which enables the log daemon to export app logs to a
     * destination. Currently only "log-analytics" is supported.
     *
     * @return the appLogsConfiguration value.
     */
    public AppLogsConfiguration appLogsConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().appLogsConfiguration();
    }

    /**
     * Set the appLogsConfiguration property: Cluster configuration which enables the log daemon to export app logs to a
     * destination. Currently only "log-analytics" is supported.
     *
     * @param appLogsConfiguration the appLogsConfiguration value to set.
     * @return the KubeEnvironmentPatchResource object itself.
     */
    public KubeEnvironmentPatchResource withAppLogsConfiguration(AppLogsConfiguration appLogsConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubeEnvironmentPatchResourceProperties();
        }
        this.innerProperties().withAppLogsConfiguration(appLogsConfiguration);
        return this;
    }

    /**
     * Get the containerAppsConfiguration property: Cluster configuration for Container Apps Environments to configure
     * Dapr Instrumentation Key and VNET Configuration.
     *
     * @return the containerAppsConfiguration value.
     */
    public ContainerAppsConfiguration containerAppsConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().containerAppsConfiguration();
    }

    /**
     * Set the containerAppsConfiguration property: Cluster configuration for Container Apps Environments to configure
     * Dapr Instrumentation Key and VNET Configuration.
     *
     * @param containerAppsConfiguration the containerAppsConfiguration value to set.
     * @return the KubeEnvironmentPatchResource object itself.
     */
    public KubeEnvironmentPatchResource withContainerAppsConfiguration(
        ContainerAppsConfiguration containerAppsConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubeEnvironmentPatchResourceProperties();
        }
        this.innerProperties().withContainerAppsConfiguration(containerAppsConfiguration);
        return this;
    }

    /**
     * Get the aksResourceId property: The aksResourceID property.
     *
     * @return the aksResourceId value.
     */
    public String aksResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().aksResourceId();
    }

    /**
     * Set the aksResourceId property: The aksResourceID property.
     *
     * @param aksResourceId the aksResourceId value to set.
     * @return the KubeEnvironmentPatchResource object itself.
     */
    public KubeEnvironmentPatchResource withAksResourceId(String aksResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KubeEnvironmentPatchResourceProperties();
        }
        this.innerProperties().withAksResourceId(aksResourceId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
