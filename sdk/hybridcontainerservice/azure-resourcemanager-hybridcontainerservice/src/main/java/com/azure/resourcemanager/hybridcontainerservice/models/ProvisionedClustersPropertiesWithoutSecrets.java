// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of provisioned clusters without the corresponding secrets. */
@Fluent
public class ProvisionedClustersPropertiesWithoutSecrets {
    /*
     * AAD profile for the provisioned cluster.
     */
    @JsonProperty(value = "aadProfile")
    private AadProfileResponse aadProfile;

    /*
     * WindowsProfile - Profile for Windows VMs in the Provisioned Cluster.
     */
    @JsonProperty(value = "windowsProfile")
    private WindowsProfileResponse windowsProfile;

    /*
     * HttpProxyConfig - Configurations for provisioning the cluster with HTTP proxy servers.
     */
    @JsonProperty(value = "httpProxyConfig")
    private HttpProxyConfigResponse httpProxyConfig;

    /** Creates an instance of ProvisionedClustersPropertiesWithoutSecrets class. */
    public ProvisionedClustersPropertiesWithoutSecrets() {
    }

    /**
     * Get the aadProfile property: AAD profile for the provisioned cluster.
     *
     * @return the aadProfile value.
     */
    public AadProfileResponse aadProfile() {
        return this.aadProfile;
    }

    /**
     * Set the aadProfile property: AAD profile for the provisioned cluster.
     *
     * @param aadProfile the aadProfile value to set.
     * @return the ProvisionedClustersPropertiesWithoutSecrets object itself.
     */
    public ProvisionedClustersPropertiesWithoutSecrets withAadProfile(AadProfileResponse aadProfile) {
        this.aadProfile = aadProfile;
        return this;
    }

    /**
     * Get the windowsProfile property: WindowsProfile - Profile for Windows VMs in the Provisioned Cluster.
     *
     * @return the windowsProfile value.
     */
    public WindowsProfileResponse windowsProfile() {
        return this.windowsProfile;
    }

    /**
     * Set the windowsProfile property: WindowsProfile - Profile for Windows VMs in the Provisioned Cluster.
     *
     * @param windowsProfile the windowsProfile value to set.
     * @return the ProvisionedClustersPropertiesWithoutSecrets object itself.
     */
    public ProvisionedClustersPropertiesWithoutSecrets withWindowsProfile(WindowsProfileResponse windowsProfile) {
        this.windowsProfile = windowsProfile;
        return this;
    }

    /**
     * Get the httpProxyConfig property: HttpProxyConfig - Configurations for provisioning the cluster with HTTP proxy
     * servers.
     *
     * @return the httpProxyConfig value.
     */
    public HttpProxyConfigResponse httpProxyConfig() {
        return this.httpProxyConfig;
    }

    /**
     * Set the httpProxyConfig property: HttpProxyConfig - Configurations for provisioning the cluster with HTTP proxy
     * servers.
     *
     * @param httpProxyConfig the httpProxyConfig value to set.
     * @return the ProvisionedClustersPropertiesWithoutSecrets object itself.
     */
    public ProvisionedClustersPropertiesWithoutSecrets withHttpProxyConfig(HttpProxyConfigResponse httpProxyConfig) {
        this.httpProxyConfig = httpProxyConfig;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (aadProfile() != null) {
            aadProfile().validate();
        }
        if (windowsProfile() != null) {
            windowsProfile().validate();
        }
        if (httpProxyConfig() != null) {
            httpProxyConfig().validate();
        }
    }
}
