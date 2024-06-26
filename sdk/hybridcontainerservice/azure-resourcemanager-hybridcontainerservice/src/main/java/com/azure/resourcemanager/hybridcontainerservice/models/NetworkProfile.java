// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** NetworkProfile - Profile of network configuration. */
@Fluent
public final class NetworkProfile {
    /*
     * LoadBalancerProfile - Profile of the cluster load balancer.
     */
    @JsonProperty(value = "loadBalancerProfile")
    private LoadBalancerProfile loadBalancerProfile;

    /*
     * LoadBalancerSku - The load balancer sku for the provisioned cluster. Possible values: 'unstacked-haproxy',
     * 'stacked-kube-vip', 'stacked-metallb', 'unmanaged'. The default is 'unmanaged'.
     */
    @JsonProperty(value = "loadBalancerSku")
    private LoadBalancerSku loadBalancerSku;

    /*
     * DNSServiceIP - An IP address assigned to the Kubernetes DNS service. It must be within the Kubernetes service
     * address range specified in serviceCidr.
     */
    @JsonProperty(value = "dnsServiceIP")
    private String dnsServiceIp;

    /*
     * NetworkPolicy - Network policy used for building Kubernetes network. Possible values include: 'calico',
     * 'flannel'. Default is 'calico'
     */
    @JsonProperty(value = "networkPolicy")
    private NetworkPolicy networkPolicy;

    /*
     * PodCidr - A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     */
    @JsonProperty(value = "podCidr")
    private String podCidr;

    /*
     * The CIDR notation IP ranges from which to assign pod IPs. One IPv4 CIDR is expected for single-stack networking.
     * Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack networking.
     */
    @JsonProperty(value = "podCidrs")
    private List<String> podCidrs;

    /*
     * ServiceCidr - A CIDR notation IP range from which to assign service cluster IPs. It must not overlap with any
     * Subnet IP ranges.
     */
    @JsonProperty(value = "serviceCidr")
    private String serviceCidr;

    /*
     * The CIDR notation IP ranges from which to assign service cluster IPs. One IPv4 CIDR is expected for single-stack
     * networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack networking. They must not
     * overlap with any Subnet IP ranges.
     */
    @JsonProperty(value = "serviceCidrs")
    private List<String> serviceCidrs;

    /** Creates an instance of NetworkProfile class. */
    public NetworkProfile() {
    }

    /**
     * Get the loadBalancerProfile property: LoadBalancerProfile - Profile of the cluster load balancer.
     *
     * @return the loadBalancerProfile value.
     */
    public LoadBalancerProfile loadBalancerProfile() {
        return this.loadBalancerProfile;
    }

    /**
     * Set the loadBalancerProfile property: LoadBalancerProfile - Profile of the cluster load balancer.
     *
     * @param loadBalancerProfile the loadBalancerProfile value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withLoadBalancerProfile(LoadBalancerProfile loadBalancerProfile) {
        this.loadBalancerProfile = loadBalancerProfile;
        return this;
    }

    /**
     * Get the loadBalancerSku property: LoadBalancerSku - The load balancer sku for the provisioned cluster. Possible
     * values: 'unstacked-haproxy', 'stacked-kube-vip', 'stacked-metallb', 'unmanaged'. The default is 'unmanaged'.
     *
     * @return the loadBalancerSku value.
     */
    public LoadBalancerSku loadBalancerSku() {
        return this.loadBalancerSku;
    }

    /**
     * Set the loadBalancerSku property: LoadBalancerSku - The load balancer sku for the provisioned cluster. Possible
     * values: 'unstacked-haproxy', 'stacked-kube-vip', 'stacked-metallb', 'unmanaged'. The default is 'unmanaged'.
     *
     * @param loadBalancerSku the loadBalancerSku value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withLoadBalancerSku(LoadBalancerSku loadBalancerSku) {
        this.loadBalancerSku = loadBalancerSku;
        return this;
    }

    /**
     * Get the dnsServiceIp property: DNSServiceIP - An IP address assigned to the Kubernetes DNS service. It must be
     * within the Kubernetes service address range specified in serviceCidr.
     *
     * @return the dnsServiceIp value.
     */
    public String dnsServiceIp() {
        return this.dnsServiceIp;
    }

    /**
     * Set the dnsServiceIp property: DNSServiceIP - An IP address assigned to the Kubernetes DNS service. It must be
     * within the Kubernetes service address range specified in serviceCidr.
     *
     * @param dnsServiceIp the dnsServiceIp value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withDnsServiceIp(String dnsServiceIp) {
        this.dnsServiceIp = dnsServiceIp;
        return this;
    }

    /**
     * Get the networkPolicy property: NetworkPolicy - Network policy used for building Kubernetes network. Possible
     * values include: 'calico', 'flannel'. Default is 'calico'.
     *
     * @return the networkPolicy value.
     */
    public NetworkPolicy networkPolicy() {
        return this.networkPolicy;
    }

    /**
     * Set the networkPolicy property: NetworkPolicy - Network policy used for building Kubernetes network. Possible
     * values include: 'calico', 'flannel'. Default is 'calico'.
     *
     * @param networkPolicy the networkPolicy value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withNetworkPolicy(NetworkPolicy networkPolicy) {
        this.networkPolicy = networkPolicy;
        return this;
    }

    /**
     * Get the podCidr property: PodCidr - A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     *
     * @return the podCidr value.
     */
    public String podCidr() {
        return this.podCidr;
    }

    /**
     * Set the podCidr property: PodCidr - A CIDR notation IP range from which to assign pod IPs when kubenet is used.
     *
     * @param podCidr the podCidr value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withPodCidr(String podCidr) {
        this.podCidr = podCidr;
        return this;
    }

    /**
     * Get the podCidrs property: The CIDR notation IP ranges from which to assign pod IPs. One IPv4 CIDR is expected
     * for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack
     * networking.
     *
     * @return the podCidrs value.
     */
    public List<String> podCidrs() {
        return this.podCidrs;
    }

    /**
     * Set the podCidrs property: The CIDR notation IP ranges from which to assign pod IPs. One IPv4 CIDR is expected
     * for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for dual-stack
     * networking.
     *
     * @param podCidrs the podCidrs value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withPodCidrs(List<String> podCidrs) {
        this.podCidrs = podCidrs;
        return this;
    }

    /**
     * Get the serviceCidr property: ServiceCidr - A CIDR notation IP range from which to assign service cluster IPs. It
     * must not overlap with any Subnet IP ranges.
     *
     * @return the serviceCidr value.
     */
    public String serviceCidr() {
        return this.serviceCidr;
    }

    /**
     * Set the serviceCidr property: ServiceCidr - A CIDR notation IP range from which to assign service cluster IPs. It
     * must not overlap with any Subnet IP ranges.
     *
     * @param serviceCidr the serviceCidr value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withServiceCidr(String serviceCidr) {
        this.serviceCidr = serviceCidr;
        return this;
    }

    /**
     * Get the serviceCidrs property: The CIDR notation IP ranges from which to assign service cluster IPs. One IPv4
     * CIDR is expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for
     * dual-stack networking. They must not overlap with any Subnet IP ranges.
     *
     * @return the serviceCidrs value.
     */
    public List<String> serviceCidrs() {
        return this.serviceCidrs;
    }

    /**
     * Set the serviceCidrs property: The CIDR notation IP ranges from which to assign service cluster IPs. One IPv4
     * CIDR is expected for single-stack networking. Two CIDRs, one for each IP family (IPv4/IPv6), is expected for
     * dual-stack networking. They must not overlap with any Subnet IP ranges.
     *
     * @param serviceCidrs the serviceCidrs value to set.
     * @return the NetworkProfile object itself.
     */
    public NetworkProfile withServiceCidrs(List<String> serviceCidrs) {
        this.serviceCidrs = serviceCidrs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (loadBalancerProfile() != null) {
            loadBalancerProfile().validate();
        }
    }
}
