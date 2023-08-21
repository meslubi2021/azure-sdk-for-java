// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Diagnostics data for a resource. */
@Fluent
public final class DiagnosticsInner extends ProxyResource {
    /*
     * Diagnostics resource specific properties
     */
    @JsonProperty(value = "properties")
    private DiagnosticsProperties properties;

    /** Creates an instance of DiagnosticsInner class. */
    public DiagnosticsInner() {
    }

    /**
     * Get the properties property: Diagnostics resource specific properties.
     *
     * @return the properties value.
     */
    public DiagnosticsProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Diagnostics resource specific properties.
     *
     * @param properties the properties value to set.
     * @return the DiagnosticsInner object itself.
     */
    public DiagnosticsInner withProperties(DiagnosticsProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
