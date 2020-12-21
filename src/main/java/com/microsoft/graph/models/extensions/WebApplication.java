// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ImplicitGrantSettings;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Web Application.
 */
public class WebApplication implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Home Page Url.
     * Home page or landing page of the application.
     */
    @SerializedName(value = "homePageUrl", alternate = {"HomePageUrl"})
    @Expose
    public String homePageUrl;

    /**
     * The Implicit Grant Settings.
     * Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow.
     */
    @SerializedName(value = "implicitGrantSettings", alternate = {"ImplicitGrantSettings"})
    @Expose
    public ImplicitGrantSettings implicitGrantSettings;

    /**
     * The Logout Url.
     * Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel, back-channel or SAML logout protocols.
     */
    @SerializedName(value = "logoutUrl", alternate = {"LogoutUrl"})
    @Expose
    public String logoutUrl;

    /**
     * The Oauth2Allow Implicit Flow.
     * 
     */
    @SerializedName(value = "oauth2AllowImplicitFlow", alternate = {"Oauth2AllowImplicitFlow"})
    @Expose
    public Boolean oauth2AllowImplicitFlow;

    /**
     * The Redirect Uris.
     * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and access tokens are sent.
     */
    @SerializedName(value = "redirectUris", alternate = {"RedirectUris"})
    @Expose
    public java.util.List<String> redirectUris;


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
