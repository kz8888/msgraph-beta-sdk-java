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
import com.microsoft.graph.models.generated.WifiAuthenticationType;
import com.microsoft.graph.models.generated.EapType;
import com.microsoft.graph.models.generated.NonEapAuthenticationMethodForEapTtlsType;
import com.microsoft.graph.models.generated.NetworkSingleSignOnType;
import com.microsoft.graph.models.extensions.WindowsCertificateProfileBase;
import com.microsoft.graph.models.extensions.Windows81TrustedRootCertificate;
import com.microsoft.graph.models.extensions.WindowsWifiConfiguration;
import com.microsoft.graph.requests.extensions.Windows81TrustedRootCertificateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Wifi Enterprise EAPConfiguration.
 */
public class WindowsWifiEnterpriseEAPConfiguration extends WindowsWifiConfiguration implements IJsonBackedObject {


    /**
     * The Authentication Method.
     * Specify the authentication method. Possible values are: certificate, usernameAndPassword, derivedCredential.
     */
    @SerializedName(value = "authenticationMethod", alternate = {"AuthenticationMethod"})
    @Expose
    public WiFiAuthenticationMethod authenticationMethod;

    /**
     * The Authentication Period In Seconds.
     * Specify the number of seconds for the client to wait after an authentication attempt before failing. Valid range 1-3600.
     */
    @SerializedName(value = "authenticationPeriodInSeconds", alternate = {"AuthenticationPeriodInSeconds"})
    @Expose
    public Integer authenticationPeriodInSeconds;

    /**
     * The Authentication Retry Delay Period In Seconds.
     * Specify the number of seconds between a failed authentication and the next authentication attempt. Valid range 1-3600.
     */
    @SerializedName(value = "authenticationRetryDelayPeriodInSeconds", alternate = {"AuthenticationRetryDelayPeriodInSeconds"})
    @Expose
    public Integer authenticationRetryDelayPeriodInSeconds;

    /**
     * The Authentication Type.
     * Specify whether to authenticate the user, the device, either, or to use guest authentication (none). If you’re using certificate authentication, make sure the certificate type matches the authentication type. Possible values are: none, user, machine, machineOrUser, guest.
     */
    @SerializedName(value = "authenticationType", alternate = {"AuthenticationType"})
    @Expose
    public WifiAuthenticationType authenticationType;

    /**
     * The Cache Credentials.
     * Specify whether to cache user credentials on the device so that users don’t need to keep entering them each time they connect.
     */
    @SerializedName(value = "cacheCredentials", alternate = {"CacheCredentials"})
    @Expose
    public Boolean cacheCredentials;

    /**
     * The Disable User Prompt For Server Validation.
     * Specify whether to prevent the user from being prompted to authorize new servers for trusted certification authorities when EAP type is selected as PEAP.
     */
    @SerializedName(value = "disableUserPromptForServerValidation", alternate = {"DisableUserPromptForServerValidation"})
    @Expose
    public Boolean disableUserPromptForServerValidation;

    /**
     * The Eapol Start Period In Seconds.
     * Specify the number of seconds to wait before sending an EAPOL (Extensible Authentication Protocol over LAN) Start message. Valid range 1-3600.
     */
    @SerializedName(value = "eapolStartPeriodInSeconds", alternate = {"EapolStartPeriodInSeconds"})
    @Expose
    public Integer eapolStartPeriodInSeconds;

    /**
     * The Eap Type.
     * Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the Wi-Fi endpoint (router). Possible values are: eapTls, leap, eapSim, eapTtls, peap, eapFast.
     */
    @SerializedName(value = "eapType", alternate = {"EapType"})
    @Expose
    public EapType eapType;

    /**
     * The Enable Pairwise Master Key Caching.
     * Specify whether the wifi connection should enable pairwise master key caching.
     */
    @SerializedName(value = "enablePairwiseMasterKeyCaching", alternate = {"EnablePairwiseMasterKeyCaching"})
    @Expose
    public Boolean enablePairwiseMasterKeyCaching;

    /**
     * The Enable Pre Authentication.
     * Specify whether pre-authentication should be enabled.
     */
    @SerializedName(value = "enablePreAuthentication", alternate = {"EnablePreAuthentication"})
    @Expose
    public Boolean enablePreAuthentication;

    /**
     * The Inner Authentication Protocol For EAPTTLS.
     * Specify inner authentication protocol for EAP TTLS. Possible values are: unencryptedPassword, challengeHandshakeAuthenticationProtocol, microsoftChap, microsoftChapVersionTwo.
     */
    @SerializedName(value = "innerAuthenticationProtocolForEAPTTLS", alternate = {"InnerAuthenticationProtocolForEAPTTLS"})
    @Expose
    public NonEapAuthenticationMethodForEapTtlsType innerAuthenticationProtocolForEAPTTLS;

    /**
     * The Maximum Authentication Failures.
     * Specify the maximum authentication failures allowed for a set of credentials. Valid range 1-100.
     */
    @SerializedName(value = "maximumAuthenticationFailures", alternate = {"MaximumAuthenticationFailures"})
    @Expose
    public Integer maximumAuthenticationFailures;

    /**
     * The Maximum Authentication Timeout In Seconds.
     * Specify maximum authentication timeout (in seconds).  Valid range: 1-120
     */
    @SerializedName(value = "maximumAuthenticationTimeoutInSeconds", alternate = {"MaximumAuthenticationTimeoutInSeconds"})
    @Expose
    public Integer maximumAuthenticationTimeoutInSeconds;

    /**
     * The Maximum EAPOLStart Messages.
     * Specifiy the maximum number of EAPOL (Extensible Authentication Protocol over LAN) Start messages to be sent before returning failure. Valid range 1-100.
     */
    @SerializedName(value = "maximumEAPOLStartMessages", alternate = {"MaximumEAPOLStartMessages"})
    @Expose
    public Integer maximumEAPOLStartMessages;

    /**
     * The Maximum Number Of Pairwise Master Keys In Cache.
     * Specify maximum number of pairwise master keys in cache.  Valid range: 1-255
     */
    @SerializedName(value = "maximumNumberOfPairwiseMasterKeysInCache", alternate = {"MaximumNumberOfPairwiseMasterKeysInCache"})
    @Expose
    public Integer maximumNumberOfPairwiseMasterKeysInCache;

    /**
     * The Maximum Pairwise Master Key Cache Time In Minutes.
     * Specify maximum pairwise master key cache time (in minutes).  Valid range: 5-1440
     */
    @SerializedName(value = "maximumPairwiseMasterKeyCacheTimeInMinutes", alternate = {"MaximumPairwiseMasterKeyCacheTimeInMinutes"})
    @Expose
    public Integer maximumPairwiseMasterKeyCacheTimeInMinutes;

    /**
     * The Maximum Pre Authentication Attempts.
     * Specify maximum pre-authentication attempts.  Valid range: 1-16
     */
    @SerializedName(value = "maximumPreAuthenticationAttempts", alternate = {"MaximumPreAuthenticationAttempts"})
    @Expose
    public Integer maximumPreAuthenticationAttempts;

    /**
     * The Network Single Sign On.
     * Specify the network single sign on type. Possible values are: disabled, prelogon, postlogon.
     */
    @SerializedName(value = "networkSingleSignOn", alternate = {"NetworkSingleSignOn"})
    @Expose
    public NetworkSingleSignOnType networkSingleSignOn;

    /**
     * The Outer Identity Privacy Temporary Value.
     * Specify the string to replace usernames for privacy when using EAP TTLS or PEAP.
     */
    @SerializedName(value = "outerIdentityPrivacyTemporaryValue", alternate = {"OuterIdentityPrivacyTemporaryValue"})
    @Expose
    public String outerIdentityPrivacyTemporaryValue;

    /**
     * The Perform Server Validation.
     * Specify whether to enable verification of server's identity by validating the certificate when EAP type is selected as PEAP.
     */
    @SerializedName(value = "performServerValidation", alternate = {"PerformServerValidation"})
    @Expose
    public Boolean performServerValidation;

    /**
     * The Prompt For Additional Authentication Credentials.
     * Specify whether the wifi connection should prompt for additional authentication credentials.
     */
    @SerializedName(value = "promptForAdditionalAuthenticationCredentials", alternate = {"PromptForAdditionalAuthenticationCredentials"})
    @Expose
    public Boolean promptForAdditionalAuthenticationCredentials;

    /**
     * The Require Cryptographic Binding.
     * Specify whether to enable cryptographic binding when EAP type is selected as PEAP.
     */
    @SerializedName(value = "requireCryptographicBinding", alternate = {"RequireCryptographicBinding"})
    @Expose
    public Boolean requireCryptographicBinding;

    /**
     * The Trusted Server Certificate Names.
     * Specify trusted server certificate names.
     */
    @SerializedName(value = "trustedServerCertificateNames", alternate = {"TrustedServerCertificateNames"})
    @Expose
    public java.util.List<String> trustedServerCertificateNames;

    /**
     * The User Based Virtual Lan.
     * Specifiy whether to change the virtual LAN used by the device based on the user’s credentials. Cannot be used when NetworkSingleSignOnType is set to Disabled.
     */
    @SerializedName(value = "userBasedVirtualLan", alternate = {"UserBasedVirtualLan"})
    @Expose
    public Boolean userBasedVirtualLan;

    /**
     * The Identity Certificate For Client Authentication.
     * Specify identity certificate for client authentication.
     */
    @SerializedName(value = "identityCertificateForClientAuthentication", alternate = {"IdentityCertificateForClientAuthentication"})
    @Expose
    public WindowsCertificateProfileBase identityCertificateForClientAuthentication;

    /**
     * The Root Certificate For Client Validation.
     * Specify root certificate for client validation.
     */
    @SerializedName(value = "rootCertificateForClientValidation", alternate = {"RootCertificateForClientValidation"})
    @Expose
    public Windows81TrustedRootCertificate rootCertificateForClientValidation;

    /**
     * The Root Certificates For Server Validation.
     * Specify root certificate for server validation.
     */
    @SerializedName(value = "rootCertificatesForServerValidation", alternate = {"RootCertificatesForServerValidation"})
    @Expose
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
            rootCertificatesForServerValidation = serializer.deserializeObject(json.get("rootCertificatesForServerValidation").toString(), Windows81TrustedRootCertificateCollectionPage.class);
        }
    }
}
