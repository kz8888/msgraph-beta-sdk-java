// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ConfigurationUsage;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Identity Protection Configuration.
 */
public class WindowsIdentityProtectionConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Enhanced Anti Spoofing For Facial Features Enabled.
     * Boolean value used to enable enhanced anti-spoofing for facial feature recognition on Windows Hello face authentication.
     */
    @SerializedName(value = "enhancedAntiSpoofingForFacialFeaturesEnabled", alternate = {"EnhancedAntiSpoofingForFacialFeaturesEnabled"})
    @Expose
	@Nullable
    public Boolean enhancedAntiSpoofingForFacialFeaturesEnabled;

    /**
     * The Pin Expiration In Days.
     * Integer value specifies the period (in days) that a PIN can be used before the system requires the user to change it. Valid values are 0 to 730 inclusive. Valid values 0 to 730
     */
    @SerializedName(value = "pinExpirationInDays", alternate = {"PinExpirationInDays"})
    @Expose
	@Nullable
    public Integer pinExpirationInDays;

    /**
     * The Pin Lowercase Characters Usage.
     * This value configures the use of lowercase characters in the Windows Hello for Business PIN.
     */
    @SerializedName(value = "pinLowercaseCharactersUsage", alternate = {"PinLowercaseCharactersUsage"})
    @Expose
	@Nullable
    public ConfigurationUsage pinLowercaseCharactersUsage;

    /**
     * The Pin Maximum Length.
     * Integer value that sets the maximum number of characters allowed for the work PIN. Valid values are 4 to 127 inclusive and greater than or equal to the value set for the minimum PIN. Valid values 4 to 127
     */
    @SerializedName(value = "pinMaximumLength", alternate = {"PinMaximumLength"})
    @Expose
	@Nullable
    public Integer pinMaximumLength;

    /**
     * The Pin Minimum Length.
     * Integer value that sets the minimum number of characters required for the Windows Hello for Business PIN. Valid values are 4 to 127 inclusive and less than or equal to the value set for the maximum PIN. Valid values 4 to 127
     */
    @SerializedName(value = "pinMinimumLength", alternate = {"PinMinimumLength"})
    @Expose
	@Nullable
    public Integer pinMinimumLength;

    /**
     * The Pin Previous Block Count.
     * Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset. Valid values 0 to 50
     */
    @SerializedName(value = "pinPreviousBlockCount", alternate = {"PinPreviousBlockCount"})
    @Expose
	@Nullable
    public Integer pinPreviousBlockCount;

    /**
     * The Pin Recovery Enabled.
     * Boolean value that enables a user to change their PIN by using the Windows Hello for Business PIN recovery service.
     */
    @SerializedName(value = "pinRecoveryEnabled", alternate = {"PinRecoveryEnabled"})
    @Expose
	@Nullable
    public Boolean pinRecoveryEnabled;

    /**
     * The Pin Special Characters Usage.
     * Controls the ability to use special characters in the Windows Hello for Business PIN.
     */
    @SerializedName(value = "pinSpecialCharactersUsage", alternate = {"PinSpecialCharactersUsage"})
    @Expose
	@Nullable
    public ConfigurationUsage pinSpecialCharactersUsage;

    /**
     * The Pin Uppercase Characters Usage.
     * This value configures the use of uppercase characters in the Windows Hello for Business PIN.
     */
    @SerializedName(value = "pinUppercaseCharactersUsage", alternate = {"PinUppercaseCharactersUsage"})
    @Expose
	@Nullable
    public ConfigurationUsage pinUppercaseCharactersUsage;

    /**
     * The Security Device Required.
     * Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.
     */
    @SerializedName(value = "securityDeviceRequired", alternate = {"SecurityDeviceRequired"})
    @Expose
	@Nullable
    public Boolean securityDeviceRequired;

    /**
     * The Unlock With Biometrics Enabled.
     * Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.
     */
    @SerializedName(value = "unlockWithBiometricsEnabled", alternate = {"UnlockWithBiometricsEnabled"})
    @Expose
	@Nullable
    public Boolean unlockWithBiometricsEnabled;

    /**
     * The Use Certificates For On Premises Auth Enabled.
     * Boolean value that enables Windows Hello for Business to use certificates to authenticate on-premise resources.
     */
    @SerializedName(value = "useCertificatesForOnPremisesAuthEnabled", alternate = {"UseCertificatesForOnPremisesAuthEnabled"})
    @Expose
	@Nullable
    public Boolean useCertificatesForOnPremisesAuthEnabled;

    /**
     * The Use Security Key For Signin.
     * Boolean value used to enable the Windows Hello security key as a logon credential.
     */
    @SerializedName(value = "useSecurityKeyForSignin", alternate = {"UseSecurityKeyForSignin"})
    @Expose
	@Nullable
    public Boolean useSecurityKeyForSignin;

    /**
     * The Windows Hello For Business Blocked.
     * Boolean value that blocks Windows Hello for Business as a method for signing into Windows.
     */
    @SerializedName(value = "windowsHelloForBusinessBlocked", alternate = {"WindowsHelloForBusinessBlocked"})
    @Expose
	@Nullable
    public Boolean windowsHelloForBusinessBlocked;


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
