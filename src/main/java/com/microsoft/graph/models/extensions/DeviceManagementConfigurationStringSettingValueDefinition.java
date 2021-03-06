// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceManagementConfigurationStringFormat;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingValueDefinition;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration String Setting Value Definition.
 */
public class DeviceManagementConfigurationStringSettingValueDefinition extends DeviceManagementConfigurationSettingValueDefinition implements IJsonBackedObject {


    /**
     * The Format.
     * Pre-defined format of the string. Possible values are: none, email, guid, ip, base64, url, version, xml, date, time, binary, regEx, json, dateTime, surfaceHub.
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
    public DeviceManagementConfigurationStringFormat format;

    /**
     * The Input Validation Schema.
     * Regular expression or any xml or json schema that the input string should match
     */
    @SerializedName(value = "inputValidationSchema", alternate = {"InputValidationSchema"})
    @Expose
    public String inputValidationSchema;

    /**
     * The Is Secret.
     * Specifies whether the setting needs to be treated as a secret. Settings marked as yes will be encrypted in transit and at rest and will be displayed as asterisks when represented in the UX.
     */
    @SerializedName(value = "isSecret", alternate = {"IsSecret"})
    @Expose
    public Boolean isSecret;

    /**
     * The Maximum Length.
     * Maximum length of string. Valid values 0 to 87516
     */
    @SerializedName(value = "maximumLength", alternate = {"MaximumLength"})
    @Expose
    public Long maximumLength;

    /**
     * The Minimum Length.
     * Minimum length of string. Valid values 0 to 87516
     */
    @SerializedName(value = "minimumLength", alternate = {"MinimumLength"})
    @Expose
    public Long minimumLength;


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
