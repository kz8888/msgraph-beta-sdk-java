// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.CompanyDetail;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Position Detail.
 */
public class PositionDetail implements IJsonBackedObject {

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
     * The Company.
     * 
     */
    @SerializedName(value = "company", alternate = {"Company"})
    @Expose
	@Nullable
    public CompanyDetail company;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The End Month Year.
     * 
     */
    @SerializedName(value = "endMonthYear", alternate = {"EndMonthYear"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly endMonthYear;

    /**
     * The Job Title.
     * 
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
	@Nullable
    public String jobTitle;

    /**
     * The Role.
     * 
     */
    @SerializedName(value = "role", alternate = {"Role"})
    @Expose
	@Nullable
    public String role;

    /**
     * The Start Month Year.
     * 
     */
    @SerializedName(value = "startMonthYear", alternate = {"StartMonthYear"})
    @Expose
	@Nullable
    public com.microsoft.graph.core.DateOnly startMonthYear;

    /**
     * The Summary.
     * 
     */
    @SerializedName(value = "summary", alternate = {"Summary"})
    @Expose
	@Nullable
    public String summary;


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
