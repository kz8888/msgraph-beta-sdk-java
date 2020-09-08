// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Direct Routing Log Row.
 */
public class DirectRoutingLogRow implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Callee Number.
     * 
     */
    @SerializedName("calleeNumber")
    @Expose
    public String calleeNumber;

    /**
     * The Call End Sub Reason.
     * 
     */
    @SerializedName("callEndSubReason")
    @Expose
    public Integer callEndSubReason;

    /**
     * The Caller Number.
     * 
     */
    @SerializedName("callerNumber")
    @Expose
    public String callerNumber;

    /**
     * The Call Type.
     * 
     */
    @SerializedName("callType")
    @Expose
    public String callType;

    /**
     * The Correlation Id.
     * 
     */
    @SerializedName("correlationId")
    @Expose
    public String correlationId;

    /**
     * The Duration.
     * 
     */
    @SerializedName("duration")
    @Expose
    public Integer duration;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Failure Date Time.
     * 
     */
    @SerializedName("failureDateTime")
    @Expose
    public java.util.Calendar failureDateTime;

    /**
     * The Final Sip Code.
     * 
     */
    @SerializedName("finalSipCode")
    @Expose
    public Integer finalSipCode;

    /**
     * The Final Sip Code Phrase.
     * 
     */
    @SerializedName("finalSipCodePhrase")
    @Expose
    public String finalSipCodePhrase;

    /**
     * The Id.
     * 
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The Invite Date Time.
     * 
     */
    @SerializedName("inviteDateTime")
    @Expose
    public java.util.Calendar inviteDateTime;

    /**
     * The Media Bypass Enabled.
     * 
     */
    @SerializedName("mediaBypassEnabled")
    @Expose
    public Boolean mediaBypassEnabled;

    /**
     * The Media Path Location.
     * 
     */
    @SerializedName("mediaPathLocation")
    @Expose
    public String mediaPathLocation;

    /**
     * The Signaling Location.
     * 
     */
    @SerializedName("signalingLocation")
    @Expose
    public String signalingLocation;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Successful Call.
     * 
     */
    @SerializedName("successfulCall")
    @Expose
    public Boolean successfulCall;

    /**
     * The Trunk Fully Qualified Domain Name.
     * 
     */
    @SerializedName("trunkFullyQualifiedDomainName")
    @Expose
    public String trunkFullyQualifiedDomainName;

    /**
     * The User Display Name.
     * 
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The User Id.
     * 
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
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
