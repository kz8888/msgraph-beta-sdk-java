// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PayloadTypes;
import com.microsoft.graph.models.generated.Priority;
import com.microsoft.graph.models.extensions.TargetPolicyEndpoints;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification.
 */
public class Notification extends Entity implements IJsonBackedObject {


    /**
     * The Display Time To Live.
     * Sets how long (in seconds) this notification content will stay in each platform?s notification viewer. For example, when the notification is delivered to a Windows device, the value of this property is passed on to ToastNotification.ExpirationTime, which determines how long the toast notification will stay in the user?s Windows Action Center.
     */
    @SerializedName(value = "displayTimeToLive", alternate = {"DisplayTimeToLive"})
    @Expose
    public Integer displayTimeToLive;

    /**
     * The Expiration Date Time.
     * Sets a UTC expiration date and time on a user notification using ISO 8601 format (for example, midnight UTC on Jan 1, 2019 would look like this: '2019-01-01T00:00:00Z'). When time is up, the notification is removed from the Microsoft Graph notification feed store completely and is no longer part of notification history. Max value is 30 days.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Group Name.
     * The name of the group that this notification belongs to. It is set by the developer for the purpose of grouping notifications together.
     */
    @SerializedName(value = "groupName", alternate = {"GroupName"})
    @Expose
    public String groupName;

    /**
     * The Payload.
     * This is the data content of a raw or visual user notification that will be delivered to and consumed by the app client receiving this notification.
     */
    @SerializedName(value = "payload", alternate = {"Payload"})
    @Expose
    public PayloadTypes payload;

    /**
     * The Priority.
     * Indicates the priority of a raw user notification. Visual notifications are sent with high priority by default. Valid values are None, High and Low.
     */
    @SerializedName(value = "priority", alternate = {"Priority"})
    @Expose
    public Priority priority;

    /**
     * The Target Host Name.
     * Represents the host name of the app to which the calling service wants to post the notification, for the given user. If targeting web endpoints (see targetPolicy.platformTypes), ensure that targetHostName is the same as the name used when creating a subscription on the client side within the application JSON property.
     */
    @SerializedName(value = "targetHostName", alternate = {"TargetHostName"})
    @Expose
    public String targetHostName;

    /**
     * The Target Policy.
     * Target policy object handles notification delivery policy for endpoint types that should be targeted (Windows, iOS, Android and WebPush) for the given user.
     */
    @SerializedName(value = "targetPolicy", alternate = {"TargetPolicy"})
    @Expose
    public TargetPolicyEndpoints targetPolicy;


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
