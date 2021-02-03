// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.generated.DeviceAndAppManagementAssignmentFilterType;
import com.microsoft.graph.models.generated.AssignmentFilterEvaluationResult;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Assignment Filter Evaluation Summary.
 */
public class AssignmentFilterEvaluationSummary implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Assignment Filter Display Name.
     * The admin defined name for assignment filter.
     */
    @SerializedName(value = "assignmentFilterDisplayName", alternate = {"AssignmentFilterDisplayName"})
    @Expose
    public String assignmentFilterDisplayName;

    /**
     * The Assignment Filter Id.
     * Unique identifier for the assignment filter object
     */
    @SerializedName(value = "assignmentFilterId", alternate = {"AssignmentFilterId"})
    @Expose
    public String assignmentFilterId;

    /**
     * The Assignment Filter Last Modified Date Time.
     * The time the assignment filter was last modified.
     */
    @SerializedName(value = "assignmentFilterLastModifiedDateTime", alternate = {"AssignmentFilterLastModifiedDateTime"})
    @Expose
    public java.util.Calendar assignmentFilterLastModifiedDateTime;

    /**
     * The Assignment Filter Platform.
     * The platform for which this assignment filter is created.
     */
    @SerializedName(value = "assignmentFilterPlatform", alternate = {"AssignmentFilterPlatform"})
    @Expose
    public DevicePlatformType assignmentFilterPlatform;

    /**
     * The Assignment Filter Type.
     * Indicate filter type either include or exclude.
     */
    @SerializedName(value = "assignmentFilterType", alternate = {"AssignmentFilterType"})
    @Expose
    public DeviceAndAppManagementAssignmentFilterType assignmentFilterType;

    /**
     * The Evaluation Date Time.
     * The time assignment filter was evaluated.
     */
    @SerializedName(value = "evaluationDateTime", alternate = {"EvaluationDateTime"})
    @Expose
    public java.util.Calendar evaluationDateTime;

    /**
     * The Evaluation Result.
     * Assignment filter evaluation result.
     */
    @SerializedName(value = "evaluationResult", alternate = {"EvaluationResult"})
    @Expose
    public AssignmentFilterEvaluationResult evaluationResult;


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
