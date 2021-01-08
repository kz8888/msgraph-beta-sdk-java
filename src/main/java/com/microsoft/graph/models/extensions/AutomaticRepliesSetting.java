// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ExternalAudienceScope;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;
import com.microsoft.graph.models.generated.AutomaticRepliesStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Automatic Replies Setting.
 */
public class AutomaticRepliesSetting implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The External Audience.
     * The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status is AlwaysEnabled or Scheduled. The possible values are: none, contactsOnly, all.
     */
    @SerializedName(value = "externalAudience", alternate = {"ExternalAudience"})
    @Expose
	@Nullable
    public ExternalAudienceScope externalAudience;

    /**
     * The External Reply Message.
     * The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
     */
    @SerializedName(value = "externalReplyMessage", alternate = {"ExternalReplyMessage"})
    @Expose
	@Nullable
    public String externalReplyMessage;

    /**
     * The Internal Reply Message.
     * The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled or Scheduled.
     */
    @SerializedName(value = "internalReplyMessage", alternate = {"InternalReplyMessage"})
    @Expose
	@Nullable
    public String internalReplyMessage;

    /**
     * The Scheduled End Date Time.
     * The date and time that automatic replies are set to end, if Status is set to Scheduled.
     */
    @SerializedName(value = "scheduledEndDateTime", alternate = {"ScheduledEndDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone scheduledEndDateTime;

    /**
     * The Scheduled Start Date Time.
     * The date and time that automatic replies are set to begin, if Status is set to Scheduled.
     */
    @SerializedName(value = "scheduledStartDateTime", alternate = {"ScheduledStartDateTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone scheduledStartDateTime;

    /**
     * The Status.
     * Configurations status for automatic replies. The possible values are: disabled, alwaysEnabled, scheduled.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public AutomaticRepliesStatus status;


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
