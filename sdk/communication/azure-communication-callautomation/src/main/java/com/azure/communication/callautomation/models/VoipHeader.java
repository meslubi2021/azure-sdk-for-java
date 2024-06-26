// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.


package com.azure.communication.callautomation.models;

import com.azure.core.annotation.Fluent;

/**
 *  Custom context VOIP header.
 */
@Fluent
public class VoipHeader extends CustomContextHeader {
    /**
     * Create a VoipHeader object with key and value
     * @param key the header key
     * @param value the header value
     */
    public VoipHeader(String key, String value) {
        super(key, value);
    }
}
