// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.ResponsiblePolicy;
import com.microsoft.graph.models.extensions.ResponsibleSensitiveType;
import com.microsoft.graph.models.extensions.MatchingLabel;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Evaluate Label Job Result.
 */
public class EvaluateLabelJobResult implements IJsonBackedObject {

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
     * The Responsible Policy.
     * 
     */
    @SerializedName(value = "responsiblePolicy", alternate = {"ResponsiblePolicy"})
    @Expose
	@Nullable
    public ResponsiblePolicy responsiblePolicy;

    /**
     * The Responsible Sensitive Types.
     * 
     */
    @SerializedName(value = "responsibleSensitiveTypes", alternate = {"ResponsibleSensitiveTypes"})
    @Expose
	@Nullable
    public java.util.List<ResponsibleSensitiveType> responsibleSensitiveTypes;

    /**
     * The Sensitivity Label.
     * 
     */
    @SerializedName(value = "sensitivityLabel", alternate = {"SensitivityLabel"})
    @Expose
	@Nullable
    public MatchingLabel sensitivityLabel;


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
