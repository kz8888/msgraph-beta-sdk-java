// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.DeviceManagementTroubleshootingErrorDetails;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Troubleshooting Event.
 */
public class DeviceManagementTroubleshootingEvent extends Entity implements IJsonBackedObject {


    /**
     * The Additional Information.
     * A set of string key and string value pairs which provides additional information on the Troubleshooting event
     */
    @SerializedName(value = "additionalInformation", alternate = {"AdditionalInformation"})
    @Expose
    public java.util.List<KeyValuePair> additionalInformation;

    /**
     * The Correlation Id.
     * Id used for tracing the failure in the service.
     */
    @SerializedName(value = "correlationId", alternate = {"CorrelationId"})
    @Expose
    public String correlationId;

    /**
     * The Event Date Time.
     * Time when the event occurred .
     */
    @SerializedName(value = "eventDateTime", alternate = {"EventDateTime"})
    @Expose
    public java.util.Calendar eventDateTime;

    /**
     * The Event Name.
     * Event Name corresponding to the Troubleshooting Event. It is an Optional field
     */
    @SerializedName(value = "eventName", alternate = {"EventName"})
    @Expose
    public String eventName;

    /**
     * The Troubleshooting Error Details.
     * Object containing detailed information about the error and its remediation.
     */
    @SerializedName(value = "troubleshootingErrorDetails", alternate = {"TroubleshootingErrorDetails"})
    @Expose
    public DeviceManagementTroubleshootingErrorDetails troubleshootingErrorDetails;


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
