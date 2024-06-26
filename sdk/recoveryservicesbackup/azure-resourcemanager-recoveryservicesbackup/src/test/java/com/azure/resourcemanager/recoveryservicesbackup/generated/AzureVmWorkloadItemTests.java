// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureVmWorkloadItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;
import org.junit.jupiter.api.Assertions;

public final class AzureVmWorkloadItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureVmWorkloadItem model =
            BinaryData
                .fromString(
                    "{\"workloadItemType\":\"AzureVmWorkloadItem\",\"parentName\":\"nnhdrl\",\"serverName\":\"gjc\",\"isAutoProtectable\":false,\"subinquireditemcount\":1025559588,\"subWorkloadItemCount\":718100150,\"backupManagementType\":\"lwywae\",\"workloadType\":\"zgfbukklelssx\",\"friendlyName\":\"ycsxzu\",\"protectionState\":\"Protected\"}")
                .toObject(AzureVmWorkloadItem.class);
        Assertions.assertEquals("lwywae", model.backupManagementType());
        Assertions.assertEquals("zgfbukklelssx", model.workloadType());
        Assertions.assertEquals("ycsxzu", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
        Assertions.assertEquals("nnhdrl", model.parentName());
        Assertions.assertEquals("gjc", model.serverName());
        Assertions.assertEquals(false, model.isAutoProtectable());
        Assertions.assertEquals(1025559588, model.subinquireditemcount());
        Assertions.assertEquals(718100150, model.subWorkloadItemCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureVmWorkloadItem model =
            new AzureVmWorkloadItem()
                .withBackupManagementType("lwywae")
                .withWorkloadType("zgfbukklelssx")
                .withFriendlyName("ycsxzu")
                .withProtectionState(ProtectionStatus.PROTECTED)
                .withParentName("nnhdrl")
                .withServerName("gjc")
                .withIsAutoProtectable(false)
                .withSubinquireditemcount(1025559588)
                .withSubWorkloadItemCount(718100150);
        model = BinaryData.fromObject(model).toObject(AzureVmWorkloadItem.class);
        Assertions.assertEquals("lwywae", model.backupManagementType());
        Assertions.assertEquals("zgfbukklelssx", model.workloadType());
        Assertions.assertEquals("ycsxzu", model.friendlyName());
        Assertions.assertEquals(ProtectionStatus.PROTECTED, model.protectionState());
        Assertions.assertEquals("nnhdrl", model.parentName());
        Assertions.assertEquals("gjc", model.serverName());
        Assertions.assertEquals(false, model.isAutoProtectable());
        Assertions.assertEquals(1025559588, model.subinquireditemcount());
        Assertions.assertEquals(718100150, model.subWorkloadItemCount());
    }
}
