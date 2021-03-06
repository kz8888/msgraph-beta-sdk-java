// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DiscoverySource;
import com.microsoft.graph.models.generated.EnrollmentState;
import com.microsoft.graph.models.generated.Platform;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Apple Device Identity.
 */
public class ImportedAppleDeviceIdentity extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Created Date Time of the device
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * The description of the device
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Discovery Source.
     * Apple device discovery source. Possible values are: unknown, adminImport, deviceEnrollmentProgram.
     */
    @SerializedName(value = "discoverySource", alternate = {"DiscoverySource"})
    @Expose
    public DiscoverySource discoverySource;

    /**
     * The Enrollment State.
     * The state of the device in Intune. Possible values are: unknown, enrolled, pendingReset, failed, notContacted, blocked.
     */
    @SerializedName(value = "enrollmentState", alternate = {"EnrollmentState"})
    @Expose
    public EnrollmentState enrollmentState;

    /**
     * The Is Deleted.
     * Indicates if the device is deleted from Apple Business Manager
     */
    @SerializedName(value = "isDeleted", alternate = {"IsDeleted"})
    @Expose
    public Boolean isDeleted;

    /**
     * The Is Supervised.
     * Indicates if the Apple device is supervised. More information is at: https://support.apple.com/HT202837
     */
    @SerializedName(value = "isSupervised", alternate = {"IsSupervised"})
    @Expose
    public Boolean isSupervised;

    /**
     * The Last Contacted Date Time.
     * Last Contacted Date Time of the device
     */
    @SerializedName(value = "lastContactedDateTime", alternate = {"LastContactedDateTime"})
    @Expose
    public java.util.Calendar lastContactedDateTime;

    /**
     * The Platform.
     * The platform of the Device. Possible values are: unknown, ios, android, windows, windowsMobile, macOS.
     */
    @SerializedName(value = "platform", alternate = {"Platform"})
    @Expose
    public Platform platform;

    /**
     * The Requested Enrollment Profile Assignment Date Time.
     * The time enrollment profile was assigned to the device
     */
    @SerializedName(value = "requestedEnrollmentProfileAssignmentDateTime", alternate = {"RequestedEnrollmentProfileAssignmentDateTime"})
    @Expose
    public java.util.Calendar requestedEnrollmentProfileAssignmentDateTime;

    /**
     * The Requested Enrollment Profile Id.
     * Enrollment profile Id admin intends to apply to the device during next enrollment
     */
    @SerializedName(value = "requestedEnrollmentProfileId", alternate = {"RequestedEnrollmentProfileId"})
    @Expose
    public String requestedEnrollmentProfileId;

    /**
     * The Serial Number.
     * Device serial number
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
    public String serialNumber;


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
