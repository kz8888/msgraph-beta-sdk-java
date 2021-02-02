// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.ediscovery.models.generated.ChildSelectability;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.ediscovery.models.extensions.Tag;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.ediscovery.requests.extensions.TagCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tag.
 */
public class Tag extends Entity implements IJsonBackedObject {


    /**
     * The Child Selectability.
     * 
     */
    @SerializedName(value = "childSelectability", alternate = {"ChildSelectability"})
    @Expose
    public ChildSelectability childSelectability;

    /**
     * The Created By.
     * 
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
    public IdentitySet createdBy;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Child Tags.
     * 
     */
    public TagCollectionPage childTags;

    /**
     * The Parent.
     * 
     */
    @SerializedName(value = "parent", alternate = {"Parent"})
    @Expose
    public Tag parent;


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


        if (json.has("childTags")) {
            childTags = serializer.deserializeObject(json.get("childTags").toString(), TagCollectionPage.class);
        }
    }
}
