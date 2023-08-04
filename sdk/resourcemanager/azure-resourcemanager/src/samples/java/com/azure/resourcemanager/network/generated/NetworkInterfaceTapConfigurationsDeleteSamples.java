// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for NetworkInterfaceTapConfigurations Delete. */
public final class NetworkInterfaceTapConfigurationsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/NetworkInterfaceTapConfigurationDelete.json
     */
    /**
     * Sample code: Delete tap configuration.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteTapConfiguration(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getNetworkInterfaceTapConfigurations()
            .delete("rg1", "test-networkinterface", "test-tapconfiguration", com.azure.core.util.Context.NONE);
    }
}
