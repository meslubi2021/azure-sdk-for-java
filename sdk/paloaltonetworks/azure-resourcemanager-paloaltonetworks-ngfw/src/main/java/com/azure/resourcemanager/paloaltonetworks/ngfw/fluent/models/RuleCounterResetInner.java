// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Rule counter reset. */
@Fluent
public final class RuleCounterResetInner {
    /*
     * priority number
     */
    @JsonProperty(value = "priority", access = JsonProperty.Access.WRITE_ONLY)
    private String priority;

    /*
     * rule Stack Name
     */
    @JsonProperty(value = "ruleStackName")
    private String ruleStackName;

    /*
     * rule list name
     */
    @JsonProperty(value = "ruleListName")
    private String ruleListName;

    /*
     * firewall name
     */
    @JsonProperty(value = "firewallName")
    private String firewallName;

    /*
     * rule name
     */
    @JsonProperty(value = "ruleName")
    private String ruleName;

    /** Creates an instance of RuleCounterResetInner class. */
    public RuleCounterResetInner() {
    }

    /**
     * Get the priority property: priority number.
     *
     * @return the priority value.
     */
    public String priority() {
        return this.priority;
    }

    /**
     * Get the ruleStackName property: rule Stack Name.
     *
     * @return the ruleStackName value.
     */
    public String ruleStackName() {
        return this.ruleStackName;
    }

    /**
     * Set the ruleStackName property: rule Stack Name.
     *
     * @param ruleStackName the ruleStackName value to set.
     * @return the RuleCounterResetInner object itself.
     */
    public RuleCounterResetInner withRuleStackName(String ruleStackName) {
        this.ruleStackName = ruleStackName;
        return this;
    }

    /**
     * Get the ruleListName property: rule list name.
     *
     * @return the ruleListName value.
     */
    public String ruleListName() {
        return this.ruleListName;
    }

    /**
     * Set the ruleListName property: rule list name.
     *
     * @param ruleListName the ruleListName value to set.
     * @return the RuleCounterResetInner object itself.
     */
    public RuleCounterResetInner withRuleListName(String ruleListName) {
        this.ruleListName = ruleListName;
        return this;
    }

    /**
     * Get the firewallName property: firewall name.
     *
     * @return the firewallName value.
     */
    public String firewallName() {
        return this.firewallName;
    }

    /**
     * Set the firewallName property: firewall name.
     *
     * @param firewallName the firewallName value to set.
     * @return the RuleCounterResetInner object itself.
     */
    public RuleCounterResetInner withFirewallName(String firewallName) {
        this.firewallName = firewallName;
        return this;
    }

    /**
     * Get the ruleName property: rule name.
     *
     * @return the ruleName value.
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName property: rule name.
     *
     * @param ruleName the ruleName value to set.
     * @return the RuleCounterResetInner object itself.
     */
    public RuleCounterResetInner withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
