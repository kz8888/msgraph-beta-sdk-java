// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ExternalAuthenticationType;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import com.microsoft.graph.models.extensions.VerifiedCustomDomainCertificatesMetadata;
import com.microsoft.graph.models.extensions.OnPremisesPublishingSingleSignOn;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Publishing.
 */
public class OnPremisesPublishing implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The External Url.
     * 
     */
    @SerializedName("externalUrl")
    @Expose
    public String externalUrl;

    /**
     * The Internal Url.
     * 
     */
    @SerializedName("internalUrl")
    @Expose
    public String internalUrl;

    /**
     * The External Authentication Type.
     * 
     */
    @SerializedName("externalAuthenticationType")
    @Expose
    public ExternalAuthenticationType externalAuthenticationType;

    /**
     * The Is Translate Host Header Enabled.
     * 
     */
    @SerializedName("isTranslateHostHeaderEnabled")
    @Expose
    public Boolean isTranslateHostHeaderEnabled;

    /**
     * The Is Translate Links In Body Enabled.
     * 
     */
    @SerializedName("isTranslateLinksInBodyEnabled")
    @Expose
    public Boolean isTranslateLinksInBodyEnabled;

    /**
     * The Is On Prem Publishing Enabled.
     * 
     */
    @SerializedName("isOnPremPublishingEnabled")
    @Expose
    public Boolean isOnPremPublishingEnabled;

    /**
     * The Application Server Timeout.
     * 
     */
    @SerializedName("applicationServerTimeout")
    @Expose
    public String applicationServerTimeout;

    /**
     * The Verified Custom Domain Key Credential.
     * 
     */
    @SerializedName("verifiedCustomDomainKeyCredential")
    @Expose
    public KeyCredential verifiedCustomDomainKeyCredential;

    /**
     * The Verified Custom Domain Password Credential.
     * 
     */
    @SerializedName("verifiedCustomDomainPasswordCredential")
    @Expose
    public PasswordCredential verifiedCustomDomainPasswordCredential;

    /**
     * The Verified Custom Domain Certificates Metadata.
     * 
     */
    @SerializedName("verifiedCustomDomainCertificatesMetadata")
    @Expose
    public VerifiedCustomDomainCertificatesMetadata verifiedCustomDomainCertificatesMetadata;

    /**
     * The Single Sign On Settings.
     * 
     */
    @SerializedName("singleSignOnSettings")
    @Expose
    public OnPremisesPublishingSingleSignOn singleSignOnSettings;

    /**
     * The Application Type.
     * 
     */
    @SerializedName("applicationType")
    @Expose
    public String applicationType;

    /**
     * The Is Http Only Cookie Enabled.
     * 
     */
    @SerializedName("isHttpOnlyCookieEnabled")
    @Expose
    public Boolean isHttpOnlyCookieEnabled;

    /**
     * The Is Secure Cookie Enabled.
     * 
     */
    @SerializedName("isSecureCookieEnabled")
    @Expose
    public Boolean isSecureCookieEnabled;

    /**
     * The Is Persistent Cookie Enabled.
     * 
     */
    @SerializedName("isPersistentCookieEnabled")
    @Expose
    public Boolean isPersistentCookieEnabled;

    /**
     * The Alternate Url.
     * 
     */
    @SerializedName("alternateUrl")
    @Expose
    public String alternateUrl;

    /**
     * The Use Alternate Url For Translation And Redirect.
     * 
     */
    @SerializedName("useAlternateUrlForTranslationAndRedirect")
    @Expose
    public Boolean useAlternateUrlForTranslationAndRedirect;


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