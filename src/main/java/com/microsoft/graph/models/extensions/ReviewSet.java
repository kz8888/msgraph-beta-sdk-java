// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ReviewSetQuery;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ReviewSetQueryCollectionResponse;
import com.microsoft.graph.requests.extensions.ReviewSetQueryCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set.
 */
public class ReviewSet extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * 
     */
    @SerializedName("createdBy")
    @Expose
    public String createdBy;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Queries.
     * 
     */
    public ReviewSetQueryCollectionPage queries;


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


        if (json.has("queries")) {
            final ReviewSetQueryCollectionResponse response = new ReviewSetQueryCollectionResponse();
            if (json.has("queries@odata.nextLink")) {
                response.nextLink = json.get("queries@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("queries").toString(), JsonObject[].class);
            final ReviewSetQuery[] array = new ReviewSetQuery[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ReviewSetQuery.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            queries = new ReviewSetQueryCollectionPage(response, null);
        }
    }
}