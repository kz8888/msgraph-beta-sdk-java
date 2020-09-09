// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.WiFiAuthenticationMethod;
import com.microsoft.graph.models.generated.EapType;
import com.microsoft.graph.models.generated.NonEapAuthenticationMethodForEapTtlsType;
import com.microsoft.graph.models.generated.NetworkSingleSignOnType;
import com.microsoft.graph.models.extensions.WindowsCertificateProfileBase;
import com.microsoft.graph.models.extensions.Windows81TrustedRootCertificate;
import com.microsoft.graph.models.extensions.WindowsWifiConfiguration;
import com.microsoft.graph.requests.extensions.Windows81TrustedRootCertificateCollectionResponse;
import com.microsoft.graph.requests.extensions.Windows81TrustedRootCertificateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Wifi Enterprise EAPConfiguration.
 */
public class WindowsWifiEnterpriseEAPConfiguration extends WindowsWifiConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Specify the authentication method.
     */
    @SerializedName("authenticationMethod")
    @Expose
    public WiFiAuthenticationMethod authenticationMethod;

    /**
     * The Disable User Prompt For Server Validation.
     * Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.
     */
    @SerializedName("disableUserPromptForServerValidation")
    @Expose
    public Boolean disableUserPromptForServerValidation;

    /**
     * The Eap Type.
     * Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router).
     */
    @SerializedName("eapType")
    @Expose
    public EapType eapType;

    /**
     * The Enable Pairwise Master Key Caching.
     * Specify whether the wifi connection should enable pairwise master key caching.
     */
    @SerializedName("enablePairwiseMasterKeyCaching")
    @Expose
    public Boolean enablePairwiseMasterKeyCaching;

    /**
     * The Enable Pre Authentication.
     * Specify whether pre-authentication should be enabled.
     */
    @SerializedName("enablePreAuthentication")
    @Expose
    public Boolean enablePreAuthentication;

    /**
     * The Inner Authentication Protocol For EAPTTLS.
     * Specify inner authentication protocol for EAP TTLS.
     */
    @SerializedName("innerAuthenticationProtocolForEAPTTLS")
    @Expose
    public NonEapAuthenticationMethodForEapTtlsType innerAuthenticationProtocolForEAPTTLS;

    /**
     * The Maximum Authentication Timeout In Seconds.
     * Specify maximum authentication timeout (in seconds).  Valid range: 1-120
     */
    @SerializedName("maximumAuthenticationTimeoutInSeconds")
    @Expose
    public Integer maximumAuthenticationTimeoutInSeconds;

    /**
     * The Maximum Number Of Pairwise Master Keys In Cache.
     * Specify maximum number of pairwise master keys in cache.  Valid range: 1-255
     */
    @SerializedName("maximumNumberOfPairwiseMasterKeysInCache")
    @Expose
    public Integer maximumNumberOfPairwiseMasterKeysInCache;

    /**
     * The Maximum Pairwise Master Key Cache Time In Minutes.
     * Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440
     */
    @SerializedName("maximumPairwiseMasterKeyCacheTimeInMinutes")
    @Expose
    public Integer maximumPairwiseMasterKeyCacheTimeInMinutes;

    /**
     * The Maximum Pre Authentication Attempts.
     * Specify maximum pre-authentication attempts.  Valid range: 1-16
     */
    @SerializedName("maximumPreAuthenticationAttempts")
    @Expose
    public Integer maximumPreAuthenticationAttempts;

    /**
     * The Network Single Sign On.
     * Specify the network single sign on type.
     */
    @SerializedName("networkSingleSignOn")
    @Expose
    public NetworkSingleSignOnType networkSingleSignOn;

    /**
     * The Outer Identity Privacy Temporary Value.
     * Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     */
    @SerializedName("outerIdentityPrivacyTemporaryValue")
    @Expose
    public String outerIdentityPrivacyTemporaryValue;

    /**
     * The Perform Server Validation.
     * Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.
     */
    @SerializedName("performServerValidation")
    @Expose
    public Boolean performServerValidation;

    /**
     * The Prompt For Additional Authentication Credentials.
     * Specify whether the wifi connection should prompt for additional authentication credentials.
     */
    @SerializedName("promptForAdditionalAuthenticationCredentials")
    @Expose
    public Boolean promptForAdditionalAuthenticationCredentials;

    /**
     * The Require Cryptographic Binding.
     * Specify whether to enable cryptographic binding when EAP type is selected as PEAP.
     */
    @SerializedName("requireCryptographicBinding")
    @Expose
    public Boolean requireCryptographicBinding;

    /**
     * The Trusted Server Certificate Names.
     * Specify trusted server certificate names.
     */
    @SerializedName("trustedServerCertificateNames")
    @Expose
    public java.util.List<String> trustedServerCertificateNames;

    /**
     * The Identity Certificate For Client Authentication.
     * Specify identity certificate for client authentication.
     */
    @SerializedName("identityCertificateForClientAuthentication")
    @Expose
    public WindowsCertificateProfileBase identityCertificateForClientAuthentication;

    /**
     * The Root Certificate For Client Validation.
     * Specify root certificate for client validation.
     */
    @SerializedName("rootCertificateForClientValidation")
    @Expose
    public Windows81TrustedRootCertificate rootCertificateForClientValidation;

    /**
     * The Root Certificates For Server Validation.
     * Specify root certificate for server validation.
     */
    public Windows81TrustedRootCertificateCollectionPage rootCertificatesForServerValidation;


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


        if (json.has("rootCertificatesForServerValidation")) {
            final Windows81TrustedRootCertificateCollectionResponse response = new Windows81TrustedRootCertificateCollectionResponse();
            if (json.has("rootCertificatesForServerValidation@odata.nextLink")) {
                response.nextLink = json.get("rootCertificatesForServerValidation@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("rootCertificatesForServerValidation").toString(), JsonObject[].class);
            final Windows81TrustedRootCertificate[] array = new Windows81TrustedRootCertificate[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Windows81TrustedRootCertificate.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            rootCertificatesForServerValidation = new Windows81TrustedRootCertificateCollectionPage(response, null);
        }
    }
}
