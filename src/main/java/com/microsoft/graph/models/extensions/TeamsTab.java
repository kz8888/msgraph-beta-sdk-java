// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TeamsTabConfiguration;
import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Tab.
 */
public class TeamsTab extends Entity implements IJsonBackedObject {


    /**
     * The Configuration.
     * Container for custom settings applied to a tab. The tab is considered configured only once this property is set.
     */
    @SerializedName(value = "configuration", alternate = {"Configuration"})
    @Expose
    public TeamsTabConfiguration configuration;

    /**
     * The Display Name.
     * Name of the tab.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Message Id.
     * 
     */
    @SerializedName(value = "messageId", alternate = {"MessageId"})
    @Expose
    public String messageId;

    /**
     * The Sort Order Index.
     * 
     */
    @SerializedName(value = "sortOrderIndex", alternate = {"SortOrderIndex"})
    @Expose
    public String sortOrderIndex;

    /**
     * The Teams App Id.
     * 
     */
    @SerializedName(value = "teamsAppId", alternate = {"TeamsAppId"})
    @Expose
    public String teamsAppId;

    /**
     * The Web Url.
     * Deep link URL of the tab instance. Read only.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
    public String webUrl;

    /**
     * The Teams App.
     * The application that is linked to the tab. This cannot be changed after tab creation.
     */
    @SerializedName(value = "teamsApp", alternate = {"TeamsApp"})
    @Expose
    public TeamsApp teamsApp;


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
