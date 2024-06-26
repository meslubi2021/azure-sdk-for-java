// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.models.UpdateFirewallRuleParameters;
import org.junit.jupiter.api.Assertions;

public final class UpdateFirewallRuleParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateFirewallRuleParameters model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"startIpAddress\":\"tkftutqxlngx\",\"endIpAddress\":\"fgugnxkrxdqmid\"}}")
                .toObject(UpdateFirewallRuleParameters.class);
        Assertions.assertEquals("tkftutqxlngx", model.startIpAddress());
        Assertions.assertEquals("fgugnxkrxdqmid", model.endIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateFirewallRuleParameters model =
            new UpdateFirewallRuleParameters().withStartIpAddress("tkftutqxlngx").withEndIpAddress("fgugnxkrxdqmid");
        model = BinaryData.fromObject(model).toObject(UpdateFirewallRuleParameters.class);
        Assertions.assertEquals("tkftutqxlngx", model.startIpAddress());
        Assertions.assertEquals("fgugnxkrxdqmid", model.endIpAddress());
    }
}
