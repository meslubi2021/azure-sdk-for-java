// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.fluent.UsageModelsClient;
import com.azure.resourcemanager.storagecache.fluent.models.UsageModelInner;
import com.azure.resourcemanager.storagecache.models.UsageModel;
import com.azure.resourcemanager.storagecache.models.UsageModels;

public final class UsageModelsImpl implements UsageModels {
    private static final ClientLogger LOGGER = new ClientLogger(UsageModelsImpl.class);

    private final UsageModelsClient innerClient;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

    public UsageModelsImpl(
        UsageModelsClient innerClient, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<UsageModel> list() {
        PagedIterable<UsageModelInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new UsageModelImpl(inner1, this.manager()));
    }

    public PagedIterable<UsageModel> list(Context context) {
        PagedIterable<UsageModelInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new UsageModelImpl(inner1, this.manager()));
    }

    private UsageModelsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }
}
