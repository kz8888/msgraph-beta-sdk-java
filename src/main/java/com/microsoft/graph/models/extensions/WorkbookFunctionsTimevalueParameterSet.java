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
 * The class for the Workbook Functions Timevalue Parameter Set.
 */
public class WorkbookFunctionsTimevalueParameterSet {
    /**
     * The time Text.
     * 
     */
    @SerializedName(value = "timeText", alternate = {"TimeText"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement timeText;


    /**
     * Instiaciates a new WorkbookFunctionsTimevalueParameterSet
     */
    public WorkbookFunctionsTimevalueParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsTimevalueParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsTimevalueParameterSet(@Nonnull final WorkbookFunctionsTimevalueParameterSetBuilder builder) {
        this.timeText = builder.timeText;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsTimevalueParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsTimevalueParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsTimevalueParameterSet
     */
    public static final class WorkbookFunctionsTimevalueParameterSetBuilder {
        /**
         * The timeText parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement timeText;
        /**
         * Sets the TimeText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTimevalueParameterSetBuilder withTimeText(@Nullable final com.google.gson.JsonElement val) {
            this.timeText = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsTimevalueParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsTimevalueParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsTimevalueParameterSet build() {
            return new WorkbookFunctionsTimevalueParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.timeText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("timeText", timeText));
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
