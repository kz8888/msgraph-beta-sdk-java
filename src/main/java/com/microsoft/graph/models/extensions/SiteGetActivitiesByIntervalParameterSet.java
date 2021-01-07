// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ItemActivityStat;
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
 * The class for the Site Get Activities By Interval Parameter Set.
 */
public class SiteGetActivitiesByIntervalParameterSet {
    /**
     * The start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public String startDateTime;

    /**
     * The end Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public String endDateTime;

    /**
     * The interval.
     * 
     */
    @SerializedName(value = "interval", alternate = {"Interval"})
    @Expose
	@Nullable
    public String interval;


    /**
     * Instiaciates a new SiteGetActivitiesByIntervalParameterSet
     */
    public SiteGetActivitiesByIntervalParameterSet() {}
    /**
     * Instiaciates a new SiteGetActivitiesByIntervalParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected SiteGetActivitiesByIntervalParameterSet(@Nonnull final SiteGetActivitiesByIntervalParameterSetBuilder builder) {
        this.startDateTime = builder.startDateTime;
        this.endDateTime = builder.endDateTime;
        this.interval = builder.interval;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static SiteGetActivitiesByIntervalParameterSetBuilder newBuilder() {
        return new SiteGetActivitiesByIntervalParameterSetBuilder();
    }
    /**
     * Fluent builder for the SiteGetActivitiesByIntervalParameterSet
     */
    public static final class SiteGetActivitiesByIntervalParameterSetBuilder {
        /**
         * The startDateTime parameter value
         */
        @Nullable
        protected String startDateTime;
        /**
         * Sets the StartDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SiteGetActivitiesByIntervalParameterSetBuilder withStartDateTime(@Nullable final String val) {
            this.startDateTime = val;
            return this;
        }
        /**
         * The endDateTime parameter value
         */
        @Nullable
        protected String endDateTime;
        /**
         * Sets the EndDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SiteGetActivitiesByIntervalParameterSetBuilder withEndDateTime(@Nullable final String val) {
            this.endDateTime = val;
            return this;
        }
        /**
         * The interval parameter value
         */
        @Nullable
        protected String interval;
        /**
         * Sets the Interval
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public SiteGetActivitiesByIntervalParameterSetBuilder withInterval(@Nullable final String val) {
            this.interval = val;
            return this;
        }
        /**
         * Instanciates a new SiteGetActivitiesByIntervalParameterSetBuilder
         */
        @Nullable
        protected SiteGetActivitiesByIntervalParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public SiteGetActivitiesByIntervalParameterSet build() {
            return new SiteGetActivitiesByIntervalParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.startDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDateTime", startDateTime));
        }
        if(this.endDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endDateTime", endDateTime));
        }
        if(this.interval != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("interval", interval));
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
