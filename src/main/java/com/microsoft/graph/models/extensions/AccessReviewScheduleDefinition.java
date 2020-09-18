// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserIdentity;
import com.microsoft.graph.models.extensions.AccessReviewScope;
import com.microsoft.graph.models.extensions.AccessReviewReviewerScope;
import com.microsoft.graph.models.extensions.AccessReviewScheduleSettings;
import com.microsoft.graph.models.extensions.AccessReviewInstance;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceCollectionResponse;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Definition.
 */
public class AccessReviewScheduleDefinition extends Entity implements IJsonBackedObject {


    /**
     * The Created By.
     * 
     */
    @SerializedName("createdBy")
    @Expose
    public UserIdentity createdBy;

    /**
     * The Created Date Time.
     * 
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description For Admins.
     * 
     */
    @SerializedName("descriptionForAdmins")
    @Expose
    public String descriptionForAdmins;

    /**
     * The Description For Reviewers.
     * 
     */
    @SerializedName("descriptionForReviewers")
    @Expose
    public String descriptionForReviewers;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Instance Enumeration Scope.
     * 
     */
    @SerializedName("instanceEnumerationScope")
    @Expose
    public AccessReviewScope instanceEnumerationScope;

    /**
     * The Last Modified Date Time.
     * 
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Reviewers.
     * 
     */
    @SerializedName("reviewers")
    @Expose
    public java.util.List<AccessReviewReviewerScope> reviewers;

    /**
     * The Scope.
     * 
     */
    @SerializedName("scope")
    @Expose
    public AccessReviewScope scope;

    /**
     * The Settings.
     * 
     */
    @SerializedName("settings")
    @Expose
    public AccessReviewScheduleSettings settings;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public String status;

    /**
     * The Instances.
     * 
     */
    @SerializedName("instances")
    @Expose
    public AccessReviewInstanceCollectionPage instances;


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


        if (json.has("instances")) {
            final AccessReviewInstanceCollectionResponse response = new AccessReviewInstanceCollectionResponse();
            if (json.has("instances@odata.nextLink")) {
                response.nextLink = json.get("instances@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("instances").toString(), JsonObject[].class);
            final AccessReviewInstance[] array = new AccessReviewInstance[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), AccessReviewInstance.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            instances = new AccessReviewInstanceCollectionPage(response, null);
        }
    }
}
