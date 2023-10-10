// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.cdn.generated.models.HealthProbeParameters;
import com.azure.resourcemanager.cdn.generated.models.OriginGroupProvisioningState;
import com.azure.resourcemanager.cdn.generated.models.OriginGroupResourceState;
import com.azure.resourcemanager.cdn.generated.models.ResourceReference;
import com.azure.resourcemanager.cdn.generated.models.ResponseBasedOriginErrorDetectionParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Origin group comprising of origins is used for load balancing to origins when the content cannot be served from CDN.
 */
@Fluent
public final class OriginGroupInner extends ProxyResource {
    /*
     * The JSON object that contains the properties of the origin group.
     */
    @JsonProperty(value = "properties")
    private OriginGroupProperties innerProperties;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of OriginGroupInner class. */
    public OriginGroupInner() {
    }

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the origin group.
     *
     * @return the innerProperties value.
     */
    private OriginGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the resourceState property: Resource status of the origin group.
     *
     * @return the resourceState value.
     */
    public OriginGroupResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the provisioningState property: Provisioning status of the origin group.
     *
     * @return the provisioningState value.
     */
    public OriginGroupProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @return the healthProbeSettings value.
     */
    public HealthProbeParameters healthProbeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().healthProbeSettings();
    }

    /**
     * Set the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the OriginGroupInner object itself.
     */
    public OriginGroupInner withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupProperties();
        }
        this.innerProperties().withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /**
     * Get the origins property: The source of the content being delivered via CDN within given origin group.
     *
     * @return the origins value.
     */
    public List<ResourceReference> origins() {
        return this.innerProperties() == null ? null : this.innerProperties().origins();
    }

    /**
     * Set the origins property: The source of the content being delivered via CDN within given origin group.
     *
     * @param origins the origins value to set.
     * @return the OriginGroupInner object itself.
     */
    public OriginGroupInner withOrigins(List<ResourceReference> origins) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupProperties();
        }
        this.innerProperties().withOrigins(origins);
        return this;
    }

    /**
     * Get the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @return the trafficRestorationTimeToHealedOrNewEndpointsInMinutes value.
     */
    public Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().trafficRestorationTimeToHealedOrNewEndpointsInMinutes();
    }

    /**
     * Set the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes the
     *     trafficRestorationTimeToHealedOrNewEndpointsInMinutes value to set.
     * @return the OriginGroupInner object itself.
     */
    public OriginGroupInner withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupProperties();
        }
        this
            .innerProperties()
            .withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        return this;
    }

    /**
     * Get the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     *
     * @return the responseBasedOriginErrorDetectionSettings value.
     */
    public ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().responseBasedOriginErrorDetectionSettings();
    }

    /**
     * Set the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses. This property is currently not supported.
     *
     * @param responseBasedOriginErrorDetectionSettings the responseBasedOriginErrorDetectionSettings value to set.
     * @return the OriginGroupInner object itself.
     */
    public OriginGroupInner withResponseBasedOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OriginGroupProperties();
        }
        this.innerProperties().withResponseBasedOriginErrorDetectionSettings(responseBasedOriginErrorDetectionSettings);
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
    }
}
