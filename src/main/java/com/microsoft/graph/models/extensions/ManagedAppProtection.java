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
import com.microsoft.graph.models.generated.ManagedAppDataIngestionLocation;
import com.microsoft.graph.models.generated.ManagedAppDataStorageLocation;
import com.microsoft.graph.models.generated.ManagedAppDataTransferLevel;
import com.microsoft.graph.models.generated.ManagedAppClipboardSharingLevel;
import com.microsoft.graph.models.generated.ManagedAppRemediationAction;
import com.microsoft.graph.models.generated.ManagedAppPhoneNumberRedirectLevel;
import com.microsoft.graph.models.generated.ManagedBrowserType;
import com.microsoft.graph.models.generated.ManagedAppDeviceThreatLevel;
import com.microsoft.graph.models.generated.ManagedAppNotificationRestriction;
import com.microsoft.graph.models.generated.ManagedAppPinCharacterSet;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Protection.
 */
public class ManagedAppProtection extends ManagedAppPolicy implements IJsonBackedObject {


    /**
     * The Allowed Data Ingestion Locations.
     * Data storage locations where a user may store managed data.
     */
    @SerializedName(value = "allowedDataIngestionLocations", alternate = {"AllowedDataIngestionLocations"})
    @Expose
	@Nullable
    public java.util.List<ManagedAppDataIngestionLocation> allowedDataIngestionLocations;

    /**
     * The Allowed Data Storage Locations.
     * Data storage locations where a user may store managed data.
     */
    @SerializedName(value = "allowedDataStorageLocations", alternate = {"AllowedDataStorageLocations"})
    @Expose
	@Nullable
    public java.util.List<ManagedAppDataStorageLocation> allowedDataStorageLocations;

    /**
     * The Allowed Inbound Data Transfer Sources.
     * Sources from which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
     */
    @SerializedName(value = "allowedInboundDataTransferSources", alternate = {"AllowedInboundDataTransferSources"})
    @Expose
	@Nullable
    public ManagedAppDataTransferLevel allowedInboundDataTransferSources;

    /**
     * The Allowed Outbound Clipboard Sharing Exception Length.
     * Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed.
     */
    @SerializedName(value = "allowedOutboundClipboardSharingExceptionLength", alternate = {"AllowedOutboundClipboardSharingExceptionLength"})
    @Expose
	@Nullable
    public Integer allowedOutboundClipboardSharingExceptionLength;

    /**
     * The Allowed Outbound Clipboard Sharing Level.
     * The level to which the clipboard may be shared between apps on the managed device. Possible values are: allApps, managedAppsWithPasteIn, managedApps, blocked.
     */
    @SerializedName(value = "allowedOutboundClipboardSharingLevel", alternate = {"AllowedOutboundClipboardSharingLevel"})
    @Expose
	@Nullable
    public ManagedAppClipboardSharingLevel allowedOutboundClipboardSharingLevel;

    /**
     * The Allowed Outbound Data Transfer Destinations.
     * Destinations to which data is allowed to be transferred. Possible values are: allApps, managedApps, none.
     */
    @SerializedName(value = "allowedOutboundDataTransferDestinations", alternate = {"AllowedOutboundDataTransferDestinations"})
    @Expose
	@Nullable
    public ManagedAppDataTransferLevel allowedOutboundDataTransferDestinations;

    /**
     * The App Action If Device Compliance Required.
     * Defines a managed app behavior, either block or wipe, when the device is either rooted or jailbroken, if DeviceComplianceRequired is set to true.
     */
    @SerializedName(value = "appActionIfDeviceComplianceRequired", alternate = {"AppActionIfDeviceComplianceRequired"})
    @Expose
	@Nullable
    public ManagedAppRemediationAction appActionIfDeviceComplianceRequired;

    /**
     * The App Action If Maximum Pin Retries Exceeded.
     * Defines a managed app behavior, either block or wipe, based on maximum number of incorrect pin retry attempts.
     */
    @SerializedName(value = "appActionIfMaximumPinRetriesExceeded", alternate = {"AppActionIfMaximumPinRetriesExceeded"})
    @Expose
	@Nullable
    public ManagedAppRemediationAction appActionIfMaximumPinRetriesExceeded;

    /**
     * The App Action If Unable To Authenticate User.
     * If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD.
     */
    @SerializedName(value = "appActionIfUnableToAuthenticateUser", alternate = {"AppActionIfUnableToAuthenticateUser"})
    @Expose
	@Nullable
    public ManagedAppRemediationAction appActionIfUnableToAuthenticateUser;

    /**
     * The Block Data Ingestion Into Organization Documents.
     * Indicates whether a user can bring data into org documents.
     */
    @SerializedName(value = "blockDataIngestionIntoOrganizationDocuments", alternate = {"BlockDataIngestionIntoOrganizationDocuments"})
    @Expose
	@Nullable
    public Boolean blockDataIngestionIntoOrganizationDocuments;

    /**
     * The Contact Sync Blocked.
     * Indicates whether contacts can be synced to the user's device.
     */
    @SerializedName(value = "contactSyncBlocked", alternate = {"ContactSyncBlocked"})
    @Expose
	@Nullable
    public Boolean contactSyncBlocked;

    /**
     * The Data Backup Blocked.
     * Indicates whether the backup of a managed app's data is blocked.
     */
    @SerializedName(value = "dataBackupBlocked", alternate = {"DataBackupBlocked"})
    @Expose
	@Nullable
    public Boolean dataBackupBlocked;

    /**
     * The Device Compliance Required.
     * Indicates whether device compliance is required.
     */
    @SerializedName(value = "deviceComplianceRequired", alternate = {"DeviceComplianceRequired"})
    @Expose
	@Nullable
    public Boolean deviceComplianceRequired;

    /**
     * The Dialer Restriction Level.
     * The classes of dialer apps that are allowed to click-to-open a phone number.
     */
    @SerializedName(value = "dialerRestrictionLevel", alternate = {"DialerRestrictionLevel"})
    @Expose
	@Nullable
    public ManagedAppPhoneNumberRedirectLevel dialerRestrictionLevel;

    /**
     * The Disable App Pin If Device Pin Is Set.
     * Indicates whether use of the app pin is required if the device pin is set.
     */
    @SerializedName(value = "disableAppPinIfDevicePinIsSet", alternate = {"DisableAppPinIfDevicePinIsSet"})
    @Expose
	@Nullable
    public Boolean disableAppPinIfDevicePinIsSet;

    /**
     * The Fingerprint Blocked.
     * Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.
     */
    @SerializedName(value = "fingerprintBlocked", alternate = {"FingerprintBlocked"})
    @Expose
	@Nullable
    public Boolean fingerprintBlocked;

    /**
     * The Managed Browser.
     * Indicates in which managed browser(s) that internet links should be opened. When this property is configured, ManagedBrowserToOpenLinksRequired should be true. Possible values are: notConfigured, microsoftEdge.
     */
    @SerializedName(value = "managedBrowser", alternate = {"ManagedBrowser"})
    @Expose
	@Nullable
    public EnumSet<ManagedBrowserType> managedBrowser;

    /**
     * The Managed Browser To Open Links Required.
     * Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)
     */
    @SerializedName(value = "managedBrowserToOpenLinksRequired", alternate = {"ManagedBrowserToOpenLinksRequired"})
    @Expose
	@Nullable
    public Boolean managedBrowserToOpenLinksRequired;

    /**
     * The Maximum Allowed Device Threat Level.
     * Maximum allowed device threat level, as reported by the MTD app
     */
    @SerializedName(value = "maximumAllowedDeviceThreatLevel", alternate = {"MaximumAllowedDeviceThreatLevel"})
    @Expose
	@Nullable
    public ManagedAppDeviceThreatLevel maximumAllowedDeviceThreatLevel;

    /**
     * The Maximum Pin Retries.
     * Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.
     */
    @SerializedName(value = "maximumPinRetries", alternate = {"MaximumPinRetries"})
    @Expose
	@Nullable
    public Integer maximumPinRetries;

    /**
     * The Minimum Pin Length.
     * Minimum pin length required for an app-level pin if PinRequired is set to True
     */
    @SerializedName(value = "minimumPinLength", alternate = {"MinimumPinLength"})
    @Expose
	@Nullable
    public Integer minimumPinLength;

    /**
     * The Minimum Required App Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName(value = "minimumRequiredAppVersion", alternate = {"MinimumRequiredAppVersion"})
    @Expose
	@Nullable
    public String minimumRequiredAppVersion;

    /**
     * The Minimum Required Os Version.
     * Versions less than the specified version will block the managed app from accessing company data.
     */
    @SerializedName(value = "minimumRequiredOsVersion", alternate = {"MinimumRequiredOsVersion"})
    @Expose
	@Nullable
    public String minimumRequiredOsVersion;

    /**
     * The Minimum Warning App Version.
     * Versions less than the specified version will result in warning message on the managed app.
     */
    @SerializedName(value = "minimumWarningAppVersion", alternate = {"MinimumWarningAppVersion"})
    @Expose
	@Nullable
    public String minimumWarningAppVersion;

    /**
     * The Minimum Warning Os Version.
     * Versions less than the specified version will result in warning message on the managed app from accessing company data.
     */
    @SerializedName(value = "minimumWarningOsVersion", alternate = {"MinimumWarningOsVersion"})
    @Expose
	@Nullable
    public String minimumWarningOsVersion;

    /**
     * The Minimum Wipe App Version.
     * Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     */
    @SerializedName(value = "minimumWipeAppVersion", alternate = {"MinimumWipeAppVersion"})
    @Expose
	@Nullable
    public String minimumWipeAppVersion;

    /**
     * The Minimum Wipe Os Version.
     * Versions less than or equal to the specified version will wipe the managed app and the associated company data.
     */
    @SerializedName(value = "minimumWipeOsVersion", alternate = {"MinimumWipeOsVersion"})
    @Expose
	@Nullable
    public String minimumWipeOsVersion;

    /**
     * The Mobile Threat Defense Remediation Action.
     * Determines what action to take if the mobile threat defense threat threshold isn't met. Warn isn't a supported value for this property
     */
    @SerializedName(value = "mobileThreatDefenseRemediationAction", alternate = {"MobileThreatDefenseRemediationAction"})
    @Expose
	@Nullable
    public ManagedAppRemediationAction mobileThreatDefenseRemediationAction;

    /**
     * The Notification Restriction.
     * Specify app notification restriction
     */
    @SerializedName(value = "notificationRestriction", alternate = {"NotificationRestriction"})
    @Expose
	@Nullable
    public ManagedAppNotificationRestriction notificationRestriction;

    /**
     * The Organizational Credentials Required.
     * Indicates whether organizational credentials are required for app use.
     */
    @SerializedName(value = "organizationalCredentialsRequired", alternate = {"OrganizationalCredentialsRequired"})
    @Expose
	@Nullable
    public Boolean organizationalCredentialsRequired;

    /**
     * The Period Before Pin Reset.
     * TimePeriod before the all-level pin must be reset if PinRequired is set to True.
     */
    @SerializedName(value = "periodBeforePinReset", alternate = {"PeriodBeforePinReset"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration periodBeforePinReset;

    /**
     * The Period Offline Before Access Check.
     * The period after which access is checked when the device is not connected to the internet.
     */
    @SerializedName(value = "periodOfflineBeforeAccessCheck", alternate = {"PeriodOfflineBeforeAccessCheck"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration periodOfflineBeforeAccessCheck;

    /**
     * The Period Offline Before Wipe Is Enforced.
     * The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.
     */
    @SerializedName(value = "periodOfflineBeforeWipeIsEnforced", alternate = {"PeriodOfflineBeforeWipeIsEnforced"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration periodOfflineBeforeWipeIsEnforced;

    /**
     * The Period Online Before Access Check.
     * The period after which access is checked when the device is connected to the internet.
     */
    @SerializedName(value = "periodOnlineBeforeAccessCheck", alternate = {"PeriodOnlineBeforeAccessCheck"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration periodOnlineBeforeAccessCheck;

    /**
     * The Pin Character Set.
     * Character set which may be used for an app-level pin if PinRequired is set to True. Possible values are: numeric, alphanumericAndSymbol.
     */
    @SerializedName(value = "pinCharacterSet", alternate = {"PinCharacterSet"})
    @Expose
	@Nullable
    public ManagedAppPinCharacterSet pinCharacterSet;

    /**
     * The Pin Required.
     * Indicates whether an app-level pin is required.
     */
    @SerializedName(value = "pinRequired", alternate = {"PinRequired"})
    @Expose
	@Nullable
    public Boolean pinRequired;

    /**
     * The Pin Required Instead Of Biometric Timeout.
     * Timeout in minutes for an app pin instead of non biometrics passcode
     */
    @SerializedName(value = "pinRequiredInsteadOfBiometricTimeout", alternate = {"PinRequiredInsteadOfBiometricTimeout"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration pinRequiredInsteadOfBiometricTimeout;

    /**
     * The Previous Pin Block Count.
     * Requires a pin to be unique from the number specified in this property.
     */
    @SerializedName(value = "previousPinBlockCount", alternate = {"PreviousPinBlockCount"})
    @Expose
	@Nullable
    public Integer previousPinBlockCount;

    /**
     * The Print Blocked.
     * Indicates whether printing is allowed from managed apps.
     */
    @SerializedName(value = "printBlocked", alternate = {"PrintBlocked"})
    @Expose
	@Nullable
    public Boolean printBlocked;

    /**
     * The Save As Blocked.
     * Indicates whether users may use the 'Save As' menu item to save a copy of protected files.
     */
    @SerializedName(value = "saveAsBlocked", alternate = {"SaveAsBlocked"})
    @Expose
	@Nullable
    public Boolean saveAsBlocked;

    /**
     * The Simple Pin Blocked.
     * Indicates whether simplePin is blocked.
     */
    @SerializedName(value = "simplePinBlocked", alternate = {"SimplePinBlocked"})
    @Expose
	@Nullable
    public Boolean simplePinBlocked;


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
