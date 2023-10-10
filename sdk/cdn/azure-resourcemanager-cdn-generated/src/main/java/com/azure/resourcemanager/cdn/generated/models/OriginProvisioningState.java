// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Provisioning status of the origin. */
public final class OriginProvisioningState extends ExpandableStringEnum<OriginProvisioningState> {
    /** Static value Succeeded for OriginProvisioningState. */
    public static final OriginProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for OriginProvisioningState. */
    public static final OriginProvisioningState FAILED = fromString("Failed");

    /** Static value Updating for OriginProvisioningState. */
    public static final OriginProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for OriginProvisioningState. */
    public static final OriginProvisioningState DELETING = fromString("Deleting");

    /** Static value Creating for OriginProvisioningState. */
    public static final OriginProvisioningState CREATING = fromString("Creating");

    /**
     * Creates a new instance of OriginProvisioningState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OriginProvisioningState() {
    }

    /**
     * Creates or finds a OriginProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OriginProvisioningState.
     */
    @JsonCreator
    public static OriginProvisioningState fromString(String name) {
        return fromString(name, OriginProvisioningState.class);
    }

    /**
     * Gets known OriginProvisioningState values.
     *
     * @return known OriginProvisioningState values.
     */
    public static Collection<OriginProvisioningState> values() {
        return values(OriginProvisioningState.class);
    }
}
