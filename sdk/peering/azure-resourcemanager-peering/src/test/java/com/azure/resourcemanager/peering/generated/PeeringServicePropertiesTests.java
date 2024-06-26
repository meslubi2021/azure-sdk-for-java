// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.fluent.models.PeeringServiceProperties;
import org.junit.jupiter.api.Assertions;

public final class PeeringServicePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringServiceProperties model =
            BinaryData
                .fromString(
                    "{\"peeringServiceLocation\":\"olbgycduiertgccy\",\"peeringServiceProvider\":\"aolps\",\"provisioningState\":\"Deleting\",\"providerPrimaryPeeringLocation\":\"fmmdnbbg\",\"providerBackupPeeringLocation\":\"pswiydmcwyh\"}")
                .toObject(PeeringServiceProperties.class);
        Assertions.assertEquals("olbgycduiertgccy", model.peeringServiceLocation());
        Assertions.assertEquals("aolps", model.peeringServiceProvider());
        Assertions.assertEquals("fmmdnbbg", model.providerPrimaryPeeringLocation());
        Assertions.assertEquals("pswiydmcwyh", model.providerBackupPeeringLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringServiceProperties model =
            new PeeringServiceProperties()
                .withPeeringServiceLocation("olbgycduiertgccy")
                .withPeeringServiceProvider("aolps")
                .withProviderPrimaryPeeringLocation("fmmdnbbg")
                .withProviderBackupPeeringLocation("pswiydmcwyh");
        model = BinaryData.fromObject(model).toObject(PeeringServiceProperties.class);
        Assertions.assertEquals("olbgycduiertgccy", model.peeringServiceLocation());
        Assertions.assertEquals("aolps", model.peeringServiceProvider());
        Assertions.assertEquals("fmmdnbbg", model.providerPrimaryPeeringLocation());
        Assertions.assertEquals("pswiydmcwyh", model.providerBackupPeeringLocation());
    }
}
