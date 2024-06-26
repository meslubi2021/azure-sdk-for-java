// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.models.DatabasePropertiesGeoReplication;
import com.azure.resourcemanager.redisenterprise.models.LinkedDatabase;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabasePropertiesGeoReplicationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabasePropertiesGeoReplication model =
            BinaryData
                .fromString(
                    "{\"groupNickname\":\"zzvdudgwds\",\"linkedDatabases\":[{\"id\":\"twmcynpwlb\",\"state\":\"LinkFailed\"},{\"id\":\"acfta\",\"state\":\"UnlinkFailed\"},{\"id\":\"nltyfsoppusuesnz\",\"state\":\"Linking\"},{\"id\":\"bavo\",\"state\":\"Unlinking\"}]}")
                .toObject(DatabasePropertiesGeoReplication.class);
        Assertions.assertEquals("zzvdudgwds", model.groupNickname());
        Assertions.assertEquals("twmcynpwlb", model.linkedDatabases().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabasePropertiesGeoReplication model =
            new DatabasePropertiesGeoReplication()
                .withGroupNickname("zzvdudgwds")
                .withLinkedDatabases(
                    Arrays
                        .asList(
                            new LinkedDatabase().withId("twmcynpwlb"),
                            new LinkedDatabase().withId("acfta"),
                            new LinkedDatabase().withId("nltyfsoppusuesnz"),
                            new LinkedDatabase().withId("bavo")));
        model = BinaryData.fromObject(model).toObject(DatabasePropertiesGeoReplication.class);
        Assertions.assertEquals("zzvdudgwds", model.groupNickname());
        Assertions.assertEquals("twmcynpwlb", model.linkedDatabases().get(0).id());
    }
}
