// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EasAuthenticationMethod;
import com.microsoft.graph.models.generated.EmailSyncDuration;
import com.microsoft.graph.models.generated.UserEmailSource;
import com.microsoft.graph.models.generated.EmailSyncSchedule;
import com.microsoft.graph.models.generated.DomainNameSource;
import com.microsoft.graph.models.generated.AndroidUsernameSource;
import com.microsoft.graph.models.extensions.AndroidCertificateProfileBase;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Eas Email Profile Configuration.
 */
public class AndroidEasEmailProfileConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Account Name.
     * Exchange ActiveSync account name, displayed to users as name of EAS (this) profile.
     */
    @SerializedName(value = "accountName", alternate = {"AccountName"})
    @Expose
	@Nullable
    public String accountName;

    /**
     * The Authentication Method.
     * Authentication method for Exchange ActiveSync.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
	@Nullable
    public EasAuthenticationMethod authenticationMethod;

    /**
     * The Custom Domain Name.
     * Custom domain name value used while generating an email profile before installing on the device.
     */
    @SerializedName(value = "customDomainName", alternate = {"CustomDomainName"})
    @Expose
	@Nullable
    public String customDomainName;

    /**
     * The Duration Of Email To Sync.
     * Duration of time email should be synced to.
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
     * Exchange location (URL) that the native mail app connects to.
     */
    @SerializedName(value = "hostName", alternate = {"HostName"})
    @Expose
	@Nullable
    public String hostName;

    /**
     * The Require Smime.
     * Indicates whether or not to use S/MIME certificate.
     */
    @SerializedName(value = "requireSmime", alternate = {"RequireSmime"})
    @Expose
	@Nullable
    public Boolean requireSmime;

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
     * Toggles syncing the calendar. If set to false calendar is turned off on the device.
     */
    @SerializedName(value = "syncCalendar", alternate = {"SyncCalendar"})
    @Expose
	@Nullable
    public Boolean syncCalendar;

    /**
     * The Sync Contacts.
     * Toggles syncing contacts. If set to false contacts are turned off on the device.
     */
    @SerializedName(value = "syncContacts", alternate = {"SyncContacts"})
    @Expose
	@Nullable
    public Boolean syncContacts;

    /**
     * The Sync Notes.
     * Toggles syncing notes. If set to false notes are turned off on the device.
     */
    @SerializedName(value = "syncNotes", alternate = {"SyncNotes"})
    @Expose
	@Nullable
    public Boolean syncNotes;

    /**
     * The Sync Tasks.
     * Toggles syncing tasks. If set to false tasks are turned off on the device.
     */
    @SerializedName(value = "syncTasks", alternate = {"SyncTasks"})
    @Expose
	@Nullable
    public Boolean syncTasks;

    /**
     * The User Domain Name Source.
     * UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName(value = "userDomainNameSource", alternate = {"UserDomainNameSource"})
    @Expose
	@Nullable
    public DomainNameSource userDomainNameSource;

    /**
     * The Username Source.
     * Username attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName(value = "usernameSource", alternate = {"UsernameSource"})
    @Expose
	@Nullable
    public AndroidUsernameSource usernameSource;

    /**
     * The Identity Certificate.
     * Identity certificate.
     */
    @SerializedName(value = "identityCertificate", alternate = {"IdentityCertificate"})
    @Expose
	@Nullable
    public AndroidCertificateProfileBase identityCertificate;

    /**
     * The Smime Signing Certificate.
     * S/MIME signing certificate.
     */
    @SerializedName(value = "smimeSigningCertificate", alternate = {"SmimeSigningCertificate"})
    @Expose
	@Nullable
    public AndroidCertificateProfileBase smimeSigningCertificate;


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
