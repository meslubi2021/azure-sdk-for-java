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

/** The MySqlDataFeed model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dataSourceType")
@JsonTypeName("MySql")
@Fluent
public final class MySqlDataFeed extends DataFeedDetail {
    /*
     * The dataSourceParameter property.
     */
    @JsonProperty(value = "dataSourceParameter", required = true)
    private SqlSourceParameter dataSourceParameter;

    /** Creates an instance of MySqlDataFeed class. */
    public MySqlDataFeed() {}

    /**
     * Get the dataSourceParameter property: The dataSourceParameter property.
     *
     * @return the dataSourceParameter value.
     */
    public SqlSourceParameter getDataSourceParameter() {
        return this.dataSourceParameter;
    }

    /**
     * Set the dataSourceParameter property: The dataSourceParameter property.
     *
     * @param dataSourceParameter the dataSourceParameter value to set.
     * @return the MySqlDataFeed object itself.
     */
    public MySqlDataFeed setDataSourceParameter(SqlSourceParameter dataSourceParameter) {
        this.dataSourceParameter = dataSourceParameter;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setDataFeedName(String dataFeedName) {
        super.setDataFeedName(dataFeedName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setDataFeedDescription(String dataFeedDescription) {
        super.setDataFeedDescription(dataFeedDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setGranularityName(Granularity granularityName) {
        super.setGranularityName(granularityName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setGranularityAmount(Integer granularityAmount) {
        super.setGranularityAmount(granularityAmount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setMetrics(List<DataFeedMetric> metrics) {
        super.setMetrics(metrics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setDimension(List<DataFeedDimension> dimension) {
        super.setDimension(dimension);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setTimestampColumn(String timestampColumn) {
        super.setTimestampColumn(timestampColumn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setDataStartFrom(OffsetDateTime dataStartFrom) {
        super.setDataStartFrom(dataStartFrom);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setStartOffsetInSeconds(Long startOffsetInSeconds) {
        super.setStartOffsetInSeconds(startOffsetInSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setMaxConcurrency(Integer maxConcurrency) {
        super.setMaxConcurrency(maxConcurrency);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        super.setMinRetryIntervalInSeconds(minRetryIntervalInSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        super.setStopRetryAfterInSeconds(stopRetryAfterInSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setNeedRollup(NeedRollupEnum needRollup) {
        super.setNeedRollup(needRollup);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setRollUpMethod(RollUpMethod rollUpMethod) {
        super.setRollUpMethod(rollUpMethod);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setRollUpColumns(List<String> rollUpColumns) {
        super.setRollUpColumns(rollUpColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setAllUpIdentification(String allUpIdentification) {
        super.setAllUpIdentification(allUpIdentification);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        super.setFillMissingPointType(fillMissingPointType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setFillMissingPointValue(Double fillMissingPointValue) {
        super.setFillMissingPointValue(fillMissingPointValue);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setViewMode(ViewMode viewMode) {
        super.setViewMode(viewMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setAdmins(List<String> admins) {
        super.setAdmins(admins);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setViewers(List<String> viewers) {
        super.setViewers(viewers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setActionLinkTemplate(String actionLinkTemplate) {
        super.setActionLinkTemplate(actionLinkTemplate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        super.setAuthenticationType(authenticationType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MySqlDataFeed setCredentialId(String credentialId) {
        super.setCredentialId(credentialId);
        return this;
    }
}
