// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Insights Settings.
 */
public class ItemInsightsSettings extends Entity implements IJsonBackedObject {


    /**
     * The Disabled For Group.
     * The ID of an Azure AD group, of which the members' item insights are disabled. Default is empty. Optional.
     */
    @SerializedName(value = "disabledForGroup", alternate = {"DisabledForGroup"})
    @Expose
    public String disabledForGroup;

    /**
     * The Is Enabled In Organization.
     * true if organization item insights are enabled; false if organization item insights are disabled for all users without exceptions. Default is true. Optional.
     */
    @SerializedName(value = "isEnabledInOrganization", alternate = {"IsEnabledInOrganization"})
    @Expose
    public Boolean isEnabledInOrganization;


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
