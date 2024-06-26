// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.TriggerResourceInner;
import com.azure.resourcemanager.datafactory.models.Trigger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TriggerResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TriggerResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"type\":\"Trigger\",\"description\":\"cp\",\"runtimeState\":\"Started\",\"annotations\":[\"dataihih\",\"datahzdsqtzbsrgnow\",\"datajhf\",\"datamvec\"],\"\":{\"ekqvgqouwif\":\"dataxmwoteyowcluqo\",\"ivqikfxcvhr\":\"datampjw\",\"c\":\"datasphuagrttikteus\"}},\"name\":\"vyklxuby\",\"type\":\"ff\",\"etag\":\"fblcq\",\"id\":\"ubgq\"}")
                .toObject(TriggerResourceInner.class);
        Assertions.assertEquals("ubgq", model.id());
        Assertions.assertEquals("cp", model.properties().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TriggerResourceInner model =
            new TriggerResourceInner()
                .withId("ubgq")
                .withProperties(
                    new Trigger()
                        .withDescription("cp")
                        .withAnnotations(Arrays.asList("dataihih", "datahzdsqtzbsrgnow", "datajhf", "datamvec"))
                        .withAdditionalProperties(mapOf("type", "Trigger", "runtimeState", "Started")));
        model = BinaryData.fromObject(model).toObject(TriggerResourceInner.class);
        Assertions.assertEquals("ubgq", model.id());
        Assertions.assertEquals("cp", model.properties().description());
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
