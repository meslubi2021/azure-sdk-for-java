// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for RuleSets ListByProfile. */
public final class RuleSetsListByProfileSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/RuleSets_ListByProfile.json
     */
    /**
     * Sample code: RuleSets_ListByProfile.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void ruleSetsListByProfile(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.ruleSets().listByProfile("RG", "profile1", com.azure.core.util.Context.NONE);
    }
}
