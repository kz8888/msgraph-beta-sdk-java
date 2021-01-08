// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.GroupPolicyUploadedLanguageFile;
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
 * The class for the Group Policy Uploaded Definition File Update Language Files Parameter Set.
 */
public class GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSet {
    /**
     * The group Policy Uploaded Language Files.
     * 
     */
    @SerializedName(value = "groupPolicyUploadedLanguageFiles", alternate = {"GroupPolicyUploadedLanguageFiles"})
    @Expose
	@Nullable
    public java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles;


    /**
     * Instiaciates a new GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSet
     */
    public GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSet() {}
    /**
     * Instiaciates a new GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSet(@Nonnull final GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSetBuilder builder) {
        this.groupPolicyUploadedLanguageFiles = builder.groupPolicyUploadedLanguageFiles;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSetBuilder newBuilder() {
        return new GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSetBuilder();
    }
    /**
     * Fluent builder for the GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSet
     */
    public static final class GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSetBuilder {
        /**
         * The groupPolicyUploadedLanguageFiles parameter value
         */
        @Nullable
        protected java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles;
        /**
         * Sets the GroupPolicyUploadedLanguageFiles
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSetBuilder withGroupPolicyUploadedLanguageFiles(@Nullable final java.util.List<GroupPolicyUploadedLanguageFile> val) {
            this.groupPolicyUploadedLanguageFiles = val;
            return this;
        }
        /**
         * Instanciates a new GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSetBuilder
         */
        @Nullable
        protected GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSet build() {
            return new GroupPolicyUploadedDefinitionFileUpdateLanguageFilesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.groupPolicyUploadedLanguageFiles != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupPolicyUploadedLanguageFiles", groupPolicyUploadedLanguageFiles));
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
