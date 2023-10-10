// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.resourcemanager.cdn.generated.models.LogRanking;
import com.azure.resourcemanager.cdn.generated.models.LogRankingMetric;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for LogAnalytics GetLogAnalyticsRankings. */
public final class LogAnalyticsGetLogAnalyticsRankingsSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/LogAnalytics_GetLogAnalyticsRankings.json
     */
    /**
     * Sample code: LogAnalytics_GetLogAnalyticsRankings.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void logAnalyticsGetLogAnalyticsRankings(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager
            .logAnalytics()
            .getLogAnalyticsRankingsWithResponse(
                "RG",
                "profile1",
                Arrays.asList(LogRanking.URL),
                Arrays.asList(LogRankingMetric.CLIENT_REQUEST_COUNT),
                5,
                OffsetDateTime.parse("2020-11-04T06:49:27.554Z"),
                OffsetDateTime.parse("2020-11-04T09:49:27.554Z"),
                null,
                com.azure.core.util.Context.NONE);
    }
}
