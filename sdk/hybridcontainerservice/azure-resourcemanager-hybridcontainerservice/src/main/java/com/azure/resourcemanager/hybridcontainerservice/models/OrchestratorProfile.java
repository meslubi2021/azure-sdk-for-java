// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains information about orchestrator. */
@Immutable
public final class OrchestratorProfile {
    /*
     * Whether Kubernetes version is currently in preview.
     */
    @JsonProperty(value = "isPreview", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPreview;

    /*
     * Orchestrator type.
     */
    @JsonProperty(value = "orchestratorType", access = JsonProperty.Access.WRITE_ONLY)
    private String orchestratorType;

    /*
     * Orchestrator version (major, minor, patch).
     */
    @JsonProperty(value = "orchestratorVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String orchestratorVersion;

    /** Creates an instance of OrchestratorProfile class. */
    public OrchestratorProfile() {
    }

    /**
     * Get the isPreview property: Whether Kubernetes version is currently in preview.
     *
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Get the orchestratorType property: Orchestrator type.
     *
     * @return the orchestratorType value.
     */
    public String orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * Get the orchestratorVersion property: Orchestrator version (major, minor, patch).
     *
     * @return the orchestratorVersion value.
     */
    public String orchestratorVersion() {
        return this.orchestratorVersion;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
