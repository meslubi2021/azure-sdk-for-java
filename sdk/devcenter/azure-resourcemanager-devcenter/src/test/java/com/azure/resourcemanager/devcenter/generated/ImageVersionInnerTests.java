// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.ImageVersionInner;

public final class ImageVersionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageVersionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"name\":\"e\",\"publishedDate\":\"2021-12-09T19:14:49Z\",\"excludeFromLatest\":false,\"osDiskImageSizeInGb\":514021855,\"provisioningState\":\"Failed\"},\"id\":\"dslfhotwmcy\",\"name\":\"pwlbjnpg\",\"type\":\"cftadeh\"}")
                .toObject(ImageVersionInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageVersionInner model = new ImageVersionInner();
        model = BinaryData.fromObject(model).toObject(ImageVersionInner.class);
    }
}
