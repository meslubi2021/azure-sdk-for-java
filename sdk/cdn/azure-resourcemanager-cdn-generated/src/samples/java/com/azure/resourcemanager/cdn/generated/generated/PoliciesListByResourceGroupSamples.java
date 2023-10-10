// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for Policies ListByResourceGroup. */
public final class PoliciesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/WafListPolicies.json
     */
    /**
     * Sample code: List Policies in a Resource Group.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void listPoliciesInAResourceGroup(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.policies().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
