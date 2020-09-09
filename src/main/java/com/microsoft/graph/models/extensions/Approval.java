// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ApprovalStep;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ApprovalStepCollectionResponse;
import com.microsoft.graph.requests.extensions.ApprovalStepCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval.
 */
public class Approval extends Entity implements IJsonBackedObject {


    /**
     * The Completed Steps.
     * 
     */
    public ApprovalStepCollectionPage completedSteps;

    /**
     * The Pending Steps.
     * 
     */
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
            final ApprovalStepCollectionResponse response = new ApprovalStepCollectionResponse();
            if (json.has("completedSteps@odata.nextLink")) {
                response.nextLink = json.get("completedSteps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("completedSteps").toString(), JsonObject[].class);
            final ApprovalStep[] array = new ApprovalStep[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ApprovalStep.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            completedSteps = new ApprovalStepCollectionPage(response, null);
        }

        if (json.has("pendingSteps")) {
            final ApprovalStepCollectionResponse response = new ApprovalStepCollectionResponse();
            if (json.has("pendingSteps@odata.nextLink")) {
                response.nextLink = json.get("pendingSteps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("pendingSteps").toString(), JsonObject[].class);
            final ApprovalStep[] array = new ApprovalStep[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ApprovalStep.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            pendingSteps = new ApprovalStepCollectionPage(response, null);
        }
    }
}
