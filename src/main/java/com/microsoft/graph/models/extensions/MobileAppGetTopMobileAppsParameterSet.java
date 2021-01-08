// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.MobileApp;
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
 * The class for the Mobile App Get Top Mobile Apps Parameter Set.
 */
public class MobileAppGetTopMobileAppsParameterSet {
    /**
     * The status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public String status;

    /**
     * The count.
     * 
     */
    @SerializedName(value = "count", alternate = {"Count"})
    @Expose
	@Nullable
    public Long count;


    /**
     * Instiaciates a new MobileAppGetTopMobileAppsParameterSet
     */
    public MobileAppGetTopMobileAppsParameterSet() {}
    /**
     * Instiaciates a new MobileAppGetTopMobileAppsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected MobileAppGetTopMobileAppsParameterSet(@Nonnull final MobileAppGetTopMobileAppsParameterSetBuilder builder) {
        this.status = builder.status;
        this.count = builder.count;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static MobileAppGetTopMobileAppsParameterSetBuilder newBuilder() {
        return new MobileAppGetTopMobileAppsParameterSetBuilder();
    }
    /**
     * Fluent builder for the MobileAppGetTopMobileAppsParameterSet
     */
    public static final class MobileAppGetTopMobileAppsParameterSetBuilder {
        /**
         * The status parameter value
         */
        @Nullable
        protected String status;
        /**
         * Sets the Status
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MobileAppGetTopMobileAppsParameterSetBuilder withStatus(@Nullable final String val) {
            this.status = val;
            return this;
        }
        /**
         * The count parameter value
         */
        @Nullable
        protected Long count;
        /**
         * Sets the Count
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MobileAppGetTopMobileAppsParameterSetBuilder withCount(@Nullable final Long val) {
            this.count = val;
            return this;
        }
        /**
         * Instanciates a new MobileAppGetTopMobileAppsParameterSetBuilder
         */
        @Nullable
        protected MobileAppGetTopMobileAppsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public MobileAppGetTopMobileAppsParameterSet build() {
            return new MobileAppGetTopMobileAppsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.status != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("status", status));
        }
        if(this.count != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("count", count));
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
