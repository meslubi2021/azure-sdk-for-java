// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines GetByResourceGroup. */
public final class VirtualMachinesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/preview/2020-06-05-preview/examples/GetVirtualMachine.json
     */
    /**
     * Sample code: GetVirtualMachine.
     *
     * @param manager Entry point to ScvmmManager.
     */
    public static void getVirtualMachine(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.virtualMachines().getByResourceGroupWithResponse("testrg", "DemoVM", Context.NONE);
    }
}
