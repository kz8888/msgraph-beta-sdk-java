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
 * The class for the Continuous Access Evaluation Policy.
 */
public class ContinuousAccessEvaluationPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * 
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Groups.
     * 
     */
    @SerializedName(value = "groups", alternate = {"Groups"})
    @Expose
    public java.util.List<String> groups;

    /**
     * The Is Enabled.
     * 
     */
    @SerializedName(value = "isEnabled", alternate = {"IsEnabled"})
    @Expose
    public Boolean isEnabled;

    /**
     * The Users.
     * 
     */
    @SerializedName(value = "users", alternate = {"Users"})
    @Expose
    public java.util.List<String> users;


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
