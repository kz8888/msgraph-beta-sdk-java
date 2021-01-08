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
 * The class for the Workbook Functions Bitrshift Parameter Set.
 */
public class WorkbookFunctionsBitrshiftParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The shift Amount.
     * 
     */
    @SerializedName(value = "shiftAmount", alternate = {"ShiftAmount"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement shiftAmount;


    /**
     * Instiaciates a new WorkbookFunctionsBitrshiftParameterSet
     */
    public WorkbookFunctionsBitrshiftParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsBitrshiftParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsBitrshiftParameterSet(@Nonnull final WorkbookFunctionsBitrshiftParameterSetBuilder builder) {
        this.number = builder.number;
        this.shiftAmount = builder.shiftAmount;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsBitrshiftParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsBitrshiftParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsBitrshiftParameterSet
     */
    public static final class WorkbookFunctionsBitrshiftParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBitrshiftParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The shiftAmount parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement shiftAmount;
        /**
         * Sets the ShiftAmount
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsBitrshiftParameterSetBuilder withShiftAmount(@Nullable final com.google.gson.JsonElement val) {
            this.shiftAmount = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsBitrshiftParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsBitrshiftParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsBitrshiftParameterSet build() {
            return new WorkbookFunctionsBitrshiftParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.shiftAmount != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("shiftAmount", shiftAmount));
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
