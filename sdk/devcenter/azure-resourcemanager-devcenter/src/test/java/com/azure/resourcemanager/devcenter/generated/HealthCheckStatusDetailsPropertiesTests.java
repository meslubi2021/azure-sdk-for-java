// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.HealthCheckStatusDetailsProperties;

public final class HealthCheckStatusDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HealthCheckStatusDetailsProperties model =
            BinaryData
                .fromString(
                    "{\"startDateTime\":\"2021-07-01T02:09:13Z\",\"endDateTime\":\"2021-06-22T22:11:38Z\",\"healthChecks\":[{\"status\":\"Pending\",\"displayName\":\"gytguslfead\",\"startDateTime\":\"2021-10-11T19:56:34Z\",\"endDateTime\":\"2021-03-01T03:16:18Z\",\"errorType\":\"yhejhzisxgfp\",\"recommendedAction\":\"olppvksrpqvujz\",\"additionalDetails\":\"ehtwdwrft\"},{\"status\":\"Running\",\"displayName\":\"yrcdlbhshfwprac\",\"startDateTime\":\"2021-05-02T16:38:33Z\",\"endDateTime\":\"2021-05-07T13:40:48Z\",\"errorType\":\"khevxccedc\",\"recommendedAction\":\"md\",\"additionalDetails\":\"dnwzxltjcvnhltiu\"},{\"status\":\"Unknown\",\"displayName\":\"avvwxqi\",\"startDateTime\":\"2021-05-18T05:36:02Z\",\"endDateTime\":\"2021-07-30T07:40:44Z\",\"errorType\":\"owx\",\"recommendedAction\":\"mdjrkvfgbvfvp\",\"additionalDetails\":\"odacizs\"}]}")
                .toObject(HealthCheckStatusDetailsProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HealthCheckStatusDetailsProperties model = new HealthCheckStatusDetailsProperties();
        model = BinaryData.fromObject(model).toObject(HealthCheckStatusDetailsProperties.class);
    }
}
