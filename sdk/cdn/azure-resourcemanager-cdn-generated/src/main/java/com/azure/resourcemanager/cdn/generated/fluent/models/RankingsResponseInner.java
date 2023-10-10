// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.generated.models.RankingsResponseTablesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Rankings Response. */
@Fluent
public final class RankingsResponseInner {
    /*
     * The dateTimeBegin property.
     */
    @JsonProperty(value = "dateTimeBegin")
    private OffsetDateTime dateTimeBegin;

    /*
     * The dateTimeEnd property.
     */
    @JsonProperty(value = "dateTimeEnd")
    private OffsetDateTime dateTimeEnd;

    /*
     * The tables property.
     */
    @JsonProperty(value = "tables")
    private List<RankingsResponseTablesItem> tables;

    /** Creates an instance of RankingsResponseInner class. */
    public RankingsResponseInner() {
    }

    /**
     * Get the dateTimeBegin property: The dateTimeBegin property.
     *
     * @return the dateTimeBegin value.
     */
    public OffsetDateTime dateTimeBegin() {
        return this.dateTimeBegin;
    }

    /**
     * Set the dateTimeBegin property: The dateTimeBegin property.
     *
     * @param dateTimeBegin the dateTimeBegin value to set.
     * @return the RankingsResponseInner object itself.
     */
    public RankingsResponseInner withDateTimeBegin(OffsetDateTime dateTimeBegin) {
        this.dateTimeBegin = dateTimeBegin;
        return this;
    }

    /**
     * Get the dateTimeEnd property: The dateTimeEnd property.
     *
     * @return the dateTimeEnd value.
     */
    public OffsetDateTime dateTimeEnd() {
        return this.dateTimeEnd;
    }

    /**
     * Set the dateTimeEnd property: The dateTimeEnd property.
     *
     * @param dateTimeEnd the dateTimeEnd value to set.
     * @return the RankingsResponseInner object itself.
     */
    public RankingsResponseInner withDateTimeEnd(OffsetDateTime dateTimeEnd) {
        this.dateTimeEnd = dateTimeEnd;
        return this;
    }

    /**
     * Get the tables property: The tables property.
     *
     * @return the tables value.
     */
    public List<RankingsResponseTablesItem> tables() {
        return this.tables;
    }

    /**
     * Set the tables property: The tables property.
     *
     * @param tables the tables value to set.
     * @return the RankingsResponseInner object itself.
     */
    public RankingsResponseInner withTables(List<RankingsResponseTablesItem> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tables() != null) {
            tables().forEach(e -> e.validate());
        }
    }
}
