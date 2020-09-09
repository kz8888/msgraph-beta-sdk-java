// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EasAuthenticationMethod;
import com.microsoft.graph.models.generated.EmailSyncDuration;
import com.microsoft.graph.models.generated.EasServices;
import com.microsoft.graph.models.generated.UserEmailSource;
import com.microsoft.graph.models.generated.EmailCertificateType;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
import com.microsoft.graph.models.extensions.IosCertificateProfileBase;
import com.microsoft.graph.models.extensions.IosCertificateProfile;
import com.microsoft.graph.models.extensions.EasEmailProfileConfigurationBase;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Eas Email Profile Configuration.
 */
public class IosEasEmailProfileConfiguration extends EasEmailProfileConfigurationBase implements IJsonBackedObject {


    /**
     * The Account Name.
     * Account name.
     */
    @SerializedName("accountName")
    @Expose
    public String accountName;

    /**
     * The Authentication Method.
     * Authentication method for this Email profile.
     */
    @SerializedName("authenticationMethod")
    @Expose
    public EasAuthenticationMethod authenticationMethod;

    /**
     * The Block Moving Messages To Other Email Accounts.
     * Indicates whether or not to block moving messages to other email accounts.
     */
    @SerializedName("blockMovingMessagesToOtherEmailAccounts")
    @Expose
    public Boolean blockMovingMessagesToOtherEmailAccounts;

    /**
     * The Block Sending Email From Third Party Apps.
     * Indicates whether or not to block sending email from third party apps.
     */
    @SerializedName("blockSendingEmailFromThirdPartyApps")
    @Expose
    public Boolean blockSendingEmailFromThirdPartyApps;

    /**
     * The Block Syncing Recently Used Email Addresses.
     * Indicates whether or not to block syncing recently used email addresses, for instance - when composing new email.
     */
    @SerializedName("blockSyncingRecentlyUsedEmailAddresses")
    @Expose
    public Boolean blockSyncingRecentlyUsedEmailAddresses;

    /**
     * The Duration Of Email To Sync.
     * Duration of time email should be synced back to. 
     */
    @SerializedName("durationOfEmailToSync")
    @Expose
    public EmailSyncDuration durationOfEmailToSync;

    /**
     * The Eas Services.
     * Exchange data to sync.
     */
    @SerializedName("easServices")
    @Expose
    public EnumSet<EasServices> easServices;

    /**
     * The Eas Services User Override Enabled.
     * Allow users to change sync settings.
     */
    @SerializedName("easServicesUserOverrideEnabled")
    @Expose
    public Boolean easServicesUserOverrideEnabled;

    /**
     * The Email Address Source.
     * Email attribute that is picked from AAD and injected into this profile before installing on the device.
     */
    @SerializedName("emailAddressSource")
    @Expose
    public UserEmailSource emailAddressSource;

    /**
     * The Encryption Certificate Type.
     * Encryption Certificate type for this Email profile.
     */
    @SerializedName("encryptionCertificateType")
    @Expose
    public EmailCertificateType encryptionCertificateType;

    /**
     * The Host Name.
     * Exchange location that (URL) that the native mail app connects to.
     */
    @SerializedName("hostName")
    @Expose
    public String hostName;

    /**
     * The Require Smime.
     * Indicates whether or not to use S/MIME certificate.
     */
    @SerializedName("requireSmime")
    @Expose
    public Boolean requireSmime;

    /**
     * The Require Ssl.
     * Indicates whether or not to use SSL.
     */
    @SerializedName("requireSsl")
    @Expose
    public Boolean requireSsl;

    /**
     * The Signing Certificate Type.
     * Signing Certificate type for this Email profile.
     */
    @SerializedName("signingCertificateType")
    @Expose
    public EmailCertificateType signingCertificateType;

    /**
     * The Smime Enable Per Message Switch.
     * Indicates whether or not to allow unencrypted emails.
     */
    @SerializedName("smimeEnablePerMessageSwitch")
    @Expose
    public Boolean smimeEnablePerMessageSwitch;

    /**
     * The Smime Encrypt By Default Enabled.
     * If set to true S/MIME encryption is enabled by default.
     */
    @SerializedName("smimeEncryptByDefaultEnabled")
    @Expose
    public Boolean smimeEncryptByDefaultEnabled;

    /**
     * The Smime Encrypt By Default User Override Enabled.
     * If set to true, the user can toggle the encryption by default setting.
     */
    @SerializedName("smimeEncryptByDefaultUserOverrideEnabled")
    @Expose
    public Boolean smimeEncryptByDefaultUserOverrideEnabled;

    /**
     * The Smime Encryption Certificate User Override Enabled.
     * If set to true the user can select the S/MIME encryption identity. 
     */
    @SerializedName("smimeEncryptionCertificateUserOverrideEnabled")
    @Expose
    public Boolean smimeEncryptionCertificateUserOverrideEnabled;

    /**
     * The Smime Signing Certificate User Override Enabled.
     * If set to true, the user can select the signing identity.
     */
    @SerializedName("smimeSigningCertificateUserOverrideEnabled")
    @Expose
    public Boolean smimeSigningCertificateUserOverrideEnabled;

    /**
     * The Smime Signing Enabled.
     * If set to true S/MIME signing is enabled for this account
     */
    @SerializedName("smimeSigningEnabled")
    @Expose
    public Boolean smimeSigningEnabled;

    /**
     * The Smime Signing User Override Enabled.
     * If set to true, the user can toggle S/MIME signing on or off.
     */
    @SerializedName("smimeSigningUserOverrideEnabled")
    @Expose
    public Boolean smimeSigningUserOverrideEnabled;

    /**
     * The Use OAuth.
     * Specifies whether the connection should use OAuth for authentication.
     */
    @SerializedName("useOAuth")
    @Expose
    public Boolean useOAuth;

    /**
     * The Derived Credential Settings.
     * Tenant level settings for the Derived Credentials to be used for authentication.
     */
    @SerializedName("derivedCredentialSettings")
    @Expose
    public DeviceManagementDerivedCredentialSettings derivedCredentialSettings;

    /**
     * The Identity Certificate.
     * Identity certificate.
     */
    @SerializedName("identityCertificate")
    @Expose
    public IosCertificateProfileBase identityCertificate;

    /**
     * The Smime Encryption Certificate.
     * S/MIME encryption certificate.
     */
    @SerializedName("smimeEncryptionCertificate")
    @Expose
    public IosCertificateProfile smimeEncryptionCertificate;

    /**
     * The Smime Signing Certificate.
     * S/MIME signing certificate.
     */
    @SerializedName("smimeSigningCertificate")
    @Expose
    public IosCertificateProfile smimeSigningCertificate;


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
