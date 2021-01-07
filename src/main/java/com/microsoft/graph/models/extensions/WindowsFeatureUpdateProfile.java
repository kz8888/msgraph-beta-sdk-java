// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.WindowsFeatureUpdateProfileAssignment;
import com.microsoft.graph.models.extensions.WindowsUpdateState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsUpdateStateCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Feature Update Profile.
 */
public class WindowsFeatureUpdateProfile extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date time that the profile was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * The description of the profile which is specified by the user.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * The display name of the profile.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Feature Update Version.
     * The feature update version that will be deployed to the devices targeted by this profile. The version could be any supported version for example 1709, 1803 or 1809 and so on.
     */
    @SerializedName(value = "featureUpdateVersion", alternate = {"FeatureUpdateVersion"})
    @Expose
	@Nullable
    public String featureUpdateVersion;

    /**
     * The Last Modified Date Time.
     * The date time that the profile was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Feature Update entity.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
	@Nullable
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Assignments.
     * The list of group assignments of the profile.
     */
    @SerializedName(value = "assignments", alternate = {"Assignments"})
    @Expose
	@Nullable
    public WindowsFeatureUpdateProfileAssignmentCollectionPage assignments;

    /**
     * The Device Update States.
     * The list of device states this profile targeted to
     */
    @SerializedName(value = "deviceUpdateStates", alternate = {"DeviceUpdateStates"})
    @Expose
	@Nullable
    public WindowsUpdateStateCollectionPage deviceUpdateStates;


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


        if (json.has("assignments")) {
            assignments = serializer.deserializeObject(json.get("assignments").toString(), WindowsFeatureUpdateProfileAssignmentCollectionPage.class);
        }

        if (json.has("deviceUpdateStates")) {
            deviceUpdateStates = serializer.deserializeObject(json.get("deviceUpdateStates").toString(), WindowsUpdateStateCollectionPage.class);
        }
    }
}
