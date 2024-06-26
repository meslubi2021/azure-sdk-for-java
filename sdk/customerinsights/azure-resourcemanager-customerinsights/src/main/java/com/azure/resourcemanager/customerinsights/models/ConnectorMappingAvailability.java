// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Connector mapping property availability. */
@Fluent
public final class ConnectorMappingAvailability {
    /*
     * The frequency to update.
     */
    @JsonProperty(value = "frequency")
    private FrequencyTypes frequency;

    /*
     * The interval of the given frequency to use.
     */
    @JsonProperty(value = "interval", required = true)
    private int interval;

    /** Creates an instance of ConnectorMappingAvailability class. */
    public ConnectorMappingAvailability() {
    }

    /**
     * Get the frequency property: The frequency to update.
     *
     * @return the frequency value.
     */
    public FrequencyTypes frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: The frequency to update.
     *
     * @param frequency the frequency value to set.
     * @return the ConnectorMappingAvailability object itself.
     */
    public ConnectorMappingAvailability withFrequency(FrequencyTypes frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the interval property: The interval of the given frequency to use.
     *
     * @return the interval value.
     */
    public int interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval of the given frequency to use.
     *
     * @param interval the interval value to set.
     * @return the ConnectorMappingAvailability object itself.
     */
    public ConnectorMappingAvailability withInterval(int interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
