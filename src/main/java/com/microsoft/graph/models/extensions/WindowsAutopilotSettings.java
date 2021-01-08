// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsAutopilotSyncStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Settings.
 */
public class WindowsAutopilotSettings extends Entity implements IJsonBackedObject {


    /**
     * The Last Manual Sync Trigger Date Time.
     * Last data sync date time with DDS service.
     */
    @SerializedName(value = "lastManualSyncTriggerDateTime", alternate = {"LastManualSyncTriggerDateTime"})
    @Expose
    public java.util.Calendar lastManualSyncTriggerDateTime;

    /**
     * The Last Sync Date Time.
     * Last data sync date time with DDS service.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Sync Status.
     * Indicates the status of sync with Device data sync (DDS) service. Possible values are: unknown, inProgress, completed, failed.
     */
    @SerializedName(value = "syncStatus", alternate = {"SyncStatus"})
    @Expose
    public WindowsAutopilotSyncStatus syncStatus;


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
