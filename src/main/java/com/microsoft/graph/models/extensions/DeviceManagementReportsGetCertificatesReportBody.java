// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Certificates Report Body.
 */
public class DeviceManagementReportsGetCertificatesReportBody {

    /**
     * The name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The select.
     * 
     */
    @SerializedName(value = "select", alternate = {"Select"})
    @Expose
    public java.util.List<String> select;

    /**
     * The search.
     * 
     */
    @SerializedName(value = "search", alternate = {"Search"})
    @Expose
    public String search;

    /**
     * The group By.
     * 
     */
    @SerializedName(value = "groupBy", alternate = {"GroupBy"})
    @Expose
    public java.util.List<String> groupBy;

    /**
     * The order By.
     * 
     */
    @SerializedName(value = "orderBy", alternate = {"OrderBy"})
    @Expose
    public java.util.List<String> orderBy;

    /**
     * The skip.
     * 
     */
    @SerializedName(value = "skip", alternate = {"Skip"})
    @Expose
    public Integer skip;

    /**
     * The top.
     * 
     */
    @SerializedName(value = "top", alternate = {"Top"})
    @Expose
    public Integer top;

    /**
     * The session Id.
     * 
     */
    @SerializedName(value = "sessionId", alternate = {"SessionId"})
    @Expose
    public String sessionId;

    /**
     * The filter.
     * 
     */
    @SerializedName(value = "filter", alternate = {"Filter"})
    @Expose
    public String filter;


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
