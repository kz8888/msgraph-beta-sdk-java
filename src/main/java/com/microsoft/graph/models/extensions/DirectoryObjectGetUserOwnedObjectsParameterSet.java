// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.DirectoryObject;
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
 * The class for the Directory Object Get User Owned Objects Parameter Set.
 */
public class DirectoryObjectGetUserOwnedObjectsParameterSet {
    /**
     * The user Id.
     * 
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public String type;


    /**
     * Instiaciates a new DirectoryObjectGetUserOwnedObjectsParameterSet
     */
    public DirectoryObjectGetUserOwnedObjectsParameterSet() {}
    /**
     * Instiaciates a new DirectoryObjectGetUserOwnedObjectsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DirectoryObjectGetUserOwnedObjectsParameterSet(@Nonnull final DirectoryObjectGetUserOwnedObjectsParameterSetBuilder builder) {
        this.userId = builder.userId;
        this.type = builder.type;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DirectoryObjectGetUserOwnedObjectsParameterSetBuilder newBuilder() {
        return new DirectoryObjectGetUserOwnedObjectsParameterSetBuilder();
    }
    /**
     * Fluent builder for the DirectoryObjectGetUserOwnedObjectsParameterSet
     */
    public static final class DirectoryObjectGetUserOwnedObjectsParameterSetBuilder {
        /**
         * The userId parameter value
         */
        @Nullable
        protected String userId;
        /**
         * Sets the UserId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DirectoryObjectGetUserOwnedObjectsParameterSetBuilder withUserId(@Nullable final String val) {
            this.userId = val;
            return this;
        }
        /**
         * The type parameter value
         */
        @Nullable
        protected String type;
        /**
         * Sets the Type
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DirectoryObjectGetUserOwnedObjectsParameterSetBuilder withType(@Nullable final String val) {
            this.type = val;
            return this;
        }
        /**
         * Instanciates a new DirectoryObjectGetUserOwnedObjectsParameterSetBuilder
         */
        @Nullable
        protected DirectoryObjectGetUserOwnedObjectsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DirectoryObjectGetUserOwnedObjectsParameterSet build() {
            return new DirectoryObjectGetUserOwnedObjectsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.userId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("userId", userId));
        }
        if(this.type != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("type", type));
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
