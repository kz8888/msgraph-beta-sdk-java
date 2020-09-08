// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Enablement;
import com.microsoft.graph.models.generated.MacOSFileVaultRecoveryKeyTypes;
import com.microsoft.graph.models.extensions.MacOSFirewallApplication;
import com.microsoft.graph.models.generated.MacOSGatekeeperAppSources;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSEndpoint Protection Configuration.
 */
public class MacOSEndpointProtectionConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Advanced Threat Protection Automatic Sample Submission.
     * Determines whether or not to enable automatic file sample submission for Microsoft Defender Advanced Threat Protection on macOS.
     */
    @SerializedName("advancedThreatProtectionAutomaticSampleSubmission")
    @Expose
    public Enablement advancedThreatProtectionAutomaticSampleSubmission;

    /**
     * The Advanced Threat Protection Cloud Delivered.
     * Determines whether or not to enable cloud-delivered protection for Microsoft Defender Advanced Threat Protection on macOS.
     */
    @SerializedName("advancedThreatProtectionCloudDelivered")
    @Expose
    public Enablement advancedThreatProtectionCloudDelivered;

    /**
     * The Advanced Threat Protection Diagnostic Data Collection.
     * Determines whether or not to enable diagnostic and usage data collection for Microsoft Defender Advanced Threat Protection on macOS.
     */
    @SerializedName("advancedThreatProtectionDiagnosticDataCollection")
    @Expose
    public Enablement advancedThreatProtectionDiagnosticDataCollection;

    /**
     * The Advanced Threat Protection Excluded Extensions.
     * A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     */
    @SerializedName("advancedThreatProtectionExcludedExtensions")
    @Expose
    public java.util.List<String> advancedThreatProtectionExcludedExtensions;

    /**
     * The Advanced Threat Protection Excluded Files.
     * A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     */
    @SerializedName("advancedThreatProtectionExcludedFiles")
    @Expose
    public java.util.List<String> advancedThreatProtectionExcludedFiles;

    /**
     * The Advanced Threat Protection Excluded Folders.
     * A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     */
    @SerializedName("advancedThreatProtectionExcludedFolders")
    @Expose
    public java.util.List<String> advancedThreatProtectionExcludedFolders;

    /**
     * The Advanced Threat Protection Excluded Processes.
     * A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     */
    @SerializedName("advancedThreatProtectionExcludedProcesses")
    @Expose
    public java.util.List<String> advancedThreatProtectionExcludedProcesses;

    /**
     * The Advanced Threat Protection Real Time.
     * Determines whether or not to enable real-time protection for Microsoft Defender Advanced Threat Protection on macOS.
     */
    @SerializedName("advancedThreatProtectionRealTime")
    @Expose
    public Enablement advancedThreatProtectionRealTime;

    /**
     * The File Vault Allow Deferral Until Sign Out.
     * Optional. If set to true, the user can defer the enabling of FileVault until they sign out.
     */
    @SerializedName("fileVaultAllowDeferralUntilSignOut")
    @Expose
    public Boolean fileVaultAllowDeferralUntilSignOut;

    /**
     * The File Vault Disable Prompt At Sign Out.
     * Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.
     */
    @SerializedName("fileVaultDisablePromptAtSignOut")
    @Expose
    public Boolean fileVaultDisablePromptAtSignOut;

    /**
     * The File Vault Enabled.
     * Whether FileVault should be enabled or not.
     */
    @SerializedName("fileVaultEnabled")
    @Expose
    public Boolean fileVaultEnabled;

    /**
     * The File Vault Hide Personal Recovery Key.
     * Optional. A hidden personal recovery key does not appear on the user's screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.
     */
    @SerializedName("fileVaultHidePersonalRecoveryKey")
    @Expose
    public Boolean fileVaultHidePersonalRecoveryKey;

    /**
     * The File Vault Institutional Recovery Key Certificate.
     * Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.
     */
    @SerializedName("fileVaultInstitutionalRecoveryKeyCertificate")
    @Expose
    public byte[] fileVaultInstitutionalRecoveryKeyCertificate;

    /**
     * The File Vault Institutional Recovery Key Certificate File Name.
     * File name of the institutional recovery key certificate to display in UI. (*.der).
     */
    @SerializedName("fileVaultInstitutionalRecoveryKeyCertificateFileName")
    @Expose
    public String fileVaultInstitutionalRecoveryKeyCertificateFileName;

    /**
     * The File Vault Number Of Times User Can Ignore.
     * Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.
     */
    @SerializedName("fileVaultNumberOfTimesUserCanIgnore")
    @Expose
    public Integer fileVaultNumberOfTimesUserCanIgnore;

    /**
     * The File Vault Personal Recovery Key Help Message.
     * Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.
     */
    @SerializedName("fileVaultPersonalRecoveryKeyHelpMessage")
    @Expose
    public String fileVaultPersonalRecoveryKeyHelpMessage;

    /**
     * The File Vault Personal Recovery Key Rotation In Months.
     * Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.
     */
    @SerializedName("fileVaultPersonalRecoveryKeyRotationInMonths")
    @Expose
    public Integer fileVaultPersonalRecoveryKeyRotationInMonths;

    /**
     * The File Vault Selected Recovery Key Types.
     * Required if FileVault is enabled, determines the type(s) of recovery key to use. 
     */
    @SerializedName("fileVaultSelectedRecoveryKeyTypes")
    @Expose
    public EnumSet<MacOSFileVaultRecoveryKeyTypes> fileVaultSelectedRecoveryKeyTypes;

    /**
     * The Firewall Applications.
     * List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.
     */
    @SerializedName("firewallApplications")
    @Expose
    public java.util.List<MacOSFirewallApplication> firewallApplications;

    /**
     * The Firewall Block All Incoming.
     * Corresponds to the ???Block all incoming connections??? option.
     */
    @SerializedName("firewallBlockAllIncoming")
    @Expose
    public Boolean firewallBlockAllIncoming;

    /**
     * The Firewall Enabled.
     * Whether the firewall should be enabled or not.
     */
    @SerializedName("firewallEnabled")
    @Expose
    public Boolean firewallEnabled;

    /**
     * The Firewall Enable Stealth Mode.
     * Corresponds to ???Enable stealth mode.???
     */
    @SerializedName("firewallEnableStealthMode")
    @Expose
    public Boolean firewallEnableStealthMode;

    /**
     * The Gatekeeper Allowed App Source.
     * System and Privacy setting that determines which download locations apps can be run from on a macOS device.
     */
    @SerializedName("gatekeeperAllowedAppSource")
    @Expose
    public MacOSGatekeeperAppSources gatekeeperAllowedAppSource;

    /**
     * The Gatekeeper Block Override.
     * If set to true, the user override for Gatekeeper will be disabled.
     */
    @SerializedName("gatekeeperBlockOverride")
    @Expose
    public Boolean gatekeeperBlockOverride;


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
