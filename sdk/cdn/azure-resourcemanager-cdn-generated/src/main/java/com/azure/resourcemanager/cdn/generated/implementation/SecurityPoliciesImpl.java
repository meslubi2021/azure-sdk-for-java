// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.fluent.SecurityPoliciesClient;
import com.azure.resourcemanager.cdn.generated.fluent.models.SecurityPolicyInner;
import com.azure.resourcemanager.cdn.generated.models.SecurityPolicies;
import com.azure.resourcemanager.cdn.generated.models.SecurityPolicy;

public final class SecurityPoliciesImpl implements SecurityPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(SecurityPoliciesImpl.class);

    private final SecurityPoliciesClient innerClient;

    private final com.azure.resourcemanager.cdn.generated.CdnManager serviceManager;

    public SecurityPoliciesImpl(
        SecurityPoliciesClient innerClient, com.azure.resourcemanager.cdn.generated.CdnManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityPolicy> listByProfile(String resourceGroupName, String profileName) {
        PagedIterable<SecurityPolicyInner> inner = this.serviceClient().listByProfile(resourceGroupName, profileName);
        return Utils.mapPage(inner, inner1 -> new SecurityPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityPolicy> listByProfile(String resourceGroupName, String profileName, Context context) {
        PagedIterable<SecurityPolicyInner> inner =
            this.serviceClient().listByProfile(resourceGroupName, profileName, context);
        return Utils.mapPage(inner, inner1 -> new SecurityPolicyImpl(inner1, this.manager()));
    }

    public Response<SecurityPolicy> getWithResponse(
        String resourceGroupName, String profileName, String securityPolicyName, Context context) {
        Response<SecurityPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, profileName, securityPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityPolicy get(String resourceGroupName, String profileName, String securityPolicyName) {
        SecurityPolicyInner inner = this.serviceClient().get(resourceGroupName, profileName, securityPolicyName);
        if (inner != null) {
            return new SecurityPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String profileName, String securityPolicyName) {
        this.serviceClient().delete(resourceGroupName, profileName, securityPolicyName);
    }

    public void delete(String resourceGroupName, String profileName, String securityPolicyName, Context context) {
        this.serviceClient().delete(resourceGroupName, profileName, securityPolicyName, context);
    }

    public SecurityPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String securityPolicyName = Utils.getValueFromIdByName(id, "securityPolicies");
        if (securityPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, profileName, securityPolicyName, Context.NONE).getValue();
    }

    public Response<SecurityPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String securityPolicyName = Utils.getValueFromIdByName(id, "securityPolicies");
        if (securityPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityPolicies'.", id)));
        }
        return this.getWithResponse(resourceGroupName, profileName, securityPolicyName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String securityPolicyName = Utils.getValueFromIdByName(id, "securityPolicies");
        if (securityPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityPolicies'.", id)));
        }
        this.delete(resourceGroupName, profileName, securityPolicyName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String profileName = Utils.getValueFromIdByName(id, "profiles");
        if (profileName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'profiles'.", id)));
        }
        String securityPolicyName = Utils.getValueFromIdByName(id, "securityPolicies");
        if (securityPolicyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityPolicies'.", id)));
        }
        this.delete(resourceGroupName, profileName, securityPolicyName, context);
    }

    private SecurityPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cdn.generated.CdnManager manager() {
        return this.serviceManager;
    }

    public SecurityPolicyImpl define(String name) {
        return new SecurityPolicyImpl(name, this.manager());
    }
}
