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
 * The class for the Workbook Functions Tbill Yield Parameter Set.
 */
public class WorkbookFunctionsTbillYieldParameterSet {
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
     * The pr.
     * 
     */
    @SerializedName(value = "pr", alternate = {"Pr"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement pr;


    /**
     * Instiaciates a new WorkbookFunctionsTbillYieldParameterSet
     */
    public WorkbookFunctionsTbillYieldParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsTbillYieldParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsTbillYieldParameterSet(@Nonnull final WorkbookFunctionsTbillYieldParameterSetBuilder builder) {
        this.settlement = builder.settlement;
        this.maturity = builder.maturity;
        this.pr = builder.pr;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsTbillYieldParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsTbillYieldParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsTbillYieldParameterSet
     */
    public static final class WorkbookFunctionsTbillYieldParameterSetBuilder {
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
        public WorkbookFunctionsTbillYieldParameterSetBuilder withSettlement(@Nullable final com.google.gson.JsonElement val) {
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
        public WorkbookFunctionsTbillYieldParameterSetBuilder withMaturity(@Nullable final com.google.gson.JsonElement val) {
            this.maturity = val;
            return this;
        }
        /**
         * The pr parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement pr;
        /**
         * Sets the Pr
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTbillYieldParameterSetBuilder withPr(@Nullable final com.google.gson.JsonElement val) {
            this.pr = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsTbillYieldParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsTbillYieldParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsTbillYieldParameterSet build() {
            return new WorkbookFunctionsTbillYieldParameterSet(this);
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
        if(this.pr != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pr", pr));
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
