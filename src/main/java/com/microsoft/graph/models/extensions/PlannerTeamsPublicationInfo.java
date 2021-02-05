// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Teams Publication Info.
 */
public class PlannerTeamsPublicationInfo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Last Modified Date Time.
     * The date and time when this task was last modified by the publication process. Read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Publication Id.
     * The identifier of the publication. Read-only.
     */
    @SerializedName(value = "publicationId", alternate = {"PublicationId"})
    @Expose
    public String publicationId;

    /**
     * The Published To Plan Id.
     * The identifier of the plannerPlan this task was originally placed in. Read-only.
     */
    @SerializedName(value = "publishedToPlanId", alternate = {"PublishedToPlanId"})
    @Expose
    public String publishedToPlanId;

    /**
     * The Publishing Team Id.
     * The identifier of the team that initiated the publication process. Read-only.
     */
    @SerializedName(value = "publishingTeamId", alternate = {"PublishingTeamId"})
    @Expose
    public String publishingTeamId;

    /**
     * The Publishing Team Name.
     * The display name of the team that initiated the publication process. This display name is for reference only, and might not represent the most up-to-date name of the team. Read-only.
     */
    @SerializedName(value = "publishingTeamName", alternate = {"PublishingTeamName"})
    @Expose
    public String publishingTeamName;


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
