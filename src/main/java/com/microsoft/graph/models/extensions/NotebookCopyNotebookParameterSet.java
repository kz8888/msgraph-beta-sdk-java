// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.OnenoteOperation;
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
 * The class for the Notebook Copy Notebook Parameter Set.
 */
public class NotebookCopyNotebookParameterSet {
    /**
     * The group Id.
     * 
     */
    @SerializedName(value = "groupId", alternate = {"GroupId"})
    @Expose
	@Nullable
    public String groupId;

    /**
     * The rename As.
     * 
     */
    @SerializedName(value = "renameAs", alternate = {"RenameAs"})
    @Expose
	@Nullable
    public String renameAs;

    /**
     * The notebook Folder.
     * 
     */
    @SerializedName(value = "notebookFolder", alternate = {"NotebookFolder"})
    @Expose
	@Nullable
    public String notebookFolder;

    /**
     * The site Collection Id.
     * 
     */
    @SerializedName(value = "siteCollectionId", alternate = {"SiteCollectionId"})
    @Expose
	@Nullable
    public String siteCollectionId;

    /**
     * The site Id.
     * 
     */
    @SerializedName(value = "siteId", alternate = {"SiteId"})
    @Expose
	@Nullable
    public String siteId;


    /**
     * Instiaciates a new NotebookCopyNotebookParameterSet
     */
    public NotebookCopyNotebookParameterSet() {}
    /**
     * Instiaciates a new NotebookCopyNotebookParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected NotebookCopyNotebookParameterSet(@Nonnull final NotebookCopyNotebookParameterSetBuilder builder) {
        this.groupId = builder.groupId;
        this.renameAs = builder.renameAs;
        this.notebookFolder = builder.notebookFolder;
        this.siteCollectionId = builder.siteCollectionId;
        this.siteId = builder.siteId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static NotebookCopyNotebookParameterSetBuilder newBuilder() {
        return new NotebookCopyNotebookParameterSetBuilder();
    }
    /**
     * Fluent builder for the NotebookCopyNotebookParameterSet
     */
    public static final class NotebookCopyNotebookParameterSetBuilder {
        /**
         * The groupId parameter value
         */
        @Nullable
        protected String groupId;
        /**
         * Sets the GroupId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public NotebookCopyNotebookParameterSetBuilder withGroupId(@Nullable final String val) {
            this.groupId = val;
            return this;
        }
        /**
         * The renameAs parameter value
         */
        @Nullable
        protected String renameAs;
        /**
         * Sets the RenameAs
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public NotebookCopyNotebookParameterSetBuilder withRenameAs(@Nullable final String val) {
            this.renameAs = val;
            return this;
        }
        /**
         * The notebookFolder parameter value
         */
        @Nullable
        protected String notebookFolder;
        /**
         * Sets the NotebookFolder
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public NotebookCopyNotebookParameterSetBuilder withNotebookFolder(@Nullable final String val) {
            this.notebookFolder = val;
            return this;
        }
        /**
         * The siteCollectionId parameter value
         */
        @Nullable
        protected String siteCollectionId;
        /**
         * Sets the SiteCollectionId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public NotebookCopyNotebookParameterSetBuilder withSiteCollectionId(@Nullable final String val) {
            this.siteCollectionId = val;
            return this;
        }
        /**
         * The siteId parameter value
         */
        @Nullable
        protected String siteId;
        /**
         * Sets the SiteId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public NotebookCopyNotebookParameterSetBuilder withSiteId(@Nullable final String val) {
            this.siteId = val;
            return this;
        }
        /**
         * Instanciates a new NotebookCopyNotebookParameterSetBuilder
         */
        @Nullable
        protected NotebookCopyNotebookParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public NotebookCopyNotebookParameterSet build() {
            return new NotebookCopyNotebookParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.groupId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupId", groupId));
        }
        if(this.renameAs != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("renameAs", renameAs));
        }
        if(this.notebookFolder != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("notebookFolder", notebookFolder));
        }
        if(this.siteCollectionId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("siteCollectionId", siteCollectionId));
        }
        if(this.siteId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("siteId", siteId));
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
