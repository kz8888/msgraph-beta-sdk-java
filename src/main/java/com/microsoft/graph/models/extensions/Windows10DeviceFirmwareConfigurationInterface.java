// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Enablement;
import com.microsoft.graph.models.generated.ChangeUefiSettingsPermission;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Device Firmware Configuration Interface.
 */
public class Windows10DeviceFirmwareConfigurationInterface extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Boot From Built In Network Adapters.
     * Defines whether a user is allowed to boot from built-in network adapters.
     */
    @SerializedName(value = "bootFromBuiltInNetworkAdapters", alternate = {"BootFromBuiltInNetworkAdapters"})
    @Expose
	@Nullable
    public Enablement bootFromBuiltInNetworkAdapters;

    /**
     * The Boot From External Media.
     * Defines whether a user is allowed to boot from external media.
     */
    @SerializedName(value = "bootFromExternalMedia", alternate = {"BootFromExternalMedia"})
    @Expose
	@Nullable
    public Enablement bootFromExternalMedia;

    /**
     * The Cameras.
     * Defines whether built-in cameras are enabled.
     */
    @SerializedName(value = "cameras", alternate = {"Cameras"})
    @Expose
	@Nullable
    public Enablement cameras;

    /**
     * The Change Uefi Settings Permission.
     * Defines the permission level granted to users to change UEFI settings.
     */
    @SerializedName(value = "changeUefiSettingsPermission", alternate = {"ChangeUefiSettingsPermission"})
    @Expose
	@Nullable
    public ChangeUefiSettingsPermission changeUefiSettingsPermission;

    /**
     * The Microphones And Speakers.
     * Defines whether built-in microphones or speakers are enabled.
     */
    @SerializedName(value = "microphonesAndSpeakers", alternate = {"MicrophonesAndSpeakers"})
    @Expose
	@Nullable
    public Enablement microphonesAndSpeakers;

    /**
     * The Radios.
     * Defines whether built-in radios e.g. WIFI, NFC, Bluetooth, are enabled.
     */
    @SerializedName(value = "radios", alternate = {"Radios"})
    @Expose
	@Nullable
    public Enablement radios;

    /**
     * The Virtualization Of Cpu And IO.
     * Defines whether CPU and IO virtualization is enabled.
     */
    @SerializedName(value = "virtualizationOfCpuAndIO", alternate = {"VirtualizationOfCpuAndIO"})
    @Expose
	@Nullable
    public Enablement virtualizationOfCpuAndIO;


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
