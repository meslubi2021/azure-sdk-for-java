// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Output of check name availability API. */
@Immutable
public final class CheckEndpointNameAvailabilityOutputInner {
    /*
     * Indicates whether the name is available.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /*
     * Returns the available hostname generated based on the AutoGeneratedDomainNameLabelScope when the name is
     * available, otherwise it returns empty string
     */
    @JsonProperty(value = "availableHostname", access = JsonProperty.Access.WRITE_ONLY)
    private String availableHostname;

    /*
     * The reason why the name is not available.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /*
     * The detailed error message describing why the name is not available.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /** Creates an instance of CheckEndpointNameAvailabilityOutputInner class. */
    public CheckEndpointNameAvailabilityOutputInner() {
    }

    /**
     * Get the nameAvailable property: Indicates whether the name is available.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the availableHostname property: Returns the available hostname generated based on the
     * AutoGeneratedDomainNameLabelScope when the name is available, otherwise it returns empty string.
     *
     * @return the availableHostname value.
     */
    public String availableHostname() {
        return this.availableHostname;
    }

    /**
     * Get the reason property: The reason why the name is not available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Get the message property: The detailed error message describing why the name is not available.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
