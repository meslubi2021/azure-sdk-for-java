// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationGroupProperties;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationGroupType;
import org.junit.jupiter.api.Assertions;

public final class ApplicationGroupPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationGroupProperties model =
            BinaryData
                .fromString(
                    "{\"objectId\":\"lqidyby\",\"description\":\"zfcl\",\"friendlyName\":\"axdbabph\",\"hostPoolArmPath\":\"wrqlfktsthsuco\",\"workspaceArmPath\":\"nyyazttbtwwrqpue\",\"applicationGroupType\":\"Desktop\",\"cloudPcResource\":false}")
                .toObject(ApplicationGroupProperties.class);
        Assertions.assertEquals("zfcl", model.description());
        Assertions.assertEquals("axdbabph", model.friendlyName());
        Assertions.assertEquals("wrqlfktsthsuco", model.hostPoolArmPath());
        Assertions.assertEquals(ApplicationGroupType.DESKTOP, model.applicationGroupType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationGroupProperties model =
            new ApplicationGroupProperties()
                .withDescription("zfcl")
                .withFriendlyName("axdbabph")
                .withHostPoolArmPath("wrqlfktsthsuco")
                .withApplicationGroupType(ApplicationGroupType.DESKTOP);
        model = BinaryData.fromObject(model).toObject(ApplicationGroupProperties.class);
        Assertions.assertEquals("zfcl", model.description());
        Assertions.assertEquals("axdbabph", model.friendlyName());
        Assertions.assertEquals("wrqlfktsthsuco", model.hostPoolArmPath());
        Assertions.assertEquals(ApplicationGroupType.DESKTOP, model.applicationGroupType());
    }
}
