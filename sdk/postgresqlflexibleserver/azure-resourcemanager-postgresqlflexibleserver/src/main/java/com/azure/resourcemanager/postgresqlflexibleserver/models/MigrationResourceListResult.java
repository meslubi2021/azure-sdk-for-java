// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.MigrationResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of migration resources. */
@Immutable
public final class MigrationResourceListResult {
    /*
     * A list of migration resources.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<MigrationResourceInner> value;

    /*
     * The link used to get the next page of migrations.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of MigrationResourceListResult class. */
    public MigrationResourceListResult() {
    }

    /**
     * Get the value property: A list of migration resources.
     *
     * @return the value value.
     */
    public List<MigrationResourceInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link used to get the next page of migrations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
