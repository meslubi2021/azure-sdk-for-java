// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Locations and availability zones where the SKU is available. */
@Fluent
public final class ResourceSkuLocationInfo {
    /*
     * Gets location of the SKU
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Gets list of availability zones where the SKU is supported.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * Gets details of capabilities available to a SKU in specific zones.
     */
    @JsonProperty(value = "zoneDetails")
    private List<ResourceSkuZoneDetails> zoneDetails;

    /**
     * Get the location property: Gets location of the SKU.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Gets location of the SKU.
     *
     * @param location the location value to set.
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the zones property: Gets list of availability zones where the SKU is supported.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Gets list of availability zones where the SKU is supported.
     *
     * @param zones the zones value to set.
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the zoneDetails property: Gets details of capabilities available to a SKU in specific zones.
     *
     * @return the zoneDetails value.
     */
    public List<ResourceSkuZoneDetails> zoneDetails() {
        return this.zoneDetails;
    }

    /**
     * Set the zoneDetails property: Gets details of capabilities available to a SKU in specific zones.
     *
     * @param zoneDetails the zoneDetails value to set.
     * @return the ResourceSkuLocationInfo object itself.
     */
    public ResourceSkuLocationInfo withZoneDetails(List<ResourceSkuZoneDetails> zoneDetails) {
        this.zoneDetails = zoneDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (zoneDetails() != null) {
            zoneDetails().forEach(e -> e.validate());
        }
    }
}
