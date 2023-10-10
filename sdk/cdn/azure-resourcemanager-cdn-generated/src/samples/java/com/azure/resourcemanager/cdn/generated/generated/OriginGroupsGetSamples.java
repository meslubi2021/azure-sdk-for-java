// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for OriginGroups Get. */
public final class OriginGroupsGetSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/OriginGroups_Get.json
     */
    /**
     * Sample code: OriginGroups_Get.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void originGroupsGet(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager
            .originGroups()
            .getWithResponse("RG", "profile1", "endpoint1", "originGroup1", com.azure.core.util.Context.NONE);
    }
}
