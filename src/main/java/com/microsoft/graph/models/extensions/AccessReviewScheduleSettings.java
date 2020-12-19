// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.AccessReviewApplyAction;
import com.microsoft.graph.models.extensions.PatternedRecurrence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Settings.
 */
public class AccessReviewScheduleSettings implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Apply Actions.
     * 
     */
    @SerializedName(value = "applyActions", alternate = {"ApplyActions"})
    @Expose
    public java.util.List<AccessReviewApplyAction> applyActions;

    /**
     * The Auto Apply Decisions Enabled.
     * 
     */
    @SerializedName(value = "autoApplyDecisionsEnabled", alternate = {"AutoApplyDecisionsEnabled"})
    @Expose
    public Boolean autoApplyDecisionsEnabled;

    /**
     * The Default Decision.
     * 
     */
    @SerializedName(value = "defaultDecision", alternate = {"DefaultDecision"})
    @Expose
    public String defaultDecision;

    /**
     * The Default Decision Enabled.
     * 
     */
    @SerializedName(value = "defaultDecisionEnabled", alternate = {"DefaultDecisionEnabled"})
    @Expose
    public Boolean defaultDecisionEnabled;

    /**
     * The Instance Duration In Days.
     * 
     */
    @SerializedName(value = "instanceDurationInDays", alternate = {"InstanceDurationInDays"})
    @Expose
    public Integer instanceDurationInDays;

    /**
     * The Justification Required On Approval.
     * 
     */
    @SerializedName(value = "justificationRequiredOnApproval", alternate = {"JustificationRequiredOnApproval"})
    @Expose
    public Boolean justificationRequiredOnApproval;

    /**
     * The Mail Notifications Enabled.
     * 
     */
    @SerializedName(value = "mailNotificationsEnabled", alternate = {"MailNotificationsEnabled"})
    @Expose
    public Boolean mailNotificationsEnabled;

    /**
     * The Recommendations Enabled.
     * 
     */
    @SerializedName(value = "recommendationsEnabled", alternate = {"RecommendationsEnabled"})
    @Expose
    public Boolean recommendationsEnabled;

    /**
     * The Recurrence.
     * 
     */
    @SerializedName(value = "recurrence", alternate = {"Recurrence"})
    @Expose
    public PatternedRecurrence recurrence;

    /**
     * The Reminder Notifications Enabled.
     * 
     */
    @SerializedName(value = "reminderNotificationsEnabled", alternate = {"ReminderNotificationsEnabled"})
    @Expose
    public Boolean reminderNotificationsEnabled;


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
