// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.EmailEngagementTrackingReportReceived
 * event.
 */
@Fluent
public final class AcsEmailEngagementTrackingReportReceivedEventData {
    /*
     * The Sender Email Address
     */
    @JsonProperty(value = "sender")
    private String sender;

    /*
     * The Recipient Email Address
     */
    @JsonProperty(value = "recipient")
    private String recipient;

    /*
     * The Id of the email that has been sent
     */
    @JsonProperty(value = "messageId")
    private String messageId;

    /*
     * The time at which the user interacted with the email
     */
    @JsonProperty(value = "userActionTimeStamp")
    private OffsetDateTime userActionTimestamp;

    /*
     * The context of the type of engagement user had with email
     */
    @JsonProperty(value = "engagementContext")
    private String engagementContext;

    /*
     * The user agent interacting with the email
     */
    @JsonProperty(value = "userAgent")
    private String userAgent;

    /*
     * The type of engagement user have with email
     */
    @JsonProperty(value = "engagementType")
    private AcsUserEngagement engagement;

    /** Creates an instance of AcsEmailEngagementTrackingReportReceivedEventData class. */
    public AcsEmailEngagementTrackingReportReceivedEventData() {}

    /**
     * Get the sender property: The Sender Email Address.
     *
     * @return the sender value.
     */
    public String getSender() {
        return this.sender;
    }

    /**
     * Set the sender property: The Sender Email Address.
     *
     * @param sender the sender value to set.
     * @return the AcsEmailEngagementTrackingReportReceivedEventData object itself.
     */
    public AcsEmailEngagementTrackingReportReceivedEventData setSender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get the recipient property: The Recipient Email Address.
     *
     * @return the recipient value.
     */
    public String getRecipient() {
        return this.recipient;
    }

    /**
     * Set the recipient property: The Recipient Email Address.
     *
     * @param recipient the recipient value to set.
     * @return the AcsEmailEngagementTrackingReportReceivedEventData object itself.
     */
    public AcsEmailEngagementTrackingReportReceivedEventData setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Get the messageId property: The Id of the email that has been sent.
     *
     * @return the messageId value.
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The Id of the email that has been sent.
     *
     * @param messageId the messageId value to set.
     * @return the AcsEmailEngagementTrackingReportReceivedEventData object itself.
     */
    public AcsEmailEngagementTrackingReportReceivedEventData setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the userActionTimestamp property: The time at which the user interacted with the email.
     *
     * @return the userActionTimestamp value.
     */
    public OffsetDateTime getUserActionTimestamp() {
        return this.userActionTimestamp;
    }

    /**
     * Set the userActionTimestamp property: The time at which the user interacted with the email.
     *
     * @param userActionTimestamp the userActionTimestamp value to set.
     * @return the AcsEmailEngagementTrackingReportReceivedEventData object itself.
     */
    public AcsEmailEngagementTrackingReportReceivedEventData setUserActionTimestamp(
            OffsetDateTime userActionTimestamp) {
        this.userActionTimestamp = userActionTimestamp;
        return this;
    }

    /**
     * Get the engagementContext property: The context of the type of engagement user had with email.
     *
     * @return the engagementContext value.
     */
    public String getEngagementContext() {
        return this.engagementContext;
    }

    /**
     * Set the engagementContext property: The context of the type of engagement user had with email.
     *
     * @param engagementContext the engagementContext value to set.
     * @return the AcsEmailEngagementTrackingReportReceivedEventData object itself.
     */
    public AcsEmailEngagementTrackingReportReceivedEventData setEngagementContext(String engagementContext) {
        this.engagementContext = engagementContext;
        return this;
    }

    /**
     * Get the userAgent property: The user agent interacting with the email.
     *
     * @return the userAgent value.
     */
    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * Set the userAgent property: The user agent interacting with the email.
     *
     * @param userAgent the userAgent value to set.
     * @return the AcsEmailEngagementTrackingReportReceivedEventData object itself.
     */
    public AcsEmailEngagementTrackingReportReceivedEventData setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * Get the engagement property: The type of engagement user have with email.
     *
     * @return the engagement value.
     */
    public AcsUserEngagement getEngagement() {
        return this.engagement;
    }

    /**
     * Set the engagement property: The type of engagement user have with email.
     *
     * @param engagement the engagement value to set.
     * @return the AcsEmailEngagementTrackingReportReceivedEventData object itself.
     */
    public AcsEmailEngagementTrackingReportReceivedEventData setEngagement(AcsUserEngagement engagement) {
        this.engagement = engagement;
        return this;
    }
}
