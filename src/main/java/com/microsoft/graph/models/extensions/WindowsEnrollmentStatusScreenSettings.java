// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Enrollment Status Screen Settings.
 */
public class WindowsEnrollmentStatusScreenSettings implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allow Device Use Before Profile And App Install Complete.
     * Allow or block user to use device before profile and app installation complete
     */
    @SerializedName(value = "allowDeviceUseBeforeProfileAndAppInstallComplete", alternate = {"AllowDeviceUseBeforeProfileAndAppInstallComplete"})
    @Expose
	@Nullable
    public Boolean allowDeviceUseBeforeProfileAndAppInstallComplete;

    /**
     * The Allow Device Use On Install Failure.
     * Allow the user to continue using the device on installation failure
     */
    @SerializedName(value = "allowDeviceUseOnInstallFailure", alternate = {"AllowDeviceUseOnInstallFailure"})
    @Expose
	@Nullable
    public Boolean allowDeviceUseOnInstallFailure;

    /**
     * The Allow Log Collection On Install Failure.
     * Allow or block log collection on installation failure
     */
    @SerializedName(value = "allowLogCollectionOnInstallFailure", alternate = {"AllowLogCollectionOnInstallFailure"})
    @Expose
	@Nullable
    public Boolean allowLogCollectionOnInstallFailure;

    /**
     * The Block Device Setup Retry By User.
     * Allow the user to retry the setup on installation failure
     */
    @SerializedName(value = "blockDeviceSetupRetryByUser", alternate = {"BlockDeviceSetupRetryByUser"})
    @Expose
	@Nullable
    public Boolean blockDeviceSetupRetryByUser;

    /**
     * The Custom Error Message.
     * Set custom error message to show upon installation failure
     */
    @SerializedName(value = "customErrorMessage", alternate = {"CustomErrorMessage"})
    @Expose
	@Nullable
    public String customErrorMessage;

    /**
     * The Hide Installation Progress.
     * Show or hide installation progress to user
     */
    @SerializedName(value = "hideInstallationProgress", alternate = {"HideInstallationProgress"})
    @Expose
	@Nullable
    public Boolean hideInstallationProgress;

    /**
     * The Install Progress Timeout In Minutes.
     * Set installation progress timeout in minutes
     */
    @SerializedName(value = "installProgressTimeoutInMinutes", alternate = {"InstallProgressTimeoutInMinutes"})
    @Expose
	@Nullable
    public Integer installProgressTimeoutInMinutes;


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
