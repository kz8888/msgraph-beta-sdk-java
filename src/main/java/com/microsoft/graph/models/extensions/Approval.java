// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ApprovalStep;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ApprovalStepCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval.
 */
public class Approval extends Entity implements IJsonBackedObject {


    /**
     * The Completed Steps.
     * 
     */
    @SerializedName(value = "completedSteps", alternate = {"CompletedSteps"})
    @Expose
    public ApprovalStepCollectionPage completedSteps;

    /**
     * The Pending Steps.
     * 
     */
    @SerializedName(value = "pendingSteps", alternate = {"PendingSteps"})
    @Expose
    public ApprovalStepCollectionPage pendingSteps;


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


        if (json.has("completedSteps")) {
            completedSteps = serializer.deserializeObject(json.get("completedSteps").toString(), ApprovalStepCollectionPage.class);
        }

        if (json.has("pendingSteps")) {
            pendingSteps = serializer.deserializeObject(json.get("pendingSteps").toString(), ApprovalStepCollectionPage.class);
        }
    }
}
