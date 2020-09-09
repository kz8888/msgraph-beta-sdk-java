// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Install Summary.
 */
public class MobileAppInstallSummary extends Entity implements IJsonBackedObject {


    /**
     * The Failed Device Count.
     * Number of Devices that have failed to install this app.
     */
    @SerializedName("failedDeviceCount")
    @Expose
    public Integer failedDeviceCount;

    /**
     * The Failed User Count.
     * Number of Users that have 1 or more device that failed to install this app.
     */
    @SerializedName("failedUserCount")
    @Expose
    public Integer failedUserCount;

    /**
     * The Installed Device Count.
     * Number of Devices that have successfully installed this app.
     */
    @SerializedName("installedDeviceCount")
    @Expose
    public Integer installedDeviceCount;

    /**
     * The Installed User Count.
     * Number of Users whose devices have all succeeded to install this app.
     */
    @SerializedName("installedUserCount")
    @Expose
    public Integer installedUserCount;

    /**
     * The Not Applicable Device Count.
     * Number of Devices that are not applicable for this app.
     */
    @SerializedName("notApplicableDeviceCount")
    @Expose
    public Integer notApplicableDeviceCount;

    /**
     * The Not Applicable User Count.
     * Number of Users whose devices were all not applicable for this app.
     */
    @SerializedName("notApplicableUserCount")
    @Expose
    public Integer notApplicableUserCount;

    /**
     * The Not Installed Device Count.
     * Number of Devices that does not have this app installed.
     */
    @SerializedName("notInstalledDeviceCount")
    @Expose
    public Integer notInstalledDeviceCount;

    /**
     * The Not Installed User Count.
     * Number of Users that have 1 or more devices that did not install this app.
     */
    @SerializedName("notInstalledUserCount")
    @Expose
    public Integer notInstalledUserCount;

    /**
     * The Pending Install Device Count.
     * Number of Devices that have been notified to install this app.
     */
    @SerializedName("pendingInstallDeviceCount")
    @Expose
    public Integer pendingInstallDeviceCount;

    /**
     * The Pending Install User Count.
     * Number of Users that have 1 or more device that have been notified to install this app and have 0 devices with failures.
     */
    @SerializedName("pendingInstallUserCount")
    @Expose
    public Integer pendingInstallUserCount;


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
