// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.VpnAuthenticationMethod;
import com.microsoft.graph.models.extensions.WindowsPhone81CertificateProfileBase;
import com.microsoft.graph.models.extensions.Windows81VpnConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Vpn Configuration.
 */
public class WindowsPhone81VpnConfiguration extends Windows81VpnConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Authentication method. Possible values are: certificate, usernameAndPassword, sharedSecret, derivedCredential, azureAD.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
    public VpnAuthenticationMethod authenticationMethod;

    /**
     * The Bypass Vpn On Company Wifi.
     * Bypass VPN on company Wi-Fi.
     */
    @SerializedName(value = "bypassVpnOnCompanyWifi", alternate = {"BypassVpnOnCompanyWifi"})
    @Expose
    public Boolean bypassVpnOnCompanyWifi;

    /**
     * The Bypass Vpn On Home Wifi.
     * Bypass VPN on home Wi-Fi.
     */
    @SerializedName(value = "bypassVpnOnHomeWifi", alternate = {"BypassVpnOnHomeWifi"})
    @Expose
    public Boolean bypassVpnOnHomeWifi;

    /**
     * The Dns Suffix Search List.
     * DNS suffix search list.
     */
    @SerializedName(value = "dnsSuffixSearchList", alternate = {"DnsSuffixSearchList"})
    @Expose
    public java.util.List<String> dnsSuffixSearchList;

    /**
     * The Remember User Credentials.
     * Remember user credentials.
     */
    @SerializedName(value = "rememberUserCredentials", alternate = {"RememberUserCredentials"})
    @Expose
    public Boolean rememberUserCredentials;

    /**
     * The Identity Certificate.
     * Identity certificate for client authentication when authentication method is certificate.
     */
    @SerializedName(value = "identityCertificate", alternate = {"IdentityCertificate"})
    @Expose
    public WindowsPhone81CertificateProfileBase identityCertificate;


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
