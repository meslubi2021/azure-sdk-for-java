// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionUserConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.azure.resourcemanager.hybridnetwork.models.SkuType;
import com.azure.resourcemanager.hybridnetwork.models.VendorProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Network function resource response. */
@Fluent
public final class NetworkFunctionInner extends Resource {
    /*
     * Network function properties.
     */
    @JsonProperty(value = "properties")
    private NetworkFunctionPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of NetworkFunctionInner class. */
    public NetworkFunctionInner() {
    }

    /**
     * Get the innerProperties property: Network function properties.
     *
     * @return the innerProperties value.
     */
    private NetworkFunctionPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the NetworkFunctionInner object itself.
     */
    public NetworkFunctionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkFunctionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkFunctionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network function resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the device property: The reference to the device resource. Once set, it cannot be updated.
     *
     * @return the device value.
     */
    public SubResource device() {
        return this.innerProperties() == null ? null : this.innerProperties().device();
    }

    /**
     * Set the device property: The reference to the device resource. Once set, it cannot be updated.
     *
     * @param device the device value to set.
     * @return the NetworkFunctionInner object itself.
     */
    public NetworkFunctionInner withDevice(SubResource device) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFunctionPropertiesFormat();
        }
        this.innerProperties().withDevice(device);
        return this;
    }

    /**
     * Get the skuName property: The sku name for the network function. Once set, it cannot be updated.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.innerProperties() == null ? null : this.innerProperties().skuName();
    }

    /**
     * Set the skuName property: The sku name for the network function. Once set, it cannot be updated.
     *
     * @param skuName the skuName value to set.
     * @return the NetworkFunctionInner object itself.
     */
    public NetworkFunctionInner withSkuName(String skuName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFunctionPropertiesFormat();
        }
        this.innerProperties().withSkuName(skuName);
        return this;
    }

    /**
     * Get the skuType property: The sku type for the network function.
     *
     * @return the skuType value.
     */
    public SkuType skuType() {
        return this.innerProperties() == null ? null : this.innerProperties().skuType();
    }

    /**
     * Get the vendorName property: The vendor name for the network function. Once set, it cannot be updated.
     *
     * @return the vendorName value.
     */
    public String vendorName() {
        return this.innerProperties() == null ? null : this.innerProperties().vendorName();
    }

    /**
     * Set the vendorName property: The vendor name for the network function. Once set, it cannot be updated.
     *
     * @param vendorName the vendorName value to set.
     * @return the NetworkFunctionInner object itself.
     */
    public NetworkFunctionInner withVendorName(String vendorName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFunctionPropertiesFormat();
        }
        this.innerProperties().withVendorName(vendorName);
        return this;
    }

    /**
     * Get the serviceKey property: The service key for the network function resource.
     *
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceKey();
    }

    /**
     * Get the vendorProvisioningState property: The vendor provisioning state for the network function resource.
     *
     * @return the vendorProvisioningState value.
     */
    public VendorProvisioningState vendorProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().vendorProvisioningState();
    }

    /**
     * Get the managedApplication property: The resource URI of the managed application.
     *
     * @return the managedApplication value.
     */
    public SubResource managedApplication() {
        return this.innerProperties() == null ? null : this.innerProperties().managedApplication();
    }

    /**
     * Get the managedApplicationParameters property: The parameters for the managed application.
     *
     * @return the managedApplicationParameters value.
     */
    public Object managedApplicationParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().managedApplicationParameters();
    }

    /**
     * Set the managedApplicationParameters property: The parameters for the managed application.
     *
     * @param managedApplicationParameters the managedApplicationParameters value to set.
     * @return the NetworkFunctionInner object itself.
     */
    public NetworkFunctionInner withManagedApplicationParameters(Object managedApplicationParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFunctionPropertiesFormat();
        }
        this.innerProperties().withManagedApplicationParameters(managedApplicationParameters);
        return this;
    }

    /**
     * Get the networkFunctionContainerConfigurations property: The network function container configurations from the
     * user.
     *
     * @return the networkFunctionContainerConfigurations value.
     */
    public Object networkFunctionContainerConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().networkFunctionContainerConfigurations();
    }

    /**
     * Set the networkFunctionContainerConfigurations property: The network function container configurations from the
     * user.
     *
     * @param networkFunctionContainerConfigurations the networkFunctionContainerConfigurations value to set.
     * @return the NetworkFunctionInner object itself.
     */
    public NetworkFunctionInner withNetworkFunctionContainerConfigurations(
        Object networkFunctionContainerConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFunctionPropertiesFormat();
        }
        this.innerProperties().withNetworkFunctionContainerConfigurations(networkFunctionContainerConfigurations);
        return this;
    }

    /**
     * Get the networkFunctionUserConfigurations property: The network function configurations from the user.
     *
     * @return the networkFunctionUserConfigurations value.
     */
    public List<NetworkFunctionUserConfiguration> networkFunctionUserConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().networkFunctionUserConfigurations();
    }

    /**
     * Set the networkFunctionUserConfigurations property: The network function configurations from the user.
     *
     * @param networkFunctionUserConfigurations the networkFunctionUserConfigurations value to set.
     * @return the NetworkFunctionInner object itself.
     */
    public NetworkFunctionInner withNetworkFunctionUserConfigurations(
        List<NetworkFunctionUserConfiguration> networkFunctionUserConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkFunctionPropertiesFormat();
        }
        this.innerProperties().withNetworkFunctionUserConfigurations(networkFunctionUserConfigurations);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
