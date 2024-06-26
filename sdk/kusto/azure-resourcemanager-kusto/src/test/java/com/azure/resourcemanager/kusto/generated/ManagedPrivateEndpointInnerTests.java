// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ManagedPrivateEndpointInner;
import org.junit.jupiter.api.Assertions;

public final class ManagedPrivateEndpointInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpointInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"privateLinkResourceId\":\"sluicpdggkzz\",\"privateLinkResourceRegion\":\"mbmpaxmodfvuefy\",\"groupId\":\"sbpfvmwyhr\",\"requestMessage\":\"uyfta\",\"provisioningState\":\"Creating\"},\"id\":\"wiyzvqtmnubexkp\",\"name\":\"ksmond\",\"type\":\"mquxvypo\"}")
                .toObject(ManagedPrivateEndpointInner.class);
        Assertions.assertEquals("sluicpdggkzz", model.privateLinkResourceId());
        Assertions.assertEquals("mbmpaxmodfvuefy", model.privateLinkResourceRegion());
        Assertions.assertEquals("sbpfvmwyhr", model.groupId());
        Assertions.assertEquals("uyfta", model.requestMessage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpointInner model =
            new ManagedPrivateEndpointInner()
                .withPrivateLinkResourceId("sluicpdggkzz")
                .withPrivateLinkResourceRegion("mbmpaxmodfvuefy")
                .withGroupId("sbpfvmwyhr")
                .withRequestMessage("uyfta");
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpointInner.class);
        Assertions.assertEquals("sluicpdggkzz", model.privateLinkResourceId());
        Assertions.assertEquals("mbmpaxmodfvuefy", model.privateLinkResourceRegion());
        Assertions.assertEquals("sbpfvmwyhr", model.groupId());
        Assertions.assertEquals("uyfta", model.requestMessage());
    }
}
