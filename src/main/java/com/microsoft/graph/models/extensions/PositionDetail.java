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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Position Detail.
 */
public class PositionDetail implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Company.
     * Detail about the company or employer.
     */
    @SerializedName(value = "company", alternate = {"Company"})
    @Expose
    public CompanyDetail company;

    /**
     * The Description.
     * Description of the position in question.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The End Month Year.
     * When the position ended.
     */
    @SerializedName(value = "endMonthYear", alternate = {"EndMonthYear"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly endMonthYear;

    /**
     * The Job Title.
     * The title held when in that position.
     */
    @SerializedName(value = "jobTitle", alternate = {"JobTitle"})
    @Expose
    public String jobTitle;

    /**
     * The Role.
     * The role the position entailed.
     */
    @SerializedName(value = "role", alternate = {"Role"})
    @Expose
    public String role;

    /**
     * The Start Month Year.
     * The start month and year of the position.
     */
    @SerializedName(value = "startMonthYear", alternate = {"StartMonthYear"})
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly startMonthYear;

    /**
     * The Summary.
     * Short summary of the position.
     */
    @SerializedName(value = "summary", alternate = {"Summary"})
    @Expose
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
