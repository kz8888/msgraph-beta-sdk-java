// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentityState;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Windows Autopilot Device Identity.
 */
public class ImportedWindowsAutopilotDeviceIdentity extends Entity implements IJsonBackedObject {


    /**
     * The Assigned User Principal Name.
     * UPN of the user the device will be assigned
     */
    @SerializedName(value = "assignedUserPrincipalName", alternate = {"AssignedUserPrincipalName"})
    @Expose
    public String assignedUserPrincipalName;

    /**
     * The Group Tag.
     * Group Tag of the Windows autopilot device.
     */
    @SerializedName(value = "groupTag", alternate = {"GroupTag"})
    @Expose
    public String groupTag;

    /**
     * The Hardware Identifier.
     * Hardware Blob of the Windows autopilot device.
     */
    @SerializedName(value = "hardwareIdentifier", alternate = {"HardwareIdentifier"})
    @Expose
    public byte[] hardwareIdentifier;

    /**
     * The Import Id.
     * The Import Id of the Windows autopilot device.
     */
    @SerializedName(value = "importId", alternate = {"ImportId"})
    @Expose
    public String importId;

    /**
     * The Order Identifier.
     * Order Id of the Windows autopilot device.
     */
    @SerializedName(value = "orderIdentifier", alternate = {"OrderIdentifier"})
    @Expose
    public String orderIdentifier;

    /**
     * The Product Key.
     * Product Key of the Windows autopilot device.
     */
    @SerializedName(value = "productKey", alternate = {"ProductKey"})
    @Expose
    public String productKey;

    /**
     * The Serial Number.
     * Serial number of the Windows autopilot device.
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
    public String serialNumber;

    /**
     * The State.
     * Current state of the imported device.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public ImportedWindowsAutopilotDeviceIdentityState state;


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
