// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request body for CanMigrate operation. */
@Fluent
public final class CanMigrateParameters {
    /*
     * Resource reference of the classic cdn profile or classic frontdoor that need to be migrated.
     */
    @JsonProperty(value = "classicResourceReference", required = true)
    private ResourceReference classicResourceReference;

    /** Creates an instance of CanMigrateParameters class. */
    public CanMigrateParameters() {
    }

    /**
     * Get the classicResourceReference property: Resource reference of the classic cdn profile or classic frontdoor
     * that need to be migrated.
     *
     * @return the classicResourceReference value.
     */
    public ResourceReference classicResourceReference() {
        return this.classicResourceReference;
    }

    /**
     * Set the classicResourceReference property: Resource reference of the classic cdn profile or classic frontdoor
     * that need to be migrated.
     *
     * @param classicResourceReference the classicResourceReference value to set.
     * @return the CanMigrateParameters object itself.
     */
    public CanMigrateParameters withClassicResourceReference(ResourceReference classicResourceReference) {
        this.classicResourceReference = classicResourceReference;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (classicResourceReference() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property classicResourceReference in model CanMigrateParameters"));
        } else {
            classicResourceReference().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CanMigrateParameters.class);
}
