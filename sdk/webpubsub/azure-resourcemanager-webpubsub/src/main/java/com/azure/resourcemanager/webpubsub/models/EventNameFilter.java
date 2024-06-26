// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Filter events by their name. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("EventName")
@Fluent
public final class EventNameFilter extends EventListenerFilter {
    /*
     * Gets or sets a list of system events. Supported events: "connected" and "disconnected". Blocking event "connect"
     * is not supported because it requires a response.
     */
    @JsonProperty(value = "systemEvents")
    private List<String> systemEvents;

    /*
     * Gets or sets a matching pattern for event names.
     * There are 3 kinds of patterns supported:
     * 1. "*", it matches any event name
     * 2. Combine multiple events with ",", for example "event1,event2", it matches events "event1" and "event2"
     * 3. A single event name, for example, "event1", it matches "event1"
     */
    @JsonProperty(value = "userEventPattern")
    private String userEventPattern;

    /** Creates an instance of EventNameFilter class. */
    public EventNameFilter() {
    }

    /**
     * Get the systemEvents property: Gets or sets a list of system events. Supported events: "connected" and
     * "disconnected". Blocking event "connect" is not supported because it requires a response.
     *
     * @return the systemEvents value.
     */
    public List<String> systemEvents() {
        return this.systemEvents;
    }

    /**
     * Set the systemEvents property: Gets or sets a list of system events. Supported events: "connected" and
     * "disconnected". Blocking event "connect" is not supported because it requires a response.
     *
     * @param systemEvents the systemEvents value to set.
     * @return the EventNameFilter object itself.
     */
    public EventNameFilter withSystemEvents(List<String> systemEvents) {
        this.systemEvents = systemEvents;
        return this;
    }

    /**
     * Get the userEventPattern property: Gets or sets a matching pattern for event names. There are 3 kinds of patterns
     * supported: 1. "*", it matches any event name 2. Combine multiple events with ",", for example "event1,event2", it
     * matches events "event1" and "event2" 3. A single event name, for example, "event1", it matches "event1".
     *
     * @return the userEventPattern value.
     */
    public String userEventPattern() {
        return this.userEventPattern;
    }

    /**
     * Set the userEventPattern property: Gets or sets a matching pattern for event names. There are 3 kinds of patterns
     * supported: 1. "*", it matches any event name 2. Combine multiple events with ",", for example "event1,event2", it
     * matches events "event1" and "event2" 3. A single event name, for example, "event1", it matches "event1".
     *
     * @param userEventPattern the userEventPattern value to set.
     * @return the EventNameFilter object itself.
     */
    public EventNameFilter withUserEventPattern(String userEventPattern) {
        this.userEventPattern = userEventPattern;
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
    }
}
