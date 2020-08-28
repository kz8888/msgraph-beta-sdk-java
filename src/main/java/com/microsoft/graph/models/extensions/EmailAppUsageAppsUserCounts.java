// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email App Usage Apps User Counts.
 */
public class EmailAppUsageAppsUserCounts extends Entity implements IJsonBackedObject {


    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName("reportRefreshDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Mail For Mac.
     * 
     */
    @SerializedName("mailForMac")
    @Expose
    public Long mailForMac;

    /**
     * The Outlook For Mac.
     * 
     */
    @SerializedName("outlookForMac")
    @Expose
    public Long outlookForMac;

    /**
     * The Outlook For Windows.
     * 
     */
    @SerializedName("outlookForWindows")
    @Expose
    public Long outlookForWindows;

    /**
     * The Outlook For Mobile.
     * 
     */
    @SerializedName("outlookForMobile")
    @Expose
    public Long outlookForMobile;

    /**
     * The Other For Mobile.
     * 
     */
    @SerializedName("otherForMobile")
    @Expose
    public Long otherForMobile;

    /**
     * The Outlook For Web.
     * 
     */
    @SerializedName("outlookForWeb")
    @Expose
    public Long outlookForWeb;

    /**
     * The Pop3App.
     * 
     */
    @SerializedName("pop3App")
    @Expose
    public Long pop3App;

    /**
     * The Imap4App.
     * 
     */
    @SerializedName("imap4App")
    @Expose
    public Long imap4App;

    /**
     * The Smtp App.
     * 
     */
    @SerializedName("smtpApp")
    @Expose
    public Long smtpApp;

    /**
     * The Report Period.
     * 
     */
    @SerializedName("reportPeriod")
    @Expose
    public String reportPeriod;


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