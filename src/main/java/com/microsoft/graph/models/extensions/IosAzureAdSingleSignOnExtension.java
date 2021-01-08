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
 * The class for the Ios Azure Ad Single Sign On Extension.
 */
public class IosAzureAdSingleSignOnExtension extends IosSingleSignOnExtension implements IJsonBackedObject {


    /**
     * The Bundle Id Access Control List.
     * An optional list of additional bundle IDs allowed to use the AAD extension for single sign-on.
     */
    @SerializedName(value = "bundleIdAccessControlList", alternate = {"BundleIdAccessControlList"})
    @Expose
	@Nullable
    public java.util.List<String> bundleIdAccessControlList;

    /**
     * The Configurations.
     * Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "configurations", alternate = {"Configurations"})
    @Expose
	@Nullable
    public java.util.List<KeyTypedValuePair> configurations;

    /**
     * The Enable Shared Device Mode.
     * Enables or disables shared device mode.
     */
    @SerializedName(value = "enableSharedDeviceMode", alternate = {"EnableSharedDeviceMode"})
    @Expose
	@Nullable
    public Boolean enableSharedDeviceMode;


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
