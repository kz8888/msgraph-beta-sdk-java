// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CaseStatus;
import com.microsoft.graph.models.extensions.ReviewSet;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ReviewSetCollectionResponse;
import com.microsoft.graph.requests.extensions.ReviewSetCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Case.
 */
public class EdiscoveryCase extends Entity implements IJsonBackedObject {


    /**
     * The Closed By.
     * 
     */
    @SerializedName("closedBy")
    @Expose
    public String closedBy;

    /**
     * The Closed Date Time.
     * 
     */
    @SerializedName("closedDateTime")
    @Expose
    public java.util.Calendar closedDateTime;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The External Id.
     * 
     */
    @SerializedName("externalId")
    @Expose
    public String externalId;

    /**
     * The Last Modified By.
     * 
     */
    @SerializedName("lastModifiedBy")
    @Expose
    public String lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public CaseStatus status;

    /**
     * The Review Sets.
     * 
     */
    @SerializedName("reviewSets")
    @Expose
    public ReviewSetCollectionPage reviewSets;


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


        if (json.has("reviewSets")) {
            final ReviewSetCollectionResponse response = new ReviewSetCollectionResponse();
            if (json.has("reviewSets@odata.nextLink")) {
                response.nextLink = json.get("reviewSets@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("reviewSets").toString(), JsonObject[].class);
            final ReviewSet[] array = new ReviewSet[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ReviewSet.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            reviewSets = new ReviewSetCollectionPage(response, null);
        }
    }
}
