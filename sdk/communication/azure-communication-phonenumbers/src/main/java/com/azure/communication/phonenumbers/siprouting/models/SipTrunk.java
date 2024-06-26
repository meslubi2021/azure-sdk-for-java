// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.siprouting.models;

import com.azure.core.annotation.Immutable;

/** Represents a SIP trunk for routing calls. See RFC 4904. */
@Immutable
public final class SipTrunk {
    /*
     * Gets or sets FQDN of the trunk.
     */
    private final String fqdn;
    /*
     * Gets or sets SIP signaling port of the trunk.
     */
    private final int sipSignalingPort;

    /**
     * Constructor with required properties.
     * @param fqdn the FQDN of the trunk.
     * @param sipSignalingPort the SIP signaling port of the trunk.
     */
    public SipTrunk(String fqdn, int sipSignalingPort) {
        this.fqdn = fqdn;
        this.sipSignalingPort = sipSignalingPort;
    }

    /**
     * Get the fqdn property: Gets or sets FQDN of the trunk.
     *
     * @return the fqdn value.
     */
    public String getFqdn() {
        return this.fqdn;
    }

    /**
     * Get the sipSignalingPort property: Gets or sets SIP signaling port of the trunk.
     *
     * @return the sipSignalingPort value.
     */
    public int getSipSignalingPort() {
        return this.sipSignalingPort;
    }
}
