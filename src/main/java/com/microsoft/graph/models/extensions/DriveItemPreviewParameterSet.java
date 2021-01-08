// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.ItemPreviewInfo;
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
 * The class for the Drive Item Preview Parameter Set.
 */
public class DriveItemPreviewParameterSet {
    /**
     * The viewer.
     * 
     */
    @SerializedName(value = "viewer", alternate = {"Viewer"})
    @Expose
	@Nullable
    public String viewer;

    /**
     * The chromeless.
     * 
     */
    @SerializedName(value = "chromeless", alternate = {"Chromeless"})
    @Expose
	@Nullable
    public Boolean chromeless;

    /**
     * The allow Edit.
     * 
     */
    @SerializedName(value = "allowEdit", alternate = {"AllowEdit"})
    @Expose
	@Nullable
    public Boolean allowEdit;

    /**
     * The page.
     * 
     */
    @SerializedName(value = "page", alternate = {"Page"})
    @Expose
	@Nullable
    public String page;

    /**
     * The zoom.
     * 
     */
    @SerializedName(value = "zoom", alternate = {"Zoom"})
    @Expose
	@Nullable
    public Double zoom;


    /**
     * Instiaciates a new DriveItemPreviewParameterSet
     */
    public DriveItemPreviewParameterSet() {}
    /**
     * Instiaciates a new DriveItemPreviewParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DriveItemPreviewParameterSet(@Nonnull final DriveItemPreviewParameterSetBuilder builder) {
        this.viewer = builder.viewer;
        this.chromeless = builder.chromeless;
        this.allowEdit = builder.allowEdit;
        this.page = builder.page;
        this.zoom = builder.zoom;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemPreviewParameterSetBuilder newBuilder() {
        return new DriveItemPreviewParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveItemPreviewParameterSet
     */
    public static final class DriveItemPreviewParameterSetBuilder {
        /**
         * The viewer parameter value
         */
        @Nullable
        protected String viewer;
        /**
         * Sets the Viewer
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemPreviewParameterSetBuilder withViewer(@Nullable final String val) {
            this.viewer = val;
            return this;
        }
        /**
         * The chromeless parameter value
         */
        @Nullable
        protected Boolean chromeless;
        /**
         * Sets the Chromeless
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemPreviewParameterSetBuilder withChromeless(@Nullable final Boolean val) {
            this.chromeless = val;
            return this;
        }
        /**
         * The allowEdit parameter value
         */
        @Nullable
        protected Boolean allowEdit;
        /**
         * Sets the AllowEdit
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemPreviewParameterSetBuilder withAllowEdit(@Nullable final Boolean val) {
            this.allowEdit = val;
            return this;
        }
        /**
         * The page parameter value
         */
        @Nullable
        protected String page;
        /**
         * Sets the Page
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemPreviewParameterSetBuilder withPage(@Nullable final String val) {
            this.page = val;
            return this;
        }
        /**
         * The zoom parameter value
         */
        @Nullable
        protected Double zoom;
        /**
         * Sets the Zoom
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemPreviewParameterSetBuilder withZoom(@Nullable final Double val) {
            this.zoom = val;
            return this;
        }
        /**
         * Instanciates a new DriveItemPreviewParameterSetBuilder
         */
        @Nullable
        protected DriveItemPreviewParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemPreviewParameterSet build() {
            return new DriveItemPreviewParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.viewer != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("viewer", viewer));
        }
        if(this.chromeless != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("chromeless", chromeless));
        }
        if(this.allowEdit != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("allowEdit", allowEdit));
        }
        if(this.page != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("page", page));
        }
        if(this.zoom != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("zoom", zoom));
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
