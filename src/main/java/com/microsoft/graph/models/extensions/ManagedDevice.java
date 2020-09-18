// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ChassisType;
import com.microsoft.graph.models.generated.ComplianceState;
import com.microsoft.graph.models.extensions.ConfigurationManagerClientEnabledFeatures;
import com.microsoft.graph.models.extensions.ConfigurationManagerClientHealthState;
import com.microsoft.graph.models.extensions.ConfigurationManagerClientInformation;
import com.microsoft.graph.models.extensions.DeviceActionResult;
import com.microsoft.graph.models.generated.DeviceEnrollmentType;
import com.microsoft.graph.models.extensions.DeviceHealthAttestationState;
import com.microsoft.graph.models.generated.DeviceRegistrationState;
import com.microsoft.graph.models.generated.DeviceType;
import com.microsoft.graph.models.generated.DeviceManagementExchangeAccessState;
import com.microsoft.graph.models.generated.DeviceManagementExchangeAccessStateReason;
import com.microsoft.graph.models.extensions.HardwareInformation;
import com.microsoft.graph.models.generated.JoinType;
import com.microsoft.graph.models.generated.LostModeState;
import com.microsoft.graph.models.generated.ManagedDeviceOwnerType;
import com.microsoft.graph.models.generated.ManagementAgentType;
import com.microsoft.graph.models.generated.ManagementState;
import com.microsoft.graph.models.generated.OwnerType;
import com.microsoft.graph.models.generated.ManagedDevicePartnerReportedHealthState;
import com.microsoft.graph.models.generated.ManagedDeviceArchitecture;
import com.microsoft.graph.models.extensions.LoggedOnUser;
import com.microsoft.graph.models.extensions.SecurityBaselineState;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyState;
import com.microsoft.graph.models.extensions.DeviceConfigurationState;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationState;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.models.extensions.DeviceCategory;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.WindowsProtectionState;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.SecurityBaselineStateCollectionResponse;
import com.microsoft.graph.requests.extensions.SecurityBaselineStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceConfigurationStateCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationStateCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationStateCollectionPage;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionResponse;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceLogCollectionResponseCollectionResponse;
import com.microsoft.graph.requests.extensions.DeviceLogCollectionResponseCollectionPage;
import com.microsoft.graph.requests.extensions.UserCollectionResponse;
import com.microsoft.graph.requests.extensions.UserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device.
 */
public class ManagedDevice extends Entity implements IJsonBackedObject {


    /**
     * The Aad Registered.
     * Whether the device is Azure Active Directory registered. This property is read-only.
     */
    @SerializedName("aadRegistered")
    @Expose
    public Boolean aadRegistered;

    /**
     * The Activation Lock Bypass Code.
     * Code that allows the Activation Lock on a device to be bypassed.
     */
    @SerializedName("activationLockBypassCode")
    @Expose
    public String activationLockBypassCode;

    /**
     * The Android Security Patch Level.
     * Android security patch level
     */
    @SerializedName("androidSecurityPatchLevel")
    @Expose
    public String androidSecurityPatchLevel;

    /**
     * The Autopilot Enrolled.
     * Reports if the managed device is enrolled via auto-pilot. This property is read-only.
     */
    @SerializedName("autopilotEnrolled")
    @Expose
    public Boolean autopilotEnrolled;

    /**
     * The Azure Active Directory Device Id.
     * The unique identifier for the Azure Active Directory device. Read only. This property is read-only.
     */
    @SerializedName("azureActiveDirectoryDeviceId")
    @Expose
    public String azureActiveDirectoryDeviceId;

    /**
     * The Azure ADDevice Id.
     * The unique identifier for the Azure Active Directory device. Read only.
     */
    @SerializedName("azureADDeviceId")
    @Expose
    public String azureADDeviceId;

    /**
     * The Azure ADRegistered.
     * Whether the device is Azure Active Directory registered.
     */
    @SerializedName("azureADRegistered")
    @Expose
    public Boolean azureADRegistered;

    /**
     * The Chassis Type.
     * Chassis type of the device. This property is read-only.
     */
    @SerializedName("chassisType")
    @Expose
    public ChassisType chassisType;

    /**
     * The Compliance Grace Period Expiration Date Time.
     * The DateTime when device compliance grace period expires
     */
    @SerializedName("complianceGracePeriodExpirationDateTime")
    @Expose
    public java.util.Calendar complianceGracePeriodExpirationDateTime;

    /**
     * The Compliance State.
     * Compliance state of the device. Possible values are: unknown, compliant, noncompliant, conflict, error, inGracePeriod, configManager.
     */
    @SerializedName("complianceState")
    @Expose
    public ComplianceState complianceState;

    /**
     * The Configuration Manager Client Enabled Features.
     * ConfigrMgr client enabled features
     */
    @SerializedName("configurationManagerClientEnabledFeatures")
    @Expose
    public ConfigurationManagerClientEnabledFeatures configurationManagerClientEnabledFeatures;

    /**
     * The Configuration Manager Client Health State.
     * Configuration manager client health state, valid only for devices managed by MDM/ConfigMgr Agent
     */
    @SerializedName("configurationManagerClientHealthState")
    @Expose
    public ConfigurationManagerClientHealthState configurationManagerClientHealthState;

    /**
     * The Configuration Manager Client Information.
     * Configuration manager client information, valid only for devices managed, duel-managed or tri-managed by ConfigMgr Agent
     */
    @SerializedName("configurationManagerClientInformation")
    @Expose
    public ConfigurationManagerClientInformation configurationManagerClientInformation;

    /**
     * The Device Action Results.
     * List of ComplexType deviceActionResult objects.
     */
    @SerializedName("deviceActionResults")
    @Expose
    public java.util.List<DeviceActionResult> deviceActionResults;

    /**
     * The Device Category Display Name.
     * Device category display name
     */
    @SerializedName("deviceCategoryDisplayName")
    @Expose
    public String deviceCategoryDisplayName;

    /**
     * The Device Enrollment Type.
     * Enrollment type of the device. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement.
     */
    @SerializedName("deviceEnrollmentType")
    @Expose
    public DeviceEnrollmentType deviceEnrollmentType;

    /**
     * The Device Health Attestation State.
     * The device health attestation state.
     */
    @SerializedName("deviceHealthAttestationState")
    @Expose
    public DeviceHealthAttestationState deviceHealthAttestationState;

    /**
     * The Device Name.
     * Name of the device
     */
    @SerializedName("deviceName")
    @Expose
    public String deviceName;

    /**
     * The Device Registration State.
     * Device registration state. Possible values are: notRegistered, registered, revoked, keyConflict, approvalPending, certificateReset, notRegisteredPendingEnrollment, unknown.
     */
    @SerializedName("deviceRegistrationState")
    @Expose
    public DeviceRegistrationState deviceRegistrationState;

    /**
     * The Device Type.
     * Platform of the device. This property is read-only.
     */
    @SerializedName("deviceType")
    @Expose
    public DeviceType deviceType;

    /**
     * The Eas Activated.
     * Whether the device is Exchange ActiveSync activated.
     */
    @SerializedName("easActivated")
    @Expose
    public Boolean easActivated;

    /**
     * The Eas Activation Date Time.
     * Exchange ActivationSync activation time of the device.
     */
    @SerializedName("easActivationDateTime")
    @Expose
    public java.util.Calendar easActivationDateTime;

    /**
     * The Eas Device Id.
     * Exchange ActiveSync Id of the device.
     */
    @SerializedName("easDeviceId")
    @Expose
    public String easDeviceId;

    /**
     * The Email Address.
     * Email(s) for the user associated with the device
     */
    @SerializedName("emailAddress")
    @Expose
    public String emailAddress;

    /**
     * The Enrolled Date Time.
     * Enrollment time of the device.
     */
    @SerializedName("enrolledDateTime")
    @Expose
    public java.util.Calendar enrolledDateTime;

    /**
     * The Ethernet Mac Address.
     * Ethernet MAC. This property is read-only.
     */
    @SerializedName("ethernetMacAddress")
    @Expose
    public String ethernetMacAddress;

    /**
     * The Exchange Access State.
     * The Access State of the device in Exchange. Possible values are: none, unknown, allowed, blocked, quarantined.
     */
    @SerializedName("exchangeAccessState")
    @Expose
    public DeviceManagementExchangeAccessState exchangeAccessState;

    /**
     * The Exchange Access State Reason.
     * The reason for the device's access state in Exchange. Possible values are: none, unknown, exchangeGlobalRule, exchangeIndividualRule, exchangeDeviceRule, exchangeUpgrade, exchangeMailboxPolicy, other, compliant, notCompliant, notEnrolled, unknownLocation, mfaRequired, azureADBlockDueToAccessPolicy, compromisedPassword, deviceNotKnownWithManagedApp.
     */
    @SerializedName("exchangeAccessStateReason")
    @Expose
    public DeviceManagementExchangeAccessStateReason exchangeAccessStateReason;

    /**
     * The Exchange Last Successful Sync Date Time.
     * Last time the device contacted Exchange.
     */
    @SerializedName("exchangeLastSuccessfulSyncDateTime")
    @Expose
    public java.util.Calendar exchangeLastSuccessfulSyncDateTime;

    /**
     * The Free Storage Space In Bytes.
     * Free Storage in Bytes
     */
    @SerializedName("freeStorageSpaceInBytes")
    @Expose
    public Long freeStorageSpaceInBytes;

    /**
     * The Hardware Information.
     * The hardward details for the device.  Includes information such as storage space, manufacturer, serial number, etc. This property is read-only.
     */
    @SerializedName("hardwareInformation")
    @Expose
    public HardwareInformation hardwareInformation;

    /**
     * The Iccid.
     * Integrated Circuit Card Identifier, it is A SIM card's unique identification number. This property is read-only.
     */
    @SerializedName("iccid")
    @Expose
    public String iccid;

    /**
     * The Imei.
     * IMEI
     */
    @SerializedName("imei")
    @Expose
    public String imei;

    /**
     * The Is Encrypted.
     * Device encryption status
     */
    @SerializedName("isEncrypted")
    @Expose
    public Boolean isEncrypted;

    /**
     * The Is Supervised.
     * Device supervised status
     */
    @SerializedName("isSupervised")
    @Expose
    public Boolean isSupervised;

    /**
     * The Jail Broken.
     * whether the device is jail broken or rooted.
     */
    @SerializedName("jailBroken")
    @Expose
    public String jailBroken;

    /**
     * The Join Type.
     * Device join type
     */
    @SerializedName("joinType")
    @Expose
    public JoinType joinType;

    /**
     * The Last Sync Date Time.
     * The date and time that the device last completed a successful sync with Intune.
     */
    @SerializedName("lastSyncDateTime")
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Lost Mode State.
     * Indicates if Lost mode is enabled or disabled. This property is read-only.
     */
    @SerializedName("lostModeState")
    @Expose
    public LostModeState lostModeState;

    /**
     * The Managed Device Name.
     * Automatically generated name to identify a device. Can be overwritten to a user friendly name.
     */
    @SerializedName("managedDeviceName")
    @Expose
    public String managedDeviceName;

    /**
     * The Managed Device Owner Type.
     * Ownership of the device. Can be 'company' or 'personal'. Possible values are: unknown, company, personal.
     */
    @SerializedName("managedDeviceOwnerType")
    @Expose
    public ManagedDeviceOwnerType managedDeviceOwnerType;

    /**
     * The Management Agent.
     * Management channel of the device. Intune, EAS, etc. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController.
     */
    @SerializedName("managementAgent")
    @Expose
    public ManagementAgentType managementAgent;

    /**
     * The Management Certificate Expiration Date.
     * Reports device management certificate expiration date. This property is read-only.
     */
    @SerializedName("managementCertificateExpirationDate")
    @Expose
    public java.util.Calendar managementCertificateExpirationDate;

    /**
     * The Management State.
     * Management state of the device. This property is read-only.
     */
    @SerializedName("managementState")
    @Expose
    public ManagementState managementState;

    /**
     * The Manufacturer.
     * Manufacturer of the device
     */
    @SerializedName("manufacturer")
    @Expose
    public String manufacturer;

    /**
     * The Meid.
     * MEID
     */
    @SerializedName("meid")
    @Expose
    public String meid;

    /**
     * The Model.
     * Model of the device
     */
    @SerializedName("model")
    @Expose
    public String model;

    /**
     * The Notes.
     * Notes on the device created by IT Admin
     */
    @SerializedName("notes")
    @Expose
    public String notes;

    /**
     * The Operating System.
     * Operating system of the device. Windows, iOS, etc.
     */
    @SerializedName("operatingSystem")
    @Expose
    public String operatingSystem;

    /**
     * The Os Version.
     * Operating system version of the device.
     */
    @SerializedName("osVersion")
    @Expose
    public String osVersion;

    /**
     * The Owner Type.
     * Ownership of the device. Can be 'company' or 'personal'
     */
    @SerializedName("ownerType")
    @Expose
    public OwnerType ownerType;

    /**
     * The Partner Reported Threat State.
     * Indicates the threat state of a device when a Mobile Threat Defense partner is in use by the account and device. Read Only. Possible values are: unknown, activated, deactivated, secured, lowSeverity, mediumSeverity, highSeverity, unresponsive, compromised, misconfigured.
     */
    @SerializedName("partnerReportedThreatState")
    @Expose
    public ManagedDevicePartnerReportedHealthState partnerReportedThreatState;

    /**
     * The Phone Number.
     * Phone number of the device
     */
    @SerializedName("phoneNumber")
    @Expose
    public String phoneNumber;

    /**
     * The Physical Memory In Bytes.
     * Total Memory in Bytes. This property is read-only.
     */
    @SerializedName("physicalMemoryInBytes")
    @Expose
    public Long physicalMemoryInBytes;

    /**
     * The Prefer Mdm Over Group Policy Applied Date Time.
     * Reports the DateTime the preferMdmOverGroupPolicy setting was set.  When set, the Intune MDM settings will override Group Policy settings if there is a conflict. Read Only. This property is read-only.
     */
    @SerializedName("preferMdmOverGroupPolicyAppliedDateTime")
    @Expose
    public java.util.Calendar preferMdmOverGroupPolicyAppliedDateTime;

    /**
     * The Processor Architecture.
     * Processor architecture. This property is read-only.
     */
    @SerializedName("processorArchitecture")
    @Expose
    public ManagedDeviceArchitecture processorArchitecture;

    /**
     * The Remote Assistance Session Error Details.
     * An error string that identifies issues when creating Remote Assistance session objects.
     */
    @SerializedName("remoteAssistanceSessionErrorDetails")
    @Expose
    public String remoteAssistanceSessionErrorDetails;

    /**
     * The Remote Assistance Session Url.
     * Url that allows a Remote Assistance session to be established with the device.
     */
    @SerializedName("remoteAssistanceSessionUrl")
    @Expose
    public String remoteAssistanceSessionUrl;

    /**
     * The Require User Enrollment Approval.
     * Reports if the managed iOS device is user approval enrollment. This property is read-only.
     */
    @SerializedName("requireUserEnrollmentApproval")
    @Expose
    public Boolean requireUserEnrollmentApproval;

    /**
     * The Retire After Date Time.
     * Indicates the time after when a device will be auto retired because of scheduled action. This property is read-only.
     */
    @SerializedName("retireAfterDateTime")
    @Expose
    public java.util.Calendar retireAfterDateTime;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tag IDs for this Device instance.
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;

    /**
     * The Serial Number.
     * SerialNumber
     */
    @SerializedName("serialNumber")
    @Expose
    public String serialNumber;

    /**
     * The Sku Family.
     * Device sku family
     */
    @SerializedName("skuFamily")
    @Expose
    public String skuFamily;

    /**
     * The Specification Version.
     * Specification version. This property is read-only.
     */
    @SerializedName("specificationVersion")
    @Expose
    public String specificationVersion;

    /**
     * The Subscriber Carrier.
     * Subscriber Carrier
     */
    @SerializedName("subscriberCarrier")
    @Expose
    public String subscriberCarrier;

    /**
     * The Total Storage Space In Bytes.
     * Total Storage in Bytes
     */
    @SerializedName("totalStorageSpaceInBytes")
    @Expose
    public Long totalStorageSpaceInBytes;

    /**
     * The Udid.
     * Unique Device Identifier for iOS and macOS devices. This property is read-only.
     */
    @SerializedName("udid")
    @Expose
    public String udid;

    /**
     * The User Display Name.
     * User display name
     */
    @SerializedName("userDisplayName")
    @Expose
    public String userDisplayName;

    /**
     * The User Id.
     * Unique Identifier for the user associated with the device
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The User Principal Name.
     * Device user principal name
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Users Logged On.
     * Indicates the last logged on users of a device. This property is read-only.
     */
    @SerializedName("usersLoggedOn")
    @Expose
    public java.util.List<LoggedOnUser> usersLoggedOn;

    /**
     * The Wi Fi Mac Address.
     * Wi-Fi MAC
     */
    @SerializedName("wiFiMacAddress")
    @Expose
    public String wiFiMacAddress;

    /**
     * The Windows Active Malware Count.
     * Count of active malware for this windows device. This property is read-only.
     */
    @SerializedName("windowsActiveMalwareCount")
    @Expose
    public Integer windowsActiveMalwareCount;

    /**
     * The Windows Remediated Malware Count.
     * Count of remediated malware for this windows device. This property is read-only.
     */
    @SerializedName("windowsRemediatedMalwareCount")
    @Expose
    public Integer windowsRemediatedMalwareCount;

    /**
     * The Security Baseline States.
     * Security baseline states for this device.
     */
    @SerializedName("securityBaselineStates")
    @Expose
    public SecurityBaselineStateCollectionPage securityBaselineStates;

    /**
     * The Device Compliance Policy States.
     * Device compliance policy states for this device.
     */
    @SerializedName("deviceCompliancePolicyStates")
    @Expose
    public DeviceCompliancePolicyStateCollectionPage deviceCompliancePolicyStates;

    /**
     * The Device Configuration States.
     * Device configuration states for this device.
     */
    @SerializedName("deviceConfigurationStates")
    @Expose
    public DeviceConfigurationStateCollectionPage deviceConfigurationStates;

    /**
     * The Managed Device Mobile App Configuration States.
     * Managed device mobile app configuration states for this device.
     */
    @SerializedName("managedDeviceMobileAppConfigurationStates")
    @Expose
    public ManagedDeviceMobileAppConfigurationStateCollectionPage managedDeviceMobileAppConfigurationStates;

    /**
     * The Detected Apps.
     * All applications currently installed on the device
     */
    public DetectedAppCollectionPage detectedApps;

    /**
     * The Device Category.
     * Device category
     */
    @SerializedName("deviceCategory")
    @Expose
    public DeviceCategory deviceCategory;

    /**
     * The Log Collection Requests.
     * List of log collection requests
     */
    @SerializedName("logCollectionRequests")
    @Expose
    public DeviceLogCollectionResponseCollectionPage logCollectionRequests;

    /**
     * The Users.
     * The primary users associated with the managed device.
     */
    @SerializedName("users")
    @Expose
    public UserCollectionPage users;

    /**
     * The Windows Protection State.
     * The device protection status.
     */
    @SerializedName("windowsProtectionState")
    @Expose
    public WindowsProtectionState windowsProtectionState;


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


        if (json.has("securityBaselineStates")) {
            final SecurityBaselineStateCollectionResponse response = new SecurityBaselineStateCollectionResponse();
            if (json.has("securityBaselineStates@odata.nextLink")) {
                response.nextLink = json.get("securityBaselineStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("securityBaselineStates").toString(), JsonObject[].class);
            final SecurityBaselineState[] array = new SecurityBaselineState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SecurityBaselineState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            securityBaselineStates = new SecurityBaselineStateCollectionPage(response, null);
        }

        if (json.has("deviceCompliancePolicyStates")) {
            final DeviceCompliancePolicyStateCollectionResponse response = new DeviceCompliancePolicyStateCollectionResponse();
            if (json.has("deviceCompliancePolicyStates@odata.nextLink")) {
                response.nextLink = json.get("deviceCompliancePolicyStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceCompliancePolicyStates").toString(), JsonObject[].class);
            final DeviceCompliancePolicyState[] array = new DeviceCompliancePolicyState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceCompliancePolicyState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceCompliancePolicyStates = new DeviceCompliancePolicyStateCollectionPage(response, null);
        }

        if (json.has("deviceConfigurationStates")) {
            final DeviceConfigurationStateCollectionResponse response = new DeviceConfigurationStateCollectionResponse();
            if (json.has("deviceConfigurationStates@odata.nextLink")) {
                response.nextLink = json.get("deviceConfigurationStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("deviceConfigurationStates").toString(), JsonObject[].class);
            final DeviceConfigurationState[] array = new DeviceConfigurationState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceConfigurationState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            deviceConfigurationStates = new DeviceConfigurationStateCollectionPage(response, null);
        }

        if (json.has("managedDeviceMobileAppConfigurationStates")) {
            final ManagedDeviceMobileAppConfigurationStateCollectionResponse response = new ManagedDeviceMobileAppConfigurationStateCollectionResponse();
            if (json.has("managedDeviceMobileAppConfigurationStates@odata.nextLink")) {
                response.nextLink = json.get("managedDeviceMobileAppConfigurationStates@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managedDeviceMobileAppConfigurationStates").toString(), JsonObject[].class);
            final ManagedDeviceMobileAppConfigurationState[] array = new ManagedDeviceMobileAppConfigurationState[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedDeviceMobileAppConfigurationState.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managedDeviceMobileAppConfigurationStates = new ManagedDeviceMobileAppConfigurationStateCollectionPage(response, null);
        }

        if (json.has("detectedApps")) {
            final DetectedAppCollectionResponse response = new DetectedAppCollectionResponse();
            if (json.has("detectedApps@odata.nextLink")) {
                response.nextLink = json.get("detectedApps@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("detectedApps").toString(), JsonObject[].class);
            final DetectedApp[] array = new DetectedApp[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DetectedApp.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            detectedApps = new DetectedAppCollectionPage(response, null);
        }

        if (json.has("logCollectionRequests")) {
            final DeviceLogCollectionResponseCollectionResponse response = new DeviceLogCollectionResponseCollectionResponse();
            if (json.has("logCollectionRequests@odata.nextLink")) {
                response.nextLink = json.get("logCollectionRequests@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("logCollectionRequests").toString(), JsonObject[].class);
            final DeviceLogCollectionResponse[] array = new DeviceLogCollectionResponse[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DeviceLogCollectionResponse.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            logCollectionRequests = new DeviceLogCollectionResponseCollectionPage(response, null);
        }

        if (json.has("users")) {
            final UserCollectionResponse response = new UserCollectionResponse();
            if (json.has("users@odata.nextLink")) {
                response.nextLink = json.get("users@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("users").toString(), JsonObject[].class);
            final User[] array = new User[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), User.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            users = new UserCollectionPage(response, null);
        }
    }
}
