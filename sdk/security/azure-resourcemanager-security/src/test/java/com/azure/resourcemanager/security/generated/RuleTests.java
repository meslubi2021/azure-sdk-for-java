// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.Direction;
import com.azure.resourcemanager.security.models.Rule;
import com.azure.resourcemanager.security.models.TransportProtocol;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RuleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Rule model =
            BinaryData
                .fromString(
                    "{\"name\":\"dfgsftufqobrj\",\"direction\":\"Outbound\",\"destinationPort\":1823557197,\"protocols\":[\"UDP\",\"TCP\",\"TCP\"],\"ipAddresses\":[\"kizvytn\",\"zvulj\"]}")
                .toObject(Rule.class);
        Assertions.assertEquals("dfgsftufqobrj", model.name());
        Assertions.assertEquals(Direction.OUTBOUND, model.direction());
        Assertions.assertEquals(1823557197, model.destinationPort());
        Assertions.assertEquals(TransportProtocol.UDP, model.protocols().get(0));
        Assertions.assertEquals("kizvytn", model.ipAddresses().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Rule model =
            new Rule()
                .withName("dfgsftufqobrj")
                .withDirection(Direction.OUTBOUND)
                .withDestinationPort(1823557197)
                .withProtocols(Arrays.asList(TransportProtocol.UDP, TransportProtocol.TCP, TransportProtocol.TCP))
                .withIpAddresses(Arrays.asList("kizvytn", "zvulj"));
        model = BinaryData.fromObject(model).toObject(Rule.class);
        Assertions.assertEquals("dfgsftufqobrj", model.name());
        Assertions.assertEquals(Direction.OUTBOUND, model.direction());
        Assertions.assertEquals(1823557197, model.destinationPort());
        Assertions.assertEquals(TransportProtocol.UDP, model.protocols().get(0));
        Assertions.assertEquals("kizvytn", model.ipAddresses().get(0));
    }
}
