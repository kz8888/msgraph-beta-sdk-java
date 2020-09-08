// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RiskDetail;
import com.microsoft.graph.models.generated.RiskLevel;
import com.microsoft.graph.models.generated.RiskState;
import com.microsoft.graph.models.extensions.RiskyUserHistoryItem;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.RiskyUserHistoryItemCollectionResponse;
import com.microsoft.graph.requests.extensions.RiskyUserHistoryItemCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Risky User.
 */
public class RiskyUser extends Entity implements IJsonBackedObject {


    /**
     * The Is Deleted.
     * Indicates whether the user is deleted. Possible values are: true, false
     */
    @SerializedName("isDeleted")
    @Expose
    public Boolean isDeleted;

    /**
     * The Is Processing.
     * Indicates wehther a user's risky state is being processed by the backend
     */
    @SerializedName("isProcessing")
    @Expose
    public Boolean isProcessing;

    /**
     * The Risk Detail.
     * Details of the detected risk. Possible values are: none, adminGeneratedTemporaryPassword, userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe, userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden, adminConfirmedUserCompromised, unknownFutureValue.
     */
    @SerializedName("riskDetail")
    @Expose
    public RiskDetail riskDetail;

    /**
     * The Risk Last Updated Date Time.
     * The date and time that the risky user was last updated.
     */
    @SerializedName("riskLastUpdatedDateTime")
    @Expose
    public java.util.Calendar riskLastUpdatedDateTime;

    /**
     * The Risk Level.
     * Level of the detected risky user. Possible values are: low, medium, high, hidden, none, unknownFutureValue.
     */
    @SerializedName("riskLevel")
    @Expose
    public RiskLevel riskLevel;

    /**
     * The Risk State.
     * State of the user's risk. Possible values are: none, confirmedSafe, remediated, dismissed, atRisk, confirmedCompromised, unknownFutureValue.
     */
    @SerializedName("riskState")
    @Expose
    public RiskState riskState;

    /**
     * The User Display Name.
     * Risky user display name.
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The User Principal Name.
     * Risky user principal name.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The History.
     * The activity related to user risk level change
     */
    public RiskyUserHistoryItemCollectionPage history;


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


        if (json.has("history")) {
            final RiskyUserHistoryItemCollectionResponse response = new RiskyUserHistoryItemCollectionResponse();
            if (json.has("history@odata.nextLink")) {
                response.nextLink = json.get("history@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("history").toString(), JsonObject[].class);
            final RiskyUserHistoryItem[] array = new RiskyUserHistoryItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RiskyUserHistoryItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            history = new RiskyUserHistoryItemCollectionPage(response, null);
        }
    }
}
