// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ListInfo;
import com.microsoft.graph.models.extensions.SharepointIds;
import com.microsoft.graph.models.extensions.SystemFacet;
import com.microsoft.graph.models.extensions.ItemActivityOLD;
import com.microsoft.graph.models.extensions.ColumnDefinition;
import com.microsoft.graph.models.extensions.ContentType;
import com.microsoft.graph.models.extensions.Drive;
import com.microsoft.graph.models.extensions.ListItem;
import com.microsoft.graph.models.extensions.Subscription;
import com.microsoft.graph.models.extensions.BaseItem;
import com.microsoft.graph.requests.extensions.ItemActivityOLDCollectionPage;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionPage;
import com.microsoft.graph.requests.extensions.ListItemCollectionPage;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List.
 */
public class List extends BaseItem implements IJsonBackedObject {


    /**
     * The Display Name.
     * The displayable title of the list.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The List.
     * Provides additional details about the list.
     */
    @SerializedName(value = "list", alternate = {"List"})
    @Expose
    public ListInfo list;

    /**
     * The Sharepoint Ids.
     * Returns identifiers useful for SharePoint REST compatibility. Read-only.
     */
    @SerializedName(value = "sharepointIds", alternate = {"SharepointIds"})
    @Expose
    public SharepointIds sharepointIds;

    /**
     * The System.
     * If present, indicates that this is a system-managed list. Read-only.
     */
    @SerializedName(value = "system", alternate = {"System"})
    @Expose
    public SystemFacet system;

    /**
     * The Activities.
     * 
     */
    @SerializedName(value = "activities", alternate = {"Activities"})
    @Expose
    public ItemActivityOLDCollectionPage activities;

    /**
     * The Columns.
     * The collection of field definitions for this list.
     */
    @SerializedName(value = "columns", alternate = {"Columns"})
    @Expose
    public ColumnDefinitionCollectionPage columns;

    /**
     * The Content Types.
     * The collection of content types present in this list.
     */
    @SerializedName(value = "contentTypes", alternate = {"ContentTypes"})
    @Expose
    public ContentTypeCollectionPage contentTypes;

    /**
     * The Drive.
     * Only present on document libraries. Allows access to the list as a [drive][] resource with [driveItems][driveItem].
     */
    @SerializedName(value = "drive", alternate = {"Drive"})
    @Expose
    public Drive drive;

    /**
     * The Items.
     * All items contained in the list.
     */
    @SerializedName(value = "items", alternate = {"Items"})
    @Expose
    public ListItemCollectionPage items;

    /**
     * The Subscriptions.
     * The set of subscriptions on the list.
     */
    @SerializedName(value = "subscriptions", alternate = {"Subscriptions"})
    @Expose
    public SubscriptionCollectionPage subscriptions;


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


        if (json.has("activities")) {
            activities = serializer.deserializeObject(json.get("activities").toString(), ItemActivityOLDCollectionPage.class);
        }

        if (json.has("columns")) {
            columns = serializer.deserializeObject(json.get("columns").toString(), ColumnDefinitionCollectionPage.class);
        }

        if (json.has("contentTypes")) {
            contentTypes = serializer.deserializeObject(json.get("contentTypes").toString(), ContentTypeCollectionPage.class);
        }

        if (json.has("items")) {
            items = serializer.deserializeObject(json.get("items").toString(), ListItemCollectionPage.class);
        }

        if (json.has("subscriptions")) {
            subscriptions = serializer.deserializeObject(json.get("subscriptions").toString(), SubscriptionCollectionPage.class);
        }
    }
}
