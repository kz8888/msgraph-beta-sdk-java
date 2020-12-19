// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.MigrationStatus;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Relying Party Detailed Summary.
 */
public class RelyingPartyDetailedSummary extends Entity implements IJsonBackedObject {


    /**
     * The Failed Sign In Count.
     * 
     */
    @SerializedName(value = "failedSignInCount", alternate = {"FailedSignInCount"})
    @Expose
    public Long failedSignInCount;

    /**
     * The Migration Status.
     * 
     */
    @SerializedName(value = "migrationStatus", alternate = {"MigrationStatus"})
    @Expose
    public MigrationStatus migrationStatus;

    /**
     * The Migration Validation Details.
     * 
     */
    @SerializedName(value = "migrationValidationDetails", alternate = {"MigrationValidationDetails"})
    @Expose
    public java.util.List<KeyValuePair> migrationValidationDetails;

    /**
     * The Relying Party Id.
     * 
     */
    @SerializedName(value = "relyingPartyId", alternate = {"RelyingPartyId"})
    @Expose
    public String relyingPartyId;

    /**
     * The Relying Party Name.
     * 
     */
    @SerializedName(value = "relyingPartyName", alternate = {"RelyingPartyName"})
    @Expose
    public String relyingPartyName;

    /**
     * The Reply Urls.
     * 
     */
    @SerializedName(value = "replyUrls", alternate = {"ReplyUrls"})
    @Expose
    public java.util.List<String> replyUrls;

    /**
     * The Service Id.
     * 
     */
    @SerializedName(value = "serviceId", alternate = {"ServiceId"})
    @Expose
    public String serviceId;

    /**
     * The Sign In Success Rate.
     * 
     */
    @SerializedName(value = "signInSuccessRate", alternate = {"SignInSuccessRate"})
    @Expose
    public Double signInSuccessRate;

    /**
     * The Successful Sign In Count.
     * 
     */
    @SerializedName(value = "successfulSignInCount", alternate = {"SuccessfulSignInCount"})
    @Expose
    public Long successfulSignInCount;

    /**
     * The Total Sign In Count.
     * 
     */
    @SerializedName(value = "totalSignInCount", alternate = {"TotalSignInCount"})
    @Expose
    public Long totalSignInCount;

    /**
     * The Unique User Count.
     * 
     */
    @SerializedName(value = "uniqueUserCount", alternate = {"UniqueUserCount"})
    @Expose
    public Long uniqueUserCount;


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
