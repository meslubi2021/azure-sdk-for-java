// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.advisor.fluent.models.SuppressionProperties;
import org.junit.jupiter.api.Assertions;

public final class SuppressionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SuppressionProperties model =
            BinaryData
                .fromString(
                    "{\"suppressionId\":\"ocfs\",\"ttl\":\"s\",\"expirationTimeStamp\":\"2021-06-13T04:15:30Z\"}")
                .toObject(SuppressionProperties.class);
        Assertions.assertEquals("ocfs", model.suppressionId());
        Assertions.assertEquals("s", model.ttl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SuppressionProperties model = new SuppressionProperties().withSuppressionId("ocfs").withTtl("s");
        model = BinaryData.fromObject(model).toObject(SuppressionProperties.class);
        Assertions.assertEquals("ocfs", model.suppressionId());
        Assertions.assertEquals("s", model.ttl());
    }
}
