// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.IpAllocationInner;
import com.azure.resourcemanager.network.models.IpAllocationType;
import java.util.HashMap;
import java.util.Map;

/** Samples for IpAllocations CreateOrUpdate. */
public final class IpAllocationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/IpAllocationCreate.json
     */
    /**
     * Sample code: Create IpAllocation.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createIpAllocation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getIpAllocations()
            .createOrUpdate(
                "rg1",
                "test-ipallocation",
                new IpAllocationInner()
                    .withLocation("centraluseuap")
                    .withTypePropertiesType(IpAllocationType.HYPERNET)
                    .withPrefix("3.2.5.0/24")
                    .withAllocationTags(
                        mapOf(
                            "VNetID",
                            "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/HypernetVnet1")),
                com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
