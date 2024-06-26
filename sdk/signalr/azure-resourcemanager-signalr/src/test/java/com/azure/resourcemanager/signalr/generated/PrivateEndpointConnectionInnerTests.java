// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.signalr.models.PrivateEndpoint;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.signalr.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Succeeded\",\"privateEndpoint\":{\"id\":\"fzeeyebizik\"},\"groupIds\":[\"hqlbjbsybbq\",\"r\",\"t\",\"dgmfpgvmpipasl\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"x\",\"actionsRequired\":\"mwutwbdsre\"}},\"id\":\"drhneuyow\",\"name\":\"kdw\",\"type\":\"t\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals("fzeeyebizik", model.privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("x", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("mwutwbdsre", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withPrivateEndpoint(new PrivateEndpoint().withId("fzeeyebizik"))
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateLinkServiceConnectionStatus.REJECTED)
                        .withDescription("x")
                        .withActionsRequired("mwutwbdsre"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals("fzeeyebizik", model.privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.REJECTED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("x", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("mwutwbdsre", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
