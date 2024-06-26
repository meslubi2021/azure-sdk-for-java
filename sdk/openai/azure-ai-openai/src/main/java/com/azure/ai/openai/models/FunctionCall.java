// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The name and arguments of a function that should be called, as generated by the model. */
@Immutable
public final class FunctionCall {

    /*
     * The name of the function to call.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The arguments to call the function with, as generated by the model in JSON format.
     * Note that the model does not always generate valid JSON, and may hallucinate parameters
     * not defined by your function schema. Validate the arguments in your code before calling
     * your function.
     */
    @Generated
    @JsonProperty(value = "arguments")
    private String arguments;

    /**
     * Creates an instance of FunctionCall class.
     *
     * @param name the name value to set.
     * @param arguments the arguments value to set.
     */
    @Generated
    @JsonCreator
    public FunctionCall(
            @JsonProperty(value = "name") String name, @JsonProperty(value = "arguments") String arguments) {
        this.name = name;
        this.arguments = arguments;
    }

    /**
     * Get the name property: The name of the function to call.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the arguments property: The arguments to call the function with, as generated by the model in JSON format.
     * Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your
     * function schema. Validate the arguments in your code before calling your function.
     *
     * @return the arguments value.
     */
    @Generated
    public String getArguments() {
        return this.arguments;
    }
}
