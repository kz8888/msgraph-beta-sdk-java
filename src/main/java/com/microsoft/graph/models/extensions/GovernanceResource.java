// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.GovernanceResource;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignmentRequest;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import com.microsoft.graph.models.extensions.GovernanceRoleDefinition;
import com.microsoft.graph.models.extensions.GovernanceRoleSetting;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestCollectionPage;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionCollectionResponse;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingCollectionResponse;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Resource.
 */
public class GovernanceResource extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The External Id.
     * 
     */
    @SerializedName("externalId")
    @Expose
    public String externalId;

    /**
     * The Registered Date Time.
     * 
     */
    @SerializedName("registeredDateTime")
    @Expose
    public java.util.Calendar registeredDateTime;

    /**
     * The Registered Root.
     * 
     */
    @SerializedName("registeredRoot")
    @Expose
    public String registeredRoot;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public String status;

    /**
     * The Type.
     * 
     */
    @SerializedName("type")
    @Expose
    public String type;

    /**
     * The Parent.
     * 
     */
    @SerializedName("parent")
    @Expose
    public GovernanceResource parent;

    /**
     * The Role Assignment Requests.
     * 
     */
    public GovernanceRoleAssignmentRequestCollectionPage roleAssignmentRequests;

    /**
     * The Role Assignments.
     * 
     */
    public GovernanceRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * 
     */
    public GovernanceRoleDefinitionCollectionPage roleDefinitions;

    /**
     * The Role Settings.
     * 
     */
    public GovernanceRoleSettingCollectionPage roleSettings;


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


        if (json.has("roleAssignmentRequests")) {
            final GovernanceRoleAssignmentRequestCollectionResponse response = new GovernanceRoleAssignmentRequestCollectionResponse();
            if (json.has("roleAssignmentRequests@odata.nextLink")) {
                response.nextLink = json.get("roleAssignmentRequests@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleAssignmentRequests").toString(), JsonObject[].class);
            final GovernanceRoleAssignmentRequest[] array = new GovernanceRoleAssignmentRequest[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GovernanceRoleAssignmentRequest.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleAssignmentRequests = new GovernanceRoleAssignmentRequestCollectionPage(response, null);
        }

        if (json.has("roleAssignments")) {
            final GovernanceRoleAssignmentCollectionResponse response = new GovernanceRoleAssignmentCollectionResponse();
            if (json.has("roleAssignments@odata.nextLink")) {
                response.nextLink = json.get("roleAssignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleAssignments").toString(), JsonObject[].class);
            final GovernanceRoleAssignment[] array = new GovernanceRoleAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GovernanceRoleAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleAssignments = new GovernanceRoleAssignmentCollectionPage(response, null);
        }

        if (json.has("roleDefinitions")) {
            final GovernanceRoleDefinitionCollectionResponse response = new GovernanceRoleDefinitionCollectionResponse();
            if (json.has("roleDefinitions@odata.nextLink")) {
                response.nextLink = json.get("roleDefinitions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleDefinitions").toString(), JsonObject[].class);
            final GovernanceRoleDefinition[] array = new GovernanceRoleDefinition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GovernanceRoleDefinition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleDefinitions = new GovernanceRoleDefinitionCollectionPage(response, null);
        }

        if (json.has("roleSettings")) {
            final GovernanceRoleSettingCollectionResponse response = new GovernanceRoleSettingCollectionResponse();
            if (json.has("roleSettings@odata.nextLink")) {
                response.nextLink = json.get("roleSettings@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("roleSettings").toString(), JsonObject[].class);
            final GovernanceRoleSetting[] array = new GovernanceRoleSetting[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GovernanceRoleSetting.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            roleSettings = new GovernanceRoleSettingCollectionPage(response, null);
        }
    }
}
