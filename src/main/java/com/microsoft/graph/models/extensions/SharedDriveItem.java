// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.List;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.requests.extensions.DriveItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared Drive Item.
 */
public class SharedDriveItem extends BaseItem implements IJsonBackedObject {


    /**
     * The Owner.
     * Information about the owner of the shared item being referenced.
     */
    @SerializedName(value = "owner", alternate = {"Owner"})
    @Expose
    public IdentitySet owner;

    /**
     * The Drive Item.
     * Used to access the underlying driveItem
     */
    @SerializedName(value = "driveItem", alternate = {"DriveItem"})
    @Expose
    public DriveItem driveItem;

    /**
     * The Items.
     * All driveItems contained in the sharing root. This collection cannot be enumerated.
     */
    @SerializedName(value = "items", alternate = {"Items"})
    @Expose
    public DriveItemCollectionPage items;

    /**
     * The List.
     * Used to access the underlying list
     */
    @SerializedName(value = "list", alternate = {"List"})
    @Expose
    public List list;

    /**
     * The List Item.
     * Used to access the underlying listItem
     */
    @SerializedName(value = "listItem", alternate = {"ListItem"})
    @Expose
    public ListItem listItem;

    /**
     * The Permission.
     * Used to access the permission representing the underlying sharing link
     */
    @SerializedName(value = "permission", alternate = {"Permission"})
    @Expose
    public Permission permission;

    /**
     * The Root.
     * 
     */
    @SerializedName(value = "root", alternate = {"Root"})
    @Expose
    public DriveItem root;

    /**
     * The Site.
     * Used to access the underlying site
     */
    @SerializedName(value = "site", alternate = {"Site"})
    @Expose
    public Site site;


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


        if (json.has("items")) {
            items = serializer.deserializeObject(json.get("items").toString(), DriveItemCollectionPage.class);
        }
    }
}
