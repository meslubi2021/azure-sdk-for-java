// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.fluent.RuleSetsClient;
import com.azure.resourcemanager.cdn.generated.fluent.models.RuleSetInner;
import com.azure.resourcemanager.cdn.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.cdn.generated.models.RuleSet;
import com.azure.resourcemanager.cdn.generated.models.RuleSets;
import com.azure.resourcemanager.cdn.generated.models.Usage;

public final class RuleSetsImpl implements RuleSets {
    private static final ClientLogger LOGGER = new ClientLogger(RuleSetsImpl.class);

    private final RuleSetsClient innerClient;

    private final com.azure.resourcemanager.cdn.generated.CdnManager serviceManager;

    public RuleSetsImpl(RuleSetsClient innerClient, com.azure.resourcemanager.cdn.generated.CdnManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RuleSet> listByProfile(String resourceGroupName, String profileName) {
        PagedIterable<RuleSetInner> inner = this.serviceClient().listByProfile(resourceGroupName, profileName);
        return Utils.mapPage(inner, inner1 -> new RuleSetImpl(inner1, this.manager()));
    }

    public PagedIterable<RuleSet> listByProfile(String resourceGroupName, String profileName, Context context) {
        PagedIterable<RuleSetInner> inner = this.serviceClient().listByProfile(resourceGroupName, profileName, context);
        return Utils.mapPage(inner, inner1 -> new RuleSetImpl(inner1, this.manager()));
    }

    public Response<RuleSet> getWithResponse(
        String resourceGroupName, String profileName, String ruleSetName, Context context) {
        Response<RuleSetInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, profileName, ruleSetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RuleSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RuleSet get(String resourceGroupName, String profileName, String ruleSetName) {
        RuleSetInner inner = this.serviceClient().get(resourceGroupName, profileName, ruleSetName);
        if (inner != null) {
            return new RuleSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RuleSet> createWithResponse(
        String resourceGroupName, String profileName, String ruleSetName, Context context) {
        Response<RuleSetInner> inner =
            this.serviceClient().createWithResponse(resourceGroupName, profileName, ruleSetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RuleSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RuleSet create(String resourceGroupName, String profileName, String ruleSetName) {
        RuleSetInner inner = this.serviceClient().create(resourceGroupName, profileName, ruleSetName);
        if (inner != null) {
            return new RuleSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String profileName, String ruleSetName) {
        this.serviceClient().delete(resourceGroupName, profileName, ruleSetName);
    }

    public void delete(String resourceGroupName, String profileName, String ruleSetName, Context context) {
        this.serviceClient().delete(resourceGroupName, profileName, ruleSetName, context);
    }

    public PagedIterable<Usage> listResourceUsage(String resourceGroupName, String profileName, String ruleSetName) {
        PagedIterable<UsageInner> inner =
            this.serviceClient().listResourceUsage(resourceGroupName, profileName, ruleSetName);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listResourceUsage(
        String resourceGroupName, String profileName, String ruleSetName, Context context) {
        PagedIterable<UsageInner> inner =
            this.serviceClient().listResourceUsage(resourceGroupName, profileName, ruleSetName, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    private RuleSetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cdn.generated.CdnManager manager() {
        return this.serviceManager;
    }
}
