// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ApiApplication;
import com.microsoft.graph.models.extensions.AppRole;
import com.microsoft.graph.models.extensions.InformationalUrl;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.OptionalClaims;
import com.microsoft.graph.models.extensions.ParentalControlSettings;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.models.extensions.PublicClientApplication;
import com.microsoft.graph.models.extensions.RequiredResourceAccess;
import com.microsoft.graph.models.extensions.SpaApplication;
import com.microsoft.graph.models.extensions.WebApplication;
import com.microsoft.graph.models.extensions.OnPremisesPublishing;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ExtensionProperty;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.models.extensions.Synchronization;
import com.microsoft.graph.requests.extensions.ExtensionPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application.
 */
public class Application extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Api.
     * Specifies settings for an application that implements a web API.
     */
    @SerializedName(value = "api", alternate = {"Api"})
    @Expose
    public ApiApplication api;

    /**
     * The App Id.
     * The unique identifier for the application that is assigned by Azure AD. Not nullable. Read-only.
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
    public String appId;

    /**
     * The App Roles.
     * The collection of roles assigned to the application. With app role assignments, these roles can be assigned to users, groups, or service principals associated with other applications. Not nullable.
     */
    @SerializedName(value = "appRoles", alternate = {"AppRoles"})
    @Expose
    public java.util.List<AppRole> appRoles;

    /**
     * The Created Date Time.
     * The date and time the application was registered. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Default Redirect Uri.
     * 
     */
    @SerializedName(value = "defaultRedirectUri", alternate = {"DefaultRedirectUri"})
    @Expose
    public String defaultRedirectUri;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name for the application.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Group Membership Claims.
     * Configures the groups claim issued in a user or OAuth 2.0 access token that the application expects. To set this attribute, use one of the following string values:NoneSecurityGroup: For security groups and Azure AD rolesAll: This gets all of the security groups, distribution groups, and Azure AD directory roles that the signed-in user is a member of.
     */
    @SerializedName(value = "groupMembershipClaims", alternate = {"GroupMembershipClaims"})
    @Expose
    public String groupMembershipClaims;

    /**
     * The Identifier Uris.
     * The URIs that identify the application within its Azure AD tenant, or within a verified custom domain if the application is multi-tenant. For more information, see Application Objects and Service Principal Objects. The any operator is required for filter expressions on multi-valued properties. Not nullable.
     */
    @SerializedName(value = "identifierUris", alternate = {"IdentifierUris"})
    @Expose
    public java.util.List<String> identifierUris;

    /**
     * The Info.
     * Basic profile information of the application, such as it's marketing, support, terms of service, and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more information, see How to: Add Terms of service and privacy statement for registered Azure AD apps.
     */
    @SerializedName(value = "info", alternate = {"Info"})
    @Expose
    public InformationalUrl info;

    /**
     * The Is Device Only Auth Supported.
     * 
     */
    @SerializedName(value = "isDeviceOnlyAuthSupported", alternate = {"IsDeviceOnlyAuthSupported"})
    @Expose
    public Boolean isDeviceOnlyAuthSupported;

    /**
     * The Is Fallback Public Client.
     * Specifies the fallback application type as public client, such as an installed application running on a mobile device. The default value is false which means the fallback application type is confidential client such as a web app. There are certain scenarios where Azure AD cannot determine the client application type. For example, the ROPC flow where the application is configured without specifying a redirect URI. In those cases Azure AD interprets the application type based on the value of this property.
     */
    @SerializedName(value = "isFallbackPublicClient", alternate = {"IsFallbackPublicClient"})
    @Expose
    public Boolean isFallbackPublicClient;

    /**
     * The Key Credentials.
     * The collection of key credentials associated with the application. Not nullable.
     */
    @SerializedName(value = "keyCredentials", alternate = {"KeyCredentials"})
    @Expose
    public java.util.List<KeyCredential> keyCredentials;

    /**
     * The Notes.
     * 
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
    public String notes;

    /**
     * The Optional Claims.
     * Application developers can configure optional claims in their Azure AD applications to specify the claims that are sent to their application by the Microsoft security token service. For more information, see How to: Provide optional claims to your app.
     */
    @SerializedName(value = "optionalClaims", alternate = {"OptionalClaims"})
    @Expose
    public OptionalClaims optionalClaims;

    /**
     * The Parental Control Settings.
     * Specifies parental control settings for an application.
     */
    @SerializedName(value = "parentalControlSettings", alternate = {"ParentalControlSettings"})
    @Expose
    public ParentalControlSettings parentalControlSettings;

    /**
     * The Password Credentials.
     * The collection of password credentials associated with the application. Not nullable.
     */
    @SerializedName(value = "passwordCredentials", alternate = {"PasswordCredentials"})
    @Expose
    public java.util.List<PasswordCredential> passwordCredentials;

    /**
     * The Public Client.
     * Specifies settings for installed clients such as desktop or mobile devices.
     */
    @SerializedName(value = "publicClient", alternate = {"PublicClient"})
    @Expose
    public PublicClientApplication publicClient;

    /**
     * The Publisher Domain.
     * The verified publisher domain for the application. Read-only.
     */
    @SerializedName(value = "publisherDomain", alternate = {"PublisherDomain"})
    @Expose
    public String publisherDomain;

    /**
     * The Required Resource Access.
     * Specifies the resources that the application needs to access. This property also specifies the set of OAuth permission scopes and application roles that it needs for each of those resources. This configuration of access to the required resources drives the consent experience. Not nullable.
     */
    @SerializedName(value = "requiredResourceAccess", alternate = {"RequiredResourceAccess"})
    @Expose
    public java.util.List<RequiredResourceAccess> requiredResourceAccess;

    /**
     * The Sign In Audience.
     * Specifies the Microsoft accounts that are supported for the current application. Supported values are:AzureADMyOrg: Users with a Microsoft work or school account in my organization’s Azure AD tenant (single-tenant).AzureADMultipleOrgs: Users with a Microsoft work or school account in any organization’s Azure AD tenant (multi-tenant).AzureADandPersonalMicrosoftAccount: Users with a personal Microsoft account, or a work or school account in any organization’s Azure AD tenant.PersonalMicrosoftAccount: Users with a personal Microsoft account only.
     */
    @SerializedName(value = "signInAudience", alternate = {"SignInAudience"})
    @Expose
    public String signInAudience;

    /**
     * The Spa.
     * Specifies settings for a single-page application, including sign out URLs and redirect URIs for authorization codes and access tokens.
     */
    @SerializedName(value = "spa", alternate = {"Spa"})
    @Expose
    public SpaApplication spa;

    /**
     * The Tags.
     * Custom strings that can be used to categorize and identify the application. Not nullable.
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
    public java.util.List<String> tags;

    /**
     * The Token Encryption Key Id.
     * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD encrypts all the tokens it emits by using the key this property points to. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     */
    @SerializedName(value = "tokenEncryptionKeyId", alternate = {"TokenEncryptionKeyId"})
    @Expose
    public java.util.UUID tokenEncryptionKeyId;

    /**
     * The Unique Name.
     * 
     */
    @SerializedName(value = "uniqueName", alternate = {"UniqueName"})
    @Expose
    public String uniqueName;

    /**
     * The Web.
     * Specifies settings for a web application.
     */
    @SerializedName(value = "web", alternate = {"Web"})
    @Expose
    public WebApplication web;

    /**
     * The On Premises Publishing.
     * Represents the set of properties required for configuring Application Proxy for this application. Configuring these properties allows you to publish your on-premises application for secure remote access.
     */
    @SerializedName(value = "onPremisesPublishing", alternate = {"OnPremisesPublishing"})
    @Expose
    public OnPremisesPublishing onPremisesPublishing;

    /**
     * The Created On Behalf Of.
     * Read-only.
     */
    @SerializedName(value = "createdOnBehalfOf", alternate = {"CreatedOnBehalfOf"})
    @Expose
    public DirectoryObject createdOnBehalfOf;

    /**
     * The Extension Properties.
     * Read-only. Nullable.
     */
    @SerializedName(value = "extensionProperties", alternate = {"ExtensionProperties"})
    @Expose
    public ExtensionPropertyCollectionPage extensionProperties;

    /**
     * The Home Realm Discovery Policies.
     * 
     */
    public HomeRealmDiscoveryPolicyCollectionPage homeRealmDiscoveryPolicies;

    /**
     * The Owners.
     * Directory objects that are owners of the application. The owners are a set of non-admin users who are allowed to modify this object. Requires version 2013-11-08 or newer. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage owners;

    /**
     * The Token Issuance Policies.
     * 
     */
    public TokenIssuancePolicyCollectionPage tokenIssuancePolicies;

    /**
     * The Token Lifetime Policies.
     * The tokenLifetimePolicies assigned to this application.
     */
    public TokenLifetimePolicyCollectionPage tokenLifetimePolicies;

    /**
     * The Connector Group.
     * The connectorGroup the application is using with Azure AD Application Proxy. Nullable.
     */
    @SerializedName(value = "connectorGroup", alternate = {"ConnectorGroup"})
    @Expose
    public ConnectorGroup connectorGroup;

    /**
     * The Synchronization.
     * 
     */
    @SerializedName(value = "synchronization", alternate = {"Synchronization"})
    @Expose
    public Synchronization synchronization;


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


        if (json.has("extensionProperties")) {
            extensionProperties = serializer.deserializeObject(json.get("extensionProperties").toString(), ExtensionPropertyCollectionPage.class);
        }

        if (json.has("homeRealmDiscoveryPolicies")) {
            homeRealmDiscoveryPolicies = serializer.deserializeObject(json.get("homeRealmDiscoveryPolicies").toString(), HomeRealmDiscoveryPolicyCollectionPage.class);
        }

        if (json.has("owners")) {
            owners = serializer.deserializeObject(json.get("owners").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("tokenIssuancePolicies")) {
            tokenIssuancePolicies = serializer.deserializeObject(json.get("tokenIssuancePolicies").toString(), TokenIssuancePolicyCollectionPage.class);
        }

        if (json.has("tokenLifetimePolicies")) {
            tokenLifetimePolicies = serializer.deserializeObject(json.get("tokenLifetimePolicies").toString(), TokenLifetimePolicyCollectionPage.class);
        }
    }
}
