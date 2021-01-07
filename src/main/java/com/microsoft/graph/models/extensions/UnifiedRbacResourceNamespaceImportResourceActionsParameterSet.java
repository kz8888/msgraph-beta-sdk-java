// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.UnifiedRbacResourceNamespace;
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
 * The class for the Unified Rbac Resource Namespace Import Resource Actions Parameter Set.
 */
public class UnifiedRbacResourceNamespaceImportResourceActionsParameterSet {
    /**
     * The format.
     * 
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
	@Nullable
    public String format;

    /**
     * The value.
     * 
     */
    @SerializedName(value = "value", alternate = {"Value"})
    @Expose
	@Nullable
    public String value;

    /**
     * The overwrite Resource Namespace.
     * 
     */
    @SerializedName(value = "overwriteResourceNamespace", alternate = {"OverwriteResourceNamespace"})
    @Expose
	@Nullable
    public Boolean overwriteResourceNamespace;


    /**
     * Instiaciates a new UnifiedRbacResourceNamespaceImportResourceActionsParameterSet
     */
    public UnifiedRbacResourceNamespaceImportResourceActionsParameterSet() {}
    /**
     * Instiaciates a new UnifiedRbacResourceNamespaceImportResourceActionsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UnifiedRbacResourceNamespaceImportResourceActionsParameterSet(@Nonnull final UnifiedRbacResourceNamespaceImportResourceActionsParameterSetBuilder builder) {
        this.format = builder.format;
        this.value = builder.value;
        this.overwriteResourceNamespace = builder.overwriteResourceNamespace;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UnifiedRbacResourceNamespaceImportResourceActionsParameterSetBuilder newBuilder() {
        return new UnifiedRbacResourceNamespaceImportResourceActionsParameterSetBuilder();
    }
    /**
     * Fluent builder for the UnifiedRbacResourceNamespaceImportResourceActionsParameterSet
     */
    public static final class UnifiedRbacResourceNamespaceImportResourceActionsParameterSetBuilder {
        /**
         * The format parameter value
         */
        @Nullable
        protected String format;
        /**
         * Sets the Format
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UnifiedRbacResourceNamespaceImportResourceActionsParameterSetBuilder withFormat(@Nullable final String val) {
            this.format = val;
            return this;
        }
        /**
         * The value parameter value
         */
        @Nullable
        protected String value;
        /**
         * Sets the Value
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UnifiedRbacResourceNamespaceImportResourceActionsParameterSetBuilder withValue(@Nullable final String val) {
            this.value = val;
            return this;
        }
        /**
         * The overwriteResourceNamespace parameter value
         */
        @Nullable
        protected Boolean overwriteResourceNamespace;
        /**
         * Sets the OverwriteResourceNamespace
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UnifiedRbacResourceNamespaceImportResourceActionsParameterSetBuilder withOverwriteResourceNamespace(@Nullable final Boolean val) {
            this.overwriteResourceNamespace = val;
            return this;
        }
        /**
         * Instanciates a new UnifiedRbacResourceNamespaceImportResourceActionsParameterSetBuilder
         */
        @Nullable
        protected UnifiedRbacResourceNamespaceImportResourceActionsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UnifiedRbacResourceNamespaceImportResourceActionsParameterSet build() {
            return new UnifiedRbacResourceNamespaceImportResourceActionsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.format != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("format", format));
        }
        if(this.value != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("value", value));
        }
        if(this.overwriteResourceNamespace != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("overwriteResourceNamespace", overwriteResourceNamespace));
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
