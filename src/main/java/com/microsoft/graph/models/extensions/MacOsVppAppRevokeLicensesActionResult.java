// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.VppTokenActionFailureReason;
import com.microsoft.graph.models.generated.ActionState;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac Os Vpp App Revoke Licenses Action Result.
 */
public class MacOsVppAppRevokeLicensesActionResult implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Action Failure Reason.
     * The reason for the revoke licenses action failure.
     */
    @SerializedName(value = "actionFailureReason", alternate = {"ActionFailureReason"})
    @Expose
	@Nullable
    public VppTokenActionFailureReason actionFailureReason;

    /**
     * The Action Name.
     * Action name
     */
    @SerializedName(value = "actionName", alternate = {"ActionName"})
    @Expose
	@Nullable
    public String actionName;

    /**
     * The Action State.
     * State of the action
     */
    @SerializedName(value = "actionState", alternate = {"ActionState"})
    @Expose
	@Nullable
    public ActionState actionState;

    /**
     * The Failed Licenses Count.
     * A count of the number of licenses for which revoke failed.
     */
    @SerializedName(value = "failedLicensesCount", alternate = {"FailedLicensesCount"})
    @Expose
	@Nullable
    public Integer failedLicensesCount;

    /**
     * The Last Updated Date Time.
     * Time the action state was last updated
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastUpdatedDateTime;

    /**
     * The Managed Device Id.
     * DeviceId associated with the action.
     */
    @SerializedName(value = "managedDeviceId", alternate = {"ManagedDeviceId"})
    @Expose
	@Nullable
    public String managedDeviceId;

    /**
     * The Start Date Time.
     * Time the action was initiated
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar startDateTime;

    /**
     * The Total Licenses Count.
     * A count of the number of licenses for which revoke was attempted.
     */
    @SerializedName(value = "totalLicensesCount", alternate = {"TotalLicensesCount"})
    @Expose
	@Nullable
    public Integer totalLicensesCount;

    /**
     * The User Id.
     * UserId associated with the action.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;


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
