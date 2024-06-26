// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersResponseExtendedLocation;
import org.junit.jupiter.api.Assertions;

public final class ProvisionedClustersResponseExtendedLocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProvisionedClustersResponseExtendedLocation model =
            BinaryData
                .fromString("{\"type\":\"jugwdkcglhsl\",\"name\":\"jdyggdtji\"}")
                .toObject(ProvisionedClustersResponseExtendedLocation.class);
        Assertions.assertEquals("jugwdkcglhsl", model.type());
        Assertions.assertEquals("jdyggdtji", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProvisionedClustersResponseExtendedLocation model =
            new ProvisionedClustersResponseExtendedLocation().withType("jugwdkcglhsl").withName("jdyggdtji");
        model = BinaryData.fromObject(model).toObject(ProvisionedClustersResponseExtendedLocation.class);
        Assertions.assertEquals("jugwdkcglhsl", model.type());
        Assertions.assertEquals("jdyggdtji", model.name());
    }
}
