// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationNetworksClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.NetworkInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Network;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationNetworks;

public final class ReplicationNetworksImpl implements ReplicationNetworks {
    private static final ClientLogger LOGGER = new ClientLogger(ReplicationNetworksImpl.class);

    private final ReplicationNetworksClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public ReplicationNetworksImpl(
        ReplicationNetworksClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Network> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName) {
        PagedIterable<NetworkInner> inner =
            this.serviceClient().listByReplicationFabrics(resourceName, resourceGroupName, fabricName);
        return Utils.mapPage(inner, inner1 -> new NetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<Network> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName, Context context) {
        PagedIterable<NetworkInner> inner =
            this.serviceClient().listByReplicationFabrics(resourceName, resourceGroupName, fabricName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkImpl(inner1, this.manager()));
    }

    public Response<Network> getWithResponse(
        String resourceName, String resourceGroupName, String fabricName, String networkName, Context context) {
        Response<NetworkInner> inner =
            this.serviceClient().getWithResponse(resourceName, resourceGroupName, fabricName, networkName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Network get(String resourceName, String resourceGroupName, String fabricName, String networkName) {
        NetworkInner inner = this.serviceClient().get(resourceName, resourceGroupName, fabricName, networkName);
        if (inner != null) {
            return new NetworkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Network> list(String resourceName, String resourceGroupName) {
        PagedIterable<NetworkInner> inner = this.serviceClient().list(resourceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkImpl(inner1, this.manager()));
    }

    public PagedIterable<Network> list(String resourceName, String resourceGroupName, Context context) {
        PagedIterable<NetworkInner> inner = this.serviceClient().list(resourceName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkImpl(inner1, this.manager()));
    }

    private ReplicationNetworksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}
