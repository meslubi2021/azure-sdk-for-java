// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.resourcemanager.iotfirmwaredefense.fluent.models.CveInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of Cve. */
public interface Cve {
    /**
     * Gets the cveId property: ID of CVE.
     *
     * @return the cveId value.
     */
    String cveId();

    /**
     * Gets the component property: Component of CVE.
     *
     * @return the component value.
     */
    Object component();

    /**
     * Gets the severity property: Severity of CVE.
     *
     * @return the severity value.
     */
    String severity();

    /**
     * Gets the name property: Name of CVE.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the cvssScore property: A single CVSS score to represent the CVE. If a V3 score is specified, then it will
     * use the V3 score. Otherwise if the V2 score is specified it will be the V2 score.
     *
     * @return the cvssScore value.
     */
    String cvssScore();

    /**
     * Gets the cvssVersion property: Cvss version of CVE.
     *
     * @return the cvssVersion value.
     */
    String cvssVersion();

    /**
     * Gets the cvssV2Score property: Cvss V2 score of CVE.
     *
     * @return the cvssV2Score value.
     */
    String cvssV2Score();

    /**
     * Gets the cvssV3Score property: Cvss V3 score of CVE.
     *
     * @return the cvssV3Score value.
     */
    String cvssV3Score();

    /**
     * Gets the publishDate property: Publish date of CVE.
     *
     * @return the publishDate value.
     */
    OffsetDateTime publishDate();

    /**
     * Gets the updatedDate property: Updated date of CVE.
     *
     * @return the updatedDate value.
     */
    OffsetDateTime updatedDate();

    /**
     * Gets the links property: The list of CVE links.
     *
     * @return the links value.
     */
    List<CveLink> links();

    /**
     * Gets the description property: Description of CVE.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the inner com.azure.resourcemanager.iotfirmwaredefense.fluent.models.CveInner object.
     *
     * @return the inner object.
     */
    CveInner innerModel();
}
