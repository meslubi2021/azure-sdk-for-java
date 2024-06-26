// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hardwaresecuritymodules.fluent.models.DedicatedHsmOperationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the request to list Dedicated HSM Provider operations. It contains a list of operations. */
@Fluent
public final class DedicatedHsmOperationListResult {
    /*
     * List of Dedicated HSM Resource Provider operations.
     */
    @JsonProperty(value = "value")
    private List<DedicatedHsmOperationInner> value;

    /**
     * Get the value property: List of Dedicated HSM Resource Provider operations.
     *
     * @return the value value.
     */
    public List<DedicatedHsmOperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Dedicated HSM Resource Provider operations.
     *
     * @param value the value value to set.
     * @return the DedicatedHsmOperationListResult object itself.
     */
    public DedicatedHsmOperationListResult withValue(List<DedicatedHsmOperationInner> value) {
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
