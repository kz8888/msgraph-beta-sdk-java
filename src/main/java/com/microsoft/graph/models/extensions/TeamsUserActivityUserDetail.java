// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams User Activity User Detail.
 */
public class TeamsUserActivityUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Assigned Products.
     * 
     */
    @SerializedName(value = "assignedProducts", alternate = {"AssignedProducts"})
    @Expose
	@Nullable
    public java.util.List<String> assignedProducts;

    /**
     * The Call Count.
     * 
     */
    @SerializedName(value = "callCount", alternate = {"CallCount"})
    @Expose
	@Nullable
    public Long callCount;

    /**
     * The Deleted Date.
     * 
     */
    @SerializedName(value = "deletedDate", alternate = {"DeletedDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly deletedDate;

    /**
     * The Has Other Action.
     * 
     */
    @SerializedName(value = "hasOtherAction", alternate = {"HasOtherAction"})
    @Expose
	@Nullable
    public Boolean hasOtherAction;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName(value = "isDeleted", alternate = {"IsDeleted"})
    @Expose
	@Nullable
    public Boolean isDeleted;

    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName(value = "lastActivityDate", alternate = {"LastActivityDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly lastActivityDate;

    /**
     * The Meeting Count.
     * 
     */
    @SerializedName(value = "meetingCount", alternate = {"MeetingCount"})
    @Expose
	@Nullable
    public Long meetingCount;

    /**
     * The Private Chat Message Count.
     * 
     */
    @SerializedName(value = "privateChatMessageCount", alternate = {"PrivateChatMessageCount"})
    @Expose
	@Nullable
    public Long privateChatMessageCount;

    /**
     * The Report Period.
     * 
     */
    @SerializedName(value = "reportPeriod", alternate = {"ReportPeriod"})
    @Expose
	@Nullable
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly reportRefreshDate;

    /**
     * The Team Chat Message Count.
     * 
     */
    @SerializedName(value = "teamChatMessageCount", alternate = {"TeamChatMessageCount"})
    @Expose
	@Nullable
    public Long teamChatMessageCount;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
