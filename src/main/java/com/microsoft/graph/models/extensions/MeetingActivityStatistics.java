// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ActivityStatistics;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Meeting Activity Statistics.
 */
public class MeetingActivityStatistics extends ActivityStatistics implements IJsonBackedObject {


    /**
     * The After Hours.
     * 
     */
    @SerializedName(value = "afterHours", alternate = {"AfterHours"})
    @Expose
    public javax.xml.datatype.Duration afterHours;

    /**
     * The Conflicting.
     * 
     */
    @SerializedName(value = "conflicting", alternate = {"Conflicting"})
    @Expose
    public javax.xml.datatype.Duration conflicting;

    /**
     * The Long.
     * 
     */
    @SerializedName(value = "long", alternate = {"Long"})
    @Expose
    public javax.xml.datatype.Duration msgraphLong;

    /**
     * The Multitasking.
     * 
     */
    @SerializedName(value = "multitasking", alternate = {"Multitasking"})
    @Expose
    public javax.xml.datatype.Duration multitasking;

    /**
     * The Organized.
     * 
     */
    @SerializedName(value = "organized", alternate = {"Organized"})
    @Expose
    public javax.xml.datatype.Duration organized;

    /**
     * The Recurring.
     * 
     */
    @SerializedName(value = "recurring", alternate = {"Recurring"})
    @Expose
    public javax.xml.datatype.Duration recurring;


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
