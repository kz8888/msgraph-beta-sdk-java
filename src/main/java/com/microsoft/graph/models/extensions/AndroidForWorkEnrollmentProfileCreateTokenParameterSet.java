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
 * The class for the Android For Work Enrollment Profile Create Token Parameter Set.
 */
public class AndroidForWorkEnrollmentProfileCreateTokenParameterSet {
    /**
     * The token Validity In Seconds.
     * 
     */
    @SerializedName(value = "tokenValidityInSeconds", alternate = {"TokenValidityInSeconds"})
    @Expose
	@Nullable
    public Integer tokenValidityInSeconds;


    /**
     * Instiaciates a new AndroidForWorkEnrollmentProfileCreateTokenParameterSet
     */
    public AndroidForWorkEnrollmentProfileCreateTokenParameterSet() {}
    /**
     * Instiaciates a new AndroidForWorkEnrollmentProfileCreateTokenParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected AndroidForWorkEnrollmentProfileCreateTokenParameterSet(@Nonnull final AndroidForWorkEnrollmentProfileCreateTokenParameterSetBuilder builder) {
        this.tokenValidityInSeconds = builder.tokenValidityInSeconds;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static AndroidForWorkEnrollmentProfileCreateTokenParameterSetBuilder newBuilder() {
        return new AndroidForWorkEnrollmentProfileCreateTokenParameterSetBuilder();
    }
    /**
     * Fluent builder for the AndroidForWorkEnrollmentProfileCreateTokenParameterSet
     */
    public static final class AndroidForWorkEnrollmentProfileCreateTokenParameterSetBuilder {
        /**
         * The tokenValidityInSeconds parameter value
         */
        @Nullable
        protected Integer tokenValidityInSeconds;
        /**
         * Sets the TokenValidityInSeconds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AndroidForWorkEnrollmentProfileCreateTokenParameterSetBuilder withTokenValidityInSeconds(@Nullable final Integer val) {
            this.tokenValidityInSeconds = val;
            return this;
        }
        /**
         * Instanciates a new AndroidForWorkEnrollmentProfileCreateTokenParameterSetBuilder
         */
        @Nullable
        protected AndroidForWorkEnrollmentProfileCreateTokenParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public AndroidForWorkEnrollmentProfileCreateTokenParameterSet build() {
            return new AndroidForWorkEnrollmentProfileCreateTokenParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.tokenValidityInSeconds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("tokenValidityInSeconds", tokenValidityInSeconds));
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
