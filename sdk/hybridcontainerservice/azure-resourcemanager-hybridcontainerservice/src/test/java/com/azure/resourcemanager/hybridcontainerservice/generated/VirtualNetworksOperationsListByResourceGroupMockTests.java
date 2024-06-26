// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworks;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VirtualNetworksOperationsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"infraVnetProfile\":{},\"vipPool\":[],\"vmipPool\":[],\"dhcpServers\":[\"xgomfajuwa\",\"qvdaeyyguxakjsq\"],\"dnsServers\":[\"bezkgimsidxasic\",\"dyvvjskgfmocwahp\",\"gat\",\"eaahhvjhhn\"],\"gateway\":\"zybbj\",\"ipAddressPrefix\":\"dj\",\"vlanID\":\"yxkyxvx\",\"provisioningState\":\"InProgress\",\"status\":{}},\"extendedLocation\":{\"type\":\"nljlageuaulx\",\"name\":\"smjbnkppxyn\"},\"location\":\"nlsvxeiz\",\"tags\":{\"xcktpiymerteeamm\":\"klnsrmffey\",\"g\":\"qiekkkzddrt\",\"vrefdeesv\":\"ojbmxv\"},\"id\":\"cuijpxt\",\"name\":\"s\",\"type\":\"wprtu\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        HybridContainerServiceManager manager =
            HybridContainerServiceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<VirtualNetworks> response =
            manager.virtualNetworksOperations().listByResourceGroup("moy", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("nlsvxeiz", response.iterator().next().location());
        Assertions.assertEquals("klnsrmffey", response.iterator().next().tags().get("xcktpiymerteeamm"));
        Assertions.assertEquals("bezkgimsidxasic", response.iterator().next().properties().dnsServers().get(0));
        Assertions.assertEquals("zybbj", response.iterator().next().properties().gateway());
        Assertions.assertEquals("dj", response.iterator().next().properties().ipAddressPrefix());
        Assertions.assertEquals("nljlageuaulx", response.iterator().next().extendedLocation().type());
        Assertions.assertEquals("smjbnkppxyn", response.iterator().next().extendedLocation().name());
    }
}
