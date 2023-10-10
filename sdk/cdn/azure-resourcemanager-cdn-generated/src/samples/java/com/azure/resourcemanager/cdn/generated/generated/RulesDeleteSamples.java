// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for Rules Delete. */
public final class RulesDeleteSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Rules_Delete.json
     */
    /**
     * Sample code: Rules_Delete.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void rulesDelete(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.rules().delete("RG", "profile1", "ruleSet1", "rule1", com.azure.core.util.Context.NONE);
    }
}
