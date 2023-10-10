// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the RequestMethod condition for the delivery rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonTypeName("RequestMethod")
@Fluent
public final class DeliveryRuleRequestMethodCondition extends DeliveryRuleCondition {
    /*
     * Defines the parameters for the condition.
     */
    @JsonProperty(value = "parameters", required = true)
    private RequestMethodMatchConditionParameters parameters;

    /** Creates an instance of DeliveryRuleRequestMethodCondition class. */
    public DeliveryRuleRequestMethodCondition() {
    }

    /**
     * Get the parameters property: Defines the parameters for the condition.
     *
     * @return the parameters value.
     */
    public RequestMethodMatchConditionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Defines the parameters for the condition.
     *
     * @param parameters the parameters value to set.
     * @return the DeliveryRuleRequestMethodCondition object itself.
     */
    public DeliveryRuleRequestMethodCondition withParameters(RequestMethodMatchConditionParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (parameters() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property parameters in model DeliveryRuleRequestMethodCondition"));
        } else {
            parameters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeliveryRuleRequestMethodCondition.class);
}
