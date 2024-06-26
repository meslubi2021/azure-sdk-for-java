// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.connectedvmware.fluent.models.VirtualMachineAssessPatchesResultInner;
import com.azure.resourcemanager.connectedvmware.fluent.models.VirtualMachineInner;
import com.azure.resourcemanager.connectedvmware.fluent.models.VirtualMachineInstallPatchesResultInner;
import com.azure.resourcemanager.connectedvmware.models.StopVirtualMachineOptions;
import com.azure.resourcemanager.connectedvmware.models.VirtualMachineInstallPatchesParameters;
import com.azure.resourcemanager.connectedvmware.models.VirtualMachineUpdate;

/** An instance of this class provides access to all the operations defined in VirtualMachinesClient. */
public interface VirtualMachinesClient {
    /**
     * The operation to assess patches on a vSphere VMware machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the vSphere VMware machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes the properties of an AssessPatches result.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineAssessPatchesResultInner>, VirtualMachineAssessPatchesResultInner>
        beginAssessPatches(String resourceGroupName, String name);

    /**
     * The operation to assess patches on a vSphere VMware machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the vSphere VMware machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes the properties of an AssessPatches result.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineAssessPatchesResultInner>, VirtualMachineAssessPatchesResultInner>
        beginAssessPatches(String resourceGroupName, String name, Context context);

    /**
     * The operation to assess patches on a vSphere VMware machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the vSphere VMware machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the properties of an AssessPatches result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineAssessPatchesResultInner assessPatches(String resourceGroupName, String name);

    /**
     * The operation to assess patches on a vSphere VMware machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the vSphere VMware machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the properties of an AssessPatches result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineAssessPatchesResultInner assessPatches(String resourceGroupName, String name, Context context);

    /**
     * The operation to install patches on a vSphere VMware machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the vSphere VMware machine.
     * @param installPatchesInput Input for InstallPatches as directly received by the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the result summary of an installation operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInstallPatchesResultInner>, VirtualMachineInstallPatchesResultInner>
        beginInstallPatches(
            String resourceGroupName, String name, VirtualMachineInstallPatchesParameters installPatchesInput);

    /**
     * The operation to install patches on a vSphere VMware machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the vSphere VMware machine.
     * @param installPatchesInput Input for InstallPatches as directly received by the API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the result summary of an installation operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInstallPatchesResultInner>, VirtualMachineInstallPatchesResultInner>
        beginInstallPatches(
            String resourceGroupName,
            String name,
            VirtualMachineInstallPatchesParameters installPatchesInput,
            Context context);

    /**
     * The operation to install patches on a vSphere VMware machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the vSphere VMware machine.
     * @param installPatchesInput Input for InstallPatches as directly received by the API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result summary of an installation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInstallPatchesResultInner installPatches(
        String resourceGroupName, String name, VirtualMachineInstallPatchesParameters installPatchesInput);

    /**
     * The operation to install patches on a vSphere VMware machine identity in Azure.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the vSphere VMware machine.
     * @param installPatchesInput Input for InstallPatches as directly received by the API.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result summary of an installation operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInstallPatchesResultInner installPatches(
        String resourceGroupName,
        String name,
        VirtualMachineInstallPatchesParameters installPatchesInput,
        Context context);

    /**
     * Implements virtual machine PUT method.
     *
     * <p>Create Or Update virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInner>, VirtualMachineInner> beginCreate(
        String resourceGroupName, String virtualMachineName, VirtualMachineInner body);

    /**
     * Implements virtual machine PUT method.
     *
     * <p>Create Or Update virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInner>, VirtualMachineInner> beginCreate(
        String resourceGroupName, String virtualMachineName, VirtualMachineInner body, Context context);

    /**
     * Implements virtual machine PUT method.
     *
     * <p>Create Or Update virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner create(String resourceGroupName, String virtualMachineName, VirtualMachineInner body);

    /**
     * Implements virtual machine PUT method.
     *
     * <p>Create Or Update virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner create(String resourceGroupName, String virtualMachineName);

    /**
     * Implements virtual machine PUT method.
     *
     * <p>Create Or Update virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner create(
        String resourceGroupName, String virtualMachineName, VirtualMachineInner body, Context context);

    /**
     * Gets a virtual machine.
     *
     * <p>Implements virtual machine GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner getByResourceGroup(String resourceGroupName, String virtualMachineName);

    /**
     * Gets a virtual machine.
     *
     * <p>Implements virtual machine GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachine along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualMachineInner> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Updates a virtual machine.
     *
     * <p>API to update certain properties of the virtual machine resource.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Resource properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInner>, VirtualMachineInner> beginUpdate(
        String resourceGroupName, String virtualMachineName, VirtualMachineUpdate body);

    /**
     * Updates a virtual machine.
     *
     * <p>API to update certain properties of the virtual machine resource.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Resource properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualMachineInner>, VirtualMachineInner> beginUpdate(
        String resourceGroupName, String virtualMachineName, VirtualMachineUpdate body, Context context);

    /**
     * Updates a virtual machine.
     *
     * <p>API to update certain properties of the virtual machine resource.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Resource properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner update(String resourceGroupName, String virtualMachineName, VirtualMachineUpdate body);

    /**
     * Updates a virtual machine.
     *
     * <p>API to update certain properties of the virtual machine resource.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner update(String resourceGroupName, String virtualMachineName);

    /**
     * Updates a virtual machine.
     *
     * <p>API to update certain properties of the virtual machine resource.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Resource properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the virtualMachine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualMachineInner update(
        String resourceGroupName, String virtualMachineName, VirtualMachineUpdate body, Context context);

    /**
     * Deletes an virtual machine.
     *
     * <p>Implements virtual machine DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param force Whether force delete was specified.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualMachineName, Boolean force, Boolean retain);

    /**
     * Deletes an virtual machine.
     *
     * <p>Implements virtual machine DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param force Whether force delete was specified.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualMachineName, Boolean force, Boolean retain, Context context);

    /**
     * Deletes an virtual machine.
     *
     * <p>Implements virtual machine DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param force Whether force delete was specified.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineName, Boolean force, Boolean retain);

    /**
     * Deletes an virtual machine.
     *
     * <p>Implements virtual machine DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineName);

    /**
     * Deletes an virtual machine.
     *
     * <p>Implements virtual machine DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param force Whether force delete was specified.
     * @param retain Whether to just disable the VM from azure and retain the VM in the VMM.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualMachineName, Boolean force, Boolean retain, Context context);

    /**
     * Implements the operation to stop a virtual machine.
     *
     * <p>Stop virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Virtualmachine stop action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body);

    /**
     * Implements the operation to stop a virtual machine.
     *
     * <p>Stop virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Virtualmachine stop action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStop(
        String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body, Context context);

    /**
     * Implements the operation to stop a virtual machine.
     *
     * <p>Stop virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Virtualmachine stop action payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body);

    /**
     * Implements the operation to stop a virtual machine.
     *
     * <p>Stop virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String virtualMachineName);

    /**
     * Implements the operation to stop a virtual machine.
     *
     * <p>Stop virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param body Virtualmachine stop action payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String virtualMachineName, StopVirtualMachineOptions body, Context context);

    /**
     * Implements the operation to start a virtual machine.
     *
     * <p>Start virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String virtualMachineName);

    /**
     * Implements the operation to start a virtual machine.
     *
     * <p>Start virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Implements the operation to start a virtual machine.
     *
     * <p>Start virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String virtualMachineName);

    /**
     * Implements the operation to start a virtual machine.
     *
     * <p>Start virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Implements the operation to restart a virtual machine.
     *
     * <p>Restart virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String virtualMachineName);

    /**
     * Implements the operation to restart a virtual machine.
     *
     * <p>Restart virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginRestart(
        String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Implements the operation to restart a virtual machine.
     *
     * <p>Restart virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String virtualMachineName);

    /**
     * Implements the operation to restart a virtual machine.
     *
     * <p>Restart virtual machine.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param virtualMachineName Name of the virtual machine resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String virtualMachineName, Context context);

    /**
     * Implements GET virtualMachines in a subscription.
     *
     * <p>List of virtualMachines in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInner> list();

    /**
     * Implements GET virtualMachines in a subscription.
     *
     * <p>List of virtualMachines in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInner> list(Context context);

    /**
     * Implements GET virtualMachines in a resource group.
     *
     * <p>List of virtualMachines in a resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInner> listByResourceGroup(String resourceGroupName);

    /**
     * Implements GET virtualMachines in a resource group.
     *
     * <p>List of virtualMachines in a resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualMachines as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualMachineInner> listByResourceGroup(String resourceGroupName, Context context);
}
