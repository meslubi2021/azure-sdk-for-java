// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ComputeProfile;
import com.azure.resourcemanager.hdinsight.containers.models.ProvisioningStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cluster resource properties. */
@Fluent
public final class ClusterResourceProperties {
    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStatus provisioningState;

    /*
     * The type of cluster.
     */
    @JsonProperty(value = "clusterType", required = true)
    private String clusterType;

    /*
     * A unique id generated by the RP to identify the resource.
     */
    @JsonProperty(value = "deploymentId", access = JsonProperty.Access.WRITE_ONLY)
    private String deploymentId;

    /*
     * The compute profile.
     */
    @JsonProperty(value = "computeProfile", required = true)
    private ComputeProfile computeProfile;

    /*
     * Cluster profile.
     */
    @JsonProperty(value = "clusterProfile", required = true)
    private ClusterProfile clusterProfile;

    /*
     * Business status of the resource.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /** Creates an instance of ClusterResourceProperties class. */
    public ClusterResourceProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStatus provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the clusterType property: The type of cluster.
     *
     * @return the clusterType value.
     */
    public String clusterType() {
        return this.clusterType;
    }

    /**
     * Set the clusterType property: The type of cluster.
     *
     * @param clusterType the clusterType value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * Get the deploymentId property: A unique id generated by the RP to identify the resource.
     *
     * @return the deploymentId value.
     */
    public String deploymentId() {
        return this.deploymentId;
    }

    /**
     * Get the computeProfile property: The compute profile.
     *
     * @return the computeProfile value.
     */
    public ComputeProfile computeProfile() {
        return this.computeProfile;
    }

    /**
     * Set the computeProfile property: The compute profile.
     *
     * @param computeProfile the computeProfile value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withComputeProfile(ComputeProfile computeProfile) {
        this.computeProfile = computeProfile;
        return this;
    }

    /**
     * Get the clusterProfile property: Cluster profile.
     *
     * @return the clusterProfile value.
     */
    public ClusterProfile clusterProfile() {
        return this.clusterProfile;
    }

    /**
     * Set the clusterProfile property: Cluster profile.
     *
     * @param clusterProfile the clusterProfile value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withClusterProfile(ClusterProfile clusterProfile) {
        this.clusterProfile = clusterProfile;
        return this;
    }

    /**
     * Get the status property: Business status of the resource.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clusterType in model ClusterResourceProperties"));
        }
        if (computeProfile() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property computeProfile in model ClusterResourceProperties"));
        } else {
            computeProfile().validate();
        }
        if (clusterProfile() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clusterProfile in model ClusterResourceProperties"));
        } else {
            clusterProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterResourceProperties.class);
}
