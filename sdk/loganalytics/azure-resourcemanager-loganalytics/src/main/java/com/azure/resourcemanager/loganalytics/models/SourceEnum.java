// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SourceEnum. */
public final class SourceEnum extends ExpandableStringEnum<SourceEnum> {
    /** Static value microsoft for SourceEnum. */
    public static final SourceEnum MICROSOFT = fromString("microsoft");

    /** Static value customer for SourceEnum. */
    public static final SourceEnum CUSTOMER = fromString("customer");

    /**
     * Creates or finds a SourceEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SourceEnum.
     */
    @JsonCreator
    public static SourceEnum fromString(String name) {
        return fromString(name, SourceEnum.class);
    }

    /**
     * Gets known SourceEnum values.
     *
     * @return known SourceEnum values.
     */
    public static Collection<SourceEnum> values() {
        return values(SourceEnum.class);
    }
}
