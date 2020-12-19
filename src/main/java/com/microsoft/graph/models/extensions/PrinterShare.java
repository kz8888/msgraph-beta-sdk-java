// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrinterBase;
import com.microsoft.graph.requests.extensions.GroupCollectionPage;
import com.microsoft.graph.requests.extensions.UserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Share.
 */
public class PrinterShare extends PrinterBase implements IJsonBackedObject {


    /**
     * The Allow All Users.
     * 
     */
    @SerializedName(value = "allowAllUsers", alternate = {"AllowAllUsers"})
    @Expose
    public Boolean allowAllUsers;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Allowed Groups.
     * 
     */
    public GroupCollectionPage allowedGroups;

    /**
     * The Allowed Users.
     * 
     */
    public UserCollectionPage allowedUsers;

    /**
     * The Printer.
     * 
     */
    @SerializedName(value = "printer", alternate = {"Printer"})
    @Expose
    public Printer printer;


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


        if (json.has("allowedGroups")) {
            allowedGroups = serializer.deserializeObject(json.get("allowedGroups").toString(), GroupCollectionPage.class);
        }

        if (json.has("allowedUsers")) {
            allowedUsers = serializer.deserializeObject(json.get("allowedUsers").toString(), UserCollectionPage.class);
        }
    }
}
