// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Geo Location.
 */
public class DeviceGeoLocation implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Altitude.
     * Altitude, given in meters above sea level
     */
    @SerializedName(value = "altitude", alternate = {"Altitude"})
    @Expose
	@Nullable
    public Double altitude;

    /**
     * The Heading.
     * Heading in degrees from true north
     */
    @SerializedName(value = "heading", alternate = {"Heading"})
    @Expose
	@Nullable
    public Double heading;

    /**
     * The Horizontal Accuracy.
     * Accuracy of longitude and latitude in meters
     */
    @SerializedName(value = "horizontalAccuracy", alternate = {"HorizontalAccuracy"})
    @Expose
	@Nullable
    public Double horizontalAccuracy;

    /**
     * The Last Collected Date Time.
     * Time at which location was recorded, relative to UTC
     */
    @SerializedName(value = "lastCollectedDateTime", alternate = {"LastCollectedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastCollectedDateTime;

    /**
     * The Last Collected Date Time Utc.
     * Time at which location was recorded, relative to UTC
     */
    @SerializedName(value = "lastCollectedDateTimeUtc", alternate = {"LastCollectedDateTimeUtc"})
    @Expose
	@Nullable
    public java.util.Calendar lastCollectedDateTimeUtc;

    /**
     * The Latitude.
     * Latitude coordinate of the device's location
     */
    @SerializedName(value = "latitude", alternate = {"Latitude"})
    @Expose
	@Nullable
    public Double latitude;

    /**
     * The Longitude.
     * Longitude coordinate of the device's location
     */
    @SerializedName(value = "longitude", alternate = {"Longitude"})
    @Expose
	@Nullable
    public Double longitude;

    /**
     * The Speed.
     * Speed the device is traveling in meters per second
     */
    @SerializedName(value = "speed", alternate = {"Speed"})
    @Expose
	@Nullable
    public Double speed;

    /**
     * The Vertical Accuracy.
     * Accuracy of altitude in meters
     */
    @SerializedName(value = "verticalAccuracy", alternate = {"VerticalAccuracy"})
    @Expose
	@Nullable
    public Double verticalAccuracy;


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
