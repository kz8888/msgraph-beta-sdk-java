// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.LocaleInfo;
import com.microsoft.graph.models.extensions.DateTimeTimeZone;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Automatic Replies Mail Tips.
 */
public class AutomaticRepliesMailTips implements IJsonBackedObject {

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
     * The Message.
     * The automatic reply message.
     */
    @SerializedName(value = "message", alternate = {"Message"})
    @Expose
	@Nullable
    public String message;

    /**
     * The Message Language.
     * The language that the automatic reply message is in.
     */
    @SerializedName(value = "messageLanguage", alternate = {"MessageLanguage"})
    @Expose
	@Nullable
    public LocaleInfo messageLanguage;

    /**
     * The Scheduled End Time.
     * The date and time that automatic replies are set to end.
     */
    @SerializedName(value = "scheduledEndTime", alternate = {"ScheduledEndTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone scheduledEndTime;

    /**
     * The Scheduled Start Time.
     * The date and time that automatic replies are set to begin.
     */
    @SerializedName(value = "scheduledStartTime", alternate = {"ScheduledStartTime"})
    @Expose
	@Nullable
    public DateTimeTimeZone scheduledStartTime;


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
