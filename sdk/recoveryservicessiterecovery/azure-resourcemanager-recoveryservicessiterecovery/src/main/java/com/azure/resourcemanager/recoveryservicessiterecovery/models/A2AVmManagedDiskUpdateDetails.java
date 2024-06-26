// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A2A Vm managed disk update details. */
@Fluent
public final class A2AVmManagedDiskUpdateDetails {
    /*
     * The disk Id.
     */
    @JsonProperty(value = "diskId")
    private String diskId;

    /*
     * The target disk type before failover.
     */
    @JsonProperty(value = "recoveryTargetDiskAccountType")
    private String recoveryTargetDiskAccountType;

    /*
     * The replica disk type before failover.
     */
    @JsonProperty(value = "recoveryReplicaDiskAccountType")
    private String recoveryReplicaDiskAccountType;

    /*
     * The recovery os disk encryption information.
     */
    @JsonProperty(value = "diskEncryptionInfo")
    private DiskEncryptionInfo diskEncryptionInfo;

    /*
     * The target disk name for unplanned failover operation.
     */
    @JsonProperty(value = "failoverDiskName")
    private String failoverDiskName;

    /*
     * The target disk name for test failover operation.
     */
    @JsonProperty(value = "tfoDiskName")
    private String tfoDiskName;

    /** Creates an instance of A2AVmManagedDiskUpdateDetails class. */
    public A2AVmManagedDiskUpdateDetails() {
    }

    /**
     * Get the diskId property: The disk Id.
     *
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The disk Id.
     *
     * @param diskId the diskId value to set.
     * @return the A2AVmManagedDiskUpdateDetails object itself.
     */
    public A2AVmManagedDiskUpdateDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the recoveryTargetDiskAccountType property: The target disk type before failover.
     *
     * @return the recoveryTargetDiskAccountType value.
     */
    public String recoveryTargetDiskAccountType() {
        return this.recoveryTargetDiskAccountType;
    }

    /**
     * Set the recoveryTargetDiskAccountType property: The target disk type before failover.
     *
     * @param recoveryTargetDiskAccountType the recoveryTargetDiskAccountType value to set.
     * @return the A2AVmManagedDiskUpdateDetails object itself.
     */
    public A2AVmManagedDiskUpdateDetails withRecoveryTargetDiskAccountType(String recoveryTargetDiskAccountType) {
        this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryReplicaDiskAccountType property: The replica disk type before failover.
     *
     * @return the recoveryReplicaDiskAccountType value.
     */
    public String recoveryReplicaDiskAccountType() {
        return this.recoveryReplicaDiskAccountType;
    }

    /**
     * Set the recoveryReplicaDiskAccountType property: The replica disk type before failover.
     *
     * @param recoveryReplicaDiskAccountType the recoveryReplicaDiskAccountType value to set.
     * @return the A2AVmManagedDiskUpdateDetails object itself.
     */
    public A2AVmManagedDiskUpdateDetails withRecoveryReplicaDiskAccountType(String recoveryReplicaDiskAccountType) {
        this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
        return this;
    }

    /**
     * Get the diskEncryptionInfo property: The recovery os disk encryption information.
     *
     * @return the diskEncryptionInfo value.
     */
    public DiskEncryptionInfo diskEncryptionInfo() {
        return this.diskEncryptionInfo;
    }

    /**
     * Set the diskEncryptionInfo property: The recovery os disk encryption information.
     *
     * @param diskEncryptionInfo the diskEncryptionInfo value to set.
     * @return the A2AVmManagedDiskUpdateDetails object itself.
     */
    public A2AVmManagedDiskUpdateDetails withDiskEncryptionInfo(DiskEncryptionInfo diskEncryptionInfo) {
        this.diskEncryptionInfo = diskEncryptionInfo;
        return this;
    }

    /**
     * Get the failoverDiskName property: The target disk name for unplanned failover operation.
     *
     * @return the failoverDiskName value.
     */
    public String failoverDiskName() {
        return this.failoverDiskName;
    }

    /**
     * Set the failoverDiskName property: The target disk name for unplanned failover operation.
     *
     * @param failoverDiskName the failoverDiskName value to set.
     * @return the A2AVmManagedDiskUpdateDetails object itself.
     */
    public A2AVmManagedDiskUpdateDetails withFailoverDiskName(String failoverDiskName) {
        this.failoverDiskName = failoverDiskName;
        return this;
    }

    /**
     * Get the tfoDiskName property: The target disk name for test failover operation.
     *
     * @return the tfoDiskName value.
     */
    public String tfoDiskName() {
        return this.tfoDiskName;
    }

    /**
     * Set the tfoDiskName property: The target disk name for test failover operation.
     *
     * @param tfoDiskName the tfoDiskName value to set.
     * @return the A2AVmManagedDiskUpdateDetails object itself.
     */
    public A2AVmManagedDiskUpdateDetails withTfoDiskName(String tfoDiskName) {
        this.tfoDiskName = tfoDiskName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskEncryptionInfo() != null) {
            diskEncryptionInfo().validate();
        }
    }
}
