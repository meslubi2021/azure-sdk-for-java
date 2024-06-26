// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Dictionary Lookup Element. */
@Immutable
public final class DictionaryLookupItem {
    /*
     * A string giving the normalized form of the source term.
     * For example, if the request is "JOHN", the normalized form will be "john".
     * The content of this field becomes the input to lookup examples.
     */
    @JsonProperty(value = "normalizedSource", required = true)
    private String normalizedSource;

    /*
     * A string giving the source term in a form best suited for end-user display.
     * For example, if the input is "JOHN", the display form will reflect the usual
     * spelling of the name: "John".
     */
    @JsonProperty(value = "displaySource", required = true)
    private String displaySource;

    /*
     * A list of translations for the source term.
     */
    @JsonProperty(value = "translations", required = true)
    private List<DictionaryTranslation> translations;

    /**
     * Creates an instance of DictionaryLookupItem class.
     *
     * @param normalizedSource the normalizedSource value to set.
     * @param displaySource the displaySource value to set.
     * @param translations the translations value to set.
     */
    @JsonCreator
    private DictionaryLookupItem(
            @JsonProperty(value = "normalizedSource", required = true) String normalizedSource,
            @JsonProperty(value = "displaySource", required = true) String displaySource,
            @JsonProperty(value = "translations", required = true) List<DictionaryTranslation> translations) {
        this.normalizedSource = normalizedSource;
        this.displaySource = displaySource;
        this.translations = translations;
    }

    /**
     * Get the normalizedSource property: A string giving the normalized form of the source term. For example, if the
     * request is "JOHN", the normalized form will be "john". The content of this field becomes the input to lookup
     * examples.
     *
     * @return the normalizedSource value.
     */
    public String getNormalizedSource() {
        return this.normalizedSource;
    }

    /**
     * Get the displaySource property: A string giving the source term in a form best suited for end-user display. For
     * example, if the input is "JOHN", the display form will reflect the usual spelling of the name: "John".
     *
     * @return the displaySource value.
     */
    public String getDisplaySource() {
        return this.displaySource;
    }

    /**
     * Get the translations property: A list of translations for the source term.
     *
     * @return the translations value.
     */
    public List<DictionaryTranslation> getTranslations() {
        return this.translations;
    }
}
