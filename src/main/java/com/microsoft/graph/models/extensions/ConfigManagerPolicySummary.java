// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Config Manager Policy Summary.
 */
public class ConfigManagerPolicySummary implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Compliant Device Count.
     * The number of devices evaluated to be compliant by the policy.
     */
    @SerializedName(value = "compliantDeviceCount", alternate = {"CompliantDeviceCount"})
    @Expose
    public Integer compliantDeviceCount;

    /**
     * The Enforced Device Count.
     * The number of devices that have have been remediated by the policy.
     */
    @SerializedName(value = "enforcedDeviceCount", alternate = {"EnforcedDeviceCount"})
    @Expose
    public Integer enforcedDeviceCount;

    /**
     * The Failed Device Count.
     * The number of devices that failed to be evaluated by the policy.
     */
    @SerializedName(value = "failedDeviceCount", alternate = {"FailedDeviceCount"})
    @Expose
    public Integer failedDeviceCount;

    /**
     * The Non Compliant Device Count.
     * The number of devices evaluated to be noncompliant by the policy.
     */
    @SerializedName(value = "nonCompliantDeviceCount", alternate = {"NonCompliantDeviceCount"})
    @Expose
    public Integer nonCompliantDeviceCount;

    /**
     * The Pending Device Count.
     * The number of devices that have acknowledged the policy but are pending evaluation.
     */
    @SerializedName(value = "pendingDeviceCount", alternate = {"PendingDeviceCount"})
    @Expose
    public Integer pendingDeviceCount;

    /**
     * The Targeted Device Count.
     * The number of devices targeted by the policy.
     */
    @SerializedName(value = "targetedDeviceCount", alternate = {"TargetedDeviceCount"})
    @Expose
    public Integer targetedDeviceCount;


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
