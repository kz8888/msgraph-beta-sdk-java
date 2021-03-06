// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PhysicalAddress;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company Detail.
 */
public class CompanyDetail implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Address.
     * Address of the company.
     */
    @SerializedName(value = "address", alternate = {"Address"})
    @Expose
    public PhysicalAddress address;

    /**
     * The Department.
     * Department Name within a company.
     */
    @SerializedName(value = "department", alternate = {"Department"})
    @Expose
    public String department;

    /**
     * The Display Name.
     * Company name.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Office Location.
     * Office Location of the person referred to.
     */
    @SerializedName(value = "officeLocation", alternate = {"OfficeLocation"})
    @Expose
    public String officeLocation;

    /**
     * The Pronunciation.
     * Pronunciation guide for the company name.
     */
    @SerializedName(value = "pronunciation", alternate = {"Pronunciation"})
    @Expose
    public String pronunciation;

    /**
     * The Web Url.
     * Link to the company home page.
     */
    @SerializedName(value = "webUrl", alternate = {"WebUrl"})
    @Expose
    public String webUrl;


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
