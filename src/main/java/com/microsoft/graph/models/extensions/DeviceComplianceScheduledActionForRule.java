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
import com.microsoft.graph.models.extensions.DeviceComplianceActionItem;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Scheduled Action For Rule.
 */
public class DeviceComplianceScheduledActionForRule extends Entity implements IJsonBackedObject {


    /**
     * The Rule Name.
     * Name of the rule which this scheduled action applies to.
     */
    @SerializedName(value = "ruleName", alternate = {"RuleName"})
    @Expose
	@Nullable
    public String ruleName;

    /**
     * The Scheduled Action Configurations.
     * The list of scheduled action configurations for this compliance policy.
     */
    @SerializedName(value = "scheduledActionConfigurations", alternate = {"ScheduledActionConfigurations"})
    @Expose
	@Nullable
    public DeviceComplianceActionItemCollectionPage scheduledActionConfigurations;


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


        if (json.has("scheduledActionConfigurations")) {
            scheduledActionConfigurations = serializer.deserializeObject(json.get("scheduledActionConfigurations").toString(), DeviceComplianceActionItemCollectionPage.class);
        }
    }
}
