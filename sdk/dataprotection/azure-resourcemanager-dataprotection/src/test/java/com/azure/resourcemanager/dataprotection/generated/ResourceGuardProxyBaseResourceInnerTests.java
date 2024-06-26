// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.ResourceGuardProxyBaseResourceInner;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardOperationDetail;
import com.azure.resourcemanager.dataprotection.models.ResourceGuardProxyBase;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ResourceGuardProxyBaseResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuardProxyBaseResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"resourceGuardResourceId\":\"pvkvpbjxbk\",\"resourceGuardOperationDetails\":[{\"vaultCriticalOperation\":\"dvncjabudurgk\",\"defaultResourceRequest\":\"mokzhjjklf\"},{\"vaultCriticalOperation\":\"mouwqlgzrfzeey\",\"defaultResourceRequest\":\"izikayuhq\"}],\"lastUpdatedTime\":\"jbsybbqw\",\"description\":\"t\"},\"id\":\"gmfpgvmp\",\"name\":\"paslthaqfxssmwu\",\"type\":\"wbdsr\"}")
                .toObject(ResourceGuardProxyBaseResourceInner.class);
        Assertions.assertEquals("pvkvpbjxbk", model.properties().resourceGuardResourceId());
        Assertions
            .assertEquals(
                "dvncjabudurgk", model.properties().resourceGuardOperationDetails().get(0).vaultCriticalOperation());
        Assertions
            .assertEquals(
                "mokzhjjklf", model.properties().resourceGuardOperationDetails().get(0).defaultResourceRequest());
        Assertions.assertEquals("jbsybbqw", model.properties().lastUpdatedTime());
        Assertions.assertEquals("t", model.properties().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuardProxyBaseResourceInner model =
            new ResourceGuardProxyBaseResourceInner()
                .withProperties(
                    new ResourceGuardProxyBase()
                        .withResourceGuardResourceId("pvkvpbjxbk")
                        .withResourceGuardOperationDetails(
                            Arrays
                                .asList(
                                    new ResourceGuardOperationDetail()
                                        .withVaultCriticalOperation("dvncjabudurgk")
                                        .withDefaultResourceRequest("mokzhjjklf"),
                                    new ResourceGuardOperationDetail()
                                        .withVaultCriticalOperation("mouwqlgzrfzeey")
                                        .withDefaultResourceRequest("izikayuhq")))
                        .withLastUpdatedTime("jbsybbqw")
                        .withDescription("t"));
        model = BinaryData.fromObject(model).toObject(ResourceGuardProxyBaseResourceInner.class);
        Assertions.assertEquals("pvkvpbjxbk", model.properties().resourceGuardResourceId());
        Assertions
            .assertEquals(
                "dvncjabudurgk", model.properties().resourceGuardOperationDetails().get(0).vaultCriticalOperation());
        Assertions
            .assertEquals(
                "mokzhjjklf", model.properties().resourceGuardOperationDetails().get(0).defaultResourceRequest());
        Assertions.assertEquals("jbsybbqw", model.properties().lastUpdatedTime());
        Assertions.assertEquals("t", model.properties().description());
    }
}
