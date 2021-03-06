// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WiFiAuthenticationMethod;
import com.microsoft.graph.models.generated.EapFastConfiguration;
import com.microsoft.graph.models.generated.EapType;
import com.microsoft.graph.models.generated.WiredNetworkInterface;
import com.microsoft.graph.models.generated.NonEapAuthenticationMethodForEapTtlsType;
import com.microsoft.graph.models.extensions.MacOSCertificateProfileBase;
import com.microsoft.graph.models.extensions.MacOSTrustedRootCertificate;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSWired Network Configuration.
 */
public class MacOSWiredNetworkConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: certificate, usernameAndPassword, derivedCredential.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
    public WiFiAuthenticationMethod authenticationMethod;

    /**
     * The Eap Fast Configuration.
     * EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: noProtectedAccessCredential, useProtectedAccessCredential, useProtectedAccessCredentialAndProvision, useProtectedAccessCredentialAndProvisionAnonymously.
     */
    @SerializedName(value = "eapFastConfiguration", alternate = {"EapFastConfiguration"})
    @Expose
    public EapFastConfiguration eapFastConfiguration;

    /**
     * The Eap Type.
     * Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the wired network. Possible values are: eapTls, leap, eapSim, eapTtls, peap, eapFast.
     */
    @SerializedName(value = "eapType", alternate = {"EapType"})
    @Expose
    public EapType eapType;

    /**
     * The Enable Outer Identity Privacy.
     * Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this wired network using their real username is displayed as 'anonymous'.
     */
    @SerializedName(value = "enableOuterIdentityPrivacy", alternate = {"EnableOuterIdentityPrivacy"})
    @Expose
    public String enableOuterIdentityPrivacy;

    /**
     * The Network Interface.
     * Network interface. Possible values are: anyEthernet, firstActiveEthernet, secondActiveEthernet, thirdActiveEthernet, firstEthernet, secondEthernet, thirdEthernet.
     */
    @SerializedName(value = "networkInterface", alternate = {"NetworkInterface"})
    @Expose
    public WiredNetworkInterface networkInterface;

    /**
     * The Network Name.
     * Network Name
     */
    @SerializedName(value = "networkName", alternate = {"NetworkName"})
    @Expose
    public String networkName;

    /**
     * The Non Eap Authentication Method For Eap Ttls.
     * Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     */
    @SerializedName(value = "nonEapAuthenticationMethodForEapTtls", alternate = {"NonEapAuthenticationMethodForEapTtls"})
    @Expose
    public NonEapAuthenticationMethodForEapTtlsType nonEapAuthenticationMethodForEapTtls;

    /**
     * The Trusted Server Certificate Names.
     * Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network.
     */
    @SerializedName(value = "trustedServerCertificateNames", alternate = {"TrustedServerCertificateNames"})
    @Expose
    public java.util.List<String> trustedServerCertificateNames;

    /**
     * The Identity Certificate For Client Authentication.
     * Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).
     */
    @SerializedName(value = "identityCertificateForClientAuthentication", alternate = {"IdentityCertificateForClientAuthentication"})
    @Expose
    public MacOSCertificateProfileBase identityCertificateForClientAuthentication;

    /**
     * The Root Certificate For Server Validation.
     * Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP.
     */
    @SerializedName(value = "rootCertificateForServerValidation", alternate = {"RootCertificateForServerValidation"})
    @Expose
    public MacOSTrustedRootCertificate rootCertificateForServerValidation;


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
