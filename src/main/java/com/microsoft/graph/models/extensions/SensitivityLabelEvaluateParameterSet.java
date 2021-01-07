// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.DiscoveredSensitiveType;
import com.microsoft.graph.models.extensions.CurrentLabel;
import com.microsoft.graph.models.extensions.EvaluateLabelJobResponse;
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
 * The class for the Sensitivity Label Evaluate Parameter Set.
 */
public class SensitivityLabelEvaluateParameterSet {
    /**
     * The discovered Sensitive Types.
     * 
     */
    @SerializedName(value = "discoveredSensitiveTypes", alternate = {"DiscoveredSensitiveTypes"})
    @Expose
	@Nullable
    public java.util.List<DiscoveredSensitiveType> discoveredSensitiveTypes;

    /**
     * The current Label.
     * 
     */
    @SerializedName(value = "currentLabel", alternate = {"CurrentLabel"})
    @Expose
	@Nullable
    public CurrentLabel currentLabel;


    /**
     * Instiaciates a new SensitivityLabelEvaluateParameterSet
     */
    public SensitivityLabelEvaluateParameterSet() {}
    /**
     * Instiaciates a new SensitivityLabelEvaluateParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected SensitivityLabelEvaluateParameterSet(@Nonnull final SensitivityLabelEvaluateParameterSetBuilder builder) {
        this.discoveredSensitiveTypes = builder.discoveredSensitiveTypes;
        this.currentLabel = builder.currentLabel;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static SensitivityLabelEvaluateParameterSetBuilder newBuilder() {
        return new SensitivityLabelEvaluateParameterSetBuilder();
    }
    /**
     * Fluent builder for the SensitivityLabelEvaluateParameterSet
     */
    public static final class SensitivityLabelEvaluateParameterSetBuilder {
        /**
         * The discoveredSensitiveTypes parameter value
         */
        @Nullable
        protected java.util.List<DiscoveredSensitiveType> discoveredSensitiveTypes;
        /**
         * Sets the DiscoveredSensitiveTypes
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SensitivityLabelEvaluateParameterSetBuilder withDiscoveredSensitiveTypes(@Nullable final java.util.List<DiscoveredSensitiveType> val) {
            this.discoveredSensitiveTypes = val;
            return this;
        }
        /**
         * The currentLabel parameter value
         */
        @Nullable
        protected CurrentLabel currentLabel;
        /**
         * Sets the CurrentLabel
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SensitivityLabelEvaluateParameterSetBuilder withCurrentLabel(@Nullable final CurrentLabel val) {
            this.currentLabel = val;
            return this;
        }
        /**
         * Instanciates a new SensitivityLabelEvaluateParameterSetBuilder
         */
        @Nullable
        protected SensitivityLabelEvaluateParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public SensitivityLabelEvaluateParameterSet build() {
            return new SensitivityLabelEvaluateParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.discoveredSensitiveTypes != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("discoveredSensitiveTypes", discoveredSensitiveTypes));
        }
        if(this.currentLabel != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("currentLabel", currentLabel));
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
