// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RunState;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Script Device State.
 */
public class DeviceComplianceScriptDeviceState extends Entity implements IJsonBackedObject {


    /**
     * The Detection State.
     * Detection state from the lastest device compliance script execution
     */
    @SerializedName(value = "detectionState", alternate = {"DetectionState"})
    @Expose
	@Nullable
    public RunState detectionState;

    /**
     * The Expected State Update Date Time.
     * The next timestamp of when the device compliance script is expected to execute
     */
    @SerializedName(value = "expectedStateUpdateDateTime", alternate = {"ExpectedStateUpdateDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar expectedStateUpdateDateTime;

    /**
     * The Last State Update Date Time.
     * The last timestamp of when the device compliance script executed
     */
    @SerializedName(value = "lastStateUpdateDateTime", alternate = {"LastStateUpdateDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastStateUpdateDateTime;

    /**
     * The Last Sync Date Time.
     * The last time that Intune Managment Extension synced with Intune
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Script Error.
     * Error from the detection script
     */
    @SerializedName(value = "scriptError", alternate = {"ScriptError"})
    @Expose
	@Nullable
    public String scriptError;

    /**
     * The Script Output.
     * Output of the detection script
     */
    @SerializedName(value = "scriptOutput", alternate = {"ScriptOutput"})
    @Expose
	@Nullable
    public String scriptOutput;

    /**
     * The Managed Device.
     * The managed device on which the device compliance script executed
     */
    @SerializedName(value = "managedDevice", alternate = {"ManagedDevice"})
    @Expose
	@Nullable
    public ManagedDevice managedDevice;


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
