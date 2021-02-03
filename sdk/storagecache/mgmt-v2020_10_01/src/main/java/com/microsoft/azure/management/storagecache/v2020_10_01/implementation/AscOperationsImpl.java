/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storagecache.v2020_10_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storagecache.v2020_10_01.AscOperations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.storagecache.v2020_10_01.AscOperation;

class AscOperationsImpl extends WrapperImpl<AscOperationsInner> implements AscOperations {
    private final StorageCacheManager manager;

    AscOperationsImpl(StorageCacheManager manager) {
        super(manager.inner().ascOperations());
        this.manager = manager;
    }

    public StorageCacheManager manager() {
        return this.manager;
    }

    private AscOperationImpl wrapModel(AscOperationInner inner) {
        return  new AscOperationImpl(inner, manager());
    }

    @Override
    public Observable<AscOperation> getAsync(String location, String operationId) {
        AscOperationsInner client = this.inner();
        return client.getAsync(location, operationId)
        .flatMap(new Func1<AscOperationInner, Observable<AscOperation>>() {
            @Override
            public Observable<AscOperation> call(AscOperationInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((AscOperation)wrapModel(inner));
                }
            }
       });
    }

}
