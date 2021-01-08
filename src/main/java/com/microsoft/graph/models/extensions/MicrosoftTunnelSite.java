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
import com.microsoft.graph.models.extensions.MicrosoftTunnelConfiguration;
import com.microsoft.graph.models.extensions.MicrosoftTunnelServer;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelServerCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Site.
 */
public class MicrosoftTunnelSite extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * The MicrosoftTunnelSite's description
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The MicrosoftTunnelSite's display name
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Public Address.
     * The MicrosoftTunnelSite's public domain name or IP address
     */
    @SerializedName(value = "publicAddress", alternate = {"PublicAddress"})
    @Expose
	@Nullable
    public String publicAddress;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Microsoft Tunnel Configuration.
     * The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite
     */
    @SerializedName(value = "microsoftTunnelConfiguration", alternate = {"MicrosoftTunnelConfiguration"})
    @Expose
	@Nullable
    public MicrosoftTunnelConfiguration microsoftTunnelConfiguration;

    /**
     * The Microsoft Tunnel Servers.
     * A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite
     */
    @SerializedName(value = "microsoftTunnelServers", alternate = {"MicrosoftTunnelServers"})
    @Expose
	@Nullable
    public MicrosoftTunnelServerCollectionPage microsoftTunnelServers;


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


        if (json.has("microsoftTunnelServers")) {
            microsoftTunnelServers = serializer.deserializeObject(json.get("microsoftTunnelServers").toString(), MicrosoftTunnelServerCollectionPage.class);
        }
    }
}
