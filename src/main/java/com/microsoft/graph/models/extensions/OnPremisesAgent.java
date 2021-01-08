// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.generated.AgentStatus;
import com.microsoft.graph.models.generated.OnPremisesPublishingType;
import com.microsoft.graph.models.extensions.OnPremisesAgentGroup;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.OnPremisesAgentGroupCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Agent.
 */
public class OnPremisesAgent extends Entity implements IJsonBackedObject {


    /**
     * The External Ip.
     * 
     */
    @SerializedName(value = "externalIp", alternate = {"ExternalIp"})
    @Expose
	@Nullable
    public String externalIp;

    /**
     * The Machine Name.
     * 
     */
    @SerializedName(value = "machineName", alternate = {"MachineName"})
    @Expose
	@Nullable
    public String machineName;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public AgentStatus status;

    /**
     * The Supported Publishing Types.
     * 
     */
    @SerializedName(value = "supportedPublishingTypes", alternate = {"SupportedPublishingTypes"})
    @Expose
	@Nullable
    public java.util.List<OnPremisesPublishingType> supportedPublishingTypes;

    /**
     * The Agent Groups.
     * 
     */
    @SerializedName(value = "agentGroups", alternate = {"AgentGroups"})
    @Expose
	@Nullable
    public OnPremisesAgentGroupCollectionPage agentGroups;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("agentGroups")) {
            agentGroups = serializer.deserializeObject(json.get("agentGroups").toString(), OnPremisesAgentGroupCollectionPage.class);
        }
    }
}
