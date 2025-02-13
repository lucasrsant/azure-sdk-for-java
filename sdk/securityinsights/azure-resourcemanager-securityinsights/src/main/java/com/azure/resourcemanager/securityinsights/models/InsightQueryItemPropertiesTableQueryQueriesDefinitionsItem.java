// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem model. */
@Fluent
public final class InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem.class);

    /*
     * Insight column header.
     */
    @JsonProperty(value = "filter")
    private String filter;

    /*
     * Insight column header.
     */
    @JsonProperty(value = "summarize")
    private String summarize;

    /*
     * Insight column header.
     */
    @JsonProperty(value = "project")
    private String project;

    /*
     * Insight column header.
     */
    @JsonProperty(value = "linkColumnsDefinitions")
    private List<InsightQueryItemPropertiesTableQueryQueriesDefinitionsPropertiesItemsItem> linkColumnsDefinitions;

    /**
     * Get the filter property: Insight column header.
     *
     * @return the filter value.
     */
    public String filter() {
        return this.filter;
    }

    /**
     * Set the filter property: Insight column header.
     *
     * @param filter the filter value to set.
     * @return the InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem object itself.
     */
    public InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the summarize property: Insight column header.
     *
     * @return the summarize value.
     */
    public String summarize() {
        return this.summarize;
    }

    /**
     * Set the summarize property: Insight column header.
     *
     * @param summarize the summarize value to set.
     * @return the InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem object itself.
     */
    public InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem withSummarize(String summarize) {
        this.summarize = summarize;
        return this;
    }

    /**
     * Get the project property: Insight column header.
     *
     * @return the project value.
     */
    public String project() {
        return this.project;
    }

    /**
     * Set the project property: Insight column header.
     *
     * @param project the project value to set.
     * @return the InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem object itself.
     */
    public InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem withProject(String project) {
        this.project = project;
        return this;
    }

    /**
     * Get the linkColumnsDefinitions property: Insight column header.
     *
     * @return the linkColumnsDefinitions value.
     */
    public List<InsightQueryItemPropertiesTableQueryQueriesDefinitionsPropertiesItemsItem> linkColumnsDefinitions() {
        return this.linkColumnsDefinitions;
    }

    /**
     * Set the linkColumnsDefinitions property: Insight column header.
     *
     * @param linkColumnsDefinitions the linkColumnsDefinitions value to set.
     * @return the InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem object itself.
     */
    public InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem withLinkColumnsDefinitions(
        List<InsightQueryItemPropertiesTableQueryQueriesDefinitionsPropertiesItemsItem> linkColumnsDefinitions) {
        this.linkColumnsDefinitions = linkColumnsDefinitions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (linkColumnsDefinitions() != null) {
            linkColumnsDefinitions().forEach(e -> e.validate());
        }
    }
}
