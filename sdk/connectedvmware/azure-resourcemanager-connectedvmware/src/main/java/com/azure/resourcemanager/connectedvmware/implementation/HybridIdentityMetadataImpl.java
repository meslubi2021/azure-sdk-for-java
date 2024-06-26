// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.connectedvmware.fluent.models.HybridIdentityMetadataInner;
import com.azure.resourcemanager.connectedvmware.models.HybridIdentityMetadata;
import com.azure.resourcemanager.connectedvmware.models.Identity;

public final class HybridIdentityMetadataImpl implements HybridIdentityMetadata, HybridIdentityMetadata.Definition {
    private HybridIdentityMetadataInner innerObject;

    private final com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager;

    HybridIdentityMetadataImpl(
        HybridIdentityMetadataInner innerObject,
        com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String vmId() {
        return this.innerModel().vmId();
    }

    public String publicKey() {
        return this.innerModel().publicKey();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public HybridIdentityMetadataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualMachineName;

    private String metadataName;

    public HybridIdentityMetadataImpl withExistingVirtualMachine(String resourceGroupName, String virtualMachineName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualMachineName = virtualMachineName;
        return this;
    }

    public HybridIdentityMetadata create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .createWithResponse(
                    resourceGroupName, virtualMachineName, metadataName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public HybridIdentityMetadata create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .createWithResponse(resourceGroupName, virtualMachineName, metadataName, this.innerModel(), context)
                .getValue();
        return this;
    }

    HybridIdentityMetadataImpl(
        String name, com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager serviceManager) {
        this.innerObject = new HybridIdentityMetadataInner();
        this.serviceManager = serviceManager;
        this.metadataName = name;
    }

    public HybridIdentityMetadata refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .getWithResponse(resourceGroupName, virtualMachineName, metadataName, Context.NONE)
                .getValue();
        return this;
    }

    public HybridIdentityMetadata refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .getWithResponse(resourceGroupName, virtualMachineName, metadataName, context)
                .getValue();
        return this;
    }

    public HybridIdentityMetadataImpl withVmId(String vmId) {
        this.innerModel().withVmId(vmId);
        return this;
    }

    public HybridIdentityMetadataImpl withPublicKey(String publicKey) {
        this.innerModel().withPublicKey(publicKey);
        return this;
    }
}
