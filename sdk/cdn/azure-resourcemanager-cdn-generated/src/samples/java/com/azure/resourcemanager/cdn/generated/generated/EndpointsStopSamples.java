// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for Endpoints Stop. */
public final class EndpointsStopSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Endpoints_Stop.json
     */
    /**
     * Sample code: Endpoints_Stop.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void endpointsStop(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.endpoints().stop("RG", "profile1", "endpoint1", com.azure.core.util.Context.NONE);
    }
}
