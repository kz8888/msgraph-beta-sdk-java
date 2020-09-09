// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.EducationSubmissionRecipient;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.generated.EducationSubmissionStatus;
import com.microsoft.graph.models.extensions.EducationOutcome;
import com.microsoft.graph.models.extensions.EducationSubmissionResource;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.EducationOutcomeCollectionResponse;
import com.microsoft.graph.requests.extensions.EducationOutcomeCollectionPage;
import com.microsoft.graph.requests.extensions.EducationSubmissionResourceCollectionResponse;
import com.microsoft.graph.requests.extensions.EducationSubmissionResourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Submission.
 */
public class EducationSubmission extends Entity implements IJsonBackedObject {


    /**
     * The Recipient.
     * 
     */
    @SerializedName("recipient")
    @Expose
    public EducationSubmissionRecipient recipient;

    /**
     * The Released By.
     * 
     */
    @SerializedName("releasedBy")
    @Expose
    public IdentitySet releasedBy;

    /**
     * The Released Date Time.
     * 
     */
    @SerializedName("releasedDateTime")
    @Expose
    public java.util.Calendar releasedDateTime;

    /**
     * The Resources Folder Url.
     * 
     */
    @SerializedName("resourcesFolderUrl")
    @Expose
    public String resourcesFolderUrl;

    /**
     * The Returned By.
     * 
     */
    @SerializedName("returnedBy")
    @Expose
    public IdentitySet returnedBy;

    /**
     * The Returned Date Time.
     * 
     */
    @SerializedName("returnedDateTime")
    @Expose
    public java.util.Calendar returnedDateTime;

    /**
     * The Status.
     * 
     */
    @SerializedName("status")
    @Expose
    public EducationSubmissionStatus status;

    /**
     * The Submitted By.
     * 
     */
    @SerializedName("submittedBy")
    @Expose
    public IdentitySet submittedBy;

    /**
     * The Submitted Date Time.
     * 
     */
    @SerializedName("submittedDateTime")
    @Expose
    public java.util.Calendar submittedDateTime;

    /**
     * The Unsubmitted By.
     * 
     */
    @SerializedName("unsubmittedBy")
    @Expose
    public IdentitySet unsubmittedBy;

    /**
     * The Unsubmitted Date Time.
     * 
     */
    @SerializedName("unsubmittedDateTime")
    @Expose
    public java.util.Calendar unsubmittedDateTime;

    /**
     * The Outcomes.
     * 
     */
    public EducationOutcomeCollectionPage outcomes;

    /**
     * The Resources.
     * 
     */
    public EducationSubmissionResourceCollectionPage resources;

    /**
     * The Submitted Resources.
     * 
     */
    public EducationSubmissionResourceCollectionPage submittedResources;


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


        if (json.has("outcomes")) {
            final EducationOutcomeCollectionResponse response = new EducationOutcomeCollectionResponse();
            if (json.has("outcomes@odata.nextLink")) {
                response.nextLink = json.get("outcomes@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("outcomes").toString(), JsonObject[].class);
            final EducationOutcome[] array = new EducationOutcome[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationOutcome.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            outcomes = new EducationOutcomeCollectionPage(response, null);
        }

        if (json.has("resources")) {
            final EducationSubmissionResourceCollectionResponse response = new EducationSubmissionResourceCollectionResponse();
            if (json.has("resources@odata.nextLink")) {
                response.nextLink = json.get("resources@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("resources").toString(), JsonObject[].class);
            final EducationSubmissionResource[] array = new EducationSubmissionResource[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationSubmissionResource.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            resources = new EducationSubmissionResourceCollectionPage(response, null);
        }

        if (json.has("submittedResources")) {
            final EducationSubmissionResourceCollectionResponse response = new EducationSubmissionResourceCollectionResponse();
            if (json.has("submittedResources@odata.nextLink")) {
                response.nextLink = json.get("submittedResources@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("submittedResources").toString(), JsonObject[].class);
            final EducationSubmissionResource[] array = new EducationSubmissionResource[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationSubmissionResource.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            submittedResources = new EducationSubmissionResourceCollectionPage(response, null);
        }
    }
}
