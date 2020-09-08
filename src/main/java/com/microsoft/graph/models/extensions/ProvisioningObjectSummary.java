// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Initiator;
import com.microsoft.graph.models.extensions.ModifiedProperty;
import com.microsoft.graph.models.extensions.ProvisioningStep;
import com.microsoft.graph.models.extensions.ProvisioningServicePrincipal;
import com.microsoft.graph.models.extensions.ProvisionedIdentity;
import com.microsoft.graph.models.extensions.ProvisioningSystemDetails;
import com.microsoft.graph.models.extensions.StatusBase;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Provisioning Object Summary.
 */
public class ProvisioningObjectSummary extends Entity implements IJsonBackedObject {


    /**
     * The Action.
     * 
     */
    @SerializedName("action")
    @Expose
    public String action;

    /**
     * The Activity Date Time.
     * 
     */
    @SerializedName("activityDateTime")
    @Expose
    public java.util.Calendar activityDateTime;

    /**
     * The Change Id.
     * 
     */
    @SerializedName("changeId")
    @Expose
    public String changeId;

    /**
     * The Cycle Id.
     * 
     */
    @SerializedName("cycleId")
    @Expose
    public String cycleId;

    /**
     * The Duration In Milliseconds.
     * 
     */
    @SerializedName("durationInMilliseconds")
    @Expose
    public Integer durationInMilliseconds;

    /**
     * The Initiated By.
     * 
     */
    @SerializedName("initiatedBy")
    @Expose
    public Initiator initiatedBy;

    /**
     * The Job Id.
     * 
     */
    @SerializedName("jobId")
    @Expose
    public String jobId;

    /**
     * The Modified Properties.
     * 
     */
    @SerializedName("modifiedProperties")
    @Expose
    public java.util.List<ModifiedProperty> modifiedProperties;

    /**
     * The Provisioning Steps.
     * 
     */
    @SerializedName("provisioningSteps")
    @Expose
    public java.util.List<ProvisioningStep> provisioningSteps;

    /**
     * The Service Principal.
     * 
     */
    @SerializedName("servicePrincipal")
    @Expose
    public ProvisioningServicePrincipal servicePrincipal;

    /**
     * The Source Identity.
     * 
     */
    @SerializedName("sourceIdentity")
    @Expose
    public ProvisionedIdentity sourceIdentity;

    /**
     * The Source System.
     * 
     */
    @SerializedName("sourceSystem")
    @Expose
    public ProvisioningSystemDetails sourceSystem;

    /**
     * The Status Info.
     * 
     */
    @SerializedName("statusInfo")
    @Expose
    public StatusBase statusInfo;

    /**
     * The Target Identity.
     * 
     */
    @SerializedName("targetIdentity")
    @Expose
    public ProvisionedIdentity targetIdentity;

    /**
     * The Target System.
     * 
     */
    @SerializedName("targetSystem")
    @Expose
    public ProvisioningSystemDetails targetSystem;

    /**
     * The Tenant Id.
     * 
     */
    @SerializedName("tenantId")
    @Expose
    public String tenantId;


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
