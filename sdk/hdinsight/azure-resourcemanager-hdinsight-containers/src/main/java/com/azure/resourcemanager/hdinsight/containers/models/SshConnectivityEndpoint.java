// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSH connectivity endpoint details. */
@Fluent
public final class SshConnectivityEndpoint {
    /*
     * SSH connectivity endpoint.
     */
    @JsonProperty(value = "endpoint", required = true)
    private String endpoint;

    /** Creates an instance of SshConnectivityEndpoint class. */
    public SshConnectivityEndpoint() {
    }

    /**
     * Get the endpoint property: SSH connectivity endpoint.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: SSH connectivity endpoint.
     *
     * @param endpoint the endpoint value to set.
     * @return the SshConnectivityEndpoint object itself.
     */
    public SshConnectivityEndpoint withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoint() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property endpoint in model SshConnectivityEndpoint"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SshConnectivityEndpoint.class);
}
