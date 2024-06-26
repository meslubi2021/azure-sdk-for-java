// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datadog.models.MonitorUpdateProperties;
import com.azure.resourcemanager.datadog.models.MonitoringStatus;
import org.junit.jupiter.api.Assertions;

public final class MonitorUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitorUpdateProperties model =
            BinaryData.fromString("{\"monitoringStatus\":\"Disabled\"}").toObject(MonitorUpdateProperties.class);
        Assertions.assertEquals(MonitoringStatus.DISABLED, model.monitoringStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitorUpdateProperties model = new MonitorUpdateProperties().withMonitoringStatus(MonitoringStatus.DISABLED);
        model = BinaryData.fromObject(model).toObject(MonitorUpdateProperties.class);
        Assertions.assertEquals(MonitoringStatus.DISABLED, model.monitoringStatus());
    }
}
