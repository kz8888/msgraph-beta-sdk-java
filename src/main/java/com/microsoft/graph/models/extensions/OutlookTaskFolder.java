// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.OutlookTask;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.OutlookTaskCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Task Folder.
 */
public class OutlookTaskFolder extends Entity implements IJsonBackedObject {


    /**
     * The Change Key.
     * 
     */
    @SerializedName(value = "changeKey", alternate = {"ChangeKey"})
    @Expose
    public String changeKey;

    /**
     * The Is Default Folder.
     * 
     */
    @SerializedName(value = "isDefaultFolder", alternate = {"IsDefaultFolder"})
    @Expose
    public Boolean isDefaultFolder;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Parent Group Key.
     * 
     */
    @SerializedName(value = "parentGroupKey", alternate = {"ParentGroupKey"})
    @Expose
    public java.util.UUID parentGroupKey;

    /**
     * The Multi Value Extended Properties.
     * 
     */
    @SerializedName(value = "multiValueExtendedProperties", alternate = {"MultiValueExtendedProperties"})
    @Expose
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * 
     */
    @SerializedName(value = "singleValueExtendedProperties", alternate = {"SingleValueExtendedProperties"})
    @Expose
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;

    /**
     * The Tasks.
     * 
     */
    @SerializedName(value = "tasks", alternate = {"Tasks"})
    @Expose
    public OutlookTaskCollectionPage tasks;


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


        if (json.has("multiValueExtendedProperties")) {
            multiValueExtendedProperties = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), MultiValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("singleValueExtendedProperties")) {
            singleValueExtendedProperties = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), SingleValueLegacyExtendedPropertyCollectionPage.class);
        }

        if (json.has("tasks")) {
            tasks = serializer.deserializeObject(json.get("tasks").toString(), OutlookTaskCollectionPage.class);
        }
    }
}
