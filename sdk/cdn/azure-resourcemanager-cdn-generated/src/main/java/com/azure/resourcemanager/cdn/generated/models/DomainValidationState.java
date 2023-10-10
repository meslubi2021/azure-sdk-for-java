// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step. DCV stands for
 * DomainControlValidation.
 */
public final class DomainValidationState extends ExpandableStringEnum<DomainValidationState> {
    /** Static value Unknown for DomainValidationState. */
    public static final DomainValidationState UNKNOWN = fromString("Unknown");

    /** Static value Submitting for DomainValidationState. */
    public static final DomainValidationState SUBMITTING = fromString("Submitting");

    /** Static value Pending for DomainValidationState. */
    public static final DomainValidationState PENDING = fromString("Pending");

    /** Static value Rejected for DomainValidationState. */
    public static final DomainValidationState REJECTED = fromString("Rejected");

    /** Static value TimedOut for DomainValidationState. */
    public static final DomainValidationState TIMED_OUT = fromString("TimedOut");

    /** Static value PendingRevalidation for DomainValidationState. */
    public static final DomainValidationState PENDING_REVALIDATION = fromString("PendingRevalidation");

    /** Static value Approved for DomainValidationState. */
    public static final DomainValidationState APPROVED = fromString("Approved");

    /** Static value RefreshingValidationToken for DomainValidationState. */
    public static final DomainValidationState REFRESHING_VALIDATION_TOKEN = fromString("RefreshingValidationToken");

    /** Static value InternalError for DomainValidationState. */
    public static final DomainValidationState INTERNAL_ERROR = fromString("InternalError");

    /**
     * Creates a new instance of DomainValidationState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DomainValidationState() {
    }

    /**
     * Creates or finds a DomainValidationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DomainValidationState.
     */
    @JsonCreator
    public static DomainValidationState fromString(String name) {
        return fromString(name, DomainValidationState.class);
    }

    /**
     * Gets known DomainValidationState values.
     *
     * @return known DomainValidationState values.
     */
    public static Collection<DomainValidationState> values() {
        return values(DomainValidationState.class);
    }
}
