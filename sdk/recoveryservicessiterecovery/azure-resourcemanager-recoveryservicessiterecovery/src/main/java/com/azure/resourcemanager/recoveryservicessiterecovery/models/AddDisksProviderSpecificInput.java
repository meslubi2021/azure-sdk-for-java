// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Add Disks provider specific input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = AddDisksProviderSpecificInput.class)
@JsonTypeName("AddDisksProviderSpecificInput")
@JsonSubTypes({@JsonSubTypes.Type(name = "A2A", value = A2AAddDisksInput.class)})
@Immutable
public class AddDisksProviderSpecificInput {
    /** Creates an instance of AddDisksProviderSpecificInput class. */
    public AddDisksProviderSpecificInput() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
