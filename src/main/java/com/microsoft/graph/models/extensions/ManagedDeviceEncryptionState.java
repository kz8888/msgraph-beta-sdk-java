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
import com.microsoft.graph.models.generated.AdvancedBitLockerState;
import com.microsoft.graph.models.generated.DeviceTypes;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.generated.EncryptionReadinessState;
import com.microsoft.graph.models.generated.EncryptionState;
import com.microsoft.graph.models.generated.FileVaultState;
import com.microsoft.graph.models.extensions.EncryptionReportPolicyDetails;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Encryption State.
 */
public class ManagedDeviceEncryptionState extends Entity implements IJsonBackedObject {


    /**
     * The Advanced Bit Locker States.
     * Advanced BitLocker State
     */
    @SerializedName(value = "advancedBitLockerStates", alternate = {"AdvancedBitLockerStates"})
    @Expose
	@Nullable
    public EnumSet<AdvancedBitLockerState> advancedBitLockerStates;

    /**
     * The Device Name.
     * Device name
     */
    @SerializedName(value = "deviceName", alternate = {"DeviceName"})
    @Expose
	@Nullable
    public String deviceName;

    /**
     * The Device Type.
     * Platform of the device.
     */
    @SerializedName(value = "deviceType", alternate = {"DeviceType"})
    @Expose
	@Nullable
    public DeviceTypes deviceType;

    /**
     * The Encryption Policy Setting State.
     * Encryption policy setting state
     */
    @SerializedName(value = "encryptionPolicySettingState", alternate = {"EncryptionPolicySettingState"})
    @Expose
	@Nullable
    public ComplianceStatus encryptionPolicySettingState;

    /**
     * The Encryption Readiness State.
     * Encryption readiness state
     */
    @SerializedName(value = "encryptionReadinessState", alternate = {"EncryptionReadinessState"})
    @Expose
	@Nullable
    public EncryptionReadinessState encryptionReadinessState;

    /**
     * The Encryption State.
     * Device encryption state
     */
    @SerializedName(value = "encryptionState", alternate = {"EncryptionState"})
    @Expose
	@Nullable
    public EncryptionState encryptionState;

    /**
     * The File Vault States.
     * FileVault State
     */
    @SerializedName(value = "fileVaultStates", alternate = {"FileVaultStates"})
    @Expose
	@Nullable
    public EnumSet<FileVaultState> fileVaultStates;

    /**
     * The Os Version.
     * Operating system version of the device
     */
    @SerializedName(value = "osVersion", alternate = {"OsVersion"})
    @Expose
	@Nullable
    public String osVersion;

    /**
     * The Policy Details.
     * Policy Details
     */
    @SerializedName(value = "policyDetails", alternate = {"PolicyDetails"})
    @Expose
	@Nullable
    public java.util.List<EncryptionReportPolicyDetails> policyDetails;

    /**
     * The Tpm Specification Version.
     * Device TPM Version
     */
    @SerializedName(value = "tpmSpecificationVersion", alternate = {"TpmSpecificationVersion"})
    @Expose
	@Nullable
    public String tpmSpecificationVersion;

    /**
     * The User Principal Name.
     * User name
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


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
