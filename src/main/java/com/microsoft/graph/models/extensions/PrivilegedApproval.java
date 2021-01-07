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
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

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
	@Nullable
    public javax.xml.datatype.Duration approvalDuration;

    /**
     * The Approval State.
     * 
     */
    @SerializedName(value = "approvalState", alternate = {"ApprovalState"})
    @Expose
	@Nullable
    public ApprovalState approvalState;

    /**
     * The Approval Type.
     * 
     */
    @SerializedName(value = "approvalType", alternate = {"ApprovalType"})
    @Expose
	@Nullable
    public String approvalType;

    /**
     * The Approver Reason.
     * 
     */
    @SerializedName(value = "approverReason", alternate = {"ApproverReason"})
    @Expose
	@Nullable
    public String approverReason;

    /**
     * The End Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar endDateTime;

    /**
     * The Requestor Reason.
     * 
     */
    @SerializedName(value = "requestorReason", alternate = {"RequestorReason"})
    @Expose
	@Nullable
    public String requestorReason;

    /**
     * The Role Id.
     * 
     */
    @SerializedName(value = "roleId", alternate = {"RoleId"})
    @Expose
	@Nullable
    public String roleId;

    /**
     * The Start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar startDateTime;

    /**
     * The User Id.
     * 
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The Request.
     * 
     */
    @SerializedName(value = "request", alternate = {"Request"})
    @Expose
	@Nullable
    public PrivilegedRoleAssignmentRequest request;

    /**
     * The Role Info.
     * 
     */
    @SerializedName(value = "roleInfo", alternate = {"RoleInfo"})
    @Expose
	@Nullable
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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
