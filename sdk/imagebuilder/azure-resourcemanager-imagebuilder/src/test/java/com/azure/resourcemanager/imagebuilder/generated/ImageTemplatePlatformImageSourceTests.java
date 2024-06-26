// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.imagebuilder.models.ImageTemplatePlatformImageSource;
import com.azure.resourcemanager.imagebuilder.models.PlatformImagePurchasePlan;
import org.junit.jupiter.api.Assertions;

public final class ImageTemplatePlatformImageSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageTemplatePlatformImageSource model =
            BinaryData
                .fromString(
                    "{\"type\":\"PlatformImage\",\"publisher\":\"xlzevgbmqjqabcy\",\"offer\":\"ivkwlzuvccfwnfnb\",\"sku\":\"fionl\",\"version\":\"x\",\"exactVersion\":\"qgtz\",\"planInfo\":{\"planName\":\"pnqbqqwxrjfe\",\"planProduct\":\"llnwsubi\",\"planPublisher\":\"njampm\"}}")
                .toObject(ImageTemplatePlatformImageSource.class);
        Assertions.assertEquals("xlzevgbmqjqabcy", model.publisher());
        Assertions.assertEquals("ivkwlzuvccfwnfnb", model.offer());
        Assertions.assertEquals("fionl", model.sku());
        Assertions.assertEquals("x", model.version());
        Assertions.assertEquals("pnqbqqwxrjfe", model.planInfo().planName());
        Assertions.assertEquals("llnwsubi", model.planInfo().planProduct());
        Assertions.assertEquals("njampm", model.planInfo().planPublisher());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageTemplatePlatformImageSource model =
            new ImageTemplatePlatformImageSource()
                .withPublisher("xlzevgbmqjqabcy")
                .withOffer("ivkwlzuvccfwnfnb")
                .withSku("fionl")
                .withVersion("x")
                .withPlanInfo(
                    new PlatformImagePurchasePlan()
                        .withPlanName("pnqbqqwxrjfe")
                        .withPlanProduct("llnwsubi")
                        .withPlanPublisher("njampm"));
        model = BinaryData.fromObject(model).toObject(ImageTemplatePlatformImageSource.class);
        Assertions.assertEquals("xlzevgbmqjqabcy", model.publisher());
        Assertions.assertEquals("ivkwlzuvccfwnfnb", model.offer());
        Assertions.assertEquals("fionl", model.sku());
        Assertions.assertEquals("x", model.version());
        Assertions.assertEquals("pnqbqqwxrjfe", model.planInfo().planName());
        Assertions.assertEquals("llnwsubi", model.planInfo().planProduct());
        Assertions.assertEquals("njampm", model.planInfo().planPublisher());
    }
}
