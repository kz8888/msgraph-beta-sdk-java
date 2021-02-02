// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PasswordSingleSignOnSettings;
import com.microsoft.graph.models.extensions.AddIn;
import com.microsoft.graph.models.extensions.AppRole;
import com.microsoft.graph.models.extensions.InformationalUrl;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.models.extensions.PermissionScope;
import com.microsoft.graph.models.extensions.SamlSingleSignOnSettings;
import com.microsoft.graph.models.extensions.AppRoleAssignment;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.DelegatedPermissionClassification;
import com.microsoft.graph.models.extensions.Endpoint;
import com.microsoft.graph.models.extensions.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.extensions.LicenseDetails;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import com.microsoft.graph.models.extensions.TokenIssuancePolicy;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import com.microsoft.graph.models.extensions.Synchronization;
import com.microsoft.graph.requests.extensions.AppRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.ClaimsMappingPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.DelegatedPermissionClassificationCollectionPage;
import com.microsoft.graph.requests.extensions.EndpointCollectionPage;
import com.microsoft.graph.requests.extensions.HomeRealmDiscoveryPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.LicenseDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantCollectionPage;
import com.microsoft.graph.requests.extensions.TokenIssuancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TokenLifetimePolicyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal.
 */
public class ServicePrincipal extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Password Single Sign On Settings.
     * The collection for settings related to password single sign-on. Use $select=passwordSingleSignOnSettings to read the property. Read-only for applicationTemplates except for custom applicationTemplates.
     */
    @SerializedName(value = "passwordSingleSignOnSettings", alternate = {"PasswordSingleSignOnSettings"})
    @Expose
    public PasswordSingleSignOnSettings passwordSingleSignOnSettings;

    /**
     * The Account Enabled.
     * true if the service principal account is enabled; otherwise, false.
     */
    @SerializedName(value = "accountEnabled", alternate = {"AccountEnabled"})
    @Expose
    public Boolean accountEnabled;

    /**
     * The Add Ins.
     * Defines custom behavior that a consuming service can use to call an app in specific contexts. For example, applications that can render file streams may set the addIns property for its 'FileHandler' functionality. This will let services like Microsoft 365 call the application in the context of a document the user is working on.
     */
    @SerializedName(value = "addIns", alternate = {"AddIns"})
    @Expose
    public java.util.List<AddIn> addIns;

    /**
     * The Alternative Names.
     * Used to retrieve service principals by subscription, identify resource group and full resource ids for managed identities.
     */
    @SerializedName(value = "alternativeNames", alternate = {"AlternativeNames"})
    @Expose
    public java.util.List<String> alternativeNames;

    /**
     * The App Description.
     * 
     */
    @SerializedName(value = "appDescription", alternate = {"AppDescription"})
    @Expose
    public String appDescription;

    /**
     * The App Display Name.
     * The display name exposed by the associated application.
     */
    @SerializedName(value = "appDisplayName", alternate = {"AppDisplayName"})
    @Expose
    public String appDisplayName;

    /**
     * The App Id.
     * The unique identifier for the associated application (its appId property).
     */
    @SerializedName(value = "appId", alternate = {"AppId"})
    @Expose
    public String appId;

    /**
     * The Application Template Id.
     * Unique identifier of the applicationTemplate that the servicePrincipal was created from. Read-only.
     */
    @SerializedName(value = "applicationTemplateId", alternate = {"ApplicationTemplateId"})
    @Expose
    public String applicationTemplateId;

    /**
     * The App Owner Organization Id.
     * Contains the tenant id where the application is registered. This is applicable only to service principals backed by applications.
     */
    @SerializedName(value = "appOwnerOrganizationId", alternate = {"AppOwnerOrganizationId"})
    @Expose
    public java.util.UUID appOwnerOrganizationId;

    /**
     * The App Role Assignment Required.
     * Specifies whether users or other service principals need to be granted an app role assignment for this service principal before users can sign in or apps can get tokens. The default value is false. Not nullable.
     */
    @SerializedName(value = "appRoleAssignmentRequired", alternate = {"AppRoleAssignmentRequired"})
    @Expose
    public Boolean appRoleAssignmentRequired;

    /**
     * The App Roles.
     * The roles exposed by the application which this service principal represents. For more information see the appRoles property definition on the application entity. Not nullable.
     */
    @SerializedName(value = "appRoles", alternate = {"AppRoles"})
    @Expose
    public java.util.List<AppRole> appRoles;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * The display name for the service principal.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Error Url.
     * Deprecated. Don't use.
     */
    @SerializedName(value = "errorUrl", alternate = {"ErrorUrl"})
    @Expose
    public String errorUrl;

    /**
     * The Homepage.
     * Home page or landing page of the application.
     */
    @SerializedName(value = "homepage", alternate = {"Homepage"})
    @Expose
    public String homepage;

    /**
     * The Info.
     * Basic profile information of the acquired application such as app's marketing, support, terms of service and privacy statement URLs. The terms of service and privacy statement are surfaced to users through the user consent experience. For more info, see How to: Add Terms of service and privacy statement for registered Azure AD apps.
     */
    @SerializedName(value = "info", alternate = {"Info"})
    @Expose
    public InformationalUrl info;

    /**
     * The Key Credentials.
     * The collection of key credentials associated with the service principal. Not nullable.
     */
    @SerializedName(value = "keyCredentials", alternate = {"KeyCredentials"})
    @Expose
    public java.util.List<KeyCredential> keyCredentials;

    /**
     * The Login Url.
     * Specifies the URL where the service provider redirects the user to Azure AD to authenticate. Azure AD uses the URL to launch the application from Microsoft 365 or the Azure AD My Apps. When blank, Azure AD performs IdP-initiated sign-on for applications configured with SAML-based single sign-on. The user launches the application from Microsoft 365, the Azure AD My Apps, or the Azure AD SSO URL.
     */
    @SerializedName(value = "loginUrl", alternate = {"LoginUrl"})
    @Expose
    public String loginUrl;

    /**
     * The Logout Url.
     * Specifies the URL that will be used by Microsoft's authorization service to logout an user using OpenId Connect front-channel, back-channel or SAML logout protocols.
     */
    @SerializedName(value = "logoutUrl", alternate = {"LogoutUrl"})
    @Expose
    public String logoutUrl;

    /**
     * The Notes.
     * 
     */
    @SerializedName(value = "notes", alternate = {"Notes"})
    @Expose
    public String notes;

    /**
     * The Notification Email Addresses.
     * Specifies the list of email addresses where Azure AD sends a notification when the active certificate is near the expiration date. This is only for the certificates used to sign the SAML token issued for Azure AD Gallery applications.
     */
    @SerializedName(value = "notificationEmailAddresses", alternate = {"NotificationEmailAddresses"})
    @Expose
    public java.util.List<String> notificationEmailAddresses;

    /**
     * The Password Credentials.
     * The collection of password credentials associated with the service principal. Not nullable.
     */
    @SerializedName(value = "passwordCredentials", alternate = {"PasswordCredentials"})
    @Expose
    public java.util.List<PasswordCredential> passwordCredentials;

    /**
     * The Preferred Single Sign On Mode.
     * Specifies the single sign-on mode configured for this application. Azure AD uses the preferred single sign-on mode to launch the application from Microsoft 365 or the Azure AD My Apps. The supported values are password, saml, notSupported, and oidc.
     */
    @SerializedName(value = "preferredSingleSignOnMode", alternate = {"PreferredSingleSignOnMode"})
    @Expose
    public String preferredSingleSignOnMode;

    /**
     * The Preferred Token Signing Key End Date Time.
     * Specifies the expiration date of the keyCredential used for token signing, marked by preferredTokenSigningKeyThumbprint.
     */
    @SerializedName(value = "preferredTokenSigningKeyEndDateTime", alternate = {"PreferredTokenSigningKeyEndDateTime"})
    @Expose
    public java.util.Calendar preferredTokenSigningKeyEndDateTime;

    /**
     * The Preferred Token Signing Key Thumbprint.
     * Reserved for internal use only. Do not write or otherwise rely on this property. May be removed in future versions.
     */
    @SerializedName(value = "preferredTokenSigningKeyThumbprint", alternate = {"PreferredTokenSigningKeyThumbprint"})
    @Expose
    public String preferredTokenSigningKeyThumbprint;

    /**
     * The Published Permission Scopes.
     * The delegated permissions exposed by the application. For more information see the oauth2PermissionScopes property on the application entity's api property. Not nullable.
     */
    @SerializedName(value = "publishedPermissionScopes", alternate = {"PublishedPermissionScopes"})
    @Expose
    public java.util.List<PermissionScope> publishedPermissionScopes;

    /**
     * The Publisher Name.
     * 
     */
    @SerializedName(value = "publisherName", alternate = {"PublisherName"})
    @Expose
    public String publisherName;

    /**
     * The Reply Urls.
     * The URLs that user tokens are sent to for sign in with the associated application, or the redirect URIs that OAuth 2.0 authorization codes and access tokens are sent to for the associated application. Not nullable.
     */
    @SerializedName(value = "replyUrls", alternate = {"ReplyUrls"})
    @Expose
    public java.util.List<String> replyUrls;

    /**
     * The Saml Metadata Url.
     * The url where the service exposes SAML metadata for federation.
     */
    @SerializedName(value = "samlMetadataUrl", alternate = {"SamlMetadataUrl"})
    @Expose
    public String samlMetadataUrl;

    /**
     * The Saml Single Sign On Settings.
     * The collection for settings related to saml single sign-on.
     */
    @SerializedName(value = "samlSingleSignOnSettings", alternate = {"SamlSingleSignOnSettings"})
    @Expose
    public SamlSingleSignOnSettings samlSingleSignOnSettings;

    /**
     * The Service Principal Names.
     * Contains the list of identifiersUris, copied over from the associated application. Additional values can be added to hybrid applications. These values can be used to identify the permissions exposed by this app within Azure AD. For example,Client apps can specify a resource URI which is based on the values of this property to acquire an access token, which is the URI returned in the 'aud' claim.The any operator is required for filter expressions on multi-valued properties. Not nullable.
     */
    @SerializedName(value = "servicePrincipalNames", alternate = {"ServicePrincipalNames"})
    @Expose
    public java.util.List<String> servicePrincipalNames;

    /**
     * The Service Principal Type.
     * Identifies if the service principal represents an application or a managed identity. This is set by Azure AD internally. For a service principal that represents an application this is set as Application. For a service principal that represent a managed identity this is set as ManagedIdentity.
     */
    @SerializedName(value = "servicePrincipalType", alternate = {"ServicePrincipalType"})
    @Expose
    public String servicePrincipalType;

    /**
     * The Sign In Audience.
     * Specifies what Microsoft accounts are supported for the associated application. Read-only.
     */
    @SerializedName(value = "signInAudience", alternate = {"SignInAudience"})
    @Expose
    public String signInAudience;

    /**
     * The Tags.
     * Custom strings that can be used to categorize and identify the service principal. Not nullable.
     */
    @SerializedName(value = "tags", alternate = {"Tags"})
    @Expose
    public java.util.List<String> tags;

    /**
     * The Token Encryption Key Id.
     * Specifies the keyId of a public key from the keyCredentials collection. When configured, Azure AD issues tokens for this application encrypted using the key specified by this property. The application code that receives the encrypted token must use the matching private key to decrypt the token before it can be used for the signed-in user.
     */
    @SerializedName(value = "tokenEncryptionKeyId", alternate = {"TokenEncryptionKeyId"})
    @Expose
    public java.util.UUID tokenEncryptionKeyId;

    /**
     * The App Role Assigned To.
     * Principals (users, groups, and service principals) that are assigned to this service principal. Read-only.
     */
    @SerializedName(value = "appRoleAssignedTo", alternate = {"AppRoleAssignedTo"})
    @Expose
    public AppRoleAssignmentCollectionPage appRoleAssignedTo;

    /**
     * The App Role Assignments.
     * Applications that this service principal is assigned to. Read-only. Nullable.
     */
    @SerializedName(value = "appRoleAssignments", alternate = {"AppRoleAssignments"})
    @Expose
    public AppRoleAssignmentCollectionPage appRoleAssignments;

    /**
     * The Claims Mapping Policies.
     * The claimsMappingPolicies assigned to this service principal.
     */
    public ClaimsMappingPolicyCollectionPage claimsMappingPolicies;

    /**
     * The Created Objects.
     * Directory objects created by this service principal. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage createdObjects;

    /**
     * The Delegated Permission Classifications.
     * The permission classifications for delegated permissions exposed by the app that this service principal represents.
     */
    @SerializedName(value = "delegatedPermissionClassifications", alternate = {"DelegatedPermissionClassifications"})
    @Expose
    public DelegatedPermissionClassificationCollectionPage delegatedPermissionClassifications;

    /**
     * The Endpoints.
     * Endpoints available for discovery. Services like Sharepoint populate this property with a tenant specific SharePoint endpoints that other applications can discover and use in their experiences.
     */
    @SerializedName(value = "endpoints", alternate = {"Endpoints"})
    @Expose
    public EndpointCollectionPage endpoints;

    /**
     * The Home Realm Discovery Policies.
     * The homeRealmDiscoveryPolicies assigned to this service principal.
     */
    public HomeRealmDiscoveryPolicyCollectionPage homeRealmDiscoveryPolicies;

    /**
     * The License Details.
     * 
     */
    @SerializedName(value = "licenseDetails", alternate = {"LicenseDetails"})
    @Expose
    public LicenseDetailsCollectionPage licenseDetails;

    /**
     * The Member Of.
     * Roles that this service principal is a member of. HTTP Methods: GET Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage memberOf;

    /**
     * The Oauth2Permission Grants.
     * Delegated permission grants authorizing this service principal to access an API on behalf of a signed-in user. Read-only. Nullable.
     */
    public OAuth2PermissionGrantCollectionPage oauth2PermissionGrants;

    /**
     * The Owned Objects.
     * Directory objects that are owned by this service principal. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage ownedObjects;

    /**
     * The Owners.
     * Directory objects that are owners of this servicePrincipal. The owners are a set of non-admin users or servicePrincipals who are allowed to modify this object. Read-only. Nullable.
     */
    public DirectoryObjectCollectionPage owners;

    /**
     * The Token Issuance Policies.
     * The tokenIssuancePolicies assigned to this service principal.
     */
    public TokenIssuancePolicyCollectionPage tokenIssuancePolicies;

    /**
     * The Token Lifetime Policies.
     * The tokenLifetimePolicies assigned to this service principal.
     */
    public TokenLifetimePolicyCollectionPage tokenLifetimePolicies;

    /**
     * The Transitive Member Of.
     * 
     */
    public DirectoryObjectCollectionPage transitiveMemberOf;

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


        if (json.has("appRoleAssignedTo")) {
            appRoleAssignedTo = serializer.deserializeObject(json.get("appRoleAssignedTo").toString(), AppRoleAssignmentCollectionPage.class);
        }

        if (json.has("appRoleAssignments")) {
            appRoleAssignments = serializer.deserializeObject(json.get("appRoleAssignments").toString(), AppRoleAssignmentCollectionPage.class);
        }

        if (json.has("claimsMappingPolicies")) {
            claimsMappingPolicies = serializer.deserializeObject(json.get("claimsMappingPolicies").toString(), ClaimsMappingPolicyCollectionPage.class);
        }

        if (json.has("createdObjects")) {
            createdObjects = serializer.deserializeObject(json.get("createdObjects").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("delegatedPermissionClassifications")) {
            delegatedPermissionClassifications = serializer.deserializeObject(json.get("delegatedPermissionClassifications").toString(), DelegatedPermissionClassificationCollectionPage.class);
        }

        if (json.has("endpoints")) {
            endpoints = serializer.deserializeObject(json.get("endpoints").toString(), EndpointCollectionPage.class);
        }

        if (json.has("homeRealmDiscoveryPolicies")) {
            homeRealmDiscoveryPolicies = serializer.deserializeObject(json.get("homeRealmDiscoveryPolicies").toString(), HomeRealmDiscoveryPolicyCollectionPage.class);
        }

        if (json.has("licenseDetails")) {
            licenseDetails = serializer.deserializeObject(json.get("licenseDetails").toString(), LicenseDetailsCollectionPage.class);
        }

        if (json.has("memberOf")) {
            memberOf = serializer.deserializeObject(json.get("memberOf").toString(), DirectoryObjectCollectionPage.class);
        }

        if (json.has("oauth2PermissionGrants")) {
            oauth2PermissionGrants = serializer.deserializeObject(json.get("oauth2PermissionGrants").toString(), OAuth2PermissionGrantCollectionPage.class);
        }

        if (json.has("ownedObjects")) {
            ownedObjects = serializer.deserializeObject(json.get("ownedObjects").toString(), DirectoryObjectCollectionPage.class);
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

        if (json.has("transitiveMemberOf")) {
            transitiveMemberOf = serializer.deserializeObject(json.get("transitiveMemberOf").toString(), DirectoryObjectCollectionPage.class);
        }
    }
}
