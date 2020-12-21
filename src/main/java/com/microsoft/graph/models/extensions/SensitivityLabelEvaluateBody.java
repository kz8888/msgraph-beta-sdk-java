// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.DiscoveredSensitiveType;
import com.microsoft.graph.models.extensions.CurrentLabel;
import com.microsoft.graph.models.extensions.EvaluateLabelJobResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitivity Label Evaluate Body.
 */
public class SensitivityLabelEvaluateBody {

    /**
     * The discovered Sensitive Types.
     * 
     */
    @SerializedName(value = "discoveredSensitiveTypes", alternate = {"DiscoveredSensitiveTypes"})
    @Expose
    public java.util.List<DiscoveredSensitiveType> discoveredSensitiveTypes;

    /**
     * The current Label.
     * 
     */
    @SerializedName(value = "currentLabel", alternate = {"CurrentLabel"})
    @Expose
    public CurrentLabel currentLabel;


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
