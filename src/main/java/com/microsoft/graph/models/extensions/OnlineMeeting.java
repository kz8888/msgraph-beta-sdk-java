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
import com.microsoft.graph.models.generated.AccessLevel;
import com.microsoft.graph.models.generated.OnlineMeetingPresenters;
import com.microsoft.graph.models.extensions.AudioConferencing;
import com.microsoft.graph.models.extensions.BroadcastMeetingSettings;
import com.microsoft.graph.models.generated.MeetingCapabilities;
import com.microsoft.graph.models.extensions.ChatInfo;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.LobbyBypassSettings;
import com.microsoft.graph.models.extensions.MeetingParticipants;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting.
 */
public class OnlineMeeting extends Entity implements IJsonBackedObject {


    /**
     * The Access Level.
     * 
     */
    @SerializedName(value = "accessLevel", alternate = {"AccessLevel"})
    @Expose
	@Nullable
    public AccessLevel accessLevel;

    /**
     * The Allowed Presenters.
     * Specifies who can be a presenter in a meeting. Possible values are listed in the following table.
     */
    @SerializedName(value = "allowedPresenters", alternate = {"AllowedPresenters"})
    @Expose
	@Nullable
    public OnlineMeetingPresenters allowedPresenters;

    /**
     * The Audio Conferencing.
     * The phone access (dial-in) information for an online meeting. Read-only.
     */
    @SerializedName(value = "audioConferencing", alternate = {"AudioConferencing"})
    @Expose
	@Nullable
    public AudioConferencing audioConferencing;

    /**
     * The Broadcast Settings.
     * 
     */
    @SerializedName(value = "broadcastSettings", alternate = {"BroadcastSettings"})
    @Expose
	@Nullable
    public BroadcastMeetingSettings broadcastSettings;

    /**
     * The Canceled Date Time.
     * 
     */
    @SerializedName(value = "canceledDateTime", alternate = {"CanceledDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar canceledDateTime;

    /**
     * The Capabilities.
     * 
     */
    @SerializedName(value = "capabilities", alternate = {"Capabilities"})
    @Expose
	@Nullable
    public java.util.List<MeetingCapabilities> capabilities;

    /**
     * The Chat Info.
     * The chat information associated with this online meeting.
     */
    @SerializedName(value = "chatInfo", alternate = {"ChatInfo"})
    @Expose
	@Nullable
    public ChatInfo chatInfo;

    /**
     * The Creation Date Time.
     * The meeting creation time in UTC. Read-only.
     */
    @SerializedName(value = "creationDateTime", alternate = {"CreationDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar creationDateTime;

    /**
     * The End Date Time.
     * The meeting end time in UTC.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar endDateTime;

    /**
     * The Entry Exit Announcement.
     * 
     */
    @SerializedName(value = "entryExitAnnouncement", alternate = {"EntryExitAnnouncement"})
    @Expose
	@Nullable
    public Boolean entryExitAnnouncement;

    /**
     * The Expiration Date Time.
     * 
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar expirationDateTime;

    /**
     * The External Id.
     * 
     */
    @SerializedName(value = "externalId", alternate = {"ExternalId"})
    @Expose
	@Nullable
    public String externalId;

    /**
     * The Is Broadcast.
     * 
     */
    @SerializedName(value = "isBroadcast", alternate = {"IsBroadcast"})
    @Expose
	@Nullable
    public Boolean isBroadcast;

    /**
     * The Is Cancelled.
     * 
     */
    @SerializedName(value = "isCancelled", alternate = {"IsCancelled"})
    @Expose
	@Nullable
    public Boolean isCancelled;

    /**
     * The Is Entry Exit Announced.
     * Whether or not to announce when callers join or leave.
     */
    @SerializedName(value = "isEntryExitAnnounced", alternate = {"IsEntryExitAnnounced"})
    @Expose
	@Nullable
    public Boolean isEntryExitAnnounced;

    /**
     * The Join Information.
     * The join information in the language and locale variant specified in the Accept-Language request HTTP header. Read-only.
     */
    @SerializedName(value = "joinInformation", alternate = {"JoinInformation"})
    @Expose
	@Nullable
    public ItemBody joinInformation;

    /**
     * The Join Url.
     * 
     */
    @SerializedName(value = "joinUrl", alternate = {"JoinUrl"})
    @Expose
	@Nullable
    public String joinUrl;

    /**
     * The Lobby Bypass Settings.
     * Specifies which participants can bypass the meeting   lobby.
     */
    @SerializedName(value = "lobbyBypassSettings", alternate = {"LobbyBypassSettings"})
    @Expose
	@Nullable
    public LobbyBypassSettings lobbyBypassSettings;

    /**
     * The Participants.
     * The participants associated with the online meeting.  This includes the organizer and the attendees.
     */
    @SerializedName(value = "participants", alternate = {"Participants"})
    @Expose
	@Nullable
    public MeetingParticipants participants;

    /**
     * The Start Date Time.
     * The meeting start time in UTC.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar startDateTime;

    /**
     * The Subject.
     * The subject of the online meeting.
     */
    @SerializedName(value = "subject", alternate = {"Subject"})
    @Expose
	@Nullable
    public String subject;

    /**
     * The Video Teleconference Id.
     * The video teleconferencing ID. Read-only.
     */
    @SerializedName(value = "videoTeleconferenceId", alternate = {"VideoTeleconferenceId"})
    @Expose
	@Nullable
    public String videoTeleconferenceId;


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
