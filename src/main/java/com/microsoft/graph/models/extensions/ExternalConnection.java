// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Configuration;
import com.microsoft.graph.models.generated.ConnectionState;
import com.microsoft.graph.models.extensions.ExternalGroup;
import com.microsoft.graph.models.extensions.ExternalItem;
import com.microsoft.graph.models.extensions.ConnectionOperation;
import com.microsoft.graph.models.extensions.Schema;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ExternalGroupCollectionPage;
import com.microsoft.graph.requests.extensions.ExternalItemCollectionPage;
import com.microsoft.graph.requests.extensions.ConnectionOperationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Connection.
 */
public class ExternalConnection extends Entity implements IJsonBackedObject {


    /**
     * The Configuration.
     * 
     */
    @SerializedName(value = "configuration", alternate = {"Configuration"})
    @Expose
    public Configuration configuration;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public ConnectionState state;

    /**
     * The Groups.
     * 
     */
    @SerializedName(value = "groups", alternate = {"Groups"})
    @Expose
    public ExternalGroupCollectionPage groups;

    /**
     * The Items.
     * 
     */
    @SerializedName(value = "items", alternate = {"Items"})
    @Expose
    public ExternalItemCollectionPage items;

    /**
     * The Operations.
     * 
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
    public ConnectionOperationCollectionPage operations;

    /**
     * The Schema.
     * 
     */
    @SerializedName(value = "schema", alternate = {"Schema"})
    @Expose
    public Schema schema;


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


        if (json.has("groups")) {
            groups = serializer.deserializeObject(json.get("groups").toString(), ExternalGroupCollectionPage.class);
        }

        if (json.has("items")) {
            items = serializer.deserializeObject(json.get("items").toString(), ExternalItemCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations").toString(), ConnectionOperationCollectionPage.class);
        }
    }
}
