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
 * The class for the Teams Device Usage Distribution User Counts.
 */
public class TeamsDeviceUsageDistributionUserCounts extends Entity implements IJsonBackedObject {


    /**
     * The Android Phone.
     * 
     */
    @SerializedName(value = "androidPhone", alternate = {"AndroidPhone"})
    @Expose
	@Nullable
    public Long androidPhone;

    /**
     * The Ios.
     * 
     */
    @SerializedName(value = "ios", alternate = {"Ios"})
    @Expose
	@Nullable
    public Long ios;

    /**
     * The Mac.
     * 
     */
    @SerializedName(value = "mac", alternate = {"Mac"})
    @Expose
	@Nullable
    public Long mac;

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
     * The Web.
     * 
     */
    @SerializedName(value = "web", alternate = {"Web"})
    @Expose
	@Nullable
    public Long web;

    /**
     * The Windows.
     * 
     */
    @SerializedName(value = "windows", alternate = {"Windows"})
    @Expose
	@Nullable
    public Long windows;

    /**
     * The Windows Phone.
     * 
     */
    @SerializedName(value = "windowsPhone", alternate = {"WindowsPhone"})
    @Expose
	@Nullable
    public Long windowsPhone;


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
