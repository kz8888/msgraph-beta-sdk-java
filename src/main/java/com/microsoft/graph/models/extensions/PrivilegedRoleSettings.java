// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Settings.
 */
public class PrivilegedRoleSettings extends Entity implements IJsonBackedObject {


    /**
     * The Approval On Elevation.
     * true if the approval is required when activate the role. false if the approval is not required when activate the role.
     */
    @SerializedName(value = "approvalOnElevation", alternate = {"ApprovalOnElevation"})
    @Expose
    public Boolean approvalOnElevation;

    /**
     * The Approver Ids.
     * List of Approval ids, if approval is required for activation.
     */
    @SerializedName(value = "approverIds", alternate = {"ApproverIds"})
    @Expose
    public java.util.List<String> approverIds;

    /**
     * The Elevation Duration.
     * The duration when the role is activated.
     */
    @SerializedName(value = "elevationDuration", alternate = {"ElevationDuration"})
    @Expose
    public javax.xml.datatype.Duration elevationDuration;

    /**
     * The Is Mfa On Elevation Configurable.
     * true if mfaOnElevation is configurable. false if mfaOnElevation is not configurable.
     */
    @SerializedName(value = "isMfaOnElevationConfigurable", alternate = {"IsMfaOnElevationConfigurable"})
    @Expose
    public Boolean isMfaOnElevationConfigurable;

    /**
     * The Last Global Admin.
     * Internal used only.
     */
    @SerializedName(value = "lastGlobalAdmin", alternate = {"LastGlobalAdmin"})
    @Expose
    public Boolean lastGlobalAdmin;

    /**
     * The Max Elavation Duration.
     * Maximal duration for the activated role.
     */
    @SerializedName(value = "maxElavationDuration", alternate = {"MaxElavationDuration"})
    @Expose
    public javax.xml.datatype.Duration maxElavationDuration;

    /**
     * The Mfa On Elevation.
     * true if MFA is required to activate the role. false if MFA is not required to activate the role.
     */
    @SerializedName(value = "mfaOnElevation", alternate = {"MfaOnElevation"})
    @Expose
    public Boolean mfaOnElevation;

    /**
     * The Min Elevation Duration.
     * Minimal duration for the activated role.
     */
    @SerializedName(value = "minElevationDuration", alternate = {"MinElevationDuration"})
    @Expose
    public javax.xml.datatype.Duration minElevationDuration;

    /**
     * The Notification To User On Elevation.
     * true if send notification to the end user when the role is activated. false if do not send notification when the role is activated.
     */
    @SerializedName(value = "notificationToUserOnElevation", alternate = {"NotificationToUserOnElevation"})
    @Expose
    public Boolean notificationToUserOnElevation;

    /**
     * The Ticketing Info On Elevation.
     * true if the ticketing information is required when activate the role. false if the ticketing information is not required when activate the role.
     */
    @SerializedName(value = "ticketingInfoOnElevation", alternate = {"TicketingInfoOnElevation"})
    @Expose
    public Boolean ticketingInfoOnElevation;


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
