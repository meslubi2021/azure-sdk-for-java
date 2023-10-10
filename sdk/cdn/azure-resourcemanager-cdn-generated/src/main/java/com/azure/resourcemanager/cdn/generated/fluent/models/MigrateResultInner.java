// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.cdn.generated.models.ResourceReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Result for migrate operation. */
@Immutable
public final class MigrateResultInner {
    /*
     * Resource ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private MigrateResultProperties innerProperties;

    /** Creates an instance of MigrateResultInner class. */
    public MigrateResultInner() {
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: The properties property.
     *
     * @return the innerProperties value.
     */
    private MigrateResultProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the migratedProfileResourceId property: Arm resource id of the migrated profile.
     *
     * @return the migratedProfileResourceId value.
     */
    public ResourceReference migratedProfileResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().migratedProfileResourceId();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
