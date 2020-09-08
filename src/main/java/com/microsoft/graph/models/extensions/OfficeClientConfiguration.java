// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.OfficeClientCheckinStatus;
import com.microsoft.graph.models.extensions.OfficeUserCheckinSummary;
import com.microsoft.graph.models.extensions.OfficeClientConfigurationAssignment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Configuration.
 */
public class OfficeClientConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Checkin Statuses.
     * 
     */
    @SerializedName("checkinStatuses")
    @Expose
    public java.util.List<OfficeClientCheckinStatus> checkinStatuses;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Priority.
     * 
     */
    @SerializedName("priority")
    @Expose
    public Integer priority;

    /**
     * The User Checkin Summary.
     * 
     */
    @SerializedName("userCheckinSummary")
    @Expose
    public OfficeUserCheckinSummary userCheckinSummary;

    /**
     * The Assignments.
     * 
     */
    public OfficeClientConfigurationAssignmentCollectionPage assignments;


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
            final OfficeClientConfigurationAssignmentCollectionResponse response = new OfficeClientConfigurationAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final OfficeClientConfigurationAssignment[] array = new OfficeClientConfigurationAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OfficeClientConfigurationAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new OfficeClientConfigurationAssignmentCollectionPage(response, null);
        }
    }
}
