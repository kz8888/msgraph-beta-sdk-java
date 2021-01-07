// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


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
 * The class for the Exact Match Data Store Lookup Parameter Set.
 */
public class ExactMatchDataStoreLookupParameterSet {
    /**
     * The key.
     * 
     */
    @SerializedName(value = "key", alternate = {"Key"})
    @Expose
	@Nullable
    public String key;

    /**
     * The values.
     * 
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public java.util.List<String> values;

    /**
     * The result Column Names.
     * 
     */
    @SerializedName(value = "resultColumnNames", alternate = {"ResultColumnNames"})
    @Expose
	@Nullable
    public java.util.List<String> resultColumnNames;


    /**
     * Instiaciates a new ExactMatchDataStoreLookupParameterSet
     */
    public ExactMatchDataStoreLookupParameterSet() {}
    /**
     * Instiaciates a new ExactMatchDataStoreLookupParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ExactMatchDataStoreLookupParameterSet(@Nonnull final ExactMatchDataStoreLookupParameterSetBuilder builder) {
        this.key = builder.key;
        this.values = builder.values;
        this.resultColumnNames = builder.resultColumnNames;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ExactMatchDataStoreLookupParameterSetBuilder newBuilder() {
        return new ExactMatchDataStoreLookupParameterSetBuilder();
    }
    /**
     * Fluent builder for the ExactMatchDataStoreLookupParameterSet
     */
    public static final class ExactMatchDataStoreLookupParameterSetBuilder {
        /**
         * The key parameter value
         */
        @Nullable
        protected String key;
        /**
         * Sets the Key
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ExactMatchDataStoreLookupParameterSetBuilder withKey(@Nullable final String val) {
            this.key = val;
            return this;
        }
        /**
         * The values parameter value
         */
        @Nullable
        protected java.util.List<String> values;
        /**
         * Sets the Values
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ExactMatchDataStoreLookupParameterSetBuilder withValues(@Nullable final java.util.List<String> val) {
            this.values = val;
            return this;
        }
        /**
         * The resultColumnNames parameter value
         */
        @Nullable
        protected java.util.List<String> resultColumnNames;
        /**
         * Sets the ResultColumnNames
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ExactMatchDataStoreLookupParameterSetBuilder withResultColumnNames(@Nullable final java.util.List<String> val) {
            this.resultColumnNames = val;
            return this;
        }
        /**
         * Instanciates a new ExactMatchDataStoreLookupParameterSetBuilder
         */
        @Nullable
        protected ExactMatchDataStoreLookupParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ExactMatchDataStoreLookupParameterSet build() {
            return new ExactMatchDataStoreLookupParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.key != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("key", key));
        }
        if(this.values != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("values", values));
        }
        if(this.resultColumnNames != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("resultColumnNames", resultColumnNames));
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
