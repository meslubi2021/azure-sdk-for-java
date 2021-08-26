// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayAutoscaleConfiguration;
import com.azure.resourcemanager.network.models.ApplicationGatewayBackendAddressPool;
import com.azure.resourcemanager.network.models.ApplicationGatewayBackendHttpSettings;
import com.azure.resourcemanager.network.models.ApplicationGatewayCustomError;
import com.azure.resourcemanager.network.models.ApplicationGatewayFrontendIpConfiguration;
import com.azure.resourcemanager.network.models.ApplicationGatewayFrontendPort;
import com.azure.resourcemanager.network.models.ApplicationGatewayHttpListener;
import com.azure.resourcemanager.network.models.ApplicationGatewayOperationalState;
import com.azure.resourcemanager.network.models.ApplicationGatewayPrivateLinkConfiguration;
import com.azure.resourcemanager.network.models.ApplicationGatewayRewriteRuleSet;
import com.azure.resourcemanager.network.models.ApplicationGatewaySku;
import com.azure.resourcemanager.network.models.ApplicationGatewaySslPolicy;
import com.azure.resourcemanager.network.models.ApplicationGatewaySslProfile;
import com.azure.resourcemanager.network.models.ApplicationGatewayTrustedClientCertificate;
import com.azure.resourcemanager.network.models.ApplicationGatewayTrustedRootCertificate;
import com.azure.resourcemanager.network.models.ApplicationGatewayWebApplicationFirewallConfiguration;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of the application gateway. */
@Fluent
public final class ApplicationGatewayPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayPropertiesFormat.class);

    /*
     * SKU of the application gateway resource.
     */
    @JsonProperty(value = "sku")
    private ApplicationGatewaySku sku;

    /*
     * SSL policy of the application gateway resource.
     */
    @JsonProperty(value = "sslPolicy")
    private ApplicationGatewaySslPolicy sslPolicy;

    /*
     * Operational state of the application gateway resource.
     */
    @JsonProperty(value = "operationalState", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationGatewayOperationalState operationalState;

    /*
     * Subnets of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "gatewayIPConfigurations")
    private List<ApplicationGatewayIpConfigurationInner> gatewayIpConfigurations;

    /*
     * Authentication certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "authenticationCertificates")
    private List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates;

    /*
     * Trusted Root certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "trustedRootCertificates")
    private List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates;

    /*
     * Trusted client certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "trustedClientCertificates")
    private List<ApplicationGatewayTrustedClientCertificate> trustedClientCertificates;

    /*
     * SSL certificates of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "sslCertificates")
    private List<ApplicationGatewaySslCertificateInner> sslCertificates;

    /*
     * Frontend IP addresses of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "frontendIPConfigurations")
    private List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations;

    /*
     * Frontend ports of the application gateway resource. For default limits,
     * see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "frontendPorts")
    private List<ApplicationGatewayFrontendPort> frontendPorts;

    /*
     * Probes of the application gateway resource.
     */
    @JsonProperty(value = "probes")
    private List<ApplicationGatewayProbeInner> probes;

    /*
     * Backend address pool of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "backendAddressPools")
    private List<ApplicationGatewayBackendAddressPool> backendAddressPools;

    /*
     * Backend http settings of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "backendHttpSettingsCollection")
    private List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection;

    /*
     * Http listeners of the application gateway resource. For default limits,
     * see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "httpListeners")
    private List<ApplicationGatewayHttpListener> httpListeners;

    /*
     * SSL profiles of the application gateway resource. For default limits,
     * see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "sslProfiles")
    private List<ApplicationGatewaySslProfile> sslProfiles;

    /*
     * URL path map of the application gateway resource. For default limits,
     * see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "urlPathMaps")
    private List<ApplicationGatewayUrlPathMapInner> urlPathMaps;

    /*
     * Request routing rules of the application gateway resource.
     */
    @JsonProperty(value = "requestRoutingRules")
    private List<ApplicationGatewayRequestRoutingRuleInner> requestRoutingRules;

    /*
     * Rewrite rules for the application gateway resource.
     */
    @JsonProperty(value = "rewriteRuleSets")
    private List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets;

    /*
     * Redirect configurations of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     */
    @JsonProperty(value = "redirectConfigurations")
    private List<ApplicationGatewayRedirectConfigurationInner> redirectConfigurations;

    /*
     * Web application firewall configuration.
     */
    @JsonProperty(value = "webApplicationFirewallConfiguration")
    private ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration;

    /*
     * Reference to the FirewallPolicy resource.
     */
    @JsonProperty(value = "firewallPolicy")
    private SubResource firewallPolicy;

    /*
     * Whether HTTP2 is enabled on the application gateway resource.
     */
    @JsonProperty(value = "enableHttp2")
    private Boolean enableHttp2;

    /*
     * Whether FIPS is enabled on the application gateway resource.
     */
    @JsonProperty(value = "enableFips")
    private Boolean enableFips;

    /*
     * Autoscale Configuration.
     */
    @JsonProperty(value = "autoscaleConfiguration")
    private ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration;

    /*
     * PrivateLink configurations on application gateway.
     */
    @JsonProperty(value = "privateLinkConfigurations")
    private List<ApplicationGatewayPrivateLinkConfiguration> privateLinkConfigurations;

    /*
     * Private Endpoint connections on application gateway.
     */
    @JsonProperty(value = "privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationGatewayPrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The resource GUID property of the application gateway resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the application gateway resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Custom error configurations of the application gateway resource.
     */
    @JsonProperty(value = "customErrorConfigurations")
    private List<ApplicationGatewayCustomError> customErrorConfigurations;

    /*
     * If true, associates a firewall policy with an application gateway
     * regardless whether the policy differs from the WAF Config.
     */
    @JsonProperty(value = "forceFirewallPolicyAssociation")
    private Boolean forceFirewallPolicyAssociation;

    /**
     * Get the sku property: SKU of the application gateway resource.
     *
     * @return the sku value.
     */
    public ApplicationGatewaySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the application gateway resource.
     *
     * @param sku the sku value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withSku(ApplicationGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the sslPolicy property: SSL policy of the application gateway resource.
     *
     * @return the sslPolicy value.
     */
    public ApplicationGatewaySslPolicy sslPolicy() {
        return this.sslPolicy;
    }

    /**
     * Set the sslPolicy property: SSL policy of the application gateway resource.
     *
     * @param sslPolicy the sslPolicy value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withSslPolicy(ApplicationGatewaySslPolicy sslPolicy) {
        this.sslPolicy = sslPolicy;
        return this;
    }

    /**
     * Get the operationalState property: Operational state of the application gateway resource.
     *
     * @return the operationalState value.
     */
    public ApplicationGatewayOperationalState operationalState() {
        return this.operationalState;
    }

    /**
     * Get the gatewayIpConfigurations property: Subnets of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the gatewayIpConfigurations value.
     */
    public List<ApplicationGatewayIpConfigurationInner> gatewayIpConfigurations() {
        return this.gatewayIpConfigurations;
    }

    /**
     * Set the gatewayIpConfigurations property: Subnets of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param gatewayIpConfigurations the gatewayIpConfigurations value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withGatewayIpConfigurations(
        List<ApplicationGatewayIpConfigurationInner> gatewayIpConfigurations) {
        this.gatewayIpConfigurations = gatewayIpConfigurations;
        return this;
    }

    /**
     * Get the authenticationCertificates property: Authentication certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the authenticationCertificates value.
     */
    public List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates() {
        return this.authenticationCertificates;
    }

    /**
     * Set the authenticationCertificates property: Authentication certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param authenticationCertificates the authenticationCertificates value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withAuthenticationCertificates(
        List<ApplicationGatewayAuthenticationCertificateInner> authenticationCertificates) {
        this.authenticationCertificates = authenticationCertificates;
        return this;
    }

    /**
     * Get the trustedRootCertificates property: Trusted Root certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the trustedRootCertificates value.
     */
    public List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates() {
        return this.trustedRootCertificates;
    }

    /**
     * Set the trustedRootCertificates property: Trusted Root certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param trustedRootCertificates the trustedRootCertificates value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withTrustedRootCertificates(
        List<ApplicationGatewayTrustedRootCertificate> trustedRootCertificates) {
        this.trustedRootCertificates = trustedRootCertificates;
        return this;
    }

    /**
     * Get the trustedClientCertificates property: Trusted client certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the trustedClientCertificates value.
     */
    public List<ApplicationGatewayTrustedClientCertificate> trustedClientCertificates() {
        return this.trustedClientCertificates;
    }

    /**
     * Set the trustedClientCertificates property: Trusted client certificates of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param trustedClientCertificates the trustedClientCertificates value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withTrustedClientCertificates(
        List<ApplicationGatewayTrustedClientCertificate> trustedClientCertificates) {
        this.trustedClientCertificates = trustedClientCertificates;
        return this;
    }

    /**
     * Get the sslCertificates property: SSL certificates of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the sslCertificates value.
     */
    public List<ApplicationGatewaySslCertificateInner> sslCertificates() {
        return this.sslCertificates;
    }

    /**
     * Set the sslCertificates property: SSL certificates of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param sslCertificates the sslCertificates value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withSslCertificates(
        List<ApplicationGatewaySslCertificateInner> sslCertificates) {
        this.sslCertificates = sslCertificates;
        return this;
    }

    /**
     * Get the frontendIpConfigurations property: Frontend IP addresses of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the frontendIpConfigurations value.
     */
    public List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: Frontend IP addresses of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withFrontendIpConfigurations(
        List<ApplicationGatewayFrontendIpConfiguration> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Get the frontendPorts property: Frontend ports of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the frontendPorts value.
     */
    public List<ApplicationGatewayFrontendPort> frontendPorts() {
        return this.frontendPorts;
    }

    /**
     * Set the frontendPorts property: Frontend ports of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param frontendPorts the frontendPorts value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withFrontendPorts(List<ApplicationGatewayFrontendPort> frontendPorts) {
        this.frontendPorts = frontendPorts;
        return this;
    }

    /**
     * Get the probes property: Probes of the application gateway resource.
     *
     * @return the probes value.
     */
    public List<ApplicationGatewayProbeInner> probes() {
        return this.probes;
    }

    /**
     * Set the probes property: Probes of the application gateway resource.
     *
     * @param probes the probes value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withProbes(List<ApplicationGatewayProbeInner> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * Get the backendAddressPools property: Backend address pool of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the backendAddressPools value.
     */
    public List<ApplicationGatewayBackendAddressPool> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: Backend address pool of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withBackendAddressPools(
        List<ApplicationGatewayBackendAddressPool> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get the backendHttpSettingsCollection property: Backend http settings of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the backendHttpSettingsCollection value.
     */
    public List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection() {
        return this.backendHttpSettingsCollection;
    }

    /**
     * Set the backendHttpSettingsCollection property: Backend http settings of the application gateway resource. For
     * default limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param backendHttpSettingsCollection the backendHttpSettingsCollection value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withBackendHttpSettingsCollection(
        List<ApplicationGatewayBackendHttpSettings> backendHttpSettingsCollection) {
        this.backendHttpSettingsCollection = backendHttpSettingsCollection;
        return this;
    }

    /**
     * Get the httpListeners property: Http listeners of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the httpListeners value.
     */
    public List<ApplicationGatewayHttpListener> httpListeners() {
        return this.httpListeners;
    }

    /**
     * Set the httpListeners property: Http listeners of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param httpListeners the httpListeners value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withHttpListeners(List<ApplicationGatewayHttpListener> httpListeners) {
        this.httpListeners = httpListeners;
        return this;
    }

    /**
     * Get the sslProfiles property: SSL profiles of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the sslProfiles value.
     */
    public List<ApplicationGatewaySslProfile> sslProfiles() {
        return this.sslProfiles;
    }

    /**
     * Set the sslProfiles property: SSL profiles of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param sslProfiles the sslProfiles value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withSslProfiles(List<ApplicationGatewaySslProfile> sslProfiles) {
        this.sslProfiles = sslProfiles;
        return this;
    }

    /**
     * Get the urlPathMaps property: URL path map of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the urlPathMaps value.
     */
    public List<ApplicationGatewayUrlPathMapInner> urlPathMaps() {
        return this.urlPathMaps;
    }

    /**
     * Set the urlPathMaps property: URL path map of the application gateway resource. For default limits, see
     * [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param urlPathMaps the urlPathMaps value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withUrlPathMaps(List<ApplicationGatewayUrlPathMapInner> urlPathMaps) {
        this.urlPathMaps = urlPathMaps;
        return this;
    }

    /**
     * Get the requestRoutingRules property: Request routing rules of the application gateway resource.
     *
     * @return the requestRoutingRules value.
     */
    public List<ApplicationGatewayRequestRoutingRuleInner> requestRoutingRules() {
        return this.requestRoutingRules;
    }

    /**
     * Set the requestRoutingRules property: Request routing rules of the application gateway resource.
     *
     * @param requestRoutingRules the requestRoutingRules value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withRequestRoutingRules(
        List<ApplicationGatewayRequestRoutingRuleInner> requestRoutingRules) {
        this.requestRoutingRules = requestRoutingRules;
        return this;
    }

    /**
     * Get the rewriteRuleSets property: Rewrite rules for the application gateway resource.
     *
     * @return the rewriteRuleSets value.
     */
    public List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets() {
        return this.rewriteRuleSets;
    }

    /**
     * Set the rewriteRuleSets property: Rewrite rules for the application gateway resource.
     *
     * @param rewriteRuleSets the rewriteRuleSets value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withRewriteRuleSets(
        List<ApplicationGatewayRewriteRuleSet> rewriteRuleSets) {
        this.rewriteRuleSets = rewriteRuleSets;
        return this;
    }

    /**
     * Get the redirectConfigurations property: Redirect configurations of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @return the redirectConfigurations value.
     */
    public List<ApplicationGatewayRedirectConfigurationInner> redirectConfigurations() {
        return this.redirectConfigurations;
    }

    /**
     * Set the redirectConfigurations property: Redirect configurations of the application gateway resource. For default
     * limits, see [Application Gateway
     * limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     *
     * @param redirectConfigurations the redirectConfigurations value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withRedirectConfigurations(
        List<ApplicationGatewayRedirectConfigurationInner> redirectConfigurations) {
        this.redirectConfigurations = redirectConfigurations;
        return this;
    }

    /**
     * Get the webApplicationFirewallConfiguration property: Web application firewall configuration.
     *
     * @return the webApplicationFirewallConfiguration value.
     */
    public ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration() {
        return this.webApplicationFirewallConfiguration;
    }

    /**
     * Set the webApplicationFirewallConfiguration property: Web application firewall configuration.
     *
     * @param webApplicationFirewallConfiguration the webApplicationFirewallConfiguration value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withWebApplicationFirewallConfiguration(
        ApplicationGatewayWebApplicationFirewallConfiguration webApplicationFirewallConfiguration) {
        this.webApplicationFirewallConfiguration = webApplicationFirewallConfiguration;
        return this;
    }

    /**
     * Get the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy property: Reference to the FirewallPolicy resource.
     *
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get the enableHttp2 property: Whether HTTP2 is enabled on the application gateway resource.
     *
     * @return the enableHttp2 value.
     */
    public Boolean enableHttp2() {
        return this.enableHttp2;
    }

    /**
     * Set the enableHttp2 property: Whether HTTP2 is enabled on the application gateway resource.
     *
     * @param enableHttp2 the enableHttp2 value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withEnableHttp2(Boolean enableHttp2) {
        this.enableHttp2 = enableHttp2;
        return this;
    }

    /**
     * Get the enableFips property: Whether FIPS is enabled on the application gateway resource.
     *
     * @return the enableFips value.
     */
    public Boolean enableFips() {
        return this.enableFips;
    }

    /**
     * Set the enableFips property: Whether FIPS is enabled on the application gateway resource.
     *
     * @param enableFips the enableFips value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withEnableFips(Boolean enableFips) {
        this.enableFips = enableFips;
        return this;
    }

    /**
     * Get the autoscaleConfiguration property: Autoscale Configuration.
     *
     * @return the autoscaleConfiguration value.
     */
    public ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration() {
        return this.autoscaleConfiguration;
    }

    /**
     * Set the autoscaleConfiguration property: Autoscale Configuration.
     *
     * @param autoscaleConfiguration the autoscaleConfiguration value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withAutoscaleConfiguration(
        ApplicationGatewayAutoscaleConfiguration autoscaleConfiguration) {
        this.autoscaleConfiguration = autoscaleConfiguration;
        return this;
    }

    /**
     * Get the privateLinkConfigurations property: PrivateLink configurations on application gateway.
     *
     * @return the privateLinkConfigurations value.
     */
    public List<ApplicationGatewayPrivateLinkConfiguration> privateLinkConfigurations() {
        return this.privateLinkConfigurations;
    }

    /**
     * Set the privateLinkConfigurations property: PrivateLink configurations on application gateway.
     *
     * @param privateLinkConfigurations the privateLinkConfigurations value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withPrivateLinkConfigurations(
        List<ApplicationGatewayPrivateLinkConfiguration> privateLinkConfigurations) {
        this.privateLinkConfigurations = privateLinkConfigurations;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: Private Endpoint connections on application gateway.
     *
     * @return the privateEndpointConnections value.
     */
    public List<ApplicationGatewayPrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the application gateway resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the application gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the customErrorConfigurations property: Custom error configurations of the application gateway resource.
     *
     * @return the customErrorConfigurations value.
     */
    public List<ApplicationGatewayCustomError> customErrorConfigurations() {
        return this.customErrorConfigurations;
    }

    /**
     * Set the customErrorConfigurations property: Custom error configurations of the application gateway resource.
     *
     * @param customErrorConfigurations the customErrorConfigurations value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withCustomErrorConfigurations(
        List<ApplicationGatewayCustomError> customErrorConfigurations) {
        this.customErrorConfigurations = customErrorConfigurations;
        return this;
    }

    /**
     * Get the forceFirewallPolicyAssociation property: If true, associates a firewall policy with an application
     * gateway regardless whether the policy differs from the WAF Config.
     *
     * @return the forceFirewallPolicyAssociation value.
     */
    public Boolean forceFirewallPolicyAssociation() {
        return this.forceFirewallPolicyAssociation;
    }

    /**
     * Set the forceFirewallPolicyAssociation property: If true, associates a firewall policy with an application
     * gateway regardless whether the policy differs from the WAF Config.
     *
     * @param forceFirewallPolicyAssociation the forceFirewallPolicyAssociation value to set.
     * @return the ApplicationGatewayPropertiesFormat object itself.
     */
    public ApplicationGatewayPropertiesFormat withForceFirewallPolicyAssociation(
        Boolean forceFirewallPolicyAssociation) {
        this.forceFirewallPolicyAssociation = forceFirewallPolicyAssociation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (sslPolicy() != null) {
            sslPolicy().validate();
        }
        if (gatewayIpConfigurations() != null) {
            gatewayIpConfigurations().forEach(e -> e.validate());
        }
        if (authenticationCertificates() != null) {
            authenticationCertificates().forEach(e -> e.validate());
        }
        if (trustedRootCertificates() != null) {
            trustedRootCertificates().forEach(e -> e.validate());
        }
        if (trustedClientCertificates() != null) {
            trustedClientCertificates().forEach(e -> e.validate());
        }
        if (sslCertificates() != null) {
            sslCertificates().forEach(e -> e.validate());
        }
        if (frontendIpConfigurations() != null) {
            frontendIpConfigurations().forEach(e -> e.validate());
        }
        if (frontendPorts() != null) {
            frontendPorts().forEach(e -> e.validate());
        }
        if (probes() != null) {
            probes().forEach(e -> e.validate());
        }
        if (backendAddressPools() != null) {
            backendAddressPools().forEach(e -> e.validate());
        }
        if (backendHttpSettingsCollection() != null) {
            backendHttpSettingsCollection().forEach(e -> e.validate());
        }
        if (httpListeners() != null) {
            httpListeners().forEach(e -> e.validate());
        }
        if (sslProfiles() != null) {
            sslProfiles().forEach(e -> e.validate());
        }
        if (urlPathMaps() != null) {
            urlPathMaps().forEach(e -> e.validate());
        }
        if (requestRoutingRules() != null) {
            requestRoutingRules().forEach(e -> e.validate());
        }
        if (rewriteRuleSets() != null) {
            rewriteRuleSets().forEach(e -> e.validate());
        }
        if (redirectConfigurations() != null) {
            redirectConfigurations().forEach(e -> e.validate());
        }
        if (webApplicationFirewallConfiguration() != null) {
            webApplicationFirewallConfiguration().validate();
        }
        if (autoscaleConfiguration() != null) {
            autoscaleConfiguration().validate();
        }
        if (privateLinkConfigurations() != null) {
            privateLinkConfigurations().forEach(e -> e.validate());
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (customErrorConfigurations() != null) {
            customErrorConfigurations().forEach(e -> e.validate());
        }
    }
}
