// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.DevCenterInner;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DevCenterInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DevCenterInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"MovingResources\",\"devCenterUri\":\"pzvgnwzsymglzufc\"},\"identity\":{\"principalId\":\"d864e238-85aa-45f6-bc0a-0d04874d283f\",\"tenantId\":\"1f8aca36-b0bd-4453-a820-b5a1559aee97\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"anufhfcbjysag\":{\"principalId\":\"857214e8-69f3-4cfa-aa6c-311b897a9b59\",\"clientId\":\"6fe19f67-31c9-4829-8a4a-95bfa53d8180\"},\"xqhabi\":{\"principalId\":\"7033dcf7-b35d-4907-a60b-11b104a604c2\",\"clientId\":\"01d89c8b-ed45-4332-ab70-b32c5bafaa4c\"}}},\"location\":\"ikxwc\",\"tags\":{\"n\":\"scnpqxuhivy\",\"rkxvdum\":\"wby\"},\"id\":\"grtfwvu\",\"name\":\"xgaudccs\",\"type\":\"h\"}")
                .toObject(DevCenterInner.class);
        Assertions.assertEquals("ikxwc", model.location());
        Assertions.assertEquals("scnpqxuhivy", model.tags().get("n"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DevCenterInner model =
            new DevCenterInner()
                .withLocation("ikxwc")
                .withTags(mapOf("n", "scnpqxuhivy", "rkxvdum", "wby"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf("anufhfcbjysag", new UserAssignedIdentity(), "xqhabi", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(DevCenterInner.class);
        Assertions.assertEquals("ikxwc", model.location());
        Assertions.assertEquals("scnpqxuhivy", model.tags().get("n"));
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
