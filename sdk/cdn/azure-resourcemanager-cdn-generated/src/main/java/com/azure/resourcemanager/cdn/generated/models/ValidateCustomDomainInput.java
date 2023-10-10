// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input of the custom domain to be validated for DNS mapping. */
@Fluent
public final class ValidateCustomDomainInput {
    /*
     * The host name of the custom domain. Must be a domain name.
     */
    @JsonProperty(value = "hostName", required = true)
    private String hostname;

    /** Creates an instance of ValidateCustomDomainInput class. */
    public ValidateCustomDomainInput() {
    }

    /**
     * Get the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the custom domain. Must be a domain name.
     *
     * @param hostname the hostname value to set.
     * @return the ValidateCustomDomainInput object itself.
     */
    public ValidateCustomDomainInput withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostname() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property hostname in model ValidateCustomDomainInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ValidateCustomDomainInput.class);
}
