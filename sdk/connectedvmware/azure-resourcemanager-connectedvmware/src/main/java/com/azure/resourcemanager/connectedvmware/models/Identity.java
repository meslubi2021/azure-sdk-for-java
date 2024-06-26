// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Managed service identity. */
@Fluent
public class Identity {
    /*
     * The principal id of managed service identity.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant of managed service identity.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The type of managed service identity.
     */
    @JsonProperty(value = "type", required = true)
    private IdentityType type;

    /**
     * Get the principalId property: The principal id of managed service identity.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant of managed service identity.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of managed service identity.
     *
     * @return the type value.
     */
    public IdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of managed service identity.
     *
     * @param type the type value to set.
     * @return the Identity object itself.
     */
    public Identity withType(IdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property type in model Identity"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Identity.class);
}
