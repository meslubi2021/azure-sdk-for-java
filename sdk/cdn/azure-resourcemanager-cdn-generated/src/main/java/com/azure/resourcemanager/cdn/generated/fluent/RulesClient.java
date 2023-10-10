// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cdn.generated.fluent.models.RuleInner;
import com.azure.resourcemanager.cdn.generated.models.RuleUpdateParameters;

/** An instance of this class provides access to all the operations defined in RulesClient. */
public interface RulesClient {
    /**
     * Lists all of the existing delivery rules within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RuleInner> listByRuleSet(String resourceGroupName, String profileName, String ruleSetName);

    /**
     * Lists all of the existing delivery rules within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RuleInner> listByRuleSet(
        String resourceGroupName, String profileName, String ruleSetName, Context context);

    /**
     * Gets an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing delivery rule within a rule set along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RuleInner> getWithResponse(
        String resourceGroupName, String profileName, String ruleSetName, String ruleName, Context context);

    /**
     * Gets an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an existing delivery rule within a rule set.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RuleInner get(String resourceGroupName, String profileName, String ruleSetName, String ruleName);

    /**
     * Creates a new delivery rule within the specified rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param rule The delivery rule properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of friendly Rules name mapping to the any Rules or secret related
     *     information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RuleInner>, RuleInner> beginCreate(
        String resourceGroupName, String profileName, String ruleSetName, String ruleName, RuleInner rule);

    /**
     * Creates a new delivery rule within the specified rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param rule The delivery rule properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of friendly Rules name mapping to the any Rules or secret related
     *     information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RuleInner>, RuleInner> beginCreate(
        String resourceGroupName,
        String profileName,
        String ruleSetName,
        String ruleName,
        RuleInner rule,
        Context context);

    /**
     * Creates a new delivery rule within the specified rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param rule The delivery rule properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Rules name mapping to the any Rules or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RuleInner create(String resourceGroupName, String profileName, String ruleSetName, String ruleName, RuleInner rule);

    /**
     * Creates a new delivery rule within the specified rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param rule The delivery rule properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Rules name mapping to the any Rules or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RuleInner create(
        String resourceGroupName,
        String profileName,
        String ruleSetName,
        String ruleName,
        RuleInner rule,
        Context context);

    /**
     * Updates an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param ruleUpdateProperties Delivery rule properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of friendly Rules name mapping to the any Rules or secret related
     *     information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RuleInner>, RuleInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String ruleSetName,
        String ruleName,
        RuleUpdateParameters ruleUpdateProperties);

    /**
     * Updates an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param ruleUpdateProperties Delivery rule properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of friendly Rules name mapping to the any Rules or secret related
     *     information.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RuleInner>, RuleInner> beginUpdate(
        String resourceGroupName,
        String profileName,
        String ruleSetName,
        String ruleName,
        RuleUpdateParameters ruleUpdateProperties,
        Context context);

    /**
     * Updates an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param ruleUpdateProperties Delivery rule properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Rules name mapping to the any Rules or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RuleInner update(
        String resourceGroupName,
        String profileName,
        String ruleSetName,
        String ruleName,
        RuleUpdateParameters ruleUpdateProperties);

    /**
     * Updates an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param ruleUpdateProperties Delivery rule properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return friendly Rules name mapping to the any Rules or secret related information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RuleInner update(
        String resourceGroupName,
        String profileName,
        String ruleSetName,
        String ruleName,
        RuleUpdateParameters ruleUpdateProperties,
        Context context);

    /**
     * Deletes an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String ruleSetName, String ruleName);

    /**
     * Deletes an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String profileName, String ruleSetName, String ruleName, Context context);

    /**
     * Deletes an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String ruleSetName, String ruleName);

    /**
     * Deletes an existing delivery rule within a rule set.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group.
     * @param ruleSetName Name of the rule set under the profile.
     * @param ruleName Name of the delivery rule which is unique within the endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String profileName, String ruleSetName, String ruleName, Context context);
}
