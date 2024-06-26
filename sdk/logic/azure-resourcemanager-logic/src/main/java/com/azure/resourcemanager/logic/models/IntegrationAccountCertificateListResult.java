// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountCertificateInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of integration account certificates. */
@Fluent
public final class IntegrationAccountCertificateListResult {
    /*
     * The list of integration account certificates.
     */
    @JsonProperty(value = "value")
    private List<IntegrationAccountCertificateInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of IntegrationAccountCertificateListResult class. */
    public IntegrationAccountCertificateListResult() {
    }

    /**
     * Get the value property: The list of integration account certificates.
     *
     * @return the value value.
     */
    public List<IntegrationAccountCertificateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of integration account certificates.
     *
     * @param value the value value to set.
     * @return the IntegrationAccountCertificateListResult object itself.
     */
    public IntegrationAccountCertificateListResult withValue(List<IntegrationAccountCertificateInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the IntegrationAccountCertificateListResult object itself.
     */
    public IntegrationAccountCertificateListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
