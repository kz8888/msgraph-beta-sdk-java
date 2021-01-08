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
 * The class for the Workbook Functions Erf Parameter Set.
 */
public class WorkbookFunctionsErfParameterSet {
    /**
     * The lower Limit.
     * 
     */
    @SerializedName(value = "lowerLimit", alternate = {"LowerLimit"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement lowerLimit;

    /**
     * The upper Limit.
     * 
     */
    @SerializedName(value = "upperLimit", alternate = {"UpperLimit"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement upperLimit;


    /**
     * Instiaciates a new WorkbookFunctionsErfParameterSet
     */
    public WorkbookFunctionsErfParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsErfParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsErfParameterSet(@Nonnull final WorkbookFunctionsErfParameterSetBuilder builder) {
        this.lowerLimit = builder.lowerLimit;
        this.upperLimit = builder.upperLimit;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsErfParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsErfParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsErfParameterSet
     */
    public static final class WorkbookFunctionsErfParameterSetBuilder {
        /**
         * The lowerLimit parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement lowerLimit;
        /**
         * Sets the LowerLimit
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsErfParameterSetBuilder withLowerLimit(@Nullable final com.google.gson.JsonElement val) {
            this.lowerLimit = val;
            return this;
        }
        /**
         * The upperLimit parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement upperLimit;
        /**
         * Sets the UpperLimit
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsErfParameterSetBuilder withUpperLimit(@Nullable final com.google.gson.JsonElement val) {
            this.upperLimit = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsErfParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsErfParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsErfParameterSet build() {
            return new WorkbookFunctionsErfParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.lowerLimit != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("lowerLimit", lowerLimit));
        }
        if(this.upperLimit != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("upperLimit", upperLimit));
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
