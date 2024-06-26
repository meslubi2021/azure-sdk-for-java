// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.AgentPoolInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AgentPoolList represents a list of Kubernetes cluster agent pools. */
@Fluent
public final class AgentPoolList {
    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of agent pools.
     */
    @JsonProperty(value = "value")
    private List<AgentPoolInner> value;

    /** Creates an instance of AgentPoolList class. */
    public AgentPoolList() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the AgentPoolList object itself.
     */
    public AgentPoolList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of agent pools.
     *
     * @return the value value.
     */
    public List<AgentPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of agent pools.
     *
     * @param value the value value to set.
     * @return the AgentPoolList object itself.
     */
    public AgentPoolList withValue(List<AgentPoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
