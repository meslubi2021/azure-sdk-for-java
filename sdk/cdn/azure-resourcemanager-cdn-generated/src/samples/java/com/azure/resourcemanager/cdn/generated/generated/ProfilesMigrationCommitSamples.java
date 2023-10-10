// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for Profiles MigrationCommit. */
public final class ProfilesMigrationCommitSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Profiles_MigrationCommit.json
     */
    /**
     * Sample code: Profiles_MigrationCommit.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void profilesMigrationCommit(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.profiles().migrationCommit("RG", "profile1", com.azure.core.util.Context.NONE);
    }
}
