// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.Rank;
import com.azure.resourcemanager.security.models.SensitivityLabel;
import org.junit.jupiter.api.Assertions;

public final class SensitivityLabelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SensitivityLabel model =
            BinaryData
                .fromString(
                    "{\"displayName\":\"ncormrlxqtvcof\",\"description\":\"f\",\"rank\":\"Low\",\"order\":585875953,\"enabled\":false}")
                .toObject(SensitivityLabel.class);
        Assertions.assertEquals("ncormrlxqtvcof", model.displayName());
        Assertions.assertEquals("f", model.description());
        Assertions.assertEquals(Rank.LOW, model.rank());
        Assertions.assertEquals(585875953, model.order());
        Assertions.assertEquals(false, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SensitivityLabel model =
            new SensitivityLabel()
                .withDisplayName("ncormrlxqtvcof")
                .withDescription("f")
                .withRank(Rank.LOW)
                .withOrder(585875953)
                .withEnabled(false);
        model = BinaryData.fromObject(model).toObject(SensitivityLabel.class);
        Assertions.assertEquals("ncormrlxqtvcof", model.displayName());
        Assertions.assertEquals("f", model.description());
        Assertions.assertEquals(Rank.LOW, model.rank());
        Assertions.assertEquals(585875953, model.order());
        Assertions.assertEquals(false, model.enabled());
    }
}
