// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.TargetComputeSizeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents applicable recovery vm sizes. */
@Fluent
public final class TargetComputeSizeInner {
    /*
     * The Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The Type of the object.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The custom data.
     */
    @JsonProperty(value = "properties")
    private TargetComputeSizeProperties properties;

    /** Creates an instance of TargetComputeSizeInner class. */
    public TargetComputeSizeInner() {
    }

    /**
     * Get the id property: The Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The Id.
     *
     * @param id the id value to set.
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name.
     *
     * @param name the name value to set.
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The Type of the object.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The Type of the object.
     *
     * @param type the type value to set.
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the properties property: The custom data.
     *
     * @return the properties value.
     */
    public TargetComputeSizeProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The custom data.
     *
     * @param properties the properties value to set.
     * @return the TargetComputeSizeInner object itself.
     */
    public TargetComputeSizeInner withProperties(TargetComputeSizeProperties properties) {
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
