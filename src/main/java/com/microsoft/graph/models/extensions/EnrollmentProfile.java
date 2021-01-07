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
 * The class for the Enrollment Profile.
 */
public class EnrollmentProfile extends Entity implements IJsonBackedObject {


    /**
     * The Configuration Endpoint Url.
     * Configuration endpoint url to use for Enrollment
     */
    @SerializedName(value = "configurationEndpointUrl", alternate = {"ConfigurationEndpointUrl"})
    @Expose
	@Nullable
    public String configurationEndpointUrl;

    /**
     * The Description.
     * Description of the profile
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Name of the profile
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Enable Authentication Via Company Portal.
     * Indicates to authenticate with Apple Setup Assistant instead of Company Portal.
     */
    @SerializedName(value = "enableAuthenticationViaCompanyPortal", alternate = {"EnableAuthenticationViaCompanyPortal"})
    @Expose
	@Nullable
    public Boolean enableAuthenticationViaCompanyPortal;

    /**
     * The Require Company Portal On Setup Assistant Enrolled Devices.
     * Indicates that Company Portal is required on setup assistant enrolled devices
     */
    @SerializedName(value = "requireCompanyPortalOnSetupAssistantEnrolledDevices", alternate = {"RequireCompanyPortalOnSetupAssistantEnrolledDevices"})
    @Expose
	@Nullable
    public Boolean requireCompanyPortalOnSetupAssistantEnrolledDevices;

    /**
     * The Requires User Authentication.
     * Indicates if the profile requires user authentication
     */
    @SerializedName(value = "requiresUserAuthentication", alternate = {"RequiresUserAuthentication"})
    @Expose
	@Nullable
    public Boolean requiresUserAuthentication;


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
