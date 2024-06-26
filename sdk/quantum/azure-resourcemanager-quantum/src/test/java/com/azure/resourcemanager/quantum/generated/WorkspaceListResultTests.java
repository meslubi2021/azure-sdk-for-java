// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quantum.fluent.models.QuantumWorkspaceInner;
import com.azure.resourcemanager.quantum.models.Provider;
import com.azure.resourcemanager.quantum.models.QuantumWorkspaceIdentity;
import com.azure.resourcemanager.quantum.models.ResourceIdentityType;
import com.azure.resourcemanager.quantum.models.Status;
import com.azure.resourcemanager.quantum.models.WorkspaceListResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"providers\":[{\"providerId\":\"snhsjcnyejhkryh\",\"providerSku\":\"apcz\",\"instanceUri\":\"okjye\",\"applicationName\":\"kvnipjoxz\",\"provisioningState\":\"Launching\",\"resourceUsageId\":\"gejspodmailzyde\"},{\"providerId\":\"jwyahuxinpmqnja\",\"providerSku\":\"ixjsprozvcputeg\",\"instanceUri\":\"wmfdatscmdvpjhul\",\"applicationName\":\"uvm\",\"provisioningState\":\"Deleting\",\"resourceUsageId\":\"k\"}],\"usable\":\"Partial\",\"provisioningState\":\"ProviderLaunching\",\"storageAccount\":\"odjpslwejd\",\"endpointUri\":\"wryoqpsoacc\"},\"identity\":{\"principalId\":\"akl\",\"tenantId\":\"ahbc\",\"type\":\"None\"},\"location\":\"dfdosygexp\",\"tags\":{\"vdphlxaolthqtr\":\"akhmsbzjhcrz\",\"gvfcj\":\"qjbpfzfsin\",\"xjtfelluwfzit\":\"wzo\"},\"id\":\"np\",\"name\":\"qfpjk\",\"type\":\"lxofpdvhpfxxypin\"},{\"properties\":{\"providers\":[{\"providerId\":\"huyb\",\"providerSku\":\"podepoo\",\"instanceUri\":\"nuvamiheogna\",\"applicationName\":\"zxtheotusivyevcc\",\"provisioningState\":\"Succeeded\",\"resourceUsageId\":\"nhungbw\"},{\"providerId\":\"rnfygxgispem\",\"providerSku\":\"zfkufubljofx\",\"instanceUri\":\"ofjaeqjhqjb\",\"applicationName\":\"v\",\"provisioningState\":\"Succeeded\",\"resourceUsageId\":\"qulngsntnbybkzgc\"}],\"usable\":\"Yes\",\"provisioningState\":\"Succeeded\",\"storageAccount\":\"xwrljdouskcqvkoc\",\"endpointUri\":\"jdkwtnhxbnjb\"},\"identity\":{\"principalId\":\"qrglssainqpjwn\",\"tenantId\":\"ljfmppee\",\"type\":\"SystemAssigned\"},\"location\":\"xsabkyqdu\",\"tags\":{\"zdzevndh\":\"tcj\",\"feusnhut\":\"rwpdappdsbdkvwrw\"},\"id\":\"eltmrldhugjzzdat\",\"name\":\"xhocdgeablgphuti\",\"type\":\"ndv\"},{\"properties\":{\"providers\":[{\"providerId\":\"yiftyhxhuro\",\"providerSku\":\"tyxolniwpwc\",\"instanceUri\":\"jfkgiawxk\",\"applicationName\":\"ypl\",\"provisioningState\":\"Updating\",\"resourceUsageId\":\"asy\"},{\"providerId\":\"nddhsgcbacph\",\"providerSku\":\"koty\",\"instanceUri\":\"gou\",\"applicationName\":\"ndlik\",\"provisioningState\":\"Updating\",\"resourceUsageId\":\"gfgibm\"},{\"providerId\":\"gakeqsr\",\"providerSku\":\"bzqqedqytbciq\",\"instanceUri\":\"uflmm\",\"applicationName\":\"zsm\",\"provisioningState\":\"Failed\",\"resourceUsageId\":\"lougpbkw\"}],\"usable\":\"No\",\"provisioningState\":\"Failed\",\"storageAccount\":\"qktapspwgcuert\",\"endpointUri\":\"kdosvqw\"},\"identity\":{\"principalId\":\"dgbb\",\"tenantId\":\"ddgmb\",\"type\":\"SystemAssigned\"},\"location\":\"ppbhtqqrolfp\",\"tags\":{\"jaoyfhrtx\":\"algbquxigjyjg\"},\"id\":\"lnerkujysvleju\",\"name\":\"fqawrlyxw\",\"type\":\"kcprbnw\"}],\"nextLink\":\"gjvtbv\"}")
                .toObject(WorkspaceListResult.class);
        Assertions.assertEquals("dfdosygexp", model.value().get(0).location());
        Assertions.assertEquals("akhmsbzjhcrz", model.value().get(0).tags().get("vdphlxaolthqtr"));
        Assertions.assertEquals(ResourceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("snhsjcnyejhkryh", model.value().get(0).providers().get(0).providerId());
        Assertions.assertEquals("apcz", model.value().get(0).providers().get(0).providerSku());
        Assertions.assertEquals("okjye", model.value().get(0).providers().get(0).instanceUri());
        Assertions.assertEquals("kvnipjoxz", model.value().get(0).providers().get(0).applicationName());
        Assertions.assertEquals(Status.LAUNCHING, model.value().get(0).providers().get(0).provisioningState());
        Assertions.assertEquals("gejspodmailzyde", model.value().get(0).providers().get(0).resourceUsageId());
        Assertions.assertEquals("odjpslwejd", model.value().get(0).storageAccount());
        Assertions.assertEquals("gjvtbv", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceListResult model =
            new WorkspaceListResult()
                .withValue(
                    Arrays
                        .asList(
                            new QuantumWorkspaceInner()
                                .withLocation("dfdosygexp")
                                .withTags(
                                    mapOf(
                                        "vdphlxaolthqtr",
                                        "akhmsbzjhcrz",
                                        "gvfcj",
                                        "qjbpfzfsin",
                                        "xjtfelluwfzit",
                                        "wzo"))
                                .withIdentity(new QuantumWorkspaceIdentity().withType(ResourceIdentityType.NONE))
                                .withProviders(
                                    Arrays
                                        .asList(
                                            new Provider()
                                                .withProviderId("snhsjcnyejhkryh")
                                                .withProviderSku("apcz")
                                                .withInstanceUri("okjye")
                                                .withApplicationName("kvnipjoxz")
                                                .withProvisioningState(Status.LAUNCHING)
                                                .withResourceUsageId("gejspodmailzyde"),
                                            new Provider()
                                                .withProviderId("jwyahuxinpmqnja")
                                                .withProviderSku("ixjsprozvcputeg")
                                                .withInstanceUri("wmfdatscmdvpjhul")
                                                .withApplicationName("uvm")
                                                .withProvisioningState(Status.DELETING)
                                                .withResourceUsageId("k")))
                                .withStorageAccount("odjpslwejd"),
                            new QuantumWorkspaceInner()
                                .withLocation("xsabkyqdu")
                                .withTags(mapOf("zdzevndh", "tcj", "feusnhut", "rwpdappdsbdkvwrw"))
                                .withIdentity(
                                    new QuantumWorkspaceIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withProviders(
                                    Arrays
                                        .asList(
                                            new Provider()
                                                .withProviderId("huyb")
                                                .withProviderSku("podepoo")
                                                .withInstanceUri("nuvamiheogna")
                                                .withApplicationName("zxtheotusivyevcc")
                                                .withProvisioningState(Status.SUCCEEDED)
                                                .withResourceUsageId("nhungbw"),
                                            new Provider()
                                                .withProviderId("rnfygxgispem")
                                                .withProviderSku("zfkufubljofx")
                                                .withInstanceUri("ofjaeqjhqjb")
                                                .withApplicationName("v")
                                                .withProvisioningState(Status.SUCCEEDED)
                                                .withResourceUsageId("qulngsntnbybkzgc")))
                                .withStorageAccount("xwrljdouskcqvkoc"),
                            new QuantumWorkspaceInner()
                                .withLocation("ppbhtqqrolfp")
                                .withTags(mapOf("jaoyfhrtx", "algbquxigjyjg"))
                                .withIdentity(
                                    new QuantumWorkspaceIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                                .withProviders(
                                    Arrays
                                        .asList(
                                            new Provider()
                                                .withProviderId("yiftyhxhuro")
                                                .withProviderSku("tyxolniwpwc")
                                                .withInstanceUri("jfkgiawxk")
                                                .withApplicationName("ypl")
                                                .withProvisioningState(Status.UPDATING)
                                                .withResourceUsageId("asy"),
                                            new Provider()
                                                .withProviderId("nddhsgcbacph")
                                                .withProviderSku("koty")
                                                .withInstanceUri("gou")
                                                .withApplicationName("ndlik")
                                                .withProvisioningState(Status.UPDATING)
                                                .withResourceUsageId("gfgibm"),
                                            new Provider()
                                                .withProviderId("gakeqsr")
                                                .withProviderSku("bzqqedqytbciq")
                                                .withInstanceUri("uflmm")
                                                .withApplicationName("zsm")
                                                .withProvisioningState(Status.FAILED)
                                                .withResourceUsageId("lougpbkw")))
                                .withStorageAccount("qktapspwgcuert")))
                .withNextLink("gjvtbv");
        model = BinaryData.fromObject(model).toObject(WorkspaceListResult.class);
        Assertions.assertEquals("dfdosygexp", model.value().get(0).location());
        Assertions.assertEquals("akhmsbzjhcrz", model.value().get(0).tags().get("vdphlxaolthqtr"));
        Assertions.assertEquals(ResourceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("snhsjcnyejhkryh", model.value().get(0).providers().get(0).providerId());
        Assertions.assertEquals("apcz", model.value().get(0).providers().get(0).providerSku());
        Assertions.assertEquals("okjye", model.value().get(0).providers().get(0).instanceUri());
        Assertions.assertEquals("kvnipjoxz", model.value().get(0).providers().get(0).applicationName());
        Assertions.assertEquals(Status.LAUNCHING, model.value().get(0).providers().get(0).provisioningState());
        Assertions.assertEquals("gejspodmailzyde", model.value().get(0).providers().get(0).resourceUsageId());
        Assertions.assertEquals("odjpslwejd", model.value().get(0).storageAccount());
        Assertions.assertEquals("gjvtbv", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
