// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CloudPcDeviceImageStatus;
import com.microsoft.graph.models.generated.CloudPcDeviceImageStatusDetails;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc Device Image.
 */
public class CloudPcDeviceImage extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Operating System.
     * 
     */
    @SerializedName(value = "operatingSystem", alternate = {"OperatingSystem"})
    @Expose
	@Nullable
    public String operatingSystem;

    /**
     * The Os Build Number.
     * 
     */
    @SerializedName(value = "osBuildNumber", alternate = {"OsBuildNumber"})
    @Expose
	@Nullable
    public String osBuildNumber;

    /**
     * The Source Image Resource Id.
     * 
     */
    @SerializedName(value = "sourceImageResourceId", alternate = {"SourceImageResourceId"})
    @Expose
	@Nullable
    public String sourceImageResourceId;

    /**
     * The Status.
     * 
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public CloudPcDeviceImageStatus status;

    /**
     * The Status Details.
     * 
     */
    @SerializedName(value = "statusDetails", alternate = {"StatusDetails"})
    @Expose
	@Nullable
    public CloudPcDeviceImageStatusDetails statusDetails;

    /**
     * The Version.
     * 
     */
    @SerializedName(value = "version", alternate = {"Version"})
    @Expose
	@Nullable
    public String version;


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
