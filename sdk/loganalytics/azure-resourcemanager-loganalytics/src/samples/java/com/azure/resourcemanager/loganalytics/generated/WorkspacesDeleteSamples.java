// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.Context;

/** Samples for Workspaces Delete. */
public final class WorkspacesDeleteSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/preview/2021-12-01-preview/examples/WorkspacesDelete.json
     */
    /**
     * Sample code: WorkspacesDelete.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void workspacesDelete(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.workspaces().delete("oiautorest6685", "oiautorest6685", null, Context.NONE);
    }
}
