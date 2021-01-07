// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ClassificationMethod;
import com.microsoft.graph.models.generated.SensitiveTypeScope;
import com.microsoft.graph.models.generated.SensitiveTypeSource;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitive Type.
 */
public class SensitiveType extends Entity implements IJsonBackedObject {


    /**
     * The Classification Method.
     * 
     */
    @SerializedName(value = "classificationMethod", alternate = {"ClassificationMethod"})
    @Expose
	@Nullable
    public ClassificationMethod classificationMethod;

    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Publisher Name.
     * 
     */
    @SerializedName(value = "publisherName", alternate = {"PublisherName"})
    @Expose
	@Nullable
    public String publisherName;

    /**
     * The Rule Package Id.
     * 
     */
    @SerializedName(value = "rulePackageId", alternate = {"RulePackageId"})
    @Expose
	@Nullable
    public String rulePackageId;

    /**
     * The Rule Package Type.
     * 
     */
    @SerializedName(value = "rulePackageType", alternate = {"RulePackageType"})
    @Expose
	@Nullable
    public String rulePackageType;

    /**
     * The Scope.
     * 
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
	@Nullable
    public EnumSet<SensitiveTypeScope> scope;

    /**
     * The Sensitive Type Source.
     * 
     */
    @SerializedName(value = "sensitiveTypeSource", alternate = {"SensitiveTypeSource"})
    @Expose
	@Nullable
    public SensitiveTypeSource sensitiveTypeSource;

    /**
     * The State.
     * 
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public String state;


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
