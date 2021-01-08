// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidWiFiSecurityType;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Wi Fi Configuration.
 */
public class AndroidWiFiConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Connect Automatically.
     * Connect automatically when this network is in range. Setting this to true will skip the user prompt and automatically connect the device to Wi-Fi network.
     */
    @SerializedName(value = "connectAutomatically", alternate = {"ConnectAutomatically"})
    @Expose
	@Nullable
    public Boolean connectAutomatically;

    /**
     * The Connect When Network Name Is Hidden.
     * When set to true, this profile forces the device to connect to a network that doesn't broadcast its SSID to all devices.
     */
    @SerializedName(value = "connectWhenNetworkNameIsHidden", alternate = {"ConnectWhenNetworkNameIsHidden"})
    @Expose
	@Nullable
    public Boolean connectWhenNetworkNameIsHidden;

    /**
     * The Network Name.
     * Network Name
     */
    @SerializedName(value = "networkName", alternate = {"NetworkName"})
    @Expose
	@Nullable
    public String networkName;

    /**
     * The Ssid.
     * This is the name of the Wi-Fi network that is broadcast to all devices.
     */
    @SerializedName(value = "ssid", alternate = {"Ssid"})
    @Expose
	@Nullable
    public String ssid;

    /**
     * The Wi Fi Security Type.
     * Indicates whether Wi-Fi endpoint uses an EAP based security type.
     */
    @SerializedName(value = "wiFiSecurityType", alternate = {"WiFiSecurityType"})
    @Expose
	@Nullable
    public AndroidWiFiSecurityType wiFiSecurityType;


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
