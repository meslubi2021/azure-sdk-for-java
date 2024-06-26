// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details about the download progress of update. */
@Immutable
public final class UpdateDownloadProgress {
    /*
     * The download phase.
     */
    @JsonProperty(value = "downloadPhase", access = JsonProperty.Access.WRITE_ONLY)
    private DownloadPhase downloadPhase;

    /*
     * Percentage of completion.
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /*
     * Total bytes to download.
     */
    @JsonProperty(value = "totalBytesToDownload", access = JsonProperty.Access.WRITE_ONLY)
    private Double totalBytesToDownload;

    /*
     * Total bytes downloaded.
     */
    @JsonProperty(value = "totalBytesDownloaded", access = JsonProperty.Access.WRITE_ONLY)
    private Double totalBytesDownloaded;

    /*
     * Number of updates to download.
     */
    @JsonProperty(value = "numberOfUpdatesToDownload", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfUpdatesToDownload;

    /*
     * Number of updates downloaded.
     */
    @JsonProperty(value = "numberOfUpdatesDownloaded", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfUpdatesDownloaded;

    /** Creates an instance of UpdateDownloadProgress class. */
    public UpdateDownloadProgress() {
    }

    /**
     * Get the downloadPhase property: The download phase.
     *
     * @return the downloadPhase value.
     */
    public DownloadPhase downloadPhase() {
        return this.downloadPhase;
    }

    /**
     * Get the percentComplete property: Percentage of completion.
     *
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the totalBytesToDownload property: Total bytes to download.
     *
     * @return the totalBytesToDownload value.
     */
    public Double totalBytesToDownload() {
        return this.totalBytesToDownload;
    }

    /**
     * Get the totalBytesDownloaded property: Total bytes downloaded.
     *
     * @return the totalBytesDownloaded value.
     */
    public Double totalBytesDownloaded() {
        return this.totalBytesDownloaded;
    }

    /**
     * Get the numberOfUpdatesToDownload property: Number of updates to download.
     *
     * @return the numberOfUpdatesToDownload value.
     */
    public Integer numberOfUpdatesToDownload() {
        return this.numberOfUpdatesToDownload;
    }

    /**
     * Get the numberOfUpdatesDownloaded property: Number of updates downloaded.
     *
     * @return the numberOfUpdatesDownloaded value.
     */
    public Integer numberOfUpdatesDownloaded() {
        return this.numberOfUpdatesDownloaded;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
