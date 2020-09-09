// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import com.microsoft.graph.models.extensions.GovernanceResource;
import com.microsoft.graph.models.extensions.GovernanceRoleDefinition;
import com.microsoft.graph.models.extensions.GovernanceSubject;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment.
 */
public class GovernanceRoleAssignment extends Entity implements IJsonBackedObject {


    /**
     * The Assignment State.
     * 
     */
    @SerializedName("assignmentState")
    @Expose
    public String assignmentState;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The External Id.
     * 
     */
    @SerializedName("externalId")
    @Expose
    public String externalId;

    /**
     * The Linked Eligible Role Assignment Id.
     * 
     */
    @SerializedName("linkedEligibleRoleAssignmentId")
    @Expose
    public String linkedEligibleRoleAssignmentId;

    /**
     * The Member Type.
     * 
     */
    @SerializedName("memberType")
    @Expose
    public String memberType;

    /**
     * The Resource Id.
     * 
     */
    @SerializedName("resourceId")
    @Expose
    public String resourceId;

    /**
     * The Role Definition Id.
     * 
     */
    @SerializedName("roleDefinitionId")
    @Expose
    public String roleDefinitionId;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public String status;

    /**
     * The Subject Id.
     * 
     */
    @SerializedName("subjectId")
    @Expose
    public String subjectId;

    /**
     * The Linked Eligible Role Assignment.
     * 
     */
    @SerializedName("linkedEligibleRoleAssignment")
    @Expose
    public GovernanceRoleAssignment linkedEligibleRoleAssignment;

    /**
     * The Resource.
     * 
     */
    @SerializedName("resource")
    @Expose
    public GovernanceResource resource;

    /**
     * The Role Definition.
     * 
     */
    @SerializedName("roleDefinition")
    @Expose
    public GovernanceRoleDefinition roleDefinition;

    /**
     * The Subject.
     * 
     */
    @SerializedName("subject")
    @Expose
    public GovernanceSubject subject;


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
