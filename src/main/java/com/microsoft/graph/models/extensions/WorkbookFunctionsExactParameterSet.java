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
 * The class for the Workbook Functions Exact Parameter Set.
 */
public class WorkbookFunctionsExactParameterSet {
    /**
     * The text1.
     * 
     */
    @SerializedName(value = "text1", alternate = {"Text1"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text1;

    /**
     * The text2.
     * 
     */
    @SerializedName(value = "text2", alternate = {"Text2"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text2;


    /**
     * Instiaciates a new WorkbookFunctionsExactParameterSet
     */
    public WorkbookFunctionsExactParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsExactParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsExactParameterSet(@Nonnull final WorkbookFunctionsExactParameterSetBuilder builder) {
        this.text1 = builder.text1;
        this.text2 = builder.text2;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsExactParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsExactParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsExactParameterSet
     */
    public static final class WorkbookFunctionsExactParameterSetBuilder {
        /**
         * The text1 parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement text1;
        /**
         * Sets the Text1
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsExactParameterSetBuilder withText1(@Nullable final com.google.gson.JsonElement val) {
            this.text1 = val;
            return this;
        }
        /**
         * The text2 parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement text2;
        /**
         * Sets the Text2
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsExactParameterSetBuilder withText2(@Nullable final com.google.gson.JsonElement val) {
            this.text2 = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsExactParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsExactParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsExactParameterSet build() {
            return new WorkbookFunctionsExactParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.text1 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("text1", text1));
        }
        if(this.text2 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("text2", text2));
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
