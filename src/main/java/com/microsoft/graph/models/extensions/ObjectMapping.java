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
import com.microsoft.graph.models.extensions.AttributeMapping;
import com.microsoft.graph.models.generated.ObjectFlowTypes;
import com.microsoft.graph.models.extensions.MetadataEntry;
import com.microsoft.graph.models.extensions.Filter;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Object Mapping.
 */
public class ObjectMapping implements IJsonBackedObject {

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
     * The Attribute Mappings.
     * 
     */
    @SerializedName(value = "attributeMappings", alternate = {"AttributeMappings"})
    @Expose
	@Nullable
    public java.util.List<AttributeMapping> attributeMappings;

    /**
     * The Enabled.
     * 
     */
    @SerializedName(value = "enabled", alternate = {"Enabled"})
    @Expose
	@Nullable
    public Boolean enabled;

    /**
     * The Flow Types.
     * 
     */
    @SerializedName(value = "flowTypes", alternate = {"FlowTypes"})
    @Expose
	@Nullable
    public EnumSet<ObjectFlowTypes> flowTypes;

    /**
     * The Metadata.
     * 
     */
    @SerializedName(value = "metadata", alternate = {"Metadata"})
    @Expose
	@Nullable
    public java.util.List<MetadataEntry> metadata;

    /**
     * The Name.
     * 
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Scope.
     * 
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
	@Nullable
    public Filter scope;

    /**
     * The Source Object Name.
     * 
     */
    @SerializedName(value = "sourceObjectName", alternate = {"SourceObjectName"})
    @Expose
	@Nullable
    public String sourceObjectName;

    /**
     * The Target Object Name.
     * 
     */
    @SerializedName(value = "targetObjectName", alternate = {"TargetObjectName"})
    @Expose
	@Nullable
    public String targetObjectName;


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
