// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.Context;

/** Samples for StorageTargetOperation Invalidate. */
public final class StorageTargetOperationInvalidateSamples {
    /*
     * x-ms-original-file: specification/storagecache/resource-manager/Microsoft.StorageCache/stable/2022-01-01/examples/StorageTargets_Invalidate.json
     */
    /**
     * Sample code: StorageTargets_Invalidate.
     *
     * @param manager Entry point to StorageCacheManager.
     */
    public static void storageTargetsInvalidate(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.storageTargetOperations().invalidate("scgroup", "sc", "st1", Context.NONE);
    }
}
