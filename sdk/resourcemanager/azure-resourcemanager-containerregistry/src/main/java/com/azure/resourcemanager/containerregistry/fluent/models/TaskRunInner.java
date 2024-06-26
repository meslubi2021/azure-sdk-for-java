// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.containerregistry.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.models.RunRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The task run that has the ARM resource and properties. The task run will have the information of request and result
 * of a run.
 */
@Fluent
public final class TaskRunInner extends ProxyResource {
    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties identity;

    /*
     * The properties associated with the task run, i.e., request and result of the run
     */
    @JsonProperty(value = "properties")
    private TaskRunPropertiesInner innerProperties;

    /*
     * The location of the resource
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of TaskRunInner class. */
    public TaskRunInner() {
    }

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public IdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the TaskRunInner object itself.
     */
    public TaskRunInner withIdentity(IdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: The properties associated with the task run, i.e., request and result of the
     * run.
     *
     * @return the innerProperties value.
     */
    private TaskRunPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: The location of the resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the resource.
     *
     * @param location the location value to set.
     * @return the TaskRunInner object itself.
     */
    public TaskRunInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of this task run.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the runRequest property: The request (parameters) for the run.
     *
     * @return the runRequest value.
     */
    public RunRequest runRequest() {
        return this.innerProperties() == null ? null : this.innerProperties().runRequest();
    }

    /**
     * Set the runRequest property: The request (parameters) for the run.
     *
     * @param runRequest the runRequest value to set.
     * @return the TaskRunInner object itself.
     */
    public TaskRunInner withRunRequest(RunRequest runRequest) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskRunPropertiesInner();
        }
        this.innerProperties().withRunRequest(runRequest);
        return this;
    }

    /**
     * Get the runResult property: The result of this task run.
     *
     * @return the runResult value.
     */
    public RunInner runResult() {
        return this.innerProperties() == null ? null : this.innerProperties().runResult();
    }

    /**
     * Get the forceUpdateTag property: How the run should be forced to rerun even if the run request configuration has
     * not changed.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.innerProperties() == null ? null : this.innerProperties().forceUpdateTag();
    }

    /**
     * Set the forceUpdateTag property: How the run should be forced to rerun even if the run request configuration has
     * not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the TaskRunInner object itself.
     */
    public TaskRunInner withForceUpdateTag(String forceUpdateTag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TaskRunPropertiesInner();
        }
        this.innerProperties().withForceUpdateTag(forceUpdateTag);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
