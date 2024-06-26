// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.IdentityProperties;
import com.azure.resourcemanager.nginx.models.IdentityType;
import com.azure.resourcemanager.nginx.models.NginxDeploymentUpdateParameters;
import com.azure.resourcemanager.nginx.models.NginxDeploymentUpdateProperties;
import com.azure.resourcemanager.nginx.models.NginxLogging;
import com.azure.resourcemanager.nginx.models.ResourceSku;
import com.azure.resourcemanager.nginx.models.UserIdentityProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NginxDeploymentUpdateParametersTests {
    @Test
    public void testDeserialize() {
        NginxDeploymentUpdateParameters model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"ionpimexg\",\"tenantId\":\"xgcp\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"qsqsy\":{\"principalId\":\"jrmvdjwzrlo\",\"clientId\":\"clwhijcoejctbz\"},\"axcfjpgddtocjjx\":{\"principalId\":\"kbfkg\",\"clientId\":\"dkexxppofm\"}}},\"tags\":{\"bqe\":\"mouexhdzx\",\"eic\":\"jnxqbzvddntwn\",\"cyddglmjthjqk\":\"twnpzaoqvuhrhcf\"},\"sku\":{\"name\":\"yeicxmqciwqvhk\"},\"location\":\"xuigdtopbobj\",\"properties\":{\"enableDiagnosticsSupport\":false,\"logging\":{}}}")
                .toObject(NginxDeploymentUpdateParameters.class);
        Assertions.assertEquals(IdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("mouexhdzx", model.tags().get("bqe"));
        Assertions.assertEquals("yeicxmqciwqvhk", model.sku().name());
        Assertions.assertEquals("xuigdtopbobj", model.location());
        Assertions.assertEquals(false, model.properties().enableDiagnosticsSupport());
    }

    @Test
    public void testSerialize() {
        NginxDeploymentUpdateParameters model =
            new NginxDeploymentUpdateParameters()
                .withIdentity(
                    new IdentityProperties()
                        .withType(IdentityType.USER_ASSIGNED)
                        .withUserAssignedIdentities(
                            mapOf(
                                "qsqsy",
                                new UserIdentityProperties(),
                                "axcfjpgddtocjjx",
                                new UserIdentityProperties())))
                .withTags(mapOf("bqe", "mouexhdzx", "eic", "jnxqbzvddntwn", "cyddglmjthjqk", "twnpzaoqvuhrhcf"))
                .withSku(new ResourceSku().withName("yeicxmqciwqvhk"))
                .withLocation("xuigdtopbobj")
                .withProperties(
                    new NginxDeploymentUpdateProperties()
                        .withEnableDiagnosticsSupport(false)
                        .withLogging(new NginxLogging()));
        model = BinaryData.fromObject(model).toObject(NginxDeploymentUpdateParameters.class);
        Assertions.assertEquals(IdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("mouexhdzx", model.tags().get("bqe"));
        Assertions.assertEquals("yeicxmqciwqvhk", model.sku().name());
        Assertions.assertEquals("xuigdtopbobj", model.location());
        Assertions.assertEquals(false, model.properties().enableDiagnosticsSupport());
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
