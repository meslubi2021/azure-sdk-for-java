// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Resource status of the custom domain. */
public final class CustomDomainResourceState extends ExpandableStringEnum<CustomDomainResourceState> {
    /** Static value Creating for CustomDomainResourceState. */
    public static final CustomDomainResourceState CREATING = fromString("Creating");

    /** Static value Active for CustomDomainResourceState. */
    public static final CustomDomainResourceState ACTIVE = fromString("Active");

    /** Static value Deleting for CustomDomainResourceState. */
    public static final CustomDomainResourceState DELETING = fromString("Deleting");

    /**
     * Creates a new instance of CustomDomainResourceState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CustomDomainResourceState() {
    }

    /**
     * Creates or finds a CustomDomainResourceState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CustomDomainResourceState.
     */
    @JsonCreator
    public static CustomDomainResourceState fromString(String name) {
        return fromString(name, CustomDomainResourceState.class);
    }

    /**
     * Gets known CustomDomainResourceState values.
     *
     * @return known CustomDomainResourceState values.
     */
    public static Collection<CustomDomainResourceState> values() {
        return values(CustomDomainResourceState.class);
    }
}
