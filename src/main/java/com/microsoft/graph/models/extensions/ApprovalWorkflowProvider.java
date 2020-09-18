// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.BusinessFlow;
import com.microsoft.graph.models.extensions.GovernancePolicyTemplate;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.BusinessFlowCollectionResponse;
import com.microsoft.graph.requests.extensions.BusinessFlowCollectionPage;
import com.microsoft.graph.requests.extensions.GovernancePolicyTemplateCollectionResponse;
import com.microsoft.graph.requests.extensions.GovernancePolicyTemplateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Workflow Provider.
 */
public class ApprovalWorkflowProvider extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Business Flows.
     * 
     */
    @SerializedName("businessFlows")
    @Expose
    public BusinessFlowCollectionPage businessFlows;

    /**
     * The Business Flows With Requests Awaiting My Decision.
     * 
     */
    @SerializedName("businessFlowsWithRequestsAwaitingMyDecision")
    @Expose
    public BusinessFlowCollectionPage businessFlowsWithRequestsAwaitingMyDecision;

    /**
     * The Policy Templates.
     * 
     */
    @SerializedName("policyTemplates")
    @Expose
    public GovernancePolicyTemplateCollectionPage policyTemplates;


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


        if (json.has("businessFlows")) {
            final BusinessFlowCollectionResponse response = new BusinessFlowCollectionResponse();
            if (json.has("businessFlows@odata.nextLink")) {
                response.nextLink = json.get("businessFlows@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("businessFlows").toString(), JsonObject[].class);
            final BusinessFlow[] array = new BusinessFlow[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), BusinessFlow.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            businessFlows = new BusinessFlowCollectionPage(response, null);
        }

        if (json.has("businessFlowsWithRequestsAwaitingMyDecision")) {
            final BusinessFlowCollectionResponse response = new BusinessFlowCollectionResponse();
            if (json.has("businessFlowsWithRequestsAwaitingMyDecision@odata.nextLink")) {
                response.nextLink = json.get("businessFlowsWithRequestsAwaitingMyDecision@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("businessFlowsWithRequestsAwaitingMyDecision").toString(), JsonObject[].class);
            final BusinessFlow[] array = new BusinessFlow[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), BusinessFlow.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            businessFlowsWithRequestsAwaitingMyDecision = new BusinessFlowCollectionPage(response, null);
        }

        if (json.has("policyTemplates")) {
            final GovernancePolicyTemplateCollectionResponse response = new GovernancePolicyTemplateCollectionResponse();
            if (json.has("policyTemplates@odata.nextLink")) {
                response.nextLink = json.get("policyTemplates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("policyTemplates").toString(), JsonObject[].class);
            final GovernancePolicyTemplate[] array = new GovernancePolicyTemplate[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), GovernancePolicyTemplate.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            policyTemplates = new GovernancePolicyTemplateCollectionPage(response, null);
        }
    }
}
