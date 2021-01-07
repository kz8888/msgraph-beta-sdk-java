// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2c Authentication Methods Policy.
 */
public class B2cAuthenticationMethodsPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Is Email Password Authentication Enabled.
     * 
     */
    @SerializedName(value = "isEmailPasswordAuthenticationEnabled", alternate = {"IsEmailPasswordAuthenticationEnabled"})
    @Expose
	@Nullable
    public Boolean isEmailPasswordAuthenticationEnabled;

    /**
     * The Is Phone One Time Password Authentication Enabled.
     * 
     */
    @SerializedName(value = "isPhoneOneTimePasswordAuthenticationEnabled", alternate = {"IsPhoneOneTimePasswordAuthenticationEnabled"})
    @Expose
	@Nullable
    public Boolean isPhoneOneTimePasswordAuthenticationEnabled;

    /**
     * The Is User Name Authentication Enabled.
     * 
     */
    @SerializedName(value = "isUserNameAuthenticationEnabled", alternate = {"IsUserNameAuthenticationEnabled"})
    @Expose
	@Nullable
    public Boolean isUserNameAuthenticationEnabled;


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
