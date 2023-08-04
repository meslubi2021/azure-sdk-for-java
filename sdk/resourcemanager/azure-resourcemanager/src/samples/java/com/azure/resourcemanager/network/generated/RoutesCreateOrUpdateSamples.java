// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.RouteInner;
import com.azure.resourcemanager.network.models.RouteNextHopType;

/** Samples for Routes CreateOrUpdate. */
public final class RoutesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/RouteTableRouteCreate.json
     */
    /**
     * Sample code: Create route.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createRoute(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getRoutes()
            .createOrUpdate(
                "rg1",
                "testrt",
                "route1",
                new RouteInner()
                    .withAddressPrefix("10.0.3.0/24")
                    .withNextHopType(RouteNextHopType.VIRTUAL_NETWORK_GATEWAY),
                com.azure.core.util.Context.NONE);
    }
}
