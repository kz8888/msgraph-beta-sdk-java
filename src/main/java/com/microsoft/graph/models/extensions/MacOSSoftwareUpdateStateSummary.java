// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.MacOSSoftwareUpdateState;
import com.microsoft.graph.models.generated.MacOSSoftwareUpdateCategory;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSSoftware Update State Summary.
 */
public class MacOSSoftwareUpdateStateSummary extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * Human readable name of the software update
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Updated Date Time.
     * Last date time the report for this device and product key was updated.
     */
    @SerializedName(value = "lastUpdatedDateTime", alternate = {"LastUpdatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastUpdatedDateTime;

    /**
     * The Product Key.
     * Product key of the software update.
     */
    @SerializedName(value = "productKey", alternate = {"ProductKey"})
    @Expose
	@Nullable
    public String productKey;

    /**
     * The State.
     * State of the software update
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public MacOSSoftwareUpdateState state;

    /**
     * The Update Category.
     * Software update category
     */
    @SerializedName(value = "updateCategory", alternate = {"UpdateCategory"})
    @Expose
	@Nullable
    public MacOSSoftwareUpdateCategory updateCategory;

    /**
     * The Update Version.
     * Version of the software update
     */
    @SerializedName(value = "updateVersion", alternate = {"UpdateVersion"})
    @Expose
	@Nullable
    public String updateVersion;


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
