// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
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
 * The class for the Management Condition Statement Get Management Condition Statements For Platform Parameter Set.
 */
public class ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSet {
    /**
     * The platform.
     * 
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
	@Nullable
    public DevicePlatformType platform;


    /**
     * Instiaciates a new ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSet
     */
    public ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSet() {}
    /**
     * Instiaciates a new ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSet(@Nonnull final ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSetBuilder builder) {
        this.platform = builder.platform;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSetBuilder newBuilder() {
        return new ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSetBuilder();
    }
    /**
     * Fluent builder for the ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSet
     */
    public static final class ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSetBuilder {
        /**
         * The platform parameter value
         */
        @Nullable
        protected DevicePlatformType platform;
        /**
         * Sets the Platform
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSetBuilder withPlatform(@Nullable final DevicePlatformType val) {
            this.platform = val;
            return this;
        }
        /**
         * Instanciates a new ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSetBuilder
         */
        @Nullable
        protected ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSet build() {
            return new ManagementConditionStatementGetManagementConditionStatementsForPlatformParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.platform != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("platform", platform));
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
