// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RunState;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Device State.
 */
public class DeviceManagementScriptDeviceState extends Entity implements IJsonBackedObject {


    /**
     * The Error Code.
     * Error code corresponding to erroneous execution of the device management script.
     */
    @SerializedName("errorCode")
    @Expose
    public Integer errorCode;

    /**
     * The Error Description.
     * Error description corresponding to erroneous execution of the device management script.
     */
    @SerializedName("errorDescription")
    @Expose
    public String errorDescription;

    /**
     * The Last State Update Date Time.
     * Latest time the device management script executes.
     */
    @SerializedName("lastStateUpdateDateTime")
    @Expose
    public java.util.Calendar lastStateUpdateDateTime;

    /**
     * The Result Message.
     * Details of execution output.
     */
    @SerializedName("resultMessage")
    @Expose
    public String resultMessage;

    /**
     * The Run State.
     * State of latest run of the device management script.
     */
    @SerializedName("runState")
    @Expose
    public RunState runState;

    /**
     * The Managed Device.
     * The managed devices that executes the device management script.
     */
    @SerializedName("managedDevice")
    @Expose
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
