// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.TagsObject;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualNetworkTaps UpdateTags. */
public final class VirtualNetworkTapsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-04-01/examples/VirtualNetworkTapUpdateTags.json
     */
    /**
     * Sample code: Update virtual network tap tags.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void updateVirtualNetworkTapTags(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualNetworkTaps()
            .updateTagsWithResponse(
                "rg1",
                "test-vtap",
                new TagsObject().withTags(mapOf("tag1", "value1", "tag2", "value2")),
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
