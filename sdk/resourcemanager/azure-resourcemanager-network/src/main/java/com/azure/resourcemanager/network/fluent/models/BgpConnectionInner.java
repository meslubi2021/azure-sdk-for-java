// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.HubBgpConnectionStatus;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual Appliance Site resource. */
@Fluent
public final class BgpConnectionInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BgpConnectionInner.class);

    /*
     * The properties of the Bgp connections.
     */
    @JsonProperty(value = "properties")
    private BgpConnectionProperties innerProperties;

    /*
     * Name of the connection.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Connection type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: The properties of the Bgp connections.
     *
     * @return the innerProperties value.
     */
    private BgpConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the connection.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the connection.
     *
     * @param name the name value to set.
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withName(String name) {
        this.name = name;
        return this;
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
     * Get the type property: Connection type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public BgpConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the peerAsn property: Peer ASN.
     *
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.innerProperties() == null ? null : this.innerProperties().peerAsn();
    }

    /**
     * Set the peerAsn property: Peer ASN.
     *
     * @param peerAsn the peerAsn value to set.
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withPeerAsn(Long peerAsn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BgpConnectionProperties();
        }
        this.innerProperties().withPeerAsn(peerAsn);
        return this;
    }

    /**
     * Get the peerIp property: Peer IP.
     *
     * @return the peerIp value.
     */
    public String peerIp() {
        return this.innerProperties() == null ? null : this.innerProperties().peerIp();
    }

    /**
     * Set the peerIp property: Peer IP.
     *
     * @param peerIp the peerIp value to set.
     * @return the BgpConnectionInner object itself.
     */
    public BgpConnectionInner withPeerIp(String peerIp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BgpConnectionProperties();
        }
        this.innerProperties().withPeerIp(peerIp);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the connectionState property: The current state of the VirtualHub to Peer.
     *
     * @return the connectionState value.
     */
    public HubBgpConnectionStatus connectionState() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionState();
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
