// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Run notebook response. */
@Fluent
public final class RunNotebookResponse {
    /*
     * Response message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Result of run notebook.
     */
    @JsonProperty(value = "result")
    private RunNotebookResult result;

    /** Creates an instance of RunNotebookResponse class. */
    public RunNotebookResponse() {}

    /**
     * Get the message property: Response message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the result property: Result of run notebook.
     *
     * @return the result value.
     */
    public RunNotebookResult getResult() {
        return this.result;
    }

    /**
     * Set the result property: Result of run notebook.
     *
     * @param result the result value to set.
     * @return the RunNotebookResponse object itself.
     */
    public RunNotebookResponse setResult(RunNotebookResult result) {
        this.result = result;
        return this;
    }
}
