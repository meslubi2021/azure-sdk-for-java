// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ActionEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DecryptionRuleTypeEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PreRulesResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.StateEnum;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PreRulesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"etag\":\"yilflqoiquvrehmr\",\"ruleName\":\"jhvsujztczyt\",\"priority\":178479099,\"description\":\"h\",\"ruleState\":\"ENABLED\",\"source\":{\"cidrs\":[],\"countries\":[],\"feeds\":[],\"prefixLists\":[]},\"negateSource\":\"TRUE\",\"destination\":{\"cidrs\":[],\"countries\":[],\"feeds\":[],\"prefixLists\":[],\"fqdnLists\":[]},\"negateDestination\":\"FALSE\",\"applications\":[\"ou\"],\"category\":{\"urlCustom\":[],\"feeds\":[]},\"protocol\":\"mowaziynknlqwzdv\",\"protocolPortList\":[\"hxqszdtmaajquh\"],\"inboundInspectionCertificate\":\"ylr\",\"auditComment\":\"m\",\"actionType\":\"Allow\",\"enableLogging\":\"ENABLED\",\"decryptionRuleType\":\"SSLInboundInspection\",\"tags\":[],\"provisioningState\":\"Succeeded\"},\"id\":\"p\",\"name\":\"hckfkyjpmspbps\",\"type\":\"df\"}]}";

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

        PaloAltoNetworksNgfwManager manager =
            PaloAltoNetworksNgfwManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PreRulesResource> response = manager.preRules().list("mfcttux", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("yilflqoiquvrehmr", response.iterator().next().etag());
        Assertions.assertEquals("jhvsujztczyt", response.iterator().next().ruleName());
        Assertions.assertEquals("h", response.iterator().next().description());
        Assertions.assertEquals(StateEnum.ENABLED, response.iterator().next().ruleState());
        Assertions.assertEquals(BooleanEnum.TRUE, response.iterator().next().negateSource());
        Assertions.assertEquals(BooleanEnum.FALSE, response.iterator().next().negateDestination());
        Assertions.assertEquals("ou", response.iterator().next().applications().get(0));
        Assertions.assertEquals("mowaziynknlqwzdv", response.iterator().next().protocol());
        Assertions.assertEquals("hxqszdtmaajquh", response.iterator().next().protocolPortList().get(0));
        Assertions.assertEquals("ylr", response.iterator().next().inboundInspectionCertificate());
        Assertions.assertEquals("m", response.iterator().next().auditComment());
        Assertions.assertEquals(ActionEnum.ALLOW, response.iterator().next().actionType());
        Assertions.assertEquals(StateEnum.ENABLED, response.iterator().next().enableLogging());
        Assertions
            .assertEquals(
                DecryptionRuleTypeEnum.SSLINBOUND_INSPECTION, response.iterator().next().decryptionRuleType());
    }
}
