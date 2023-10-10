// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for Profiles ListByResourceGroup. */
public final class ProfilesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Profiles_ListByResourceGroup.json
     */
    /**
     * Sample code: Profiles_ListByResourceGroup.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void profilesListByResourceGroup(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.profiles().listByResourceGroup("RG", com.azure.core.util.Context.NONE);
    }
}
