// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.fluent.models.DeepCreatedCustomDomainProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Custom domains created on the CDN endpoint. */
@Fluent
public final class DeepCreatedCustomDomain {
    /*
     * Custom domain name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Properties of the custom domain created on the CDN endpoint.
     */
    @JsonProperty(value = "properties")
    private DeepCreatedCustomDomainProperties innerProperties;

    /** Creates an instance of DeepCreatedCustomDomain class. */
    public DeepCreatedCustomDomain() {
    }

    /**
     * Get the name property: Custom domain name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Custom domain name.
     *
     * @param name the name value to set.
     * @return the DeepCreatedCustomDomain object itself.
     */
    public DeepCreatedCustomDomain withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the custom domain created on the CDN endpoint.
     *
     * @return the innerProperties value.
     */
    private DeepCreatedCustomDomainProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @param hostname the hostname value to set.
     * @return the DeepCreatedCustomDomain object itself.
     */
    public DeepCreatedCustomDomain withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeepCreatedCustomDomainProperties();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     *
     * @return the validationData value.
     */
    public String validationData() {
        return this.innerProperties() == null ? null : this.innerProperties().validationData();
    }

    /**
     * Set the validationData property: Special validation or data may be required when delivering CDN to some regions
     * due to local compliance reasons. E.g. ICP license number of a custom domain is required to deliver content in
     * China.
     *
     * @param validationData the validationData value to set.
     * @return the DeepCreatedCustomDomain object itself.
     */
    public DeepCreatedCustomDomain withValidationData(String validationData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeepCreatedCustomDomainProperties();
        }
        this.innerProperties().withValidationData(validationData);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model DeepCreatedCustomDomain"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeepCreatedCustomDomain.class);
}
