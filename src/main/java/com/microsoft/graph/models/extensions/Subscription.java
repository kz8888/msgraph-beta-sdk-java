// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Subscription.
 */
public class Subscription extends Entity implements IJsonBackedObject {


    /**
     * The Application Id.
     * Identifier of the application used to create the subscription. Read-only.
     */
    @SerializedName(value = "applicationId", alternate = {"ApplicationId"})
    @Expose
    public String applicationId;

    /**
     * The Change Type.
     * Indicates the type of change in the subscribed resource that will raise a change notification. The supported values are: created, updated, deleted. Multiple values can be combined using a comma-separated list. Required. Note: Drive root item and list change notifications support only the updated changeType. User and group change notifications support updated and deleted changeType.
     */
    @SerializedName(value = "changeType", alternate = {"ChangeType"})
    @Expose
    public String changeType;

    /**
     * The Client State.
     * Specifies the value of the clientState property sent by the service in each change notification. The maximum length is 255 characters. The client can check that the change notification came from the service by comparing the value of the clientState property sent with the subscription with the value of the clientState property received with each change notification. Optional.
     */
    @SerializedName(value = "clientState", alternate = {"ClientState"})
    @Expose
    public String clientState;

    /**
     * The Creator Id.
     * Identifier of the user or service principal that created the subscription. If the app used delegated permissions to create the subscription, this field contains the ID of the signed-in user the app called on behalf of. If the app used application permissions, this field contains the ID of the service principal corresponding to the app. Read-only.
     */
    @SerializedName(value = "creatorId", alternate = {"CreatorId"})
    @Expose
    public String creatorId;

    /**
     * The Encryption Certificate.
     * A base64-encoded representation of a certificate with a public key used to encrypt resource data in change notifications. Optional. Required when includeResourceData is true.
     */
    @SerializedName(value = "encryptionCertificate", alternate = {"EncryptionCertificate"})
    @Expose
    public String encryptionCertificate;

    /**
     * The Encryption Certificate Id.
     * A custom app-provided identifier to help identify the certificate needed to decrypt resource data. Optional. Required when includeResourceData is true.
     */
    @SerializedName(value = "encryptionCertificateId", alternate = {"EncryptionCertificateId"})
    @Expose
    public String encryptionCertificateId;

    /**
     * The Expiration Date Time.
     * Specifies the date and time when the webhook subscription expires. The time is in UTC, and can be an amount of time from subscription creation that varies for the resource subscribed to.  See the table below for maximum supported subscription length of time. Required.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Include Resource Data.
     * When set to true, change notifications include resource data (such as content of a chat message). Optional.
     */
    @SerializedName(value = "includeResourceData", alternate = {"IncludeResourceData"})
    @Expose
    public Boolean includeResourceData;

    /**
     * The Latest Supported Tls Version.
     * Specifies the latest version of Transport Layer Security (TLS) that the notification endpoint, specified by notificationUrl, supports. The possible values are: v1_0, v1_1, v1_2, v1_3. For subscribers whose notification endpoint supports a version lower than the currently recommended version (TLS 1.2), specifying this property by a set timeline allows them to temporarily use their deprecated version of TLS before completing their upgrade to TLS 1.2. For these subscribers, not setting this property per the timeline would result in subscription operations failing. For subscribers whose notification endpoint already supports TLS 1.2, setting this property is optional. In such cases, Microsoft Graph defaults the property to v1_2.
     */
    @SerializedName(value = "latestSupportedTlsVersion", alternate = {"LatestSupportedTlsVersion"})
    @Expose
    public String latestSupportedTlsVersion;

    /**
     * The Lifecycle Notification Url.
     * The URL of the endpoint that receives lifecycle notifications, including subscriptionRemoved and missed notifications. This URL must make use of the HTTPS protocol. Optional. Read more about how Outlook resources use lifecycle notifications.
     */
    @SerializedName(value = "lifecycleNotificationUrl", alternate = {"LifecycleNotificationUrl"})
    @Expose
    public String lifecycleNotificationUrl;

    /**
     * The Notification Content Type.
     * 
     */
    @SerializedName(value = "notificationContentType", alternate = {"NotificationContentType"})
    @Expose
    public String notificationContentType;

    /**
     * The Notification Query Options.
     * 
     */
    @SerializedName(value = "notificationQueryOptions", alternate = {"NotificationQueryOptions"})
    @Expose
    public String notificationQueryOptions;

    /**
     * The Notification Url.
     * The URL of the endpoint that receives the change notifications. This URL must make use of the HTTPS protocol. Required.
     */
    @SerializedName(value = "notificationUrl", alternate = {"NotificationUrl"})
    @Expose
    public String notificationUrl;

    /**
     * The Resource.
     * Specifies the resource that will be monitored for changes. Do not include the base URL (https://graph.microsoft.com/beta/). See the possible resource path values for each supported resource. Required.
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
    public String resource;


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
