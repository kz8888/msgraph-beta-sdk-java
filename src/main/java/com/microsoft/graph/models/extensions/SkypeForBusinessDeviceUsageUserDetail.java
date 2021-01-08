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
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Device Usage User Detail.
 */
public class SkypeForBusinessDeviceUsageUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName(value = "lastActivityDate", alternate = {"LastActivityDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly lastActivityDate;

    /**
     * The Report Period.
     * 
     */
    @SerializedName(value = "reportPeriod", alternate = {"ReportPeriod"})
    @Expose
	@Nullable
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName(value = "reportRefreshDate", alternate = {"ReportRefreshDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly reportRefreshDate;

    /**
     * The Used Android Phone.
     * 
     */
    @SerializedName(value = "usedAndroidPhone", alternate = {"UsedAndroidPhone"})
    @Expose
	@Nullable
    public Boolean usedAndroidPhone;

    /**
     * The Usedi Pad.
     * 
     */
    @SerializedName(value = "usediPad", alternate = {"UsediPad"})
    @Expose
	@Nullable
    public Boolean usediPad;

    /**
     * The Usedi Phone.
     * 
     */
    @SerializedName(value = "usediPhone", alternate = {"UsediPhone"})
    @Expose
	@Nullable
    public Boolean usediPhone;

    /**
     * The Used Windows.
     * 
     */
    @SerializedName(value = "usedWindows", alternate = {"UsedWindows"})
    @Expose
	@Nullable
    public Boolean usedWindows;

    /**
     * The Used Windows Phone.
     * 
     */
    @SerializedName(value = "usedWindowsPhone", alternate = {"UsedWindowsPhone"})
    @Expose
	@Nullable
    public Boolean usedWindowsPhone;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
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
