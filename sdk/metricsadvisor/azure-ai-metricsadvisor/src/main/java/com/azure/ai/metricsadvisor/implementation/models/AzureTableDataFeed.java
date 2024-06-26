// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** The AzureTableDataFeed model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dataSourceType")
@JsonTypeName("AzureTable")
@Fluent
public final class AzureTableDataFeed extends DataFeedDetail {
    /*
     * The dataSourceParameter property.
     */
    @JsonProperty(value = "dataSourceParameter", required = true)
    private AzureTableParameter dataSourceParameter;

    /** Creates an instance of AzureTableDataFeed class. */
    public AzureTableDataFeed() {}

    /**
     * Get the dataSourceParameter property: The dataSourceParameter property.
     *
     * @return the dataSourceParameter value.
     */
    public AzureTableParameter getDataSourceParameter() {
        return this.dataSourceParameter;
    }

    /**
     * Set the dataSourceParameter property: The dataSourceParameter property.
     *
     * @param dataSourceParameter the dataSourceParameter value to set.
     * @return the AzureTableDataFeed object itself.
     */
    public AzureTableDataFeed setDataSourceParameter(AzureTableParameter dataSourceParameter) {
        this.dataSourceParameter = dataSourceParameter;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setDataFeedName(String dataFeedName) {
        super.setDataFeedName(dataFeedName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setDataFeedDescription(String dataFeedDescription) {
        super.setDataFeedDescription(dataFeedDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setGranularityName(Granularity granularityName) {
        super.setGranularityName(granularityName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setGranularityAmount(Integer granularityAmount) {
        super.setGranularityAmount(granularityAmount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setMetrics(List<DataFeedMetric> metrics) {
        super.setMetrics(metrics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setDimension(List<DataFeedDimension> dimension) {
        super.setDimension(dimension);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setTimestampColumn(String timestampColumn) {
        super.setTimestampColumn(timestampColumn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setDataStartFrom(OffsetDateTime dataStartFrom) {
        super.setDataStartFrom(dataStartFrom);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setStartOffsetInSeconds(Long startOffsetInSeconds) {
        super.setStartOffsetInSeconds(startOffsetInSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setMaxConcurrency(Integer maxConcurrency) {
        super.setMaxConcurrency(maxConcurrency);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        super.setMinRetryIntervalInSeconds(minRetryIntervalInSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        super.setStopRetryAfterInSeconds(stopRetryAfterInSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setNeedRollup(NeedRollupEnum needRollup) {
        super.setNeedRollup(needRollup);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setRollUpMethod(RollUpMethod rollUpMethod) {
        super.setRollUpMethod(rollUpMethod);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setRollUpColumns(List<String> rollUpColumns) {
        super.setRollUpColumns(rollUpColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setAllUpIdentification(String allUpIdentification) {
        super.setAllUpIdentification(allUpIdentification);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        super.setFillMissingPointType(fillMissingPointType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setFillMissingPointValue(Double fillMissingPointValue) {
        super.setFillMissingPointValue(fillMissingPointValue);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setViewMode(ViewMode viewMode) {
        super.setViewMode(viewMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setAdmins(List<String> admins) {
        super.setAdmins(admins);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setViewers(List<String> viewers) {
        super.setViewers(viewers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setActionLinkTemplate(String actionLinkTemplate) {
        super.setActionLinkTemplate(actionLinkTemplate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        super.setAuthenticationType(authenticationType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureTableDataFeed setCredentialId(String credentialId) {
        super.setCredentialId(credentialId);
        return this;
    }
}
