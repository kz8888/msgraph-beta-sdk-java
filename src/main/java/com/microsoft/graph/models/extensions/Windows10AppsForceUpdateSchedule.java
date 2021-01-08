// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Windows10AppsUpdateRecurrence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Apps Force Update Schedule.
 */
public class Windows10AppsForceUpdateSchedule implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Recurrence.
     * Recurrence schedule. Possible values are: none, daily, weekly, monthly.
     */
    @SerializedName(value = "recurrence", alternate = {"Recurrence"})
    @Expose
    public Windows10AppsUpdateRecurrence recurrence;

    /**
     * The Run Immediately If After Start Date Time.
     * If true, runs the task immediately if StartDateTime is in the past, else, runs at the next recurrence.
     */
    @SerializedName(value = "runImmediatelyIfAfterStartDateTime", alternate = {"RunImmediatelyIfAfterStartDateTime"})
    @Expose
    public Boolean runImmediatelyIfAfterStartDateTime;

    /**
     * The Start Date Time.
     * The start time for the force restart.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;


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
