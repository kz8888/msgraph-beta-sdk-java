// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AccessReviewScope;
import com.microsoft.graph.models.extensions.AccessReviewInstanceDecisionItem;
import com.microsoft.graph.models.extensions.AccessReviewScheduleDefinition;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceDecisionItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance.
 */
public class AccessReviewInstance extends Entity implements IJsonBackedObject {


    /**
     * The End Date Time.
     * DateTime when review instance is scheduled to end.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Scope.
     * Created based on scope and instanceEnumerationScope at the accessReviewScheduleDefinition level. Defines the scope of users reviewed in a group. In the case of a single-group review, the scope defined at the accessReviewScheduleDefinition level applies to all instances. In the case of all groups review, scope may be different for each group. Read-only.
     */
    @SerializedName(value = "scope", alternate = {"Scope"})
    @Expose
    public AccessReviewScope scope;

    /**
     * The Start Date Time.
     * DateTime when review instance is scheduled to start. May be in the future.
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The Status.
     * Specifies the status of an accessReview. The typical states include Initializing, NotStarted, Starting, InProgress, Completing, Completed, AutoReviewing, and AutoReviewed.  Read-only.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
    public String status;

    /**
     * The Decisions.
     * Each user reviewed in an accessReviewInstance has a decision item representing if their access was approved, denied, or not yet reviewed.
     */
    @SerializedName(value = "decisions", alternate = {"Decisions"})
    @Expose
    public AccessReviewInstanceDecisionItemCollectionPage decisions;

    /**
     * The Definition.
     * There is exactly one accessReviewScheduleDefinition associated with each instance. It is the parent schedule for the instance, where instances are created for each recurrence of a review definition and each group selected to review by the definition.
     */
    @SerializedName(value = "definition", alternate = {"Definition"})
    @Expose
    public AccessReviewScheduleDefinition definition;


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


        if (json.has("decisions")) {
            decisions = serializer.deserializeObject(json.get("decisions").toString(), AccessReviewInstanceDecisionItemCollectionPage.class);
        }
    }
}
