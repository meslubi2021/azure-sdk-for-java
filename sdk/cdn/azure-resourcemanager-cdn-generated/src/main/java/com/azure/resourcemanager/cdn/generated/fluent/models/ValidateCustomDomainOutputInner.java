// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Output of custom domain validation. */
@Immutable
public final class ValidateCustomDomainOutputInner {
    /*
     * Indicates whether the custom domain is valid or not.
     */
    @JsonProperty(value = "customDomainValidated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean customDomainValidated;

    /*
     * The reason why the custom domain is not valid.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /*
     * Error message describing why the custom domain is not valid.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /** Creates an instance of ValidateCustomDomainOutputInner class. */
    public ValidateCustomDomainOutputInner() {
    }

    /**
     * Get the customDomainValidated property: Indicates whether the custom domain is valid or not.
     *
     * @return the customDomainValidated value.
     */
    public Boolean customDomainValidated() {
        return this.customDomainValidated;
    }

    /**
     * Get the reason property: The reason why the custom domain is not valid.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Get the message property: Error message describing why the custom domain is not valid.
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
