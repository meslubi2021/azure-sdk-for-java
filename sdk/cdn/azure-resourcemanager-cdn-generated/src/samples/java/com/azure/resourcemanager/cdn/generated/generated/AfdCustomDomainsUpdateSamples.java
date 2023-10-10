// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.resourcemanager.cdn.generated.models.AfdCertificateType;
import com.azure.resourcemanager.cdn.generated.models.AfdDomain;
import com.azure.resourcemanager.cdn.generated.models.AfdDomainHttpsParameters;
import com.azure.resourcemanager.cdn.generated.models.AfdMinimumTlsVersion;
import com.azure.resourcemanager.cdn.generated.models.ResourceReference;

/** Samples for AfdCustomDomains Update. */
public final class AfdCustomDomainsUpdateSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2023-05-01/examples/AFDCustomDomains_Update.json
     */
    /**
     * Sample code: AFDCustomDomains_Update.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void aFDCustomDomainsUpdate(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        AfdDomain resource =
            manager
                .afdCustomDomains()
                .getWithResponse("RG", "profile1", "domain1", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTlsSettings(
                new AfdDomainHttpsParameters()
                    .withCertificateType(AfdCertificateType.CUSTOMER_CERTIFICATE)
                    .withMinimumTlsVersion(AfdMinimumTlsVersion.TLS12))
            .withAzureDnsZone(new ResourceReference().withId(""))
            .apply();
    }
}
