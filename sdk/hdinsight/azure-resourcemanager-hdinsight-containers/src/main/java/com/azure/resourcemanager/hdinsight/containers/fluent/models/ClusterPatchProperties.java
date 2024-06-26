// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hdinsight.containers.models.UpdatableClusterProfile;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cluster resource patch data. */
@Fluent
public final class ClusterPatchProperties {
    /*
     * Cluster resource patch properties.
     */
    @JsonProperty(value = "clusterProfile")
    private UpdatableClusterProfile clusterProfile;

    /** Creates an instance of ClusterPatchProperties class. */
    public ClusterPatchProperties() {
    }

    /**
     * Get the clusterProfile property: Cluster resource patch properties.
     *
     * @return the clusterProfile value.
     */
    public UpdatableClusterProfile clusterProfile() {
        return this.clusterProfile;
    }

    /**
     * Set the clusterProfile property: Cluster resource patch properties.
     *
     * @param clusterProfile the clusterProfile value to set.
     * @return the ClusterPatchProperties object itself.
     */
    public ClusterPatchProperties withClusterProfile(UpdatableClusterProfile clusterProfile) {
        this.clusterProfile = clusterProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterProfile() != null) {
            clusterProfile().validate();
        }
    }
}
