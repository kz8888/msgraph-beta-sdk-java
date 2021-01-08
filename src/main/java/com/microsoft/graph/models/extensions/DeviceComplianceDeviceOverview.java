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
 * The class for the Device Compliance Device Overview.
 */
public class DeviceComplianceDeviceOverview extends Entity implements IJsonBackedObject {


    /**
     * The Configuration Version.
     * Version of the policy for that overview
     */
    @SerializedName(value = "configurationVersion", alternate = {"ConfigurationVersion"})
    @Expose
	@Nullable
    public Integer configurationVersion;

    /**
     * The Conflict Count.
     * Number of devices in conflict
     */
    @SerializedName(value = "conflictCount", alternate = {"ConflictCount"})
    @Expose
	@Nullable
    public Integer conflictCount;

    /**
     * The Error Count.
     * Number of error devices
     */
    @SerializedName(value = "errorCount", alternate = {"ErrorCount"})
    @Expose
	@Nullable
    public Integer errorCount;

    /**
     * The Failed Count.
     * Number of failed devices
     */
    @SerializedName(value = "failedCount", alternate = {"FailedCount"})
    @Expose
	@Nullable
    public Integer failedCount;

    /**
     * The Last Update Date Time.
     * Last update time
     */
    @SerializedName(value = "lastUpdateDateTime", alternate = {"LastUpdateDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastUpdateDateTime;

    /**
     * The Not Applicable Count.
     * Number of not applicable devices
     */
    @SerializedName(value = "notApplicableCount", alternate = {"NotApplicableCount"})
    @Expose
	@Nullable
    public Integer notApplicableCount;

    /**
     * The Not Applicable Platform Count.
     * Number of not applicable devices due to mismatch platform and policy
     */
    @SerializedName(value = "notApplicablePlatformCount", alternate = {"NotApplicablePlatformCount"})
    @Expose
	@Nullable
    public Integer notApplicablePlatformCount;

    /**
     * The Pending Count.
     * Number of pending devices
     */
    @SerializedName(value = "pendingCount", alternate = {"PendingCount"})
    @Expose
	@Nullable
    public Integer pendingCount;

    /**
     * The Success Count.
     * Number of succeeded devices
     */
    @SerializedName(value = "successCount", alternate = {"SuccessCount"})
    @Expose
	@Nullable
    public Integer successCount;


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
