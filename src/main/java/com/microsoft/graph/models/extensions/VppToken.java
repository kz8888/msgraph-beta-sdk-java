// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.VppTokenSyncStatus;
import com.microsoft.graph.models.generated.VppTokenState;
import com.microsoft.graph.models.extensions.VppTokenActionResult;
import com.microsoft.graph.models.generated.VppTokenAccountType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vpp Token.
 */
public class VppToken extends Entity implements IJsonBackedObject {


    /**
     * The Apple Id.
     * The apple Id associated with the given Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "appleId", alternate = {"AppleId"})
    @Expose
    public String appleId;

    /**
     * The Automatically Update Apps.
     * Whether or not apps for the VPP token will be automatically updated.
     */
    @SerializedName(value = "automaticallyUpdateApps", alternate = {"AutomaticallyUpdateApps"})
    @Expose
    public Boolean automaticallyUpdateApps;

    /**
     * The Claim Token Management From External Mdm.
     * Admin consent to allow claiming token management from external MDM.
     */
    @SerializedName(value = "claimTokenManagementFromExternalMdm", alternate = {"ClaimTokenManagementFromExternalMdm"})
    @Expose
    public Boolean claimTokenManagementFromExternalMdm;

    /**
     * The Country Or Region.
     * Whether or not apps for the VPP token will be automatically updated.
     */
    @SerializedName(value = "countryOrRegion", alternate = {"CountryOrRegion"})
    @Expose
    public String countryOrRegion;

    /**
     * The Data Sharing Consent Granted.
     * Consent granted for data sharing with the Apple Volume Purchase Program.
     */
    @SerializedName(value = "dataSharingConsentGranted", alternate = {"DataSharingConsentGranted"})
    @Expose
    public Boolean dataSharingConsentGranted;

    /**
     * The Display Name.
     * An admin specified token friendly name.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Expiration Date Time.
     * The expiration date time of the Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "expirationDateTime", alternate = {"ExpirationDateTime"})
    @Expose
    public java.util.Calendar expirationDateTime;

    /**
     * The Last Modified Date Time.
     * Last modification date time associated with the Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Last Sync Date Time.
     * The last time when an application sync was done with the Apple volume purchase program service using the the Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "lastSyncDateTime", alternate = {"LastSyncDateTime"})
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Last Sync Status.
     * Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token. Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
     */
    @SerializedName(value = "lastSyncStatus", alternate = {"LastSyncStatus"})
    @Expose
    public VppTokenSyncStatus lastSyncStatus;

    /**
     * The Location Name.
     * Token location returned from Apple VPP.
     */
    @SerializedName(value = "locationName", alternate = {"LocationName"})
    @Expose
    public String locationName;

    /**
     * The Organization Name.
     * The organization associated with the Apple Volume Purchase Program Token
     */
    @SerializedName(value = "organizationName", alternate = {"OrganizationName"})
    @Expose
    public String organizationName;

    /**
     * The Role Scope Tag Ids.
     * Role Scope Tags IDs assigned to this entity.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The State.
     * Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM, duplicateLocationId.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
    public VppTokenState state;

    /**
     * The Token.
     * The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
     */
    @SerializedName(value = "token", alternate = {"Token"})
    @Expose
    public String token;

    /**
     * The Token Action Results.
     * The collection of statuses of the actions performed on the Apple Volume Purchase Program Token.
     */
    @SerializedName(value = "tokenActionResults", alternate = {"TokenActionResults"})
    @Expose
    public java.util.List<VppTokenActionResult> tokenActionResults;

    /**
     * The Vpp Token Account Type.
     * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: business, education. Possible values are: business, education.
     */
    @SerializedName(value = "vppTokenAccountType", alternate = {"VppTokenAccountType"})
    @Expose
    public VppTokenAccountType vppTokenAccountType;


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
