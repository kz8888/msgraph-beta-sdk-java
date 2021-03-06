// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WindowsAutopilotProfileAssignmentDetailedStatus;
import com.microsoft.graph.models.generated.WindowsAutopilotProfileAssignmentStatus;
import com.microsoft.graph.models.generated.EnrollmentState;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfile;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity.
 */
public class WindowsAutopilotDeviceIdentity extends Entity implements IJsonBackedObject {


    /**
     * The Addressable User Name.
     * Addressable user name.
     */
    @SerializedName(value = "addressableUserName", alternate = {"AddressableUserName"})
    @Expose
    public String addressableUserName;

    /**
     * The Azure Active Directory Device Id.
     * AAD Device ID
     */
    @SerializedName(value = "azureActiveDirectoryDeviceId", alternate = {"AzureActiveDirectoryDeviceId"})
    @Expose
    public String azureActiveDirectoryDeviceId;

    /**
     * The Deployment Profile Assigned Date Time.
     * Profile set time of the Windows autopilot device.
     */
    @SerializedName(value = "deploymentProfileAssignedDateTime", alternate = {"DeploymentProfileAssignedDateTime"})
    @Expose
    public java.util.Calendar deploymentProfileAssignedDateTime;

    /**
     * The Deployment Profile Assignment Detailed Status.
     * Profile assignment detailed status of the Windows autopilot device. Possible values are: none, hardwareRequirementsNotMet, surfaceHubProfileNotSupported, holoLensProfileNotSupported, windowsPcProfileNotSupported.
     */
    @SerializedName(value = "deploymentProfileAssignmentDetailedStatus", alternate = {"DeploymentProfileAssignmentDetailedStatus"})
    @Expose
    public WindowsAutopilotProfileAssignmentDetailedStatus deploymentProfileAssignmentDetailedStatus;

    /**
     * The Deployment Profile Assignment Status.
     * Profile assignment status of the Windows autopilot device. Possible values are: unknown, assignedInSync, assignedOutOfSync, assignedUnkownSyncState, notAssigned, pending, failed.
     */
    @SerializedName(value = "deploymentProfileAssignmentStatus", alternate = {"DeploymentProfileAssignmentStatus"})
    @Expose
    public WindowsAutopilotProfileAssignmentStatus deploymentProfileAssignmentStatus;

    /**
     * The Display Name.
     * Display Name
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Enrollment State.
     * Intune enrollment state of the Windows autopilot device. Possible values are: unknown, enrolled, pendingReset, failed, notContacted, blocked.
     */
    @SerializedName(value = "enrollmentState", alternate = {"EnrollmentState"})
    @Expose
    public EnrollmentState enrollmentState;

    /**
     * The Group Tag.
     * Group Tag of the Windows autopilot device.
     */
    @SerializedName(value = "groupTag", alternate = {"GroupTag"})
    @Expose
    public String groupTag;

    /**
     * The Last Contacted Date Time.
     * Intune Last Contacted Date Time of the Windows autopilot device.
     */
    @SerializedName(value = "lastContactedDateTime", alternate = {"LastContactedDateTime"})
    @Expose
    public java.util.Calendar lastContactedDateTime;

    /**
     * The Managed Device Id.
     * Managed Device ID
     */
    @SerializedName(value = "managedDeviceId", alternate = {"ManagedDeviceId"})
    @Expose
    public String managedDeviceId;

    /**
     * The Manufacturer.
     * Oem manufacturer of the Windows autopilot device.
     */
    @SerializedName(value = "manufacturer", alternate = {"Manufacturer"})
    @Expose
    public String manufacturer;

    /**
     * The Model.
     * Model name of the Windows autopilot device.
     */
    @SerializedName(value = "model", alternate = {"Model"})
    @Expose
    public String model;

    /**
     * The Order Identifier.
     * Order Identifier of the Windows autopilot device - Deprecated
     */
    @SerializedName(value = "orderIdentifier", alternate = {"OrderIdentifier"})
    @Expose
    public String orderIdentifier;

    /**
     * The Product Key.
     * Product Key of the Windows autopilot device.
     */
    @SerializedName(value = "productKey", alternate = {"ProductKey"})
    @Expose
    public String productKey;

    /**
     * The Purchase Order Identifier.
     * Purchase Order Identifier of the Windows autopilot device.
     */
    @SerializedName(value = "purchaseOrderIdentifier", alternate = {"PurchaseOrderIdentifier"})
    @Expose
    public String purchaseOrderIdentifier;

    /**
     * The Resource Name.
     * Resource Name.
     */
    @SerializedName(value = "resourceName", alternate = {"ResourceName"})
    @Expose
    public String resourceName;

    /**
     * The Serial Number.
     * Serial number of the Windows autopilot device.
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
    public String serialNumber;

    /**
     * The Sku Number.
     * SKU Number
     */
    @SerializedName(value = "skuNumber", alternate = {"SkuNumber"})
    @Expose
    public String skuNumber;

    /**
     * The System Family.
     * System Family
     */
    @SerializedName(value = "systemFamily", alternate = {"SystemFamily"})
    @Expose
    public String systemFamily;

    /**
     * The User Principal Name.
     * User Principal Name.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;

    /**
     * The Deployment Profile.
     * Deployment profile currently assigned to the Windows autopilot device.
     */
    @SerializedName(value = "deploymentProfile", alternate = {"DeploymentProfile"})
    @Expose
    public WindowsAutopilotDeploymentProfile deploymentProfile;

    /**
     * The Intended Deployment Profile.
     * Deployment profile intended to be assigned to the Windows autopilot device.
     */
    @SerializedName(value = "intendedDeploymentProfile", alternate = {"IntendedDeploymentProfile"})
    @Expose
    public WindowsAutopilotDeploymentProfile intendedDeploymentProfile;


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
