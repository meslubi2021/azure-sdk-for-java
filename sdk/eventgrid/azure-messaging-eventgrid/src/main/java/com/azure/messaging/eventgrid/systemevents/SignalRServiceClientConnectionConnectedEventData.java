// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.SignalRService.ClientConnectionConnected event. */
@Fluent
public final class SignalRServiceClientConnectionConnectedEventData {
    /*
     * The time at which the event occurred.
     */
    @JsonProperty(value = "timestamp")
    private OffsetDateTime timestamp;

    /*
     * The hub of connected client connection.
     */
    @JsonProperty(value = "hubName")
    private String hubName;

    /*
     * The connection Id of connected client connection.
     */
    @JsonProperty(value = "connectionId")
    private String connectionId;

    /*
     * The user Id of connected client connection.
     */
    @JsonProperty(value = "userId")
    private String userId;

    /** Creates an instance of SignalRServiceClientConnectionConnectedEventData class. */
    public SignalRServiceClientConnectionConnectedEventData() {}

    /**
     * Get the timestamp property: The time at which the event occurred.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: The time at which the event occurred.
     *
     * @param timestamp the timestamp value to set.
     * @return the SignalRServiceClientConnectionConnectedEventData object itself.
     */
    public SignalRServiceClientConnectionConnectedEventData setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the hubName property: The hub of connected client connection.
     *
     * @return the hubName value.
     */
    public String getHubName() {
        return this.hubName;
    }

    /**
     * Set the hubName property: The hub of connected client connection.
     *
     * @param hubName the hubName value to set.
     * @return the SignalRServiceClientConnectionConnectedEventData object itself.
     */
    public SignalRServiceClientConnectionConnectedEventData setHubName(String hubName) {
        this.hubName = hubName;
        return this;
    }

    /**
     * Get the connectionId property: The connection Id of connected client connection.
     *
     * @return the connectionId value.
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * Set the connectionId property: The connection Id of connected client connection.
     *
     * @param connectionId the connectionId value to set.
     * @return the SignalRServiceClientConnectionConnectedEventData object itself.
     */
    public SignalRServiceClientConnectionConnectedEventData setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Get the userId property: The user Id of connected client connection.
     *
     * @return the userId value.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Set the userId property: The user Id of connected client connection.
     *
     * @param userId the userId value to set.
     * @return the SignalRServiceClientConnectionConnectedEventData object itself.
     */
    public SignalRServiceClientConnectionConnectedEventData setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
