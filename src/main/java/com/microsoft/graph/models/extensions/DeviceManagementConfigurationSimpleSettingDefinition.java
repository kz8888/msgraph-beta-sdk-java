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
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingValue;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDependedOnBy;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationDependentOn;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingValueDefinition;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDefinition;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Simple Setting Definition.
 */
public class DeviceManagementConfigurationSimpleSettingDefinition extends DeviceManagementConfigurationSettingDefinition implements IJsonBackedObject {


    /**
     * The Default Value.
     * Default setting value for this setting
     */
    @SerializedName(value = "defaultValue", alternate = {"DefaultValue"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationSettingValue defaultValue;

    /**
     * The Depended On By.
     * list of child settings that depend on this setting
     */
    @SerializedName(value = "dependedOnBy", alternate = {"DependedOnBy"})
    @Expose
	@Nullable
    public java.util.List<DeviceManagementConfigurationSettingDependedOnBy> dependedOnBy;

    /**
     * The Dependent On.
     * list of parent settings this setting is dependent on
     */
    @SerializedName(value = "dependentOn", alternate = {"DependentOn"})
    @Expose
	@Nullable
    public java.util.List<DeviceManagementConfigurationDependentOn> dependentOn;

    /**
     * The Value Definition.
     * Definition of the value for this setting
     */
    @SerializedName(value = "valueDefinition", alternate = {"ValueDefinition"})
    @Expose
	@Nullable
    public DeviceManagementConfigurationSettingValueDefinition valueDefinition;


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
