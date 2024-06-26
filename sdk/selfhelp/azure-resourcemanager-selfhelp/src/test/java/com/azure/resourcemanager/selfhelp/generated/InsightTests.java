// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.models.ImportanceLevel;
import com.azure.resourcemanager.selfhelp.models.Insight;
import org.junit.jupiter.api.Assertions;

public final class InsightTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Insight model =
            BinaryData
                .fromString(
                    "{\"id\":\"zwyiftyhxhur\",\"title\":\"ftyxolniw\",\"results\":\"cukjf\",\"importanceLevel\":\"Critical\"}")
                .toObject(Insight.class);
        Assertions.assertEquals("zwyiftyhxhur", model.id());
        Assertions.assertEquals("ftyxolniw", model.title());
        Assertions.assertEquals("cukjf", model.results());
        Assertions.assertEquals(ImportanceLevel.CRITICAL, model.importanceLevel());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Insight model =
            new Insight()
                .withId("zwyiftyhxhur")
                .withTitle("ftyxolniw")
                .withResults("cukjf")
                .withImportanceLevel(ImportanceLevel.CRITICAL);
        model = BinaryData.fromObject(model).toObject(Insight.class);
        Assertions.assertEquals("zwyiftyhxhur", model.id());
        Assertions.assertEquals("ftyxolniw", model.title());
        Assertions.assertEquals("cukjf", model.results());
        Assertions.assertEquals(ImportanceLevel.CRITICAL, model.importanceLevel());
    }
}
