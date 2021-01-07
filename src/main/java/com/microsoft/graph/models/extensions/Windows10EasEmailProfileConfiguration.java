// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EmailSyncDuration;
import com.microsoft.graph.models.generated.UserEmailSource;
import com.microsoft.graph.models.generated.EmailSyncSchedule;
import com.microsoft.graph.models.extensions.EasEmailProfileConfigurationBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Eas Email Profile Configuration.
 */
public class Windows10EasEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements IJsonBackedObject {


    /**
     * The Account Name.
     * Account name.
     */
    @SerializedName(value = "accountName", alternate = {"AccountName"})
    @Expose
	@Nullable
    public String accountName;

    /**
     * The Duration Of Email To Sync.
     * Duration of email to sync.
     */
    @SerializedName(value = "durationOfEmailToSync", alternate = {"DurationOfEmailToSync"})
    @Expose
	@Nullable
    public EmailSyncDuration durationOfEmailToSync;

    /**
     * The Email Address Source.
     * Email attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName(value = "emailAddressSource", alternate = {"EmailAddressSource"})
    @Expose
	@Nullable
    public UserEmailSource emailAddressSource;

    /**
     * The Email Sync Schedule.
     * Email sync schedule.
     */
    @SerializedName(value = "emailSyncSchedule", alternate = {"EmailSyncSchedule"})
    @Expose
	@Nullable
    public EmailSyncSchedule emailSyncSchedule;

    /**
     * The Host Name.
     * Exchange location that (URL) that the native mail app connects to.
     */
    @SerializedName(value = "hostName", alternate = {"HostName"})
    @Expose
	@Nullable
    public String hostName;

    /**
     * The Require Ssl.
     * Indicates whether or not to use SSL.
     */
    @SerializedName(value = "requireSsl", alternate = {"RequireSsl"})
    @Expose
	@Nullable
    public Boolean requireSsl;

    /**
     * The Sync Calendar.
     * Whether or not to sync the calendar.
     */
    @SerializedName(value = "syncCalendar", alternate = {"SyncCalendar"})
    @Expose
	@Nullable
    public Boolean syncCalendar;

    /**
     * The Sync Contacts.
     * Whether or not to sync contacts.
     */
    @SerializedName(value = "syncContacts", alternate = {"SyncContacts"})
    @Expose
	@Nullable
    public Boolean syncContacts;

    /**
     * The Sync Tasks.
     * Whether or not to sync tasks.
     */
    @SerializedName(value = "syncTasks", alternate = {"SyncTasks"})
    @Expose
	@Nullable
    public Boolean syncTasks;


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
