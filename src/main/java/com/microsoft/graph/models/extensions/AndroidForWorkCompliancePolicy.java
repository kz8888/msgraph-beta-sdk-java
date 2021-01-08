// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DeviceThreatProtectionLevel;
import com.microsoft.graph.models.generated.AndroidRequiredPasswordType;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Compliance Policy.
 */
public class AndroidForWorkCompliancePolicy extends DeviceCompliancePolicy implements IJsonBackedObject {


    /**
     * The Device Threat Protection Enabled.
     * Require that devices have enabled device threat protection.
     */
    @SerializedName(value = "deviceThreatProtectionEnabled", alternate = {"DeviceThreatProtectionEnabled"})
    @Expose
	@Nullable
    public Boolean deviceThreatProtectionEnabled;

    /**
     * The Device Threat Protection Required Security Level.
     * Require Mobile Threat Protection minimum risk level to report noncompliance.
     */
    @SerializedName(value = "deviceThreatProtectionRequiredSecurityLevel", alternate = {"DeviceThreatProtectionRequiredSecurityLevel"})
    @Expose
	@Nullable
    public DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;

    /**
     * The Min Android Security Patch Level.
     * Minimum Android security patch level.
     */
    @SerializedName(value = "minAndroidSecurityPatchLevel", alternate = {"MinAndroidSecurityPatchLevel"})
    @Expose
	@Nullable
    public String minAndroidSecurityPatchLevel;

    /**
     * The Os Maximum Version.
     * Maximum Android version.
     */
    @SerializedName(value = "osMaximumVersion", alternate = {"OsMaximumVersion"})
    @Expose
	@Nullable
    public String osMaximumVersion;

    /**
     * The Os Minimum Version.
     * Minimum Android version.
     */
    @SerializedName(value = "osMinimumVersion", alternate = {"OsMinimumVersion"})
    @Expose
	@Nullable
    public String osMinimumVersion;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires. Valid values 1 to 365
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
	@Nullable
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * Minimum password length. Valid values 4 to 16
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
	@Nullable
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Lock.
     * Minutes of inactivity before a password is required.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeLock", alternate = {"PasswordMinutesOfInactivityBeforeLock"})
    @Expose
	@Nullable
    public Integer passwordMinutesOfInactivityBeforeLock;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 1 to 24
     */
    @SerializedName(value = "passwordPreviousPasswordBlockCount", alternate = {"PasswordPreviousPasswordBlockCount"})
    @Expose
	@Nullable
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Required.
     * Require a password to unlock device.
     */
    @SerializedName(value = "passwordRequired", alternate = {"PasswordRequired"})
    @Expose
	@Nullable
    public Boolean passwordRequired;

    /**
     * The Password Required Type.
     * Type of characters in password
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
	@Nullable
    public AndroidRequiredPasswordType passwordRequiredType;

    /**
     * The Password Sign In Failure Count Before Factory Reset.
     * Number of sign-in failures allowed before factory reset. Valid values 1 to 16
     */
    @SerializedName(value = "passwordSignInFailureCountBeforeFactoryReset", alternate = {"PasswordSignInFailureCountBeforeFactoryReset"})
    @Expose
	@Nullable
    public Integer passwordSignInFailureCountBeforeFactoryReset;

    /**
     * The Security Block Jailbroken Devices.
     * Devices must not be jailbroken or rooted.
     */
    @SerializedName(value = "securityBlockJailbrokenDevices", alternate = {"SecurityBlockJailbrokenDevices"})
    @Expose
	@Nullable
    public Boolean securityBlockJailbrokenDevices;

    /**
     * The Security Disable Usb Debugging.
     * Disable USB debugging on Android devices.
     */
    @SerializedName(value = "securityDisableUsbDebugging", alternate = {"SecurityDisableUsbDebugging"})
    @Expose
	@Nullable
    public Boolean securityDisableUsbDebugging;

    /**
     * The Security Prevent Install Apps From Unknown Sources.
     * Require that devices disallow installation of apps from unknown sources.
     */
    @SerializedName(value = "securityPreventInstallAppsFromUnknownSources", alternate = {"SecurityPreventInstallAppsFromUnknownSources"})
    @Expose
	@Nullable
    public Boolean securityPreventInstallAppsFromUnknownSources;

    /**
     * The Security Require Company Portal App Integrity.
     * Require the device to pass the Company Portal client app runtime integrity check.
     */
    @SerializedName(value = "securityRequireCompanyPortalAppIntegrity", alternate = {"SecurityRequireCompanyPortalAppIntegrity"})
    @Expose
	@Nullable
    public Boolean securityRequireCompanyPortalAppIntegrity;

    /**
     * The Security Require Google Play Services.
     * Require Google Play Services to be installed and enabled on the device.
     */
    @SerializedName(value = "securityRequireGooglePlayServices", alternate = {"SecurityRequireGooglePlayServices"})
    @Expose
	@Nullable
    public Boolean securityRequireGooglePlayServices;

    /**
     * The Security Require Safety Net Attestation Basic Integrity.
     * Require the device to pass the SafetyNet basic integrity check.
     */
    @SerializedName(value = "securityRequireSafetyNetAttestationBasicIntegrity", alternate = {"SecurityRequireSafetyNetAttestationBasicIntegrity"})
    @Expose
	@Nullable
    public Boolean securityRequireSafetyNetAttestationBasicIntegrity;

    /**
     * The Security Require Safety Net Attestation Certified Device.
     * Require the device to pass the SafetyNet certified device check.
     */
    @SerializedName(value = "securityRequireSafetyNetAttestationCertifiedDevice", alternate = {"SecurityRequireSafetyNetAttestationCertifiedDevice"})
    @Expose
	@Nullable
    public Boolean securityRequireSafetyNetAttestationCertifiedDevice;

    /**
     * The Security Require Up To Date Security Providers.
     * Require the device to have up to date security providers. The device will require Google Play Services to be enabled and up to date.
     */
    @SerializedName(value = "securityRequireUpToDateSecurityProviders", alternate = {"SecurityRequireUpToDateSecurityProviders"})
    @Expose
	@Nullable
    public Boolean securityRequireUpToDateSecurityProviders;

    /**
     * The Security Require Verify Apps.
     * Require the Android Verify apps feature is turned on.
     */
    @SerializedName(value = "securityRequireVerifyApps", alternate = {"SecurityRequireVerifyApps"})
    @Expose
	@Nullable
    public Boolean securityRequireVerifyApps;

    /**
     * The Storage Require Encryption.
     * Require encryption on Android devices.
     */
    @SerializedName(value = "storageRequireEncryption", alternate = {"StorageRequireEncryption"})
    @Expose
	@Nullable
    public Boolean storageRequireEncryption;


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
