// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error details.
 *
 * <p>Contains details when the response code indicates an error.
 */
@Immutable
public final class ErrorResponse {
    /*
     * The code and message for an error.
     *
     * The error details.
     */
    @JsonProperty(value = "error", required = true)
    private ErrorInfo error;

    /**
     * Creates an instance of ErrorResponse class.
     *
     * @param error the error value to set.
     */
    @JsonCreator
    public ErrorResponse(@JsonProperty(value = "error", required = true) ErrorInfo error) {
        this.error = error;
    }

    /**
     * Get the error property: The code and message for an error.
     *
     * <p>The error details.
     *
     * @return the error value.
     */
    public ErrorInfo getError() {
        return this.error;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getError() == null) {
            throw new IllegalArgumentException("Missing required property error in model ErrorResponse");
        } else {
            getError().validate();
        }
    }
}
