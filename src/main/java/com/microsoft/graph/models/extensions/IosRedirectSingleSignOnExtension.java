// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.KeyTypedValuePair;
import com.microsoft.graph.models.extensions.IosSingleSignOnExtension;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Redirect Single Sign On Extension.
 */
public class IosRedirectSingleSignOnExtension extends IosSingleSignOnExtension implements IJsonBackedObject {


    /**
     * The Configurations.
     * Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "configurations", alternate = {"Configurations"})
    @Expose
	@Nullable
    public java.util.List<KeyTypedValuePair> configurations;

    /**
     * The Extension Identifier.
     * Gets or sets the bundle ID of the app extension that performs SSO for the specified URLs.
     */
    @SerializedName(value = "extensionIdentifier", alternate = {"ExtensionIdentifier"})
    @Expose
	@Nullable
    public String extensionIdentifier;

    /**
     * The Team Identifier.
     * Gets or sets the team ID of the app extension that performs SSO for the specified URLs.
     */
    @SerializedName(value = "teamIdentifier", alternate = {"TeamIdentifier"})
    @Expose
	@Nullable
    public String teamIdentifier;

    /**
     * The Url Prefixes.
     * One or more URL prefixes of identity providers on whose behalf the app extension performs single sign-on. URLs must begin with http:// or https://. All URL prefixes must be unique for all profiles.
     */
    @SerializedName(value = "urlPrefixes", alternate = {"UrlPrefixes"})
    @Expose
	@Nullable
    public java.util.List<String> urlPrefixes;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
