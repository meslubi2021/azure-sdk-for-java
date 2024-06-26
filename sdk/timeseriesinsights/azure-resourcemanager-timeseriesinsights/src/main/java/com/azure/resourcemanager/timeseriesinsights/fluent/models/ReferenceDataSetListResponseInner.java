// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the List Reference Data Sets operation. */
@Fluent
public final class ReferenceDataSetListResponseInner {
    /*
     * Result of the List Reference Data Sets operation.
     */
    @JsonProperty(value = "value")
    private List<ReferenceDataSetResourceInner> value;

    /** Creates an instance of ReferenceDataSetListResponseInner class. */
    public ReferenceDataSetListResponseInner() {
    }

    /**
     * Get the value property: Result of the List Reference Data Sets operation.
     *
     * @return the value value.
     */
    public List<ReferenceDataSetResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Reference Data Sets operation.
     *
     * @param value the value value to set.
     * @return the ReferenceDataSetListResponseInner object itself.
     */
    public ReferenceDataSetListResponseInner withValue(List<ReferenceDataSetResourceInner> value) {
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
