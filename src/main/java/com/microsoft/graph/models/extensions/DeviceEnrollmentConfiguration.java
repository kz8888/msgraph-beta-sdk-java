// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EnrollmentConfigurationAssignment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.EnrollmentConfigurationAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration.
 */
public class DeviceEnrollmentConfiguration extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Not yet documented
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Not yet documented
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * Not yet documented
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Last Modified Date Time.
     * Not yet documented
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Priority.
     * Not yet documented
     */
    @SerializedName("priority")
    @Expose
    public Integer priority;

    /**
     * The Role Scope Tag Ids.
     * Optional role scope tags for the enrollment restrictions.
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Version.
     * Not yet documented
     */
    @SerializedName("version")
    @Expose
    public Integer version;

    /**
     * The Assignments.
     * The list of group assignments for the device configuration profile.
     */
    public EnrollmentConfigurationAssignmentCollectionPage assignments;


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
            final EnrollmentConfigurationAssignmentCollectionResponse response = new EnrollmentConfigurationAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final EnrollmentConfigurationAssignment[] array = new EnrollmentConfigurationAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EnrollmentConfigurationAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new EnrollmentConfigurationAssignmentCollectionPage(response, null);
        }
    }
}
