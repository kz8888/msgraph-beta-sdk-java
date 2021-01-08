// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WindowsFeatureUpdateProfileAssignment;
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
 * The class for the Windows Feature Update Profile Assign Parameter Set.
 */
public class WindowsFeatureUpdateProfileAssignParameterSet {
    /**
     * The assignments.
     * 
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public java.util.List<WindowsFeatureUpdateProfileAssignment> assignments;


    /**
     * Instiaciates a new WindowsFeatureUpdateProfileAssignParameterSet
     */
    public WindowsFeatureUpdateProfileAssignParameterSet() {}
    /**
     * Instiaciates a new WindowsFeatureUpdateProfileAssignParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WindowsFeatureUpdateProfileAssignParameterSet(@Nonnull final WindowsFeatureUpdateProfileAssignParameterSetBuilder builder) {
        this.assignments = builder.assignments;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WindowsFeatureUpdateProfileAssignParameterSetBuilder newBuilder() {
        return new WindowsFeatureUpdateProfileAssignParameterSetBuilder();
    }
    /**
     * Fluent builder for the WindowsFeatureUpdateProfileAssignParameterSet
     */
    public static final class WindowsFeatureUpdateProfileAssignParameterSetBuilder {
        /**
         * The assignments parameter value
         */
        @Nullable
        protected java.util.List<WindowsFeatureUpdateProfileAssignment> assignments;
        /**
         * Sets the Assignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WindowsFeatureUpdateProfileAssignParameterSetBuilder withAssignments(@Nullable final java.util.List<WindowsFeatureUpdateProfileAssignment> val) {
            this.assignments = val;
            return this;
        }
        /**
         * Instanciates a new WindowsFeatureUpdateProfileAssignParameterSetBuilder
         */
        @Nullable
        protected WindowsFeatureUpdateProfileAssignParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WindowsFeatureUpdateProfileAssignParameterSet build() {
            return new WindowsFeatureUpdateProfileAssignParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.assignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("assignments", assignments));
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
