// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MobileAppAssignmentSettings;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp App Assignment Settings.
 */
public class IosVppAppAssignmentSettings extends MobileAppAssignmentSettings implements IJsonBackedObject {


    /**
     * The Uninstall On Device Removal.
     * Whether or not to uninstall the app when device is removed from Intune.
     */
    @SerializedName(value = "uninstallOnDeviceRemoval", alternate = {"UninstallOnDeviceRemoval"})
    @Expose
    public Boolean uninstallOnDeviceRemoval;

    /**
     * The Use Device Licensing.
     * Whether or not to use device licensing.
     */
    @SerializedName(value = "useDeviceLicensing", alternate = {"UseDeviceLicensing"})
    @Expose
    public Boolean useDeviceLicensing;

    /**
     * The Vpn Configuration Id.
     * The VPN Configuration Id to apply for this app.
     */
    @SerializedName(value = "vpnConfigurationId", alternate = {"VpnConfigurationId"})
    @Expose
    public String vpnConfigurationId;


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
