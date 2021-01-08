// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EmbeddedSIMDeviceStateValue;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMDevice State.
 */
public class EmbeddedSIMDeviceState extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The time the embedded SIM device status was created. Generated service side.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar createdDateTime;

    /**
     * The Device Name.
     * Device name to which the subscription was provisioned e.g. DESKTOP-JOE
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Last Sync Date Time.
     * The time the embedded SIM device last checked in. Updated service side.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Modified Date Time.
     * The time the embedded SIM device status was last modified. Updated service side.
     */
    @SerializedName(value = "modifiedDateTime", alternate = {"ModifiedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar modifiedDateTime;

    /**
     * The State.
     * The state of the profile operation applied to the device.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public EmbeddedSIMDeviceStateValue state;

    /**
     * The State Details.
     * String description of the provisioning state.
     */
    @SerializedName(value = "stateDetails", alternate = {"StateDetails"})
    @Expose
	@Nullable
    public String stateDetails;

    /**
     * The Universal Integrated Circuit Card Identifier.
     * The Universal Integrated Circuit Card Identifier (UICCID) identifying the hardware onto which a profile is to be deployed.
     */
    @SerializedName(value = "universalIntegratedCircuitCardIdentifier", alternate = {"UniversalIntegratedCircuitCardIdentifier"})
    @Expose
	@Nullable
    public String universalIntegratedCircuitCardIdentifier;

    /**
     * The User Name.
     * Username which the subscription was provisioned to e.g. joe@contoso.com
     */
    @SerializedName(value = "userName", alternate = {"UserName"})
    @Expose
	@Nullable
    public String userName;


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
