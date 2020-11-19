// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerAppAutoUpdatePolicyType;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerDefaultAppPermissionPolicyType;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerEnrollmentProfileType;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerGlobalProxy;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerKioskCustomizationStatusBar;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerKioskCustomizationSystemNavigation;
import com.microsoft.graph.models.extensions.AppListItem;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerKioskModeFolderIcon;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerKioskModeIconSize;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerKioskModeScreenOrientation;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerVirtualHomeButtonType;
import com.microsoft.graph.models.generated.MicrosoftLauncherDockPresence;
import com.microsoft.graph.models.generated.MicrosoftLauncherSearchBarPlacement;
import com.microsoft.graph.models.generated.AndroidKeyguardFeature;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerRequiredPasswordType;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerPlayStoreMode;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerBatteryPluggedMode;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerSystemUpdateInstallType;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner General Device Configuration.
 */
public class AndroidDeviceOwnerGeneralDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Accounts Block Modification.
     * Indicates whether or not adding or removing accounts is disabled.
     */
    @SerializedName(value = "accountsBlockModification", alternate = {"AccountsBlockModification"})
    @Expose
    public Boolean accountsBlockModification;

    /**
     * The Apps Allow Install From Unknown Sources.
     * Indicates whether or not the user is allowed to enable to unknown sources setting.
     */
    @SerializedName(value = "appsAllowInstallFromUnknownSources", alternate = {"AppsAllowInstallFromUnknownSources"})
    @Expose
    public Boolean appsAllowInstallFromUnknownSources;

    /**
     * The Apps Auto Update Policy.
     * Indicates the value of the app auto update policy.
     */
    @SerializedName(value = "appsAutoUpdatePolicy", alternate = {"AppsAutoUpdatePolicy"})
    @Expose
    public AndroidDeviceOwnerAppAutoUpdatePolicyType appsAutoUpdatePolicy;

    /**
     * The Apps Default Permission Policy.
     * Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically.
     */
    @SerializedName(value = "appsDefaultPermissionPolicy", alternate = {"AppsDefaultPermissionPolicy"})
    @Expose
    public AndroidDeviceOwnerDefaultAppPermissionPolicyType appsDefaultPermissionPolicy;

    /**
     * The Apps Recommend Skipping First Use Hints.
     * Whether or not to recommend all apps skip any first-time-use hints they may have added.
     */
    @SerializedName(value = "appsRecommendSkippingFirstUseHints", alternate = {"AppsRecommendSkippingFirstUseHints"})
    @Expose
    public Boolean appsRecommendSkippingFirstUseHints;

    /**
     * The Bluetooth Block Configuration.
     * Indicates whether or not to block a user from configuring bluetooth.
     */
    @SerializedName(value = "bluetoothBlockConfiguration", alternate = {"BluetoothBlockConfiguration"})
    @Expose
    public Boolean bluetoothBlockConfiguration;

    /**
     * The Bluetooth Block Contact Sharing.
     * Indicates whether or not to block a user from sharing contacts via bluetooth.
     */
    @SerializedName(value = "bluetoothBlockContactSharing", alternate = {"BluetoothBlockContactSharing"})
    @Expose
    public Boolean bluetoothBlockContactSharing;

    /**
     * The Camera Blocked.
     * Indicates whether or not to disable the use of the camera.
     */
    @SerializedName(value = "cameraBlocked", alternate = {"CameraBlocked"})
    @Expose
    public Boolean cameraBlocked;

    /**
     * The Cellular Block Wi Fi Tethering.
     * Indicates whether or not to block Wi-Fi tethering.
     */
    @SerializedName(value = "cellularBlockWiFiTethering", alternate = {"CellularBlockWiFiTethering"})
    @Expose
    public Boolean cellularBlockWiFiTethering;

    /**
     * The Certificate Credential Configuration Disabled.
     * Indicates whether or not to block users from any certificate credential configuration.
     */
    @SerializedName(value = "certificateCredentialConfigurationDisabled", alternate = {"CertificateCredentialConfigurationDisabled"})
    @Expose
    public Boolean certificateCredentialConfigurationDisabled;

    /**
     * The Data Roaming Blocked.
     * Indicates whether or not to block a user from data roaming.
     */
    @SerializedName(value = "dataRoamingBlocked", alternate = {"DataRoamingBlocked"})
    @Expose
    public Boolean dataRoamingBlocked;

    /**
     * The Date Time Configuration Blocked.
     * Indicates whether or not to block the user from manually changing the date or time on the device
     */
    @SerializedName(value = "dateTimeConfigurationBlocked", alternate = {"DateTimeConfigurationBlocked"})
    @Expose
    public Boolean dateTimeConfigurationBlocked;

    /**
     * The Enrollment Profile.
     * Indicates which enrollment profile you want to configure.
     */
    @SerializedName(value = "enrollmentProfile", alternate = {"EnrollmentProfile"})
    @Expose
    public AndroidDeviceOwnerEnrollmentProfileType enrollmentProfile;

    /**
     * The Factory Reset Blocked.
     * Indicates whether or not the factory reset option in settings is disabled.
     */
    @SerializedName(value = "factoryResetBlocked", alternate = {"FactoryResetBlocked"})
    @Expose
    public Boolean factoryResetBlocked;

    /**
     * The Factory Reset Device Administrator Emails.
     * List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up.
     */
    @SerializedName(value = "factoryResetDeviceAdministratorEmails", alternate = {"FactoryResetDeviceAdministratorEmails"})
    @Expose
    public java.util.List<String> factoryResetDeviceAdministratorEmails;

    /**
     * The Global Proxy.
     * Proxy is set up directly with host, port and excluded hosts.
     */
    @SerializedName(value = "globalProxy", alternate = {"GlobalProxy"})
    @Expose
    public AndroidDeviceOwnerGlobalProxy globalProxy;

    /**
     * The Google Accounts Blocked.
     * Indicates whether or not google accounts will be blocked.
     */
    @SerializedName(value = "googleAccountsBlocked", alternate = {"GoogleAccountsBlocked"})
    @Expose
    public Boolean googleAccountsBlocked;

    /**
     * The Kiosk Customization Device Settings Blocked.
     * Indicates whether a user can access the device's Settings app while in Kiosk Mode.
     */
    @SerializedName(value = "kioskCustomizationDeviceSettingsBlocked", alternate = {"KioskCustomizationDeviceSettingsBlocked"})
    @Expose
    public Boolean kioskCustomizationDeviceSettingsBlocked;

    /**
     * The Kiosk Customization Power Button Actions Blocked.
     * Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode.
     */
    @SerializedName(value = "kioskCustomizationPowerButtonActionsBlocked", alternate = {"KioskCustomizationPowerButtonActionsBlocked"})
    @Expose
    public Boolean kioskCustomizationPowerButtonActionsBlocked;

    /**
     * The Kiosk Customization Status Bar.
     * Indicates whether system info and notifications are disabled in Kiosk Mode.
     */
    @SerializedName(value = "kioskCustomizationStatusBar", alternate = {"KioskCustomizationStatusBar"})
    @Expose
    public AndroidDeviceOwnerKioskCustomizationStatusBar kioskCustomizationStatusBar;

    /**
     * The Kiosk Customization System Error Warnings.
     * Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode.
     */
    @SerializedName(value = "kioskCustomizationSystemErrorWarnings", alternate = {"KioskCustomizationSystemErrorWarnings"})
    @Expose
    public Boolean kioskCustomizationSystemErrorWarnings;

    /**
     * The Kiosk Customization System Navigation.
     * Indicates which navigation features are enabled in Kiosk Mode.
     */
    @SerializedName(value = "kioskCustomizationSystemNavigation", alternate = {"KioskCustomizationSystemNavigation"})
    @Expose
    public AndroidDeviceOwnerKioskCustomizationSystemNavigation kioskCustomizationSystemNavigation;

    /**
     * The Kiosk Mode Apps.
     * A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "kioskModeApps", alternate = {"KioskModeApps"})
    @Expose
    public java.util.List<AppListItem> kioskModeApps;

    /**
     * The Kiosk Mode Bluetooth Configuration Enabled.
     * Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeBluetoothConfigurationEnabled", alternate = {"KioskModeBluetoothConfigurationEnabled"})
    @Expose
    public Boolean kioskModeBluetoothConfigurationEnabled;

    /**
     * The Kiosk Mode Debug Menu Easy Access Enabled.
     * Whether or not to allow a user to easy access to the debug menu in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeDebugMenuEasyAccessEnabled", alternate = {"KioskModeDebugMenuEasyAccessEnabled"})
    @Expose
    public Boolean kioskModeDebugMenuEasyAccessEnabled;

    /**
     * The Kiosk Mode Exit Code.
     * Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeExitCode", alternate = {"KioskModeExitCode"})
    @Expose
    public String kioskModeExitCode;

    /**
     * The Kiosk Mode Flashlight Configuration Enabled.
     * Whether or not to allow a user to use the flashlight in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeFlashlightConfigurationEnabled", alternate = {"KioskModeFlashlightConfigurationEnabled"})
    @Expose
    public Boolean kioskModeFlashlightConfigurationEnabled;

    /**
     * The Kiosk Mode Folder Icon.
     * Folder icon configuration for managed home screen in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeFolderIcon", alternate = {"KioskModeFolderIcon"})
    @Expose
    public AndroidDeviceOwnerKioskModeFolderIcon kioskModeFolderIcon;

    /**
     * The Kiosk Mode Icon Size.
     * Icon size configuration for managed home screen in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeIconSize", alternate = {"KioskModeIconSize"})
    @Expose
    public AndroidDeviceOwnerKioskModeIconSize kioskModeIconSize;

    /**
     * The Kiosk Mode Managed Settings Entry Disabled.
     * Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeManagedSettingsEntryDisabled", alternate = {"KioskModeManagedSettingsEntryDisabled"})
    @Expose
    public Boolean kioskModeManagedSettingsEntryDisabled;

    /**
     * The Kiosk Mode Media Volume Configuration Enabled.
     * Whether or not to allow a user to change the media volume in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeMediaVolumeConfigurationEnabled", alternate = {"KioskModeMediaVolumeConfigurationEnabled"})
    @Expose
    public Boolean kioskModeMediaVolumeConfigurationEnabled;

    /**
     * The Kiosk Mode Screen Orientation.
     * Screen orientation configuration for managed home screen in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeScreenOrientation", alternate = {"KioskModeScreenOrientation"})
    @Expose
    public AndroidDeviceOwnerKioskModeScreenOrientation kioskModeScreenOrientation;

    /**
     * The Kiosk Mode Screen Saver Configuration Enabled.
     * Whether or not to enable screen saver mode or not in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeScreenSaverConfigurationEnabled", alternate = {"KioskModeScreenSaverConfigurationEnabled"})
    @Expose
    public Boolean kioskModeScreenSaverConfigurationEnabled;

    /**
     * The Kiosk Mode Screen Saver Detect Media Disabled.
     * Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeScreenSaverDetectMediaDisabled", alternate = {"KioskModeScreenSaverDetectMediaDisabled"})
    @Expose
    public Boolean kioskModeScreenSaverDetectMediaDisabled;

    /**
     * The Kiosk Mode Screen Saver Display Time In Seconds.
     * The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999
     */
    @SerializedName(value = "kioskModeScreenSaverDisplayTimeInSeconds", alternate = {"KioskModeScreenSaverDisplayTimeInSeconds"})
    @Expose
    public Integer kioskModeScreenSaverDisplayTimeInSeconds;

    /**
     * The Kiosk Mode Screen Saver Image Url.
     * URL for an image that will be the device's screen saver in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeScreenSaverImageUrl", alternate = {"KioskModeScreenSaverImageUrl"})
    @Expose
    public String kioskModeScreenSaverImageUrl;

    /**
     * The Kiosk Mode Screen Saver Start Delay In Seconds.
     * The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999
     */
    @SerializedName(value = "kioskModeScreenSaverStartDelayInSeconds", alternate = {"KioskModeScreenSaverStartDelayInSeconds"})
    @Expose
    public Integer kioskModeScreenSaverStartDelayInSeconds;

    /**
     * The Kiosk Mode Show App Notification Badge.
     * Whether or not to display application notification badges in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeShowAppNotificationBadge", alternate = {"KioskModeShowAppNotificationBadge"})
    @Expose
    public Boolean kioskModeShowAppNotificationBadge;

    /**
     * The Kiosk Mode Show Device Info.
     * Whether or not to allow a user to access basic device information.
     */
    @SerializedName(value = "kioskModeShowDeviceInfo", alternate = {"KioskModeShowDeviceInfo"})
    @Expose
    public Boolean kioskModeShowDeviceInfo;

    /**
     * The Kiosk Mode Virtual Home Button Enabled.
     * Whether or not to display a virtual home button when the device is in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeVirtualHomeButtonEnabled", alternate = {"KioskModeVirtualHomeButtonEnabled"})
    @Expose
    public Boolean kioskModeVirtualHomeButtonEnabled;

    /**
     * The Kiosk Mode Virtual Home Button Type.
     * Indicates whether the virtual home button is a swipe up home button or a floating home button.
     */
    @SerializedName(value = "kioskModeVirtualHomeButtonType", alternate = {"KioskModeVirtualHomeButtonType"})
    @Expose
    public AndroidDeviceOwnerVirtualHomeButtonType kioskModeVirtualHomeButtonType;

    /**
     * The Kiosk Mode Wallpaper Url.
     * URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeWallpaperUrl", alternate = {"KioskModeWallpaperUrl"})
    @Expose
    public String kioskModeWallpaperUrl;

    /**
     * The Kiosk Mode Wifi Allowed Ssids.
     * The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "kioskModeWifiAllowedSsids", alternate = {"KioskModeWifiAllowedSsids"})
    @Expose
    public java.util.List<String> kioskModeWifiAllowedSsids;

    /**
     * The Kiosk Mode Wi Fi Configuration Enabled.
     * Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode.
     */
    @SerializedName(value = "kioskModeWiFiConfigurationEnabled", alternate = {"KioskModeWiFiConfigurationEnabled"})
    @Expose
    public Boolean kioskModeWiFiConfigurationEnabled;

    /**
     * The Microphone Force Mute.
     * Indicates whether or not to block unmuting the microphone on the device.
     */
    @SerializedName(value = "microphoneForceMute", alternate = {"MicrophoneForceMute"})
    @Expose
    public Boolean microphoneForceMute;

    /**
     * The Microsoft Launcher Configuration Enabled.
     * Indicates whether or not to you want configure Microsoft Launcher.
     */
    @SerializedName(value = "microsoftLauncherConfigurationEnabled", alternate = {"MicrosoftLauncherConfigurationEnabled"})
    @Expose
    public Boolean microsoftLauncherConfigurationEnabled;

    /**
     * The Microsoft Launcher Custom Wallpaper Allow User Modification.
     * Indicates whether or not the user can modify the wallpaper to personalize their device.
     */
    @SerializedName(value = "microsoftLauncherCustomWallpaperAllowUserModification", alternate = {"MicrosoftLauncherCustomWallpaperAllowUserModification"})
    @Expose
    public Boolean microsoftLauncherCustomWallpaperAllowUserModification;

    /**
     * The Microsoft Launcher Custom Wallpaper Enabled.
     * Indicates whether or not to configure the wallpaper on the targeted devices.
     */
    @SerializedName(value = "microsoftLauncherCustomWallpaperEnabled", alternate = {"MicrosoftLauncherCustomWallpaperEnabled"})
    @Expose
    public Boolean microsoftLauncherCustomWallpaperEnabled;

    /**
     * The Microsoft Launcher Custom Wallpaper Image Url.
     * Indicates the URL for the image file to use as the wallpaper on the targeted devices.
     */
    @SerializedName(value = "microsoftLauncherCustomWallpaperImageUrl", alternate = {"MicrosoftLauncherCustomWallpaperImageUrl"})
    @Expose
    public String microsoftLauncherCustomWallpaperImageUrl;

    /**
     * The Microsoft Launcher Dock Presence Allow User Modification.
     * Indicates whether or not the user can modify the device dock configuration on the device.
     */
    @SerializedName(value = "microsoftLauncherDockPresenceAllowUserModification", alternate = {"MicrosoftLauncherDockPresenceAllowUserModification"})
    @Expose
    public Boolean microsoftLauncherDockPresenceAllowUserModification;

    /**
     * The Microsoft Launcher Dock Presence Configuration.
     * Indicates whether or not you want to configure the device dock.
     */
    @SerializedName(value = "microsoftLauncherDockPresenceConfiguration", alternate = {"MicrosoftLauncherDockPresenceConfiguration"})
    @Expose
    public MicrosoftLauncherDockPresence microsoftLauncherDockPresenceConfiguration;

    /**
     * The Microsoft Launcher Feed Allow User Modification.
     * Indicates whether or not the user can modify the launcher feed on the device.
     */
    @SerializedName(value = "microsoftLauncherFeedAllowUserModification", alternate = {"MicrosoftLauncherFeedAllowUserModification"})
    @Expose
    public Boolean microsoftLauncherFeedAllowUserModification;

    /**
     * The Microsoft Launcher Feed Enabled.
     * Indicates whether or not you want to enable the launcher feed on the device.
     */
    @SerializedName(value = "microsoftLauncherFeedEnabled", alternate = {"MicrosoftLauncherFeedEnabled"})
    @Expose
    public Boolean microsoftLauncherFeedEnabled;

    /**
     * The Microsoft Launcher Search Bar Placement Configuration.
     * Indicates the search bar placement configuration on the device.
     */
    @SerializedName(value = "microsoftLauncherSearchBarPlacementConfiguration", alternate = {"MicrosoftLauncherSearchBarPlacementConfiguration"})
    @Expose
    public MicrosoftLauncherSearchBarPlacement microsoftLauncherSearchBarPlacementConfiguration;

    /**
     * The Network Escape Hatch Allowed.
     * Indicates whether or not the device will allow connecting to a temporary network connection at boot time.
     */
    @SerializedName(value = "networkEscapeHatchAllowed", alternate = {"NetworkEscapeHatchAllowed"})
    @Expose
    public Boolean networkEscapeHatchAllowed;

    /**
     * The Nfc Block Outgoing Beam.
     * Indicates whether or not to block NFC outgoing beam.
     */
    @SerializedName(value = "nfcBlockOutgoingBeam", alternate = {"NfcBlockOutgoingBeam"})
    @Expose
    public Boolean nfcBlockOutgoingBeam;

    /**
     * The Password Block Keyguard.
     * Indicates whether or not the keyguard is disabled.
     */
    @SerializedName(value = "passwordBlockKeyguard", alternate = {"PasswordBlockKeyguard"})
    @Expose
    public Boolean passwordBlockKeyguard;

    /**
     * The Password Block Keyguard Features.
     * List of device keyguard features to block. This collection can contain a maximum of 7 elements.
     */
    @SerializedName(value = "passwordBlockKeyguardFeatures", alternate = {"PasswordBlockKeyguardFeatures"})
    @Expose
    public java.util.List<AndroidKeyguardFeature> passwordBlockKeyguardFeatures;

    /**
     * The Password Expiration Days.
     * Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365
     */
    @SerializedName(value = "passwordExpirationDays", alternate = {"PasswordExpirationDays"})
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * Indicates the minimum length of the password required on the device. Valid values 4 to 16
     */
    @SerializedName(value = "passwordMinimumLength", alternate = {"PasswordMinimumLength"})
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minimum Letter Characters.
     * Indicates the minimum number of letter characters required for device password. Valid values 1 to 16
     */
    @SerializedName(value = "passwordMinimumLetterCharacters", alternate = {"PasswordMinimumLetterCharacters"})
    @Expose
    public Integer passwordMinimumLetterCharacters;

    /**
     * The Password Minimum Lower Case Characters.
     * Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16
     */
    @SerializedName(value = "passwordMinimumLowerCaseCharacters", alternate = {"PasswordMinimumLowerCaseCharacters"})
    @Expose
    public Integer passwordMinimumLowerCaseCharacters;

    /**
     * The Password Minimum Non Letter Characters.
     * Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16
     */
    @SerializedName(value = "passwordMinimumNonLetterCharacters", alternate = {"PasswordMinimumNonLetterCharacters"})
    @Expose
    public Integer passwordMinimumNonLetterCharacters;

    /**
     * The Password Minimum Numeric Characters.
     * Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16
     */
    @SerializedName(value = "passwordMinimumNumericCharacters", alternate = {"PasswordMinimumNumericCharacters"})
    @Expose
    public Integer passwordMinimumNumericCharacters;

    /**
     * The Password Minimum Symbol Characters.
     * Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16
     */
    @SerializedName(value = "passwordMinimumSymbolCharacters", alternate = {"PasswordMinimumSymbolCharacters"})
    @Expose
    public Integer passwordMinimumSymbolCharacters;

    /**
     * The Password Minimum Upper Case Characters.
     * Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16
     */
    @SerializedName(value = "passwordMinimumUpperCaseCharacters", alternate = {"PasswordMinimumUpperCaseCharacters"})
    @Expose
    public Integer passwordMinimumUpperCaseCharacters;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName(value = "passwordMinutesOfInactivityBeforeScreenTimeout", alternate = {"PasswordMinutesOfInactivityBeforeScreenTimeout"})
    @Expose
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Previous Password Count To Block.
     * Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     */
    @SerializedName(value = "passwordPreviousPasswordCountToBlock", alternate = {"PasswordPreviousPasswordCountToBlock"})
    @Expose
    public Integer passwordPreviousPasswordCountToBlock;

    /**
     * The Password Required Type.
     * Indicates the minimum password quality required on the device.
     */
    @SerializedName(value = "passwordRequiredType", alternate = {"PasswordRequiredType"})
    @Expose
    public AndroidDeviceOwnerRequiredPasswordType passwordRequiredType;

    /**
     * The Password Sign In Failure Count Before Factory Reset.
     * Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11
     */
    @SerializedName(value = "passwordSignInFailureCountBeforeFactoryReset", alternate = {"PasswordSignInFailureCountBeforeFactoryReset"})
    @Expose
    public Integer passwordSignInFailureCountBeforeFactoryReset;

    /**
     * The Personal Profile Apps Allow Install From Unknown Sources.
     * Indicates whether the user can install apps from unknown sources on the personal profile.
     */
    @SerializedName(value = "personalProfileAppsAllowInstallFromUnknownSources", alternate = {"PersonalProfileAppsAllowInstallFromUnknownSources"})
    @Expose
    public Boolean personalProfileAppsAllowInstallFromUnknownSources;

    /**
     * The Personal Profile Camera Blocked.
     * Indicates whether to disable the use of the camera on the personal profile.
     */
    @SerializedName(value = "personalProfileCameraBlocked", alternate = {"PersonalProfileCameraBlocked"})
    @Expose
    public Boolean personalProfileCameraBlocked;

    /**
     * The Personal Profile Screen Capture Blocked.
     * Indicates whether to disable the capability to take screenshots on the personal profile.
     */
    @SerializedName(value = "personalProfileScreenCaptureBlocked", alternate = {"PersonalProfileScreenCaptureBlocked"})
    @Expose
    public Boolean personalProfileScreenCaptureBlocked;

    /**
     * The Play Store Mode.
     * Indicates the Play Store mode of the device.
     */
    @SerializedName(value = "playStoreMode", alternate = {"PlayStoreMode"})
    @Expose
    public AndroidDeviceOwnerPlayStoreMode playStoreMode;

    /**
     * The Safe Boot Blocked.
     * Indicates whether or not rebooting the device into safe boot is disabled.
     */
    @SerializedName(value = "safeBootBlocked", alternate = {"SafeBootBlocked"})
    @Expose
    public Boolean safeBootBlocked;

    /**
     * The Screen Capture Blocked.
     * Indicates whether or not to disable the capability to take screenshots.
     */
    @SerializedName(value = "screenCaptureBlocked", alternate = {"ScreenCaptureBlocked"})
    @Expose
    public Boolean screenCaptureBlocked;

    /**
     * The Security Allow Debugging Features.
     * Indicates whether or not to block the user from enabling debugging features on the device.
     */
    @SerializedName(value = "securityAllowDebuggingFeatures", alternate = {"SecurityAllowDebuggingFeatures"})
    @Expose
    public Boolean securityAllowDebuggingFeatures;

    /**
     * The Security Require Verify Apps.
     * Indicates whether or not verify apps is required.
     */
    @SerializedName(value = "securityRequireVerifyApps", alternate = {"SecurityRequireVerifyApps"})
    @Expose
    public Boolean securityRequireVerifyApps;

    /**
     * The Status Bar Blocked.
     * Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays.
     */
    @SerializedName(value = "statusBarBlocked", alternate = {"StatusBarBlocked"})
    @Expose
    public Boolean statusBarBlocked;

    /**
     * The Stay On Modes.
     * List of modes in which the device's display will stay powered-on. This collection can contain a maximum of 4 elements.
     */
    @SerializedName(value = "stayOnModes", alternate = {"StayOnModes"})
    @Expose
    public java.util.List<AndroidDeviceOwnerBatteryPluggedMode> stayOnModes;

    /**
     * The Storage Allow Usb.
     * Indicates whether or not to allow USB mass storage.
     */
    @SerializedName(value = "storageAllowUsb", alternate = {"StorageAllowUsb"})
    @Expose
    public Boolean storageAllowUsb;

    /**
     * The Storage Block External Media.
     * Indicates whether or not to block external media.
     */
    @SerializedName(value = "storageBlockExternalMedia", alternate = {"StorageBlockExternalMedia"})
    @Expose
    public Boolean storageBlockExternalMedia;

    /**
     * The Storage Block Usb File Transfer.
     * Indicates whether or not to block USB file transfer.
     */
    @SerializedName(value = "storageBlockUsbFileTransfer", alternate = {"StorageBlockUsbFileTransfer"})
    @Expose
    public Boolean storageBlockUsbFileTransfer;

    /**
     * The System Update Install Type.
     * The type of system update configuration.
     */
    @SerializedName(value = "systemUpdateInstallType", alternate = {"SystemUpdateInstallType"})
    @Expose
    public AndroidDeviceOwnerSystemUpdateInstallType systemUpdateInstallType;

    /**
     * The System Update Window End Minutes After Midnight.
     * Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440
     */
    @SerializedName(value = "systemUpdateWindowEndMinutesAfterMidnight", alternate = {"SystemUpdateWindowEndMinutesAfterMidnight"})
    @Expose
    public Integer systemUpdateWindowEndMinutesAfterMidnight;

    /**
     * The System Update Window Start Minutes After Midnight.
     * Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440
     */
    @SerializedName(value = "systemUpdateWindowStartMinutesAfterMidnight", alternate = {"SystemUpdateWindowStartMinutesAfterMidnight"})
    @Expose
    public Integer systemUpdateWindowStartMinutesAfterMidnight;

    /**
     * The System Windows Blocked.
     * Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts.
     */
    @SerializedName(value = "systemWindowsBlocked", alternate = {"SystemWindowsBlocked"})
    @Expose
    public Boolean systemWindowsBlocked;

    /**
     * The Users Block Add.
     * Indicates whether or not adding users and profiles is disabled.
     */
    @SerializedName(value = "usersBlockAdd", alternate = {"UsersBlockAdd"})
    @Expose
    public Boolean usersBlockAdd;

    /**
     * The Users Block Remove.
     * Indicates whether or not to disable removing other users from the device.
     */
    @SerializedName(value = "usersBlockRemove", alternate = {"UsersBlockRemove"})
    @Expose
    public Boolean usersBlockRemove;

    /**
     * The Volume Block Adjustment.
     * Indicates whether or not adjusting the master volume is disabled.
     */
    @SerializedName(value = "volumeBlockAdjustment", alternate = {"VolumeBlockAdjustment"})
    @Expose
    public Boolean volumeBlockAdjustment;

    /**
     * The Vpn Always On Lockdown Mode.
     * If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected.
     */
    @SerializedName(value = "vpnAlwaysOnLockdownMode", alternate = {"VpnAlwaysOnLockdownMode"})
    @Expose
    public Boolean vpnAlwaysOnLockdownMode;

    /**
     * The Vpn Always On Package Identifier.
     * Android app package name for app that will handle an always-on VPN connection.
     */
    @SerializedName(value = "vpnAlwaysOnPackageIdentifier", alternate = {"VpnAlwaysOnPackageIdentifier"})
    @Expose
    public String vpnAlwaysOnPackageIdentifier;

    /**
     * The Wifi Block Edit Configurations.
     * Indicates whether or not to block the user from editing the wifi connection settings.
     */
    @SerializedName(value = "wifiBlockEditConfigurations", alternate = {"WifiBlockEditConfigurations"})
    @Expose
    public Boolean wifiBlockEditConfigurations;

    /**
     * The Wifi Block Edit Policy Defined Configurations.
     * Indicates whether or not to block the user from editing just the networks defined by the policy.
     */
    @SerializedName(value = "wifiBlockEditPolicyDefinedConfigurations", alternate = {"WifiBlockEditPolicyDefinedConfigurations"})
    @Expose
    public Boolean wifiBlockEditPolicyDefinedConfigurations;

    /**
     * The Work Profile Password Expiration Days.
     * Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365
     */
    @SerializedName(value = "workProfilePasswordExpirationDays", alternate = {"WorkProfilePasswordExpirationDays"})
    @Expose
    public Integer workProfilePasswordExpirationDays;

    /**
     * The Work Profile Password Minimum Length.
     * Indicates the minimum length of the work profile password. Valid values 4 to 16
     */
    @SerializedName(value = "workProfilePasswordMinimumLength", alternate = {"WorkProfilePasswordMinimumLength"})
    @Expose
    public Integer workProfilePasswordMinimumLength;

    /**
     * The Work Profile Password Minimum Letter Characters.
     * Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16
     */
    @SerializedName(value = "workProfilePasswordMinimumLetterCharacters", alternate = {"WorkProfilePasswordMinimumLetterCharacters"})
    @Expose
    public Integer workProfilePasswordMinimumLetterCharacters;

    /**
     * The Work Profile Password Minimum Lower Case Characters.
     * Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16
     */
    @SerializedName(value = "workProfilePasswordMinimumLowerCaseCharacters", alternate = {"WorkProfilePasswordMinimumLowerCaseCharacters"})
    @Expose
    public Integer workProfilePasswordMinimumLowerCaseCharacters;

    /**
     * The Work Profile Password Minimum Non Letter Characters.
     * Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16
     */
    @SerializedName(value = "workProfilePasswordMinimumNonLetterCharacters", alternate = {"WorkProfilePasswordMinimumNonLetterCharacters"})
    @Expose
    public Integer workProfilePasswordMinimumNonLetterCharacters;

    /**
     * The Work Profile Password Minimum Numeric Characters.
     * Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16
     */
    @SerializedName(value = "workProfilePasswordMinimumNumericCharacters", alternate = {"WorkProfilePasswordMinimumNumericCharacters"})
    @Expose
    public Integer workProfilePasswordMinimumNumericCharacters;

    /**
     * The Work Profile Password Minimum Symbol Characters.
     * Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16
     */
    @SerializedName(value = "workProfilePasswordMinimumSymbolCharacters", alternate = {"WorkProfilePasswordMinimumSymbolCharacters"})
    @Expose
    public Integer workProfilePasswordMinimumSymbolCharacters;

    /**
     * The Work Profile Password Minimum Upper Case Characters.
     * Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16
     */
    @SerializedName(value = "workProfilePasswordMinimumUpperCaseCharacters", alternate = {"WorkProfilePasswordMinimumUpperCaseCharacters"})
    @Expose
    public Integer workProfilePasswordMinimumUpperCaseCharacters;

    /**
     * The Work Profile Password Previous Password Count To Block.
     * Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24
     */
    @SerializedName(value = "workProfilePasswordPreviousPasswordCountToBlock", alternate = {"WorkProfilePasswordPreviousPasswordCountToBlock"})
    @Expose
    public Integer workProfilePasswordPreviousPasswordCountToBlock;

    /**
     * The Work Profile Password Required Type.
     * Indicates the minimum password quality required on the work profile password.
     */
    @SerializedName(value = "workProfilePasswordRequiredType", alternate = {"WorkProfilePasswordRequiredType"})
    @Expose
    public AndroidDeviceOwnerRequiredPasswordType workProfilePasswordRequiredType;

    /**
     * The Work Profile Password Sign In Failure Count Before Factory Reset.
     * Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11
     */
    @SerializedName(value = "workProfilePasswordSignInFailureCountBeforeFactoryReset", alternate = {"WorkProfilePasswordSignInFailureCountBeforeFactoryReset"})
    @Expose
    public Integer workProfilePasswordSignInFailureCountBeforeFactoryReset;


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
