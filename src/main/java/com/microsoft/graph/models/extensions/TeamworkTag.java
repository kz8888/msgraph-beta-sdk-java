// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.TeamworkTagType;
import com.microsoft.graph.models.extensions.TeamworkTagMember;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.TeamworkTagMemberCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teamwork Tag.
 */
public class TeamworkTag extends Entity implements IJsonBackedObject {


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
     * The Member Count.
     * 
     */
    @SerializedName(value = "memberCount", alternate = {"MemberCount"})
    @Expose
    public Integer memberCount;

    /**
     * The Tag Type.
     * 
     */
    @SerializedName(value = "tagType", alternate = {"TagType"})
    @Expose
    public TeamworkTagType tagType;

    /**
     * The Team Id.
     * 
     */
    @SerializedName(value = "teamId", alternate = {"TeamId"})
    @Expose
    public String teamId;

    /**
     * The Members.
     * 
     */
    @SerializedName(value = "members", alternate = {"Members"})
    @Expose
    public TeamworkTagMemberCollectionPage members;


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


        if (json.has("members")) {
            members = serializer.deserializeObject(json.get("members").toString(), TeamworkTagMemberCollectionPage.class);
        }
    }
}
