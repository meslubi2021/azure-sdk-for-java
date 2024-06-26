// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.UpgradableVersionsDescription;
import org.junit.jupiter.api.Assertions;

public final class UpgradableVersionsDescriptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpgradableVersionsDescription model =
            BinaryData.fromString("{\"targetVersion\":\"rfidfvzwdz\"}").toObject(UpgradableVersionsDescription.class);
        Assertions.assertEquals("rfidfvzwdz", model.targetVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpgradableVersionsDescription model = new UpgradableVersionsDescription().withTargetVersion("rfidfvzwdz");
        model = BinaryData.fromObject(model).toObject(UpgradableVersionsDescription.class);
        Assertions.assertEquals("rfidfvzwdz", model.targetVersion());
    }
}
