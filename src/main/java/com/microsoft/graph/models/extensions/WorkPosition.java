// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.RelatedPerson;
import com.microsoft.graph.models.extensions.PositionDetail;
import com.microsoft.graph.models.extensions.ItemFacet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Work Position.
 */
public class WorkPosition extends ItemFacet implements IJsonBackedObject {


    /**
     * The Categories.
     * 
     */
    @SerializedName(value = "categories", alternate = {"Categories"})
    @Expose
	@Nullable
    public java.util.List<String> categories;

    /**
     * The Colleagues.
     * 
     */
    @SerializedName(value = "colleagues", alternate = {"Colleagues"})
    @Expose
	@Nullable
    public java.util.List<RelatedPerson> colleagues;

    /**
     * The Detail.
     * 
     */
    @SerializedName(value = "detail", alternate = {"Detail"})
    @Expose
	@Nullable
    public PositionDetail detail;

    /**
     * The Is Current.
     * 
     */
    @SerializedName(value = "isCurrent", alternate = {"IsCurrent"})
    @Expose
	@Nullable
    public Boolean isCurrent;

    /**
     * The Manager.
     * 
     */
    @SerializedName(value = "manager", alternate = {"Manager"})
    @Expose
	@Nullable
    public RelatedPerson manager;


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
	@Override
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
