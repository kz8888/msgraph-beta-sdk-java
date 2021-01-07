// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Second Parameter Set.
 */
public class WorkbookFunctionsSecondParameterSet {
    /**
     * The serial Number.
     * 
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement serialNumber;


    /**
     * Instiaciates a new WorkbookFunctionsSecondParameterSet
     */
    public WorkbookFunctionsSecondParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsSecondParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsSecondParameterSet(@Nonnull final WorkbookFunctionsSecondParameterSetBuilder builder) {
        this.serialNumber = builder.serialNumber;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsSecondParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsSecondParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsSecondParameterSet
     */
    public static final class WorkbookFunctionsSecondParameterSetBuilder {
        /**
         * The serialNumber parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement serialNumber;
        /**
         * Sets the SerialNumber
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSecondParameterSetBuilder withSerialNumber(@Nullable final com.google.gson.JsonElement val) {
            this.serialNumber = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsSecondParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsSecondParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsSecondParameterSet build() {
            return new WorkbookFunctionsSecondParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.serialNumber != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("serialNumber", serialNumber));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
