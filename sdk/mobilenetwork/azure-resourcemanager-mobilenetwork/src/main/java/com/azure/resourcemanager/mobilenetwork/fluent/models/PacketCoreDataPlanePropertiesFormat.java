// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PacketCoreDataPlane properties. */
@Fluent
public final class PacketCoreDataPlanePropertiesFormat {
    /*
     * The provisioning state of the packet core data plane resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The user plane interface on the access network. In 5G networks this is
     * called as N3 interface whereas in 4G networks this is called the S1-U
     * interface.
     */
    @JsonProperty(value = "userPlaneAccessInterface", required = true)
    private InterfaceProperties userPlaneAccessInterface;

    /**
     * Get the provisioningState property: The provisioning state of the packet core data plane resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the userPlaneAccessInterface property: The user plane interface on the access network. In 5G networks this is
     * called as N3 interface whereas in 4G networks this is called the S1-U interface.
     *
     * @return the userPlaneAccessInterface value.
     */
    public InterfaceProperties userPlaneAccessInterface() {
        return this.userPlaneAccessInterface;
    }

    /**
     * Set the userPlaneAccessInterface property: The user plane interface on the access network. In 5G networks this is
     * called as N3 interface whereas in 4G networks this is called the S1-U interface.
     *
     * @param userPlaneAccessInterface the userPlaneAccessInterface value to set.
     * @return the PacketCoreDataPlanePropertiesFormat object itself.
     */
    public PacketCoreDataPlanePropertiesFormat withUserPlaneAccessInterface(
        InterfaceProperties userPlaneAccessInterface) {
        this.userPlaneAccessInterface = userPlaneAccessInterface;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userPlaneAccessInterface() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property userPlaneAccessInterface in model"
                            + " PacketCoreDataPlanePropertiesFormat"));
        } else {
            userPlaneAccessInterface().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PacketCoreDataPlanePropertiesFormat.class);
}
