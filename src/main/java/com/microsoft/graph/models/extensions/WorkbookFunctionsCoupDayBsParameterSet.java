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
 * The class for the Workbook Functions Coup Day Bs Parameter Set.
 */
public class WorkbookFunctionsCoupDayBsParameterSet {
    /**
     * The settlement.
     * 
     */
    @SerializedName(value = "settlement", alternate = {"Settlement"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement settlement;

    /**
     * The maturity.
     * 
     */
    @SerializedName(value = "maturity", alternate = {"Maturity"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement maturity;

    /**
     * The frequency.
     * 
     */
    @SerializedName(value = "frequency", alternate = {"Frequency"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement frequency;

    /**
     * The basis.
     * 
     */
    @SerializedName(value = "basis", alternate = {"Basis"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement basis;


    /**
     * Instiaciates a new WorkbookFunctionsCoupDayBsParameterSet
     */
    public WorkbookFunctionsCoupDayBsParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsCoupDayBsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsCoupDayBsParameterSet(@Nonnull final WorkbookFunctionsCoupDayBsParameterSetBuilder builder) {
        this.settlement = builder.settlement;
        this.maturity = builder.maturity;
        this.frequency = builder.frequency;
        this.basis = builder.basis;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsCoupDayBsParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsCoupDayBsParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsCoupDayBsParameterSet
     */
    public static final class WorkbookFunctionsCoupDayBsParameterSetBuilder {
        /**
         * The settlement parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement settlement;
        /**
         * Sets the Settlement
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCoupDayBsParameterSetBuilder withSettlement(@Nullable final com.google.gson.JsonElement val) {
            this.settlement = val;
            return this;
        }
        /**
         * The maturity parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement maturity;
        /**
         * Sets the Maturity
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCoupDayBsParameterSetBuilder withMaturity(@Nullable final com.google.gson.JsonElement val) {
            this.maturity = val;
            return this;
        }
        /**
         * The frequency parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement frequency;
        /**
         * Sets the Frequency
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCoupDayBsParameterSetBuilder withFrequency(@Nullable final com.google.gson.JsonElement val) {
            this.frequency = val;
            return this;
        }
        /**
         * The basis parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement basis;
        /**
         * Sets the Basis
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsCoupDayBsParameterSetBuilder withBasis(@Nullable final com.google.gson.JsonElement val) {
            this.basis = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsCoupDayBsParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsCoupDayBsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsCoupDayBsParameterSet build() {
            return new WorkbookFunctionsCoupDayBsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.settlement != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("settlement", settlement));
        }
        if(this.maturity != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("maturity", maturity));
        }
        if(this.frequency != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("frequency", frequency));
        }
        if(this.basis != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("basis", basis));
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
