// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CloudPcStatus;
import com.microsoft.graph.models.extensions.CloudPcStatusDetails;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud PC.
 */
public class CloudPC extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Image Display Name.
     * 
     */
    @SerializedName(value = "imageDisplayName", alternate = {"ImageDisplayName"})
    @Expose
    public String imageDisplayName;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Managed Device Id.
     * 
     */
    @SerializedName(value = "managedDeviceId", alternate = {"ManagedDeviceId"})
    @Expose
    public String managedDeviceId;

    /**
     * The Managed Device Name.
     * 
     */
    @SerializedName(value = "managedDeviceName", alternate = {"ManagedDeviceName"})
    @Expose
    public String managedDeviceName;

    /**
     * The Provisioning Policy Id.
     * 
     */
    @SerializedName(value = "provisioningPolicyId", alternate = {"ProvisioningPolicyId"})
    @Expose
    public String provisioningPolicyId;

    /**
     * The Service Plan Id.
     * 
     */
    @SerializedName(value = "servicePlanId", alternate = {"ServicePlanId"})
    @Expose
    public String servicePlanId;

    /**
     * The Service Plan Name.
     * 
     */
    @SerializedName(value = "servicePlanName", alternate = {"ServicePlanName"})
    @Expose
    public String servicePlanName;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public CloudPcStatus status;

    /**
     * The Status Details.
     * 
     */
    @SerializedName(value = "statusDetails", alternate = {"StatusDetails"})
    @Expose
    public CloudPcStatusDetails statusDetails;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
    public String userPrincipalName;


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
