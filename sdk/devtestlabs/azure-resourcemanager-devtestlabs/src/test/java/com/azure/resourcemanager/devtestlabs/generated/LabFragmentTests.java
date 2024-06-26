// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.LabFragment;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class LabFragmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LabFragment model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"lqivbgkcv\":\"jdxvglnkvxlxpa\",\"pubcpzgpxtivhjk\":\"hpzvuqdflvoniyp\",\"hgovfgp\":\"idibgqjxgpn\"}}")
                .toObject(LabFragment.class);
        Assertions.assertEquals("jdxvglnkvxlxpa", model.tags().get("lqivbgkcv"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LabFragment model =
            new LabFragment()
                .withTags(
                    mapOf(
                        "lqivbgkcv", "jdxvglnkvxlxpa", "pubcpzgpxtivhjk", "hpzvuqdflvoniyp", "hgovfgp", "idibgqjxgpn"));
        model = BinaryData.fromObject(model).toObject(LabFragment.class);
        Assertions.assertEquals("jdxvglnkvxlxpa", model.tags().get("lqivbgkcv"));
    }

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
