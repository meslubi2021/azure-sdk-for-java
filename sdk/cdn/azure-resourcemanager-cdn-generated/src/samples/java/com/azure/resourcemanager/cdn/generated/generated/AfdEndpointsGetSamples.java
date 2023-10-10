// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for AfdEndpoints Get. */
public final class AfdEndpointsGetSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/AFDEndpoints_Get.json
     */
    /**
     * Sample code: AFDEndpoints_Get.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void aFDEndpointsGet(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.afdEndpoints().getWithResponse("RG", "profile1", "endpoint1", com.azure.core.util.Context.NONE);
    }
}
