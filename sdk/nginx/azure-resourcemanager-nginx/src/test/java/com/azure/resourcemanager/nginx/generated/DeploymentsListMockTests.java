// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.nginx.NginxManager;
import com.azure.resourcemanager.nginx.models.IdentityType;
import com.azure.resourcemanager.nginx.models.NginxDeployment;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DeploymentsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"identity\":{\"principalId\":\"czfc\",\"tenantId\":\"aaxdbabphlwrq\",\"type\":\"None\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"Canceled\",\"nginxVersion\":\"cocmnyyaztt\",\"managedResourceGroup\":\"wwrq\",\"networkProfile\":{},\"ipAddress\":\"kzywbiex\",\"enableDiagnosticsSupport\":true,\"logging\":{}},\"sku\":{\"name\":\"axibxujw\"},\"location\":\"qwalmuzyoxaepd\",\"tags\":{\"bavxbniwdjswzt\":\"ancuxrhd\",\"xbzpfzab\":\"dbpgnxytxhp\"},\"id\":\"lcuhxwtctyqiklb\",\"name\":\"ovplw\",\"type\":\"bhvgy\"}]}";

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

        NginxManager manager =
            NginxManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<NginxDeployment> response = manager.deployments().list(Context.NONE);

        Assertions.assertEquals("qwalmuzyoxaepd", response.iterator().next().location());
        Assertions.assertEquals("ancuxrhd", response.iterator().next().tags().get("bavxbniwdjswzt"));
        Assertions.assertEquals(IdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals("wwrq", response.iterator().next().properties().managedResourceGroup());
        Assertions.assertEquals(true, response.iterator().next().properties().enableDiagnosticsSupport());
        Assertions.assertEquals("axibxujw", response.iterator().next().sku().name());
    }
}
