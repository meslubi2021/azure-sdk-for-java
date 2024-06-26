// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningState;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningStatusStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The agentPool resource definition. */
@Fluent
public final class AgentPoolInner extends Resource {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private AgentPoolProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The extendedLocation property.
     */
    @JsonProperty(value = "extendedLocation")
    private AgentPoolExtendedLocation extendedLocation;

    /** Creates an instance of AgentPoolInner class. */
    public AgentPoolInner() {
    }

    /**
     * Get the innerProperties property: The properties property.
     *
     * @return the innerProperties value.
     */
    private AgentPoolProperties innerProperties() {
        return this.innerProperties;
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
     * Get the extendedLocation property: The extendedLocation property.
     *
     * @return the extendedLocation value.
     */
    public AgentPoolExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extendedLocation property.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withExtendedLocation(AgentPoolExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public AgentPoolProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool.
     *
     * @return the status value.
     */
    public AgentPoolProvisioningStatusStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: HybridAKSNodePoolStatus defines the observed state of HybridAKSNodePool.
     *
     * @param status the status value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withStatus(AgentPoolProvisioningStatusStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the count property: Count - Number of agents to host docker containers. Allowed values must be in the range
     * of 1 to 100 (inclusive). The default value is 1.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.innerProperties() == null ? null : this.innerProperties().count();
    }

    /**
     * Set the count property: Count - Number of agents to host docker containers. Allowed values must be in the range
     * of 1 to 100 (inclusive). The default value is 1.
     *
     * @param count the count value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withCount(Integer count) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withCount(count);
        return this;
    }

    /**
     * Get the availabilityZones property: AvailabilityZones - The list of Availability zones to use for nodes.
     * Datacenter racks modelled as zones.
     *
     * @return the availabilityZones value.
     */
    public List<String> availabilityZones() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilityZones();
    }

    /**
     * Set the availabilityZones property: AvailabilityZones - The list of Availability zones to use for nodes.
     * Datacenter racks modelled as zones.
     *
     * @param availabilityZones the availabilityZones value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withAvailabilityZones(List<String> availabilityZones) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * Get the maxCount property: The maximum number of nodes for auto-scaling.
     *
     * @return the maxCount value.
     */
    public Integer maxCount() {
        return this.innerProperties() == null ? null : this.innerProperties().maxCount();
    }

    /**
     * Set the maxCount property: The maximum number of nodes for auto-scaling.
     *
     * @param maxCount the maxCount value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withMaxCount(Integer maxCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withMaxCount(maxCount);
        return this;
    }

    /**
     * Get the maxPods property: The maximum number of pods that can run on a node.
     *
     * @return the maxPods value.
     */
    public Integer maxPods() {
        return this.innerProperties() == null ? null : this.innerProperties().maxPods();
    }

    /**
     * Set the maxPods property: The maximum number of pods that can run on a node.
     *
     * @param maxPods the maxPods value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withMaxPods(Integer maxPods) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withMaxPods(maxPods);
        return this;
    }

    /**
     * Get the minCount property: The minimum number of nodes for auto-scaling.
     *
     * @return the minCount value.
     */
    public Integer minCount() {
        return this.innerProperties() == null ? null : this.innerProperties().minCount();
    }

    /**
     * Set the minCount property: The minimum number of nodes for auto-scaling.
     *
     * @param minCount the minCount value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withMinCount(Integer minCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withMinCount(minCount);
        return this;
    }

    /**
     * Get the mode property: Mode - AgentPoolMode represents mode of an agent pool. Possible values include: 'System',
     * 'LB', 'User'. Default is 'User'.
     *
     * @return the mode value.
     */
    public Mode mode() {
        return this.innerProperties() == null ? null : this.innerProperties().mode();
    }

    /**
     * Set the mode property: Mode - AgentPoolMode represents mode of an agent pool. Possible values include: 'System',
     * 'LB', 'User'. Default is 'User'.
     *
     * @param mode the mode value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withMode(Mode mode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withMode(mode);
        return this;
    }

    /**
     * Get the nodeLabels property: NodeLabels - Agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @return the nodeLabels value.
     */
    public Map<String, String> nodeLabels() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeLabels();
    }

    /**
     * Set the nodeLabels property: NodeLabels - Agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @param nodeLabels the nodeLabels value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withNodeLabels(Map<String, String> nodeLabels) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withNodeLabels(nodeLabels);
        return this;
    }

    /**
     * Get the nodeTaints property: NodeTaints - Taints added to new nodes during node pool create and scale. For
     * example, key=value:NoSchedule.
     *
     * @return the nodeTaints value.
     */
    public List<String> nodeTaints() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeTaints();
    }

    /**
     * Set the nodeTaints property: NodeTaints - Taints added to new nodes during node pool create and scale. For
     * example, key=value:NoSchedule.
     *
     * @param nodeTaints the nodeTaints value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withNodeTaints(List<String> nodeTaints) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withNodeTaints(nodeTaints);
        return this;
    }

    /**
     * Get the osType property: OsType - OsType to be used to specify os type. Choose from Linux and Windows. Default to
     * Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @return the osType value.
     */
    public OsType osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: OsType - OsType to be used to specify os type. Choose from Linux and Windows. Default to
     * Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @param osType the osType value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withOsType(OsType osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the nodeImageVersion property: The version of node image.
     *
     * @return the nodeImageVersion value.
     */
    public String nodeImageVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().nodeImageVersion();
    }

    /**
     * Set the nodeImageVersion property: The version of node image.
     *
     * @param nodeImageVersion the nodeImageVersion value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withNodeImageVersion(String nodeImageVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withNodeImageVersion(nodeImageVersion);
        return this;
    }

    /**
     * Get the vmSize property: VmSize - The size of the agent pool VMs.
     *
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.innerProperties() == null ? null : this.innerProperties().vmSize();
    }

    /**
     * Set the vmSize property: VmSize - The size of the agent pool VMs.
     *
     * @param vmSize the vmSize value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withVmSize(String vmSize) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withVmSize(vmSize);
        return this;
    }

    /**
     * Get the cloudProviderProfile property: The underlying cloud infra provider properties.
     *
     * @return the cloudProviderProfile value.
     */
    public CloudProviderProfile cloudProviderProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudProviderProfile();
    }

    /**
     * Set the cloudProviderProfile property: The underlying cloud infra provider properties.
     *
     * @param cloudProviderProfile the cloudProviderProfile value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withCloudProviderProfile(CloudProviderProfile cloudProviderProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withCloudProviderProfile(cloudProviderProfile);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
