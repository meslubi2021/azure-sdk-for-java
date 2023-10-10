// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.cdn.generated.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.generated.models.AutoGeneratedDomainNameLabelScope;
import com.azure.resourcemanager.cdn.generated.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.generated.models.EnabledState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Azure Front Door endpoint is the entity within a Azure Front Door profile containing configuration information such
 * as origin, protocol, content caching and delivery behavior. The AzureFrontDoor endpoint uses the URL format
 * &lt;endpointname&gt;.azureedge.net.
 */
@Fluent
public final class AfdEndpointInner extends Resource {
    /*
     * The JSON object that contains the properties required to create an endpoint.
     */
    @JsonProperty(value = "properties")
    private AfdEndpointProperties innerProperties;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of AfdEndpointInner class. */
    public AfdEndpointInner() {
    }

    /**
     * Get the innerProperties property: The JSON object that contains the properties required to create an endpoint.
     *
     * @return the innerProperties value.
     */
    private AfdEndpointProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public AfdEndpointInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdEndpointInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the hostname property: The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g.
     * contoso.azureedge.net.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the autoGeneratedDomainNameLabelScope property: Indicates the endpoint name reuse scope. The default value is
     * TenantReuse.
     *
     * @return the autoGeneratedDomainNameLabelScope value.
     */
    public AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope() {
        return this.innerProperties() == null ? null : this.innerProperties().autoGeneratedDomainNameLabelScope();
    }

    /**
     * Set the autoGeneratedDomainNameLabelScope property: Indicates the endpoint name reuse scope. The default value is
     * TenantReuse.
     *
     * @param autoGeneratedDomainNameLabelScope the autoGeneratedDomainNameLabelScope value to set.
     * @return the AfdEndpointInner object itself.
     */
    public AfdEndpointInner withAutoGeneratedDomainNameLabelScope(
        AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdEndpointProperties();
        }
        this.innerProperties().withAutoGeneratedDomainNameLabelScope(autoGeneratedDomainNameLabelScope);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentStatus();
    }

    /**
     * Get the profileName property: The name of the profile which holds the endpoint.
     *
     * @return the profileName value.
     */
    public String profileName() {
        return this.innerProperties() == null ? null : this.innerProperties().profileName();
    }

    /**
     * Get the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @return the enabledState value.
     */
    public EnabledState enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'.
     *
     * @param enabledState the enabledState value to set.
     * @return the AfdEndpointInner object itself.
     */
    public AfdEndpointInner withEnabledState(EnabledState enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdEndpointProperties();
        }
        this.innerProperties().withEnabledState(enabledState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
