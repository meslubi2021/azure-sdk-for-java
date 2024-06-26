// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.fluent.models.ProductInner;
import org.junit.jupiter.api.Assertions;

public final class ProductInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"description\":\"pnazzm\",\"provisioningState\":\"Updating\"},\"id\":\"unmpxttd\",\"name\":\"hrbnlankxmyskpbh\",\"type\":\"nbtkcxywnytnr\"}")
                .toObject(ProductInner.class);
        Assertions.assertEquals("pnazzm", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductInner model = new ProductInner().withDescription("pnazzm");
        model = BinaryData.fromObject(model).toObject(ProductInner.class);
        Assertions.assertEquals("pnazzm", model.description());
    }
}
