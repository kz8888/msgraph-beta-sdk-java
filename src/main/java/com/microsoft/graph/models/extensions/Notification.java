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
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification.
 */
public class Notification extends Entity implements IJsonBackedObject {


    /**
     * The Display Time To Live.
     * 
     */
    @SerializedName(value = "displayTimeToLive", alternate = {"DisplayTimeToLive"})
    @Expose
	@Nullable
    public Integer displayTimeToLive;

    /**
     * The Expiration Date Time.
     * 
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar expirationDateTime;

    /**
     * The Group Name.
     * 
     */
    @SerializedName(value = "groupName", alternate = {"GroupName"})
    @Expose
	@Nullable
    public String groupName;

    /**
     * The Payload.
     * 
     */
    @SerializedName(value = "payload", alternate = {"Payload"})
    @Expose
	@Nullable
    public PayloadTypes payload;

    /**
     * The Priority.
     * 
     */
    @SerializedName(value = "priority", alternate = {"Priority"})
    @Expose
	@Nullable
    public Priority priority;

    /**
     * The Target Host Name.
     * 
     */
    @SerializedName(value = "targetHostName", alternate = {"TargetHostName"})
    @Expose
	@Nullable
    public String targetHostName;

    /**
     * The Target Policy.
     * 
     */
    @SerializedName(value = "targetPolicy", alternate = {"TargetPolicy"})
    @Expose
	@Nullable
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
