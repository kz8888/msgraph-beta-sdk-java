// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AllowInvitesFrom;
import com.microsoft.graph.models.extensions.DefaultUserRolePermissions;
import com.microsoft.graph.models.extensions.PolicyBase;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authorization Policy.
 */
public class AuthorizationPolicy extends PolicyBase implements IJsonBackedObject {


    /**
     * The Allowed To Sign Up Email Based Subscriptions.
     * 
     */
    @SerializedName("allowedToSignUpEmailBasedSubscriptions")
    @Expose
    public Boolean allowedToSignUpEmailBasedSubscriptions;

    /**
     * The Allowed To Use SSPR.
     * 
     */
    @SerializedName("allowedToUseSSPR")
    @Expose
    public Boolean allowedToUseSSPR;

    /**
     * The Allow Email Verified Users To Join Organization.
     * 
     */
    @SerializedName("allowEmailVerifiedUsersToJoinOrganization")
    @Expose
    public Boolean allowEmailVerifiedUsersToJoinOrganization;

    /**
     * The Allow Invites From.
     * 
     */
    @SerializedName("allowInvitesFrom")
    @Expose
    public AllowInvitesFrom allowInvitesFrom;

    /**
     * The Block Msol Power Shell.
     * 
     */
    @SerializedName("blockMsolPowerShell")
    @Expose
    public Boolean blockMsolPowerShell;

    /**
     * The Default User Role Permissions.
     * 
     */
    @SerializedName("defaultUserRolePermissions")
    @Expose
    public DefaultUserRolePermissions defaultUserRolePermissions;

    /**
     * The Enabled Preview Features.
     * 
     */
    @SerializedName("enabledPreviewFeatures")
    @Expose
    public java.util.List<String> enabledPreviewFeatures;

    /**
     * The Guest User Role Id.
     * 
     */
    @SerializedName("guestUserRoleId")
    @Expose
    public java.util.UUID guestUserRoleId;

    /**
     * The Permission Grant Policy Ids Assigned To Default User Role.
     * 
     */
    @SerializedName("permissionGrantPolicyIdsAssignedToDefaultUserRole")
    @Expose
    public java.util.List<String> permissionGrantPolicyIdsAssignedToDefaultUserRole;


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
