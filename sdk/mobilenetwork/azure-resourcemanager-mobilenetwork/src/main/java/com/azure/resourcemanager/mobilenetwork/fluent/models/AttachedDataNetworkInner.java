// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.NaptConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Attached data network resource. */
@Fluent
public final class AttachedDataNetworkInner extends Resource {
    /*
     * Data network properties.
     */
    @JsonProperty(value = "properties", required = true)
    private AttachedDataNetworkPropertiesFormat innerProperties = new AttachedDataNetworkPropertiesFormat();

    /**
     * Get the innerProperties property: Data network properties.
     *
     * @return the innerProperties value.
     */
    private AttachedDataNetworkPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AttachedDataNetworkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AttachedDataNetworkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the attached data network resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the userPlaneDataInterface property: The user plane interface on the data network. In 5G networks this is
     * called as N6 interface whereas in 4G networks this is called as SGi interface.
     *
     * @return the userPlaneDataInterface value.
     */
    public InterfaceProperties userPlaneDataInterface() {
        return this.innerProperties() == null ? null : this.innerProperties().userPlaneDataInterface();
    }

    /**
     * Set the userPlaneDataInterface property: The user plane interface on the data network. In 5G networks this is
     * called as N6 interface whereas in 4G networks this is called as SGi interface.
     *
     * @param userPlaneDataInterface the userPlaneDataInterface value to set.
     * @return the AttachedDataNetworkInner object itself.
     */
    public AttachedDataNetworkInner withUserPlaneDataInterface(InterfaceProperties userPlaneDataInterface) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDataNetworkPropertiesFormat();
        }
        this.innerProperties().withUserPlaneDataInterface(userPlaneDataInterface);
        return this;
    }

    /**
     * Get the naptConfiguration property: The Network Address and Port Translation configuration. If not specified the
     * attached data network uses a default NAPT configuration with NAPT enabled.
     *
     * @return the naptConfiguration value.
     */
    public NaptConfiguration naptConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().naptConfiguration();
    }

    /**
     * Set the naptConfiguration property: The Network Address and Port Translation configuration. If not specified the
     * attached data network uses a default NAPT configuration with NAPT enabled.
     *
     * @param naptConfiguration the naptConfiguration value to set.
     * @return the AttachedDataNetworkInner object itself.
     */
    public AttachedDataNetworkInner withNaptConfiguration(NaptConfiguration naptConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDataNetworkPropertiesFormat();
        }
        this.innerProperties().withNaptConfiguration(naptConfiguration);
        return this;
    }

    /**
     * Get the userEquipmentAddressPoolPrefix property: The user equipment address pool prefixes for the attached data
     * network that are dynamically assigned by the core to UEs when they set up a PDU session. At least one of
     * userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both are defined then
     * they must be the same size.
     *
     * @return the userEquipmentAddressPoolPrefix value.
     */
    public List<String> userEquipmentAddressPoolPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().userEquipmentAddressPoolPrefix();
    }

    /**
     * Set the userEquipmentAddressPoolPrefix property: The user equipment address pool prefixes for the attached data
     * network that are dynamically assigned by the core to UEs when they set up a PDU session. At least one of
     * userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both are defined then
     * they must be the same size.
     *
     * @param userEquipmentAddressPoolPrefix the userEquipmentAddressPoolPrefix value to set.
     * @return the AttachedDataNetworkInner object itself.
     */
    public AttachedDataNetworkInner withUserEquipmentAddressPoolPrefix(List<String> userEquipmentAddressPoolPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDataNetworkPropertiesFormat();
        }
        this.innerProperties().withUserEquipmentAddressPoolPrefix(userEquipmentAddressPoolPrefix);
        return this;
    }

    /**
     * Get the userEquipmentStaticAddressPoolPrefix property: The user equipment address pool prefixes for the attached
     * data network that are statically assigned by the core to UEs when they set up a PDU session. The mapping of
     * static IP to sim is configured in staticIpConfiguration on the sim resource. At least one of
     * userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both are defined then
     * they must be the same size.
     *
     * @return the userEquipmentStaticAddressPoolPrefix value.
     */
    public List<String> userEquipmentStaticAddressPoolPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().userEquipmentStaticAddressPoolPrefix();
    }

    /**
     * Set the userEquipmentStaticAddressPoolPrefix property: The user equipment address pool prefixes for the attached
     * data network that are statically assigned by the core to UEs when they set up a PDU session. The mapping of
     * static IP to sim is configured in staticIpConfiguration on the sim resource. At least one of
     * userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both are defined then
     * they must be the same size.
     *
     * @param userEquipmentStaticAddressPoolPrefix the userEquipmentStaticAddressPoolPrefix value to set.
     * @return the AttachedDataNetworkInner object itself.
     */
    public AttachedDataNetworkInner withUserEquipmentStaticAddressPoolPrefix(
        List<String> userEquipmentStaticAddressPoolPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AttachedDataNetworkPropertiesFormat();
        }
        this.innerProperties().withUserEquipmentStaticAddressPoolPrefix(userEquipmentStaticAddressPoolPrefix);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model AttachedDataNetworkInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AttachedDataNetworkInner.class);
}
