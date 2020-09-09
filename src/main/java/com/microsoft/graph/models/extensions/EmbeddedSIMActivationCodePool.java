// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EmbeddedSIMActivationCode;
import com.microsoft.graph.models.extensions.EmbeddedSIMActivationCodePoolAssignment;
import com.microsoft.graph.models.extensions.EmbeddedSIMDeviceState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.EmbeddedSIMDeviceStateCollectionResponse;
import com.microsoft.graph.requests.extensions.EmbeddedSIMDeviceStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMActivation Code Pool.
 */
public class EmbeddedSIMActivationCodePool extends Entity implements IJsonBackedObject {


    /**
     * The Activation Code Count.
     * The total count of activation codes which belong to this pool.
     */
    @SerializedName("activationCodeCount")
    @Expose
    public Integer activationCodeCount;

    /**
     * The Activation Codes.
     * The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.
     */
    @SerializedName("activationCodes")
    @Expose
    public java.util.List<EmbeddedSIMActivationCode> activationCodes;

    /**
     * The Created Date Time.
     * The time the embedded SIM activation code pool was created. Generated service side.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Display Name.
     * The admin defined name of the embedded SIM activation code pool.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Modified Date Time.
     * The time the embedded SIM activation code pool was last modified. Updated service side.
     */
    @SerializedName("modifiedDateTime")
    @Expose
    public java.util.Calendar modifiedDateTime;

    /**
     * The Assignments.
     * Navigational property to a list of targets to which this pool is assigned.
     */
    public EmbeddedSIMActivationCodePoolAssignmentCollectionPage assignments;

    /**
     * The Device States.
     * Navigational property to a list of device states for this pool.
     */
    public EmbeddedSIMDeviceStateCollectionPage deviceStates;


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


        if (json.has("assignments")) {
            final EmbeddedSIMActivationCodePoolAssignmentCollectionResponse response = new EmbeddedSIMActivationCodePoolAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final EmbeddedSIMActivationCodePoolAssignment[] array = new EmbeddedSIMActivationCodePoolAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EmbeddedSIMActivationCodePoolAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new EmbeddedSIMActivationCodePoolAssignmentCollectionPage(response, null);
        }

        if (json.has("deviceStates")) {
            final EmbeddedSIMDeviceStateCollectionResponse response = new EmbeddedSIMDeviceStateCollectionResponse();
            if (json.has("deviceStates@odata.nextLink")) {
                response.nextLink = json.get("deviceStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceStates").toString(), JsonObject[].class);
            final EmbeddedSIMDeviceState[] array = new EmbeddedSIMDeviceState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EmbeddedSIMDeviceState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceStates = new EmbeddedSIMDeviceStateCollectionPage(response, null);
        }
    }
}
