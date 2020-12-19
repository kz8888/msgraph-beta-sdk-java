// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.SecurityBaselineCategoryStateSummary;
import com.microsoft.graph.models.extensions.SecurityBaselineDeviceState;
import com.microsoft.graph.models.extensions.SecurityBaselineStateSummary;
import com.microsoft.graph.models.extensions.DeviceManagementTemplate;
import com.microsoft.graph.requests.extensions.SecurityBaselineCategoryStateSummaryCollectionPage;
import com.microsoft.graph.requests.extensions.SecurityBaselineDeviceStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Template.
 */
public class SecurityBaselineTemplate extends DeviceManagementTemplate implements IJsonBackedObject {


    /**
     * The Category Device State Summaries.
     * The security baseline per category device state summary
     */
    @SerializedName(value = "categoryDeviceStateSummaries", alternate = {"CategoryDeviceStateSummaries"})
    @Expose
    public SecurityBaselineCategoryStateSummaryCollectionPage categoryDeviceStateSummaries;

    /**
     * The Device States.
     * The security baseline device states
     */
    @SerializedName(value = "deviceStates", alternate = {"DeviceStates"})
    @Expose
    public SecurityBaselineDeviceStateCollectionPage deviceStates;

    /**
     * The Device State Summary.
     * The security baseline device state summary
     */
    @SerializedName(value = "deviceStateSummary", alternate = {"DeviceStateSummary"})
    @Expose
    public SecurityBaselineStateSummary deviceStateSummary;


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


        if (json.has("categoryDeviceStateSummaries")) {
            categoryDeviceStateSummaries = serializer.deserializeObject(json.get("categoryDeviceStateSummaries").toString(), SecurityBaselineCategoryStateSummaryCollectionPage.class);
        }

        if (json.has("deviceStates")) {
            deviceStates = serializer.deserializeObject(json.get("deviceStates").toString(), SecurityBaselineDeviceStateCollectionPage.class);
        }
    }
}
