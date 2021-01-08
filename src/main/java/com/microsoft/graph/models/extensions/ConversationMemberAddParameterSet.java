// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ConversationMember;
import com.microsoft.graph.models.extensions.ActionResultPart;
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
 * The class for the Conversation Member Add Parameter Set.
 */
public class ConversationMemberAddParameterSet {
    /**
     * The values.
     * 
     */
    @SerializedName(value = "values", alternate = {"Values"})
    @Expose
	@Nullable
    public java.util.List<ConversationMember> values;


    /**
     * Instiaciates a new ConversationMemberAddParameterSet
     */
    public ConversationMemberAddParameterSet() {}
    /**
     * Instiaciates a new ConversationMemberAddParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ConversationMemberAddParameterSet(@Nonnull final ConversationMemberAddParameterSetBuilder builder) {
        this.values = builder.values;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ConversationMemberAddParameterSetBuilder newBuilder() {
        return new ConversationMemberAddParameterSetBuilder();
    }
    /**
     * Fluent builder for the ConversationMemberAddParameterSet
     */
    public static final class ConversationMemberAddParameterSetBuilder {
        /**
         * The values parameter value
         */
        @Nullable
        protected java.util.List<ConversationMember> values;
        /**
         * Sets the Values
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ConversationMemberAddParameterSetBuilder withValues(@Nullable final java.util.List<ConversationMember> val) {
            this.values = val;
            return this;
        }
        /**
         * Instanciates a new ConversationMemberAddParameterSetBuilder
         */
        @Nullable
        protected ConversationMemberAddParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ConversationMemberAddParameterSet build() {
            return new ConversationMemberAddParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.values != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("values", values));
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
