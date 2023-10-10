// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

/** Samples for Routes Delete. */
public final class RoutesDeleteSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/Routes_Delete.json
     */
    /**
     * Sample code: Routes_Delete.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void routesDelete(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.routes().delete("RG", "profile1", "endpoint1", "route1", com.azure.core.util.Context.NONE);
    }
}
