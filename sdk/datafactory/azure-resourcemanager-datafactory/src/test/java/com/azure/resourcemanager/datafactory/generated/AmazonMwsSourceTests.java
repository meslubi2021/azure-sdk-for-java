// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonMwsSource;

public final class AmazonMwsSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmazonMwsSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"AmazonMWSSource\",\"query\":\"dataexhimvlocdxvh\",\"queryTimeout\":\"databidhhipntrdd\",\"additionalColumns\":\"dataiwanvydgmqscijlf\",\"sourceRetryCount\":\"dataxgnzasvpm\",\"sourceRetryWait\":\"dataooqyp\",\"maxConcurrentConnections\":\"datalm\",\"disableMetricsCollection\":\"dataebv\",\"\":{\"bvbexrbynnl\":\"dataoyde\",\"bosacrnpscfkef\":\"dataddhdklwzzsic\",\"gecehennledhouk\":\"dataltxefamimgjuvjv\"}}")
                .toObject(AmazonMwsSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmazonMwsSource model =
            new AmazonMwsSource()
                .withSourceRetryCount("dataxgnzasvpm")
                .withSourceRetryWait("dataooqyp")
                .withMaxConcurrentConnections("datalm")
                .withDisableMetricsCollection("dataebv")
                .withQueryTimeout("databidhhipntrdd")
                .withAdditionalColumns("dataiwanvydgmqscijlf")
                .withQuery("dataexhimvlocdxvh");
        model = BinaryData.fromObject(model).toObject(AmazonMwsSource.class);
    }
}
