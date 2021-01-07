// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AzureADLicenseType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Feature Usage Detail.
 */
public class FeatureUsageDetail implements IJsonBackedObject {

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
     * The Feature Name.
     * 
     */
    @SerializedName(value = "featureName", alternate = {"FeatureName"})
    @Expose
	@Nullable
    public String featureName;

    /**
     * The Last Configured Date Time.
     * 
     */
    @SerializedName(value = "lastConfiguredDateTime", alternate = {"LastConfiguredDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastConfiguredDateTime;

    /**
     * The Last Used Date Time.
     * 
     */
    @SerializedName(value = "lastUsedDateTime", alternate = {"LastUsedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastUsedDateTime;

    /**
     * The License Assigned.
     * 
     */
    @SerializedName(value = "licenseAssigned", alternate = {"LicenseAssigned"})
    @Expose
	@Nullable
    public AzureADLicenseType licenseAssigned;

    /**
     * The License Required.
     * 
     */
    @SerializedName(value = "licenseRequired", alternate = {"LicenseRequired"})
    @Expose
	@Nullable
    public AzureADLicenseType licenseRequired;


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
