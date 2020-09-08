// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.GovernancePolicy;
import com.microsoft.graph.models.extensions.BusinessFlowSettings;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Business Flow.
 */
public class BusinessFlow extends Entity implements IJsonBackedObject {


    /**
     * The Custom Data.
     * 
     */
    @SerializedName("customData")
    @Expose
    public String customData;

    /**
     * The De Duplication Id.
     * 
     */
    @SerializedName("deDuplicationId")
    @Expose
    public String deDuplicationId;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Policy.
     * 
     */
    @SerializedName("policy")
    @Expose
    public GovernancePolicy policy;

    /**
     * The Policy Template Id.
     * 
     */
    @SerializedName("policyTemplateId")
    @Expose
    public String policyTemplateId;

    /**
     * The Record Version.
     * 
     */
    @SerializedName("recordVersion")
    @Expose
    public String recordVersion;

    /**
     * The Schema Id.
     * 
     */
    @SerializedName("schemaId")
    @Expose
    public String schemaId;

    /**
     * The Settings.
     * 
     */
    @SerializedName("settings")
    @Expose
    public BusinessFlowSettings settings;


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
