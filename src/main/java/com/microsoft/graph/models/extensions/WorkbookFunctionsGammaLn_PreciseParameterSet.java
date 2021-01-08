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
 * The class for the Workbook Functions Gamma Ln_Precise Parameter Set.
 */
public class WorkbookFunctionsGammaLn_PreciseParameterSet {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;


    /**
     * Instiaciates a new WorkbookFunctionsGammaLn_PreciseParameterSet
     */
    public WorkbookFunctionsGammaLn_PreciseParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsGammaLn_PreciseParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsGammaLn_PreciseParameterSet(@Nonnull final WorkbookFunctionsGammaLn_PreciseParameterSetBuilder builder) {
        this.x = builder.x;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsGammaLn_PreciseParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsGammaLn_PreciseParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsGammaLn_PreciseParameterSet
     */
    public static final class WorkbookFunctionsGammaLn_PreciseParameterSetBuilder {
        /**
         * The x parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement x;
        /**
         * Sets the X
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsGammaLn_PreciseParameterSetBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsGammaLn_PreciseParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsGammaLn_PreciseParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsGammaLn_PreciseParameterSet build() {
            return new WorkbookFunctionsGammaLn_PreciseParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.x != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("x", x));
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
