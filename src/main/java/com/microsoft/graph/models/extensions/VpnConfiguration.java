// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.VpnAuthenticationMethod;
import com.microsoft.graph.models.extensions.VpnServer;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpn Configuration.
 */
public class VpnConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Authentication method.
     */
    @SerializedName("authenticationMethod")
    @Expose
    public VpnAuthenticationMethod authenticationMethod;

    /**
     * The Connection Name.
     * Connection name displayed to the user.
     */
    @SerializedName("connectionName")
    @Expose
    public String connectionName;

    /**
     * The Realm.
     * Realm when connection type is set to Pulse Secure.
     */
    @SerializedName("realm")
    @Expose
    public String realm;

    /**
     * The Role.
     * Role when connection type is set to Pulse Secure.
     */
    @SerializedName("role")
    @Expose
    public String role;

    /**
     * The Servers.
     * List of VPN Servers on the network. Make sure end users can access these network locations. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("servers")
    @Expose
    public java.util.List<VpnServer> servers;


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
