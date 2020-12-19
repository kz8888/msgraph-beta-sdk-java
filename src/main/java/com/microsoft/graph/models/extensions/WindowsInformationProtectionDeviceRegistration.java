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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration.
 */
public class WindowsInformationProtectionDeviceRegistration extends Entity implements IJsonBackedObject {


    /**
     * The Device Mac Address.
     * Device Mac address.
     */
    @SerializedName(value = "deviceMacAddress", alternate = {"DeviceMacAddress"})
    @Expose
    public String deviceMacAddress;

    /**
     * The Device Name.
     * Device name.
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
    public String deviceName;

    /**
     * The Device Registration Id.
     * Device identifier for this device registration record.
     */
    @SerializedName(value = "deviceRegistrationId", alternate = {"DeviceRegistrationId"})
    @Expose
    public String deviceRegistrationId;

    /**
     * The Device Type.
     * Device type, for example, Windows laptop VS Windows phone.
     */
    @SerializedName(value = "deviceType", alternate = {"DeviceType"})
    @Expose
    public String deviceType;

    /**
     * The Last Check In Date Time.
     * Last checkin time of the device.
     */
    @SerializedName(value = "lastCheckInDateTime", alternate = {"LastCheckInDateTime"})
    @Expose
    public java.util.Calendar lastCheckInDateTime;

    /**
     * The User Id.
     * UserId associated with this device registration record.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;


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
