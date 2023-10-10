// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for Endpoints Create. */
public final class EndpointsCreateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Endpoints_Create.json
     */
    /**
     * Sample code: Endpoints_Create.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void endpointsCreate(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager
            .endpoints()
            .define("endpoint1")
            .withRegion((String) null)
            .withExistingProfile("RG", "profile1")
            .create();
    }
}
