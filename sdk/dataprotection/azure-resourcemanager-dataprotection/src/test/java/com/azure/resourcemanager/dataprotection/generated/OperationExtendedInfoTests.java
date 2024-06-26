// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.OperationExtendedInfo;

public final class OperationExtendedInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationExtendedInfo model =
            BinaryData.fromString("{\"objectType\":\"OperationExtendedInfo\"}").toObject(OperationExtendedInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationExtendedInfo model = new OperationExtendedInfo();
        model = BinaryData.fromObject(model).toObject(OperationExtendedInfo.class);
    }
}
