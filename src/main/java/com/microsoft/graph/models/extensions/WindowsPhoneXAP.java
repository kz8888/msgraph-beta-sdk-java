// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.WindowsMinimumOperatingSystem;
import com.microsoft.graph.models.extensions.MobileLobApp;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone XAP.
 */
public class WindowsPhoneXAP extends MobileLobApp implements IJsonBackedObject {


    /**
     * The Identity Version.
     * The identity version.
     */
    @SerializedName(value = "identityVersion", alternate = {"IdentityVersion"})
    @Expose
    public String identityVersion;

    /**
     * The Minimum Supported Operating System.
     * The value for the minimum applicable operating system.
     */
    @SerializedName(value = "minimumSupportedOperatingSystem", alternate = {"MinimumSupportedOperatingSystem"})
    @Expose
    public WindowsMinimumOperatingSystem minimumSupportedOperatingSystem;

    /**
     * The Product Identifier.
     * The Product Identifier.
     */
    @SerializedName(value = "productIdentifier", alternate = {"ProductIdentifier"})
    @Expose
    public String productIdentifier;


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
