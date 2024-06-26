// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.fluent.models.GroupInformationProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GroupInformationPropertiesTests {
    @Test
    public void testDeserialize() {
        GroupInformationProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Succeeded\",\"groupId\":\"ayvvtpgvdf\",\"requiredMembers\":[\"tkftutqxlngx\",\"efgugnxk\",\"xdqmidtthzrvqdra\",\"hjybigehoqfbo\"],\"requiredZoneNames\":[\"anyktzlcuiywg\",\"ywgndrv\",\"nhzgpphrcgyn\",\"ocpecfvmmco\"]}")
                .toObject(GroupInformationProperties.class);
        Assertions.assertEquals("anyktzlcuiywg", model.requiredZoneNames().get(0));
    }

    @Test
    public void testSerialize() {
        GroupInformationProperties model =
            new GroupInformationProperties()
                .withRequiredZoneNames(Arrays.asList("anyktzlcuiywg", "ywgndrv", "nhzgpphrcgyn", "ocpecfvmmco"));
        model = BinaryData.fromObject(model).toObject(GroupInformationProperties.class);
        Assertions.assertEquals("anyktzlcuiywg", model.requiredZoneNames().get(0));
    }
}
