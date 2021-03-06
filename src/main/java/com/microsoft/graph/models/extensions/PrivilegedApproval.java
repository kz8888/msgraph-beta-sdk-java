// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ApprovalState;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import com.microsoft.graph.models.extensions.PrivilegedRole;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Approval.
 */
public class PrivilegedApproval extends Entity implements IJsonBackedObject {


    /**
     * The Approval Duration.
     * 
     */
    @SerializedName(value = "approvalDuration", alternate = {"ApprovalDuration"})
    @Expose
    public javax.xml.datatype.Duration approvalDuration;

    /**
     * The Approval State.
     * Possible values are: pending, approved, denied, aborted, canceled.
     */
    @SerializedName(value = "approvalState", alternate = {"ApprovalState"})
    @Expose
    public ApprovalState approvalState;

    /**
     * The Approval Type.
     * 
     */
    @SerializedName(value = "approvalType", alternate = {"ApprovalType"})
    @Expose
    public String approvalType;

    /**
     * The Approver Reason.
     * 
     */
    @SerializedName(value = "approverReason", alternate = {"ApproverReason"})
    @Expose
    public String approverReason;

    /**
     * The End Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Requestor Reason.
     * 
     */
    @SerializedName(value = "requestorReason", alternate = {"RequestorReason"})
    @Expose
    public String requestorReason;

    /**
     * The Role Id.
     * 
     */
    @SerializedName(value = "roleId", alternate = {"RoleId"})
    @Expose
    public String roleId;

    /**
     * The Start Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The User Id.
     * 
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
    public String userId;

    /**
     * The Request.
     * Read-only. The role assignment request for this approval object
     */
    @SerializedName(value = "request", alternate = {"Request"})
    @Expose
    public PrivilegedRoleAssignmentRequest request;

    /**
     * The Role Info.
     * Read-only. Nullable.
     */
    @SerializedName(value = "roleInfo", alternate = {"RoleInfo"})
    @Expose
    public PrivilegedRole roleInfo;


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
