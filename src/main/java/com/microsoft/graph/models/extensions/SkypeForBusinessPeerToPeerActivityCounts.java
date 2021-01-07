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
 * The class for the Skype For Business Peer To Peer Activity Counts.
 */
public class SkypeForBusinessPeerToPeerActivityCounts extends Entity implements IJsonBackedObject {


    /**
     * The App Sharing.
     * 
     */
    @SerializedName(value = "appSharing", alternate = {"AppSharing"})
    @Expose
	@Nullable
    public Long appSharing;

    /**
     * The Audio.
     * 
     */
    @SerializedName(value = "audio", alternate = {"Audio"})
    @Expose
	@Nullable
    public Long audio;

    /**
     * The File Transfer.
     * 
     */
    @SerializedName(value = "fileTransfer", alternate = {"FileTransfer"})
    @Expose
	@Nullable
    public Long fileTransfer;

    /**
     * The Im.
     * 
     */
    @SerializedName(value = "im", alternate = {"Im"})
    @Expose
	@Nullable
    public Long im;

    /**
     * The Report Date.
     * 
     */
    @SerializedName(value = "reportDate", alternate = {"ReportDate"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly reportDate;

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
     * The Video.
     * 
     */
    @SerializedName(value = "video", alternate = {"Video"})
    @Expose
	@Nullable
    public Long video;


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
