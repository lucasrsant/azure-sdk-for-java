// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** App Insights Web App stack settings. */
@Immutable
public final class AppInsightsWebAppStackSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppInsightsWebAppStackSettings.class);

    /*
     * <code>true</code> if remote Application Insights is supported for the
     * stack; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "isSupported", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isSupported;

    /*
     * <code>true</code> if Application Insights is disabled by default for the
     * stack; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "isDefaultOff", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefaultOff;

    /**
     * Get the isSupported property: &lt;code&gt;true&lt;/code&gt; if remote Application Insights is supported for the
     * stack; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isSupported value.
     */
    public Boolean isSupported() {
        return this.isSupported;
    }

    /**
     * Get the isDefaultOff property: &lt;code&gt;true&lt;/code&gt; if Application Insights is disabled by default for
     * the stack; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDefaultOff value.
     */
    public Boolean isDefaultOff() {
        return this.isDefaultOff;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}