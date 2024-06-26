// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sku information related properties of a server. */
@Fluent
public final class ServerSku {
    /*
     * The name of the sku, typically, tier + family + cores, e.g. Standard_D4s_v3.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The tier of the particular SKU, e.g. Burstable.
     */
    @JsonProperty(value = "tier", required = true)
    private SkuTier tier;

    /** Creates an instance of ServerSku class. */
    public ServerSku() {
    }

    /**
     * Get the name property: The name of the sku, typically, tier + family + cores, e.g. Standard_D4s_v3.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the sku, typically, tier + family + cores, e.g. Standard_D4s_v3.
     *
     * @param name the name value to set.
     * @return the ServerSku object itself.
     */
    public ServerSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The tier of the particular SKU, e.g. Burstable.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier of the particular SKU, e.g. Burstable.
     *
     * @param tier the tier value to set.
     * @return the ServerSku object itself.
     */
    public ServerSku withTier(SkuTier tier) {
        this.tier = tier;
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
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model ServerSku"));
        }
        if (tier() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property tier in model ServerSku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServerSku.class);
}
