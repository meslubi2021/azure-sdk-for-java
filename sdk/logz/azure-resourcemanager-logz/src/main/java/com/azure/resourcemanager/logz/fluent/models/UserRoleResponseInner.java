// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.logz.models.UserRole;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response for checking user's role for Logz.io account. */
@Fluent
public final class UserRoleResponseInner {
    /*
     * User roles on configured in Logz.io account.
     */
    @JsonProperty(value = "role")
    private UserRole role;

    /** Creates an instance of UserRoleResponseInner class. */
    public UserRoleResponseInner() {
    }

    /**
     * Get the role property: User roles on configured in Logz.io account.
     *
     * @return the role value.
     */
    public UserRole role() {
        return this.role;
    }

    /**
     * Set the role property: User roles on configured in Logz.io account.
     *
     * @param role the role value to set.
     * @return the UserRoleResponseInner object itself.
     */
    public UserRoleResponseInner withRole(UserRole role) {
        this.role = role;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
