// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comanagement Eligible Devices Summary.
 */
public class ComanagementEligibleDevicesSummary implements IJsonBackedObject {

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
     * The Comanaged Count.
     * Count of devices already Co-Managed
     */
    @SerializedName(value = "comanagedCount", alternate = {"ComanagedCount"})
    @Expose
	@Nullable
    public Integer comanagedCount;

    /**
     * The Eligible But Not Azure Ad Joined Count.
     * Count of devices eligible for Co-Management but not yet joined to Azure Active Directory
     */
    @SerializedName(value = "eligibleButNotAzureAdJoinedCount", alternate = {"EligibleButNotAzureAdJoinedCount"})
    @Expose
	@Nullable
    public Integer eligibleButNotAzureAdJoinedCount;

    /**
     * The Eligible Count.
     * Count of devices fully eligible for Co-Management
     */
    @SerializedName(value = "eligibleCount", alternate = {"EligibleCount"})
    @Expose
	@Nullable
    public Integer eligibleCount;

    /**
     * The Ineligible Count.
     * Count of devices ineligible for Co-Management
     */
    @SerializedName(value = "ineligibleCount", alternate = {"IneligibleCount"})
    @Expose
	@Nullable
    public Integer ineligibleCount;

    /**
     * The Needs Os Update Count.
     * Count of devices that will be eligible for Co-Management after an OS update
     */
    @SerializedName(value = "needsOsUpdateCount", alternate = {"NeedsOsUpdateCount"})
    @Expose
	@Nullable
    public Integer needsOsUpdateCount;


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
