// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SharepointIds;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Reference.
 */
public class ItemReference implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Drive Id.
     * Unique identifier of the drive instance that contains the item. Read-only.
     */
    @SerializedName("driveId")
    @Expose
    public String driveId;

    /**
     * The Drive Type.
     * Identifies the type of drive. See [drive][] resource for values.
     */
    @SerializedName("driveType")
    @Expose
    public String driveType;

    /**
     * The Id.
     * Unique identifier of the item in the drive. Read-only.
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The Name.
     * The name of the item being referenced. Read-only.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Path.
     * Path that can be used to navigate to the item. Read-only.
     */
    @SerializedName("path")
    @Expose
    public String path;

    /**
     * The Share Id.
     * A unique identifier for a shared resource that can be accessed via the [Shares][] API.
     */
    @SerializedName("shareId")
    @Expose
    public String shareId;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName("sharepointIds")
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The Site Id.
     * 
     */
    @SerializedName("siteId")
    @Expose
    public String siteId;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}