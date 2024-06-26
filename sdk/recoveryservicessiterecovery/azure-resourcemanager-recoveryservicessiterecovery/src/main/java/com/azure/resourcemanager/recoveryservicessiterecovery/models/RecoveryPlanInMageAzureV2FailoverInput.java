// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Recovery plan InMageAzureV2 failover input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
@Fluent
public final class RecoveryPlanInMageAzureV2FailoverInput extends RecoveryPlanProviderSpecificFailoverInput {
    /*
     * The recovery point type.
     */
    @JsonProperty(value = "recoveryPointType", required = true)
    private InMageV2RpRecoveryPointType recoveryPointType;

    /*
     * A value indicating whether multi VM sync enabled VMs should use multi VM sync points for failover.
     */
    @JsonProperty(value = "useMultiVmSyncPoint")
    private String useMultiVmSyncPoint;

    /** Creates an instance of RecoveryPlanInMageAzureV2FailoverInput class. */
    public RecoveryPlanInMageAzureV2FailoverInput() {
    }

    /**
     * Get the recoveryPointType property: The recovery point type.
     *
     * @return the recoveryPointType value.
     */
    public InMageV2RpRecoveryPointType recoveryPointType() {
        return this.recoveryPointType;
    }

    /**
     * Set the recoveryPointType property: The recovery point type.
     *
     * @param recoveryPointType the recoveryPointType value to set.
     * @return the RecoveryPlanInMageAzureV2FailoverInput object itself.
     */
    public RecoveryPlanInMageAzureV2FailoverInput withRecoveryPointType(InMageV2RpRecoveryPointType recoveryPointType) {
        this.recoveryPointType = recoveryPointType;
        return this;
    }

    /**
     * Get the useMultiVmSyncPoint property: A value indicating whether multi VM sync enabled VMs should use multi VM
     * sync points for failover.
     *
     * @return the useMultiVmSyncPoint value.
     */
    public String useMultiVmSyncPoint() {
        return this.useMultiVmSyncPoint;
    }

    /**
     * Set the useMultiVmSyncPoint property: A value indicating whether multi VM sync enabled VMs should use multi VM
     * sync points for failover.
     *
     * @param useMultiVmSyncPoint the useMultiVmSyncPoint value to set.
     * @return the RecoveryPlanInMageAzureV2FailoverInput object itself.
     */
    public RecoveryPlanInMageAzureV2FailoverInput withUseMultiVmSyncPoint(String useMultiVmSyncPoint) {
        this.useMultiVmSyncPoint = useMultiVmSyncPoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (recoveryPointType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property recoveryPointType in model RecoveryPlanInMageAzureV2FailoverInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPlanInMageAzureV2FailoverInput.class);
}
