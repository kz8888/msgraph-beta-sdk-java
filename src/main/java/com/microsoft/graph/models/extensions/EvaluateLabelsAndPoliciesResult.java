// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DetectedSensitiveContentWrapper;
import com.microsoft.graph.models.extensions.DlpPoliciesJobResult;
import com.microsoft.graph.models.extensions.EvaluateLabelJobResultGroup;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Evaluate Labels And Policies Result.
 */
public class EvaluateLabelsAndPoliciesResult implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Classification Result.
     * 
     */
    @SerializedName(value = "classificationResult", alternate = {"ClassificationResult"})
    @Expose
    public DetectedSensitiveContentWrapper classificationResult;

    /**
     * The Data Loss Prevention Policies Result.
     * 
     */
    @SerializedName(value = "dataLossPreventionPoliciesResult", alternate = {"DataLossPreventionPoliciesResult"})
    @Expose
    public DlpPoliciesJobResult dataLossPreventionPoliciesResult;

    /**
     * The Sensitivity Labels Result.
     * 
     */
    @SerializedName(value = "sensitivityLabelsResult", alternate = {"SensitivityLabelsResult"})
    @Expose
    public EvaluateLabelJobResultGroup sensitivityLabelsResult;


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
