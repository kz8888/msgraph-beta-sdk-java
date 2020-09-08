// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.extensions.ManagementConditionExpression;
import com.microsoft.graph.models.extensions.ManagementCondition;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Statement.
 */
public class ManagementConditionStatement extends Entity implements IJsonBackedObject {


    /**
     * The Applicable Platforms.
     * This is calculated from looking the management conditions associated to the management condition statement and finding the intersection of applicable platforms.
     */
    @SerializedName("applicablePlatforms")
    @Expose
    public java.util.List<DevicePlatformType> applicablePlatforms;

    /**
     * The Created Date Time.
     * The time the management condition statement was created. Generated service side.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * The admin defined description of the management condition statement.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * The admin defined name of the management condition statement.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The ETag.
     * ETag of the management condition statement. Updated service side.
     */
    @SerializedName("eTag")
    @Expose
    public String eTag;

    /**
     * The Expression.
     * The management condition statement expression used to evaluate if a management condition statement was activated/deactivated.
     */
    @SerializedName("expression")
    @Expose
    public ManagementConditionExpression expression;

    /**
     * The Modified Date Time.
     * The time the management condition statement was last modified. Updated service side.
     */
    @SerializedName("modifiedDateTime")
    @Expose
    public java.util.Calendar modifiedDateTime;

    /**
     * The Management Conditions.
     * The management conditions associated to the management condition statement.
     */
    public ManagementConditionCollectionPage managementConditions;


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


        if (json.has("managementConditions")) {
            final ManagementConditionCollectionResponse response = new ManagementConditionCollectionResponse();
            if (json.has("managementConditions@odata.nextLink")) {
                response.nextLink = json.get("managementConditions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managementConditions").toString(), JsonObject[].class);
            final ManagementCondition[] array = new ManagementCondition[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagementCondition.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managementConditions = new ManagementConditionCollectionPage(response, null);
        }
    }
}
