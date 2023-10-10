// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present,
 * defaults to Continue.
 */
public final class MatchProcessingBehavior extends ExpandableStringEnum<MatchProcessingBehavior> {
    /** Static value Continue for MatchProcessingBehavior. */
    public static final MatchProcessingBehavior CONTINUE = fromString("Continue");

    /** Static value Stop for MatchProcessingBehavior. */
    public static final MatchProcessingBehavior STOP = fromString("Stop");

    /**
     * Creates a new instance of MatchProcessingBehavior value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MatchProcessingBehavior() {
    }

    /**
     * Creates or finds a MatchProcessingBehavior from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MatchProcessingBehavior.
     */
    @JsonCreator
    public static MatchProcessingBehavior fromString(String name) {
        return fromString(name, MatchProcessingBehavior.class);
    }

    /**
     * Gets known MatchProcessingBehavior values.
     *
     * @return known MatchProcessingBehavior values.
     */
    public static Collection<MatchProcessingBehavior> values() {
        return values(MatchProcessingBehavior.class);
    }
}
