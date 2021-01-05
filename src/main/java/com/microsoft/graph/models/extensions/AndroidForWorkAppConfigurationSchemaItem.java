// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidForWorkAppConfigurationSchemaItemDataType;
import com.microsoft.graph.models.extensions.KeyValuePair;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work App Configuration Schema Item.
 */
public class AndroidForWorkAppConfigurationSchemaItem implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Data Type.
     * The type of value this item describes
     */
    @SerializedName(value = "dataType", alternate = {"DataType"})
    @Expose
    public AndroidForWorkAppConfigurationSchemaItemDataType dataType;

    /**
     * The Default Bool Value.
     * Default value for boolean type items, if specified by the app developer
     */
    @SerializedName(value = "defaultBoolValue", alternate = {"DefaultBoolValue"})
    @Expose
    public Boolean defaultBoolValue;

    /**
     * The Default Int Value.
     * Default value for integer type items, if specified by the app developer
     */
    @SerializedName(value = "defaultIntValue", alternate = {"DefaultIntValue"})
    @Expose
    public Integer defaultIntValue;

    /**
     * The Default String Array Value.
     * Default value for string array type items, if specified by the app developer
     */
    @SerializedName(value = "defaultStringArrayValue", alternate = {"DefaultStringArrayValue"})
    @Expose
    public java.util.List<String> defaultStringArrayValue;

    /**
     * The Default String Value.
     * Default value for string type items, if specified by the app developer
     */
    @SerializedName(value = "defaultStringValue", alternate = {"DefaultStringValue"})
    @Expose
    public String defaultStringValue;

    /**
     * The Description.
     * Description of what the item controls within the application
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * Human readable name
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Schema Item Key.
     * Unique key the application uses to identify the item
     */
    @SerializedName(value = "schemaItemKey", alternate = {"SchemaItemKey"})
    @Expose
    public String schemaItemKey;

    /**
     * The Selections.
     * List of human readable name/value pairs for the valid values that can be set for this item (Choice and Multiselect items only)
     */
    @SerializedName(value = "selections", alternate = {"Selections"})
    @Expose
    public java.util.List<KeyValuePair> selections;


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
