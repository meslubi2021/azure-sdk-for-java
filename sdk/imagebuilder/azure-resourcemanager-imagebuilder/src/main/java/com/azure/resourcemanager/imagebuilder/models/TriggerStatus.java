// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes the status of a trigger. */
@Immutable
public final class TriggerStatus {
    /*
     * The status code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The detailed status message, including for alerts and error messages.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * The time of the status.
     */
    @JsonProperty(value = "time", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime time;

    /** Creates an instance of TriggerStatus class. */
    public TriggerStatus() {
    }

    /**
     * Get the code property: The status code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: The detailed status message, including for alerts and error messages.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the time property: The time of the status.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
