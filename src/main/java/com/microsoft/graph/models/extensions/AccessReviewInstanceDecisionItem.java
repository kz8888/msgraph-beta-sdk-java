// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.UserIdentity;
import com.microsoft.graph.models.extensions.AccessReviewInstanceDecisionItemTarget;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Decision Item.
 */
public class AccessReviewInstanceDecisionItem extends Entity implements IJsonBackedObject {


    /**
     * The Access Review Id.
     * 
     */
    @SerializedName(value = "accessReviewId", alternate = {"AccessReviewId"})
    @Expose
	@Nullable
    public String accessReviewId;

    /**
     * The Applied By.
     * 
     */
    @SerializedName(value = "appliedBy", alternate = {"AppliedBy"})
    @Expose
	@Nullable
    public UserIdentity appliedBy;

    /**
     * The Applied Date Time.
     * 
     */
    @SerializedName(value = "appliedDateTime", alternate = {"AppliedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar appliedDateTime;

    /**
     * The Apply Result.
     * 
     */
    @SerializedName(value = "applyResult", alternate = {"ApplyResult"})
    @Expose
	@Nullable
    public String applyResult;

    /**
     * The Decision.
     * 
     */
    @SerializedName(value = "decision", alternate = {"Decision"})
    @Expose
	@Nullable
    public String decision;

    /**
     * The Justification.
     * 
     */
    @SerializedName(value = "justification", alternate = {"Justification"})
    @Expose
	@Nullable
    public String justification;

    /**
     * The Recommendation.
     * 
     */
    @SerializedName(value = "recommendation", alternate = {"Recommendation"})
    @Expose
	@Nullable
    public String recommendation;

    /**
     * The Reviewed By.
     * 
     */
    @SerializedName(value = "reviewedBy", alternate = {"ReviewedBy"})
    @Expose
	@Nullable
    public UserIdentity reviewedBy;

    /**
     * The Reviewed Date Time.
     * 
     */
    @SerializedName(value = "reviewedDateTime", alternate = {"ReviewedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar reviewedDateTime;

    /**
     * The Target.
     * 
     */
    @SerializedName(value = "target", alternate = {"Target"})
    @Expose
	@Nullable
    public AccessReviewInstanceDecisionItemTarget target;


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

    }
}
