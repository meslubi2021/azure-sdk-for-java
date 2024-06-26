// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionProperties;
import com.azure.resourcemanager.security.models.AdditionalWorkspaceDataType;
import com.azure.resourcemanager.security.models.AdditionalWorkspaceType;
import com.azure.resourcemanager.security.models.AdditionalWorkspacesProperties;
import com.azure.resourcemanager.security.models.DataSource;
import com.azure.resourcemanager.security.models.ExportData;
import com.azure.resourcemanager.security.models.RecommendationConfigStatus;
import com.azure.resourcemanager.security.models.RecommendationConfigurationProperties;
import com.azure.resourcemanager.security.models.RecommendationType;
import com.azure.resourcemanager.security.models.SecuritySolutionStatus;
import com.azure.resourcemanager.security.models.UnmaskedIpLoggingStatus;
import com.azure.resourcemanager.security.models.UserDefinedResourcesProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IoTSecuritySolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecuritySolutionProperties model =
            BinaryData
                .fromString(
                    "{\"workspace\":\"gkpocipazyxoe\",\"displayName\":\"ukgjnpiucgygevq\",\"status\":\"Disabled\",\"export\":[\"RawEvents\"],\"disabledDataSources\":[\"TwinData\",\"TwinData\",\"TwinData\",\"TwinData\"],\"iotHubs\":[\"r\",\"j\"],\"userDefinedResources\":{\"query\":\"pyd\",\"querySubscriptions\":[\"yhxdeoejzicwi\",\"sjttgzfbish\"]},\"autoDiscoveredResources\":[\"hajdeyeamdpha\"],\"recommendationsConfiguration\":[{\"recommendationType\":\"IoT_PermissiveInputFirewallRules\",\"name\":\"uxwgipwho\",\"status\":\"Disabled\"},{\"recommendationType\":\"IoT_InstallAgent\",\"name\":\"gshwankixz\",\"status\":\"Disabled\"},{\"recommendationType\":\"IoT_PermissiveInputFirewallRules\",\"name\":\"eputtmrywnuzoqf\",\"status\":\"Disabled\"},{\"recommendationType\":\"IoT_PermissiveOutputFirewallRules\",\"name\":\"zrnkcqvyxlwh\",\"status\":\"Enabled\"}],\"unmaskedIpLoggingStatus\":\"Enabled\",\"additionalWorkspaces\":[{\"workspace\":\"oqqnwvlryav\",\"type\":\"Sentinel\",\"dataTypes\":[\"RawEvents\",\"RawEvents\"]},{\"workspace\":\"qhgyxzkonocukok\",\"type\":\"Sentinel\",\"dataTypes\":[\"RawEvents\",\"Alerts\",\"RawEvents\",\"Alerts\"]},{\"workspace\":\"szfkbe\",\"type\":\"Sentinel\",\"dataTypes\":[\"RawEvents\",\"Alerts\",\"RawEvents\"]},{\"workspace\":\"vvjektcxsenhwlrs\",\"type\":\"Sentinel\",\"dataTypes\":[\"Alerts\",\"Alerts\"]}]}")
                .toObject(IoTSecuritySolutionProperties.class);
        Assertions.assertEquals("gkpocipazyxoe", model.workspace());
        Assertions.assertEquals("ukgjnpiucgygevq", model.displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, model.status());
        Assertions.assertEquals(ExportData.RAW_EVENTS, model.export().get(0));
        Assertions.assertEquals(DataSource.TWIN_DATA, model.disabledDataSources().get(0));
        Assertions.assertEquals("r", model.iotHubs().get(0));
        Assertions.assertEquals("pyd", model.userDefinedResources().query());
        Assertions.assertEquals("yhxdeoejzicwi", model.userDefinedResources().querySubscriptions().get(0));
        Assertions
            .assertEquals(
                RecommendationType.IO_T_PERMISSIVE_INPUT_FIREWALL_RULES,
                model.recommendationsConfiguration().get(0).recommendationType());
        Assertions
            .assertEquals(RecommendationConfigStatus.DISABLED, model.recommendationsConfiguration().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.ENABLED, model.unmaskedIpLoggingStatus());
        Assertions.assertEquals("oqqnwvlryav", model.additionalWorkspaces().get(0).workspace());
        Assertions.assertEquals(AdditionalWorkspaceType.SENTINEL, model.additionalWorkspaces().get(0).type());
        Assertions
            .assertEquals(
                AdditionalWorkspaceDataType.RAW_EVENTS, model.additionalWorkspaces().get(0).dataTypes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecuritySolutionProperties model =
            new IoTSecuritySolutionProperties()
                .withWorkspace("gkpocipazyxoe")
                .withDisplayName("ukgjnpiucgygevq")
                .withStatus(SecuritySolutionStatus.DISABLED)
                .withExport(Arrays.asList(ExportData.RAW_EVENTS))
                .withDisabledDataSources(
                    Arrays
                        .asList(DataSource.TWIN_DATA, DataSource.TWIN_DATA, DataSource.TWIN_DATA, DataSource.TWIN_DATA))
                .withIotHubs(Arrays.asList("r", "j"))
                .withUserDefinedResources(
                    new UserDefinedResourcesProperties()
                        .withQuery("pyd")
                        .withQuerySubscriptions(Arrays.asList("yhxdeoejzicwi", "sjttgzfbish")))
                .withRecommendationsConfiguration(
                    Arrays
                        .asList(
                            new RecommendationConfigurationProperties()
                                .withRecommendationType(RecommendationType.IO_T_PERMISSIVE_INPUT_FIREWALL_RULES)
                                .withStatus(RecommendationConfigStatus.DISABLED),
                            new RecommendationConfigurationProperties()
                                .withRecommendationType(RecommendationType.IO_T_INSTALL_AGENT)
                                .withStatus(RecommendationConfigStatus.DISABLED),
                            new RecommendationConfigurationProperties()
                                .withRecommendationType(RecommendationType.IO_T_PERMISSIVE_INPUT_FIREWALL_RULES)
                                .withStatus(RecommendationConfigStatus.DISABLED),
                            new RecommendationConfigurationProperties()
                                .withRecommendationType(RecommendationType.IO_T_PERMISSIVE_OUTPUT_FIREWALL_RULES)
                                .withStatus(RecommendationConfigStatus.ENABLED)))
                .withUnmaskedIpLoggingStatus(UnmaskedIpLoggingStatus.ENABLED)
                .withAdditionalWorkspaces(
                    Arrays
                        .asList(
                            new AdditionalWorkspacesProperties()
                                .withWorkspace("oqqnwvlryav")
                                .withType(AdditionalWorkspaceType.SENTINEL)
                                .withDataTypes(
                                    Arrays
                                        .asList(
                                            AdditionalWorkspaceDataType.RAW_EVENTS,
                                            AdditionalWorkspaceDataType.RAW_EVENTS)),
                            new AdditionalWorkspacesProperties()
                                .withWorkspace("qhgyxzkonocukok")
                                .withType(AdditionalWorkspaceType.SENTINEL)
                                .withDataTypes(
                                    Arrays
                                        .asList(
                                            AdditionalWorkspaceDataType.RAW_EVENTS,
                                            AdditionalWorkspaceDataType.ALERTS,
                                            AdditionalWorkspaceDataType.RAW_EVENTS,
                                            AdditionalWorkspaceDataType.ALERTS)),
                            new AdditionalWorkspacesProperties()
                                .withWorkspace("szfkbe")
                                .withType(AdditionalWorkspaceType.SENTINEL)
                                .withDataTypes(
                                    Arrays
                                        .asList(
                                            AdditionalWorkspaceDataType.RAW_EVENTS,
                                            AdditionalWorkspaceDataType.ALERTS,
                                            AdditionalWorkspaceDataType.RAW_EVENTS)),
                            new AdditionalWorkspacesProperties()
                                .withWorkspace("vvjektcxsenhwlrs")
                                .withType(AdditionalWorkspaceType.SENTINEL)
                                .withDataTypes(
                                    Arrays
                                        .asList(
                                            AdditionalWorkspaceDataType.ALERTS, AdditionalWorkspaceDataType.ALERTS))));
        model = BinaryData.fromObject(model).toObject(IoTSecuritySolutionProperties.class);
        Assertions.assertEquals("gkpocipazyxoe", model.workspace());
        Assertions.assertEquals("ukgjnpiucgygevq", model.displayName());
        Assertions.assertEquals(SecuritySolutionStatus.DISABLED, model.status());
        Assertions.assertEquals(ExportData.RAW_EVENTS, model.export().get(0));
        Assertions.assertEquals(DataSource.TWIN_DATA, model.disabledDataSources().get(0));
        Assertions.assertEquals("r", model.iotHubs().get(0));
        Assertions.assertEquals("pyd", model.userDefinedResources().query());
        Assertions.assertEquals("yhxdeoejzicwi", model.userDefinedResources().querySubscriptions().get(0));
        Assertions
            .assertEquals(
                RecommendationType.IO_T_PERMISSIVE_INPUT_FIREWALL_RULES,
                model.recommendationsConfiguration().get(0).recommendationType());
        Assertions
            .assertEquals(RecommendationConfigStatus.DISABLED, model.recommendationsConfiguration().get(0).status());
        Assertions.assertEquals(UnmaskedIpLoggingStatus.ENABLED, model.unmaskedIpLoggingStatus());
        Assertions.assertEquals("oqqnwvlryav", model.additionalWorkspaces().get(0).workspace());
        Assertions.assertEquals(AdditionalWorkspaceType.SENTINEL, model.additionalWorkspaces().get(0).type());
        Assertions
            .assertEquals(
                AdditionalWorkspaceDataType.RAW_EVENTS, model.additionalWorkspaces().get(0).dataTypes().get(0));
    }
}
