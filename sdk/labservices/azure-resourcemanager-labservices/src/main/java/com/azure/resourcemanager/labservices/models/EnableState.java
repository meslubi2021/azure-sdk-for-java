// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Property enabled state. */
public enum EnableState {
    /** Enum value Enabled. */
    ENABLED("Enabled"),

    /** Enum value Disabled. */
    DISABLED("Disabled");

    /** The actual serialized value for a EnableState instance. */
    private final String value;

    EnableState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a EnableState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed EnableState object, or null if unable to parse.
     */
    @JsonCreator
    public static EnableState fromString(String value) {
        if (value == null) {
            return null;
        }
        EnableState[] items = EnableState.values();
        for (EnableState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
