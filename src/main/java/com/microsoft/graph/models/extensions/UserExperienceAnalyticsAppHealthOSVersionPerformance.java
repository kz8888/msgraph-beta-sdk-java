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
 * The class for the User Experience Analytics App Health OSVersion Performance.
 */
public class UserExperienceAnalyticsAppHealthOSVersionPerformance extends Entity implements IJsonBackedObject {


    /**
     * The Active Device Count.
     * The number of active devices for the OS version. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "activeDeviceCount", alternate = {"ActiveDeviceCount"})
    @Expose
    public Integer activeDeviceCount;

    /**
     * The Mean Time To Failure In Minutes.
     * The mean time to failure for the OS version in minutes. Valid values -2147483648 to 2147483647
     */
    @SerializedName(value = "meanTimeToFailureInMinutes", alternate = {"MeanTimeToFailureInMinutes"})
    @Expose
    public Integer meanTimeToFailureInMinutes;

    /**
     * The Os Build Number.
     * The OS build number installed on the device.
     */
    @SerializedName(value = "osBuildNumber", alternate = {"OsBuildNumber"})
    @Expose
    public String osBuildNumber;

    /**
     * The Os Version.
     * The OS version installed on the device.
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
    public String osVersion;

    /**
     * The Os Version App Health Score.
     * The app health score of the OS version. Valid values -1.79769313486232E+308 to 1.79769313486232E+308
     */
    @SerializedName(value = "osVersionAppHealthScore", alternate = {"OsVersionAppHealthScore"})
    @Expose
    public Double osVersionAppHealthScore;

    /**
     * The Os Version App Health Status.
     * The overall app health status of the OS version.
     */
    @SerializedName(value = "osVersionAppHealthStatus", alternate = {"OsVersionAppHealthStatus"})
    @Expose
    public String osVersionAppHealthStatus;


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
