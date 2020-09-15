// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ErrorCode;
import com.microsoft.graph.models.generated.PolicySetStatus;
import com.microsoft.graph.models.extensions.PolicySetAssignment;
import com.microsoft.graph.models.extensions.PolicySetItem;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.PolicySetAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.PolicySetAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.PolicySetItemCollectionResponse;
import com.microsoft.graph.requests.extensions.PolicySetItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set.
 */
public class PolicySet extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * Creation time of the PolicySet.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Description of the PolicySet.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * DisplayName of the PolicySet.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Error Code.
     * Error code if any occured.
     */
    @SerializedName("errorCode")
    @Expose
    public ErrorCode errorCode;

    /**
     * The Guided Deployment Tags.
     * Tags of the guided deployment
     */
    @SerializedName("guidedDeploymentTags")
    @Expose
    public java.util.List<String> guidedDeploymentTags;

    /**
     * The Last Modified Date Time.
     * Last modified time of the PolicySet.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Role Scope Tags.
     * RoleScopeTags of the PolicySet
     */
    @SerializedName("roleScopeTags")
    @Expose
    public java.util.List<String> roleScopeTags;

    /**
     * The Status.
     * Validation/assignment status of the PolicySet.
     */
    @SerializedName("status")
    @Expose
    public PolicySetStatus status;

    /**
     * The Assignments.
     * Assignments of the PolicySet.
     */
    @SerializedName("assignments")
    @Expose
    public PolicySetAssignmentCollectionPage assignments;

    /**
     * The Items.
     * Items of the PolicySet with maximum count 100.
     */
    @SerializedName("items")
    @Expose
    public PolicySetItemCollectionPage items;


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
            final PolicySetAssignmentCollectionResponse response = new PolicySetAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final PolicySetAssignment[] array = new PolicySetAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PolicySetAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new PolicySetAssignmentCollectionPage(response, null);
        }

        if (json.has("items")) {
            final PolicySetItemCollectionResponse response = new PolicySetItemCollectionResponse();
            if (json.has("items@odata.nextLink")) {
                response.nextLink = json.get("items@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("items").toString(), JsonObject[].class);
            final PolicySetItem[] array = new PolicySetItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PolicySetItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            items = new PolicySetItemCollectionPage(response, null);
        }
    }
}
