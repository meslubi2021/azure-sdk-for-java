// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The json object containing security policy waf parameters. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("WebApplicationFirewall")
@Fluent
public final class SecurityPolicyWebApplicationFirewallParameters extends SecurityPolicyPropertiesParameters {
    /*
     * Resource ID.
     */
    @JsonProperty(value = "wafPolicy")
    private ResourceReference wafPolicy;

    /*
     * Waf associations
     */
    @JsonProperty(value = "associations")
    private List<SecurityPolicyWebApplicationFirewallAssociation> associations;

    /** Creates an instance of SecurityPolicyWebApplicationFirewallParameters class. */
    public SecurityPolicyWebApplicationFirewallParameters() {
    }

    /**
     * Get the wafPolicy property: Resource ID.
     *
     * @return the wafPolicy value.
     */
    public ResourceReference wafPolicy() {
        return this.wafPolicy;
    }

    /**
     * Set the wafPolicy property: Resource ID.
     *
     * @param wafPolicy the wafPolicy value to set.
     * @return the SecurityPolicyWebApplicationFirewallParameters object itself.
     */
    public SecurityPolicyWebApplicationFirewallParameters withWafPolicy(ResourceReference wafPolicy) {
        this.wafPolicy = wafPolicy;
        return this;
    }

    /**
     * Get the associations property: Waf associations.
     *
     * @return the associations value.
     */
    public List<SecurityPolicyWebApplicationFirewallAssociation> associations() {
        return this.associations;
    }

    /**
     * Set the associations property: Waf associations.
     *
     * @param associations the associations value to set.
     * @return the SecurityPolicyWebApplicationFirewallParameters object itself.
     */
    public SecurityPolicyWebApplicationFirewallParameters withAssociations(
        List<SecurityPolicyWebApplicationFirewallAssociation> associations) {
        this.associations = associations;
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
        if (wafPolicy() != null) {
            wafPolicy().validate();
        }
        if (associations() != null) {
            associations().forEach(e -> e.validate());
        }
    }
}
