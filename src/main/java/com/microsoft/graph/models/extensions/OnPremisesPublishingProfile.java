// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.HybridAgentUpdaterConfiguration;
import com.microsoft.graph.models.extensions.OnPremisesAgentGroup;
import com.microsoft.graph.models.extensions.OnPremisesAgent;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.models.extensions.Connector;
import com.microsoft.graph.models.extensions.PublishedResource;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.OnPremisesAgentGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.OnPremisesAgentGroupCollectionPage;
import com.microsoft.graph.requests.extensions.OnPremisesAgentCollectionResponse;
import com.microsoft.graph.requests.extensions.OnPremisesAgentCollectionPage;
import com.microsoft.graph.requests.extensions.ConnectorGroupCollectionResponse;
import com.microsoft.graph.requests.extensions.ConnectorGroupCollectionPage;
import com.microsoft.graph.requests.extensions.ConnectorCollectionResponse;
import com.microsoft.graph.requests.extensions.ConnectorCollectionPage;
import com.microsoft.graph.requests.extensions.PublishedResourceCollectionResponse;
import com.microsoft.graph.requests.extensions.PublishedResourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Publishing Profile.
 */
public class OnPremisesPublishingProfile extends Entity implements IJsonBackedObject {


    /**
     * The Hybrid Agent Updater Configuration.
     * 
     */
    @SerializedName("hybridAgentUpdaterConfiguration")
    @Expose
    public HybridAgentUpdaterConfiguration hybridAgentUpdaterConfiguration;

    /**
     * The Is Enabled.
     * 
     */
    @SerializedName("isEnabled")
    @Expose
    public Boolean isEnabled;

    /**
     * The Agent Groups.
     * 
     */
    public OnPremisesAgentGroupCollectionPage agentGroups;

    /**
     * The Agents.
     * 
     */
    public OnPremisesAgentCollectionPage agents;

    /**
     * The Connector Groups.
     * 
     */
    public ConnectorGroupCollectionPage connectorGroups;

    /**
     * The Connectors.
     * 
     */
    public ConnectorCollectionPage connectors;

    /**
     * The Published Resources.
     * 
     */
    public PublishedResourceCollectionPage publishedResources;


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


        if (json.has("agentGroups")) {
            final OnPremisesAgentGroupCollectionResponse response = new OnPremisesAgentGroupCollectionResponse();
            if (json.has("agentGroups@odata.nextLink")) {
                response.nextLink = json.get("agentGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("agentGroups").toString(), JsonObject[].class);
            final OnPremisesAgentGroup[] array = new OnPremisesAgentGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnPremisesAgentGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            agentGroups = new OnPremisesAgentGroupCollectionPage(response, null);
        }

        if (json.has("agents")) {
            final OnPremisesAgentCollectionResponse response = new OnPremisesAgentCollectionResponse();
            if (json.has("agents@odata.nextLink")) {
                response.nextLink = json.get("agents@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("agents").toString(), JsonObject[].class);
            final OnPremisesAgent[] array = new OnPremisesAgent[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), OnPremisesAgent.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            agents = new OnPremisesAgentCollectionPage(response, null);
        }

        if (json.has("connectorGroups")) {
            final ConnectorGroupCollectionResponse response = new ConnectorGroupCollectionResponse();
            if (json.has("connectorGroups@odata.nextLink")) {
                response.nextLink = json.get("connectorGroups@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("connectorGroups").toString(), JsonObject[].class);
            final ConnectorGroup[] array = new ConnectorGroup[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConnectorGroup.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            connectorGroups = new ConnectorGroupCollectionPage(response, null);
        }

        if (json.has("connectors")) {
            final ConnectorCollectionResponse response = new ConnectorCollectionResponse();
            if (json.has("connectors@odata.nextLink")) {
                response.nextLink = json.get("connectors@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("connectors").toString(), JsonObject[].class);
            final Connector[] array = new Connector[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Connector.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            connectors = new ConnectorCollectionPage(response, null);
        }

        if (json.has("publishedResources")) {
            final PublishedResourceCollectionResponse response = new PublishedResourceCollectionResponse();
            if (json.has("publishedResources@odata.nextLink")) {
                response.nextLink = json.get("publishedResources@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("publishedResources").toString(), JsonObject[].class);
            final PublishedResource[] array = new PublishedResource[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), PublishedResource.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            publishedResources = new PublishedResourceCollectionPage(response, null);
        }
    }
}
