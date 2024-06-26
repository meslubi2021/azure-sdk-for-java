// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Diagnostics data table. */
@Fluent
public final class DiagnosticDataTableResponseObject {
    /*
     * Table name
     */
    @JsonProperty(value = "tableName")
    private String tableName;

    /*
     * Columns in the table
     */
    @JsonProperty(value = "columns")
    private List<DiagnosticDataTableResponseColumn> columns;

    /*
     * Rows in the table
     */
    @JsonProperty(value = "rows")
    private List<Object> rows;

    /** Creates an instance of DiagnosticDataTableResponseObject class. */
    public DiagnosticDataTableResponseObject() {
    }

    /**
     * Get the tableName property: Table name.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: Table name.
     *
     * @param tableName the tableName value to set.
     * @return the DiagnosticDataTableResponseObject object itself.
     */
    public DiagnosticDataTableResponseObject withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the columns property: Columns in the table.
     *
     * @return the columns value.
     */
    public List<DiagnosticDataTableResponseColumn> columns() {
        return this.columns;
    }

    /**
     * Set the columns property: Columns in the table.
     *
     * @param columns the columns value to set.
     * @return the DiagnosticDataTableResponseObject object itself.
     */
    public DiagnosticDataTableResponseObject withColumns(List<DiagnosticDataTableResponseColumn> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the rows property: Rows in the table.
     *
     * @return the rows value.
     */
    public List<Object> rows() {
        return this.rows;
    }

    /**
     * Set the rows property: Rows in the table.
     *
     * @param rows the rows value to set.
     * @return the DiagnosticDataTableResponseObject object itself.
     */
    public DiagnosticDataTableResponseObject withRows(List<Object> rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (columns() != null) {
            columns().forEach(e -> e.validate());
        }
    }
}
