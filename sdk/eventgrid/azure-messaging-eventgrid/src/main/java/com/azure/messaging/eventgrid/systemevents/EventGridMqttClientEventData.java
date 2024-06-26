// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of the Data property of an EventGridEvent for MQTT Client state changes. */
@Fluent
public class EventGridMqttClientEventData {
    /*
     * Unique identifier for the MQTT client that the client presents to the service for authentication. This
     * case-sensitive string can be up to 128 characters long, and supports UTF-8 characters.
     */
    @JsonProperty(value = "clientAuthenticationName")
    private String clientAuthenticationName;

    /*
     * Name of the client resource in the Event Grid namespace.
     */
    @JsonProperty(value = "clientName")
    private String clientName;

    /*
     * Name of the Event Grid namespace where the MQTT client was created or updated.
     */
    @JsonProperty(value = "namespaceName")
    private String namespaceName;

    /** Creates an instance of EventGridMqttClientEventData class. */
    public EventGridMqttClientEventData() {}

    /**
     * Get the clientAuthenticationName property: Unique identifier for the MQTT client that the client presents to the
     * service for authentication. This case-sensitive string can be up to 128 characters long, and supports UTF-8
     * characters.
     *
     * @return the clientAuthenticationName value.
     */
    public String getClientAuthenticationName() {
        return this.clientAuthenticationName;
    }

    /**
     * Set the clientAuthenticationName property: Unique identifier for the MQTT client that the client presents to the
     * service for authentication. This case-sensitive string can be up to 128 characters long, and supports UTF-8
     * characters.
     *
     * @param clientAuthenticationName the clientAuthenticationName value to set.
     * @return the EventGridMqttClientEventData object itself.
     */
    public EventGridMqttClientEventData setClientAuthenticationName(String clientAuthenticationName) {
        this.clientAuthenticationName = clientAuthenticationName;
        return this;
    }

    /**
     * Get the clientName property: Name of the client resource in the Event Grid namespace.
     *
     * @return the clientName value.
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * Set the clientName property: Name of the client resource in the Event Grid namespace.
     *
     * @param clientName the clientName value to set.
     * @return the EventGridMqttClientEventData object itself.
     */
    public EventGridMqttClientEventData setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Get the namespaceName property: Name of the Event Grid namespace where the MQTT client was created or updated.
     *
     * @return the namespaceName value.
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Set the namespaceName property: Name of the Event Grid namespace where the MQTT client was created or updated.
     *
     * @param namespaceName the namespaceName value to set.
     * @return the EventGridMqttClientEventData object itself.
     */
    public EventGridMqttClientEventData setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
}
