// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.CountriesResponseInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.CountriesResponse;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.Country;
import java.util.Collections;
import java.util.List;

public final class CountriesResponseImpl implements CountriesResponse {
    private CountriesResponseInner innerObject;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    CountriesResponseImpl(
        CountriesResponseInner innerObject,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Country> value() {
        List<Country> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public CountriesResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }
}
