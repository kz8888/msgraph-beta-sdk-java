// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerEnrollmentMode;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerEnrollmentTokenType;
import com.microsoft.graph.models.extensions.MimeContent;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Enrollment Profile.
 */
public class AndroidDeviceOwnerEnrollmentProfile extends Entity implements IJsonBackedObject {


    /**
     * The Account Id.
     * Tenant GUID the enrollment profile belongs to.
     */
    @SerializedName(value = "accountId", alternate = {"AccountId"})
    @Expose
    public String accountId;

    /**
     * The Created Date Time.
     * Date time the enrollment profile was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * Description for the enrollment profile.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
    public String description;

    /**
     * The Display Name.
     * Display name for the enrollment profile.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
    public String displayName;

    /**
     * The Enrolled Device Count.
     * Total number of Android devices that have enrolled using this enrollment profile.
     */
    @SerializedName(value = "enrolledDeviceCount", alternate = {"EnrolledDeviceCount"})
    @Expose
    public Integer enrolledDeviceCount;

    /**
     * The Enrollment Mode.
     * The enrollment mode of devices that use this enrollment profile. Possible values are: corporateOwnedDedicatedDevice, corporateOwnedFullyManaged, corporateOwnedWorkProfile, corporateOwnedAOSPUserlessDevice.
     */
    @SerializedName(value = "enrollmentMode", alternate = {"EnrollmentMode"})
    @Expose
    public AndroidDeviceOwnerEnrollmentMode enrollmentMode;

    /**
     * The Enrollment Token Type.
     * The enrollment token type for an enrollment profile. Possible values are: default, corporateOwnedDedicatedDeviceWithAzureADSharedMode.
     */
    @SerializedName(value = "enrollmentTokenType", alternate = {"EnrollmentTokenType"})
    @Expose
    public AndroidDeviceOwnerEnrollmentTokenType enrollmentTokenType;

    /**
     * The Last Modified Date Time.
     * Date time the enrollment profile was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Qr Code Content.
     * String used to generate a QR code for the token.
     */
    @SerializedName(value = "qrCodeContent", alternate = {"QrCodeContent"})
    @Expose
    public String qrCodeContent;

    /**
     * The Qr Code Image.
     * String used to generate a QR code for the token.
     */
    @SerializedName(value = "qrCodeImage", alternate = {"QrCodeImage"})
    @Expose
    public MimeContent qrCodeImage;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName(value = "roleScopeTagIds", alternate = {"RoleScopeTagIds"})
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Token Creation Date Time.
     * Date time the most recently created token was created.
     */
    @SerializedName(value = "tokenCreationDateTime", alternate = {"TokenCreationDateTime"})
    @Expose
    public java.util.Calendar tokenCreationDateTime;

    /**
     * The Token Expiration Date Time.
     * Date time the most recently created token will expire.
     */
    @SerializedName(value = "tokenExpirationDateTime", alternate = {"TokenExpirationDateTime"})
    @Expose
    public java.util.Calendar tokenExpirationDateTime;

    /**
     * The Token Value.
     * Value of the most recently created token for this enrollment profile.
     */
    @SerializedName(value = "tokenValue", alternate = {"TokenValue"})
    @Expose
    public String tokenValue;


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
