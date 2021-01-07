// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.RolePermission;
import com.microsoft.graph.models.extensions.ComanagedDevicesSummary;
import com.microsoft.graph.models.extensions.ComanagementEligibleDevicesSummary;
import com.microsoft.graph.models.extensions.SuggestedEnrollmentLimit;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignedRoleDetails;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementAssignmentFilterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementAssignmentFilterRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.CartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateAccountSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSSoftwareUpdateAccountSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateRequestBuilder;
import com.microsoft.graph.requests.extensions.NdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NdesConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComplianceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ComanagementEligibleDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.DataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataSharingConsentRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteActionAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthApplicationPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthOSVersionPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsAppHealthOSVersionPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsBaselineRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsScoreHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppleUserInitiatedEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyMigrationReportRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyObjectFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelSiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelSiteRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.ConfigManagerCollectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConfigManagerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementAutopilotEventRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsFeatureUpdateProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.UserPFXCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserPFXCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.VirtualEndpointRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SoftwareUpdateStatusSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsRegressionSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Request.
 */
public class DeviceManagementRequest extends BaseRequest<DeviceManagement> {
	
    /**
     * The request for the DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagement.class);
    }

    /**
     * Gets the DeviceManagement from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceManagement> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagement from the service
     *
     * @return the DeviceManagement from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceManagement> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagement with a source
     *
     * @param sourceDeviceManagement the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceManagement sourceDeviceManagement, @Nonnull final ICallback<? super DeviceManagement> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagement);
    }

    /**
     * Patches this DeviceManagement with a source
     *
     * @param sourceDeviceManagement the source object with updates
     * @return the updated DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement patch(@Nonnull final DeviceManagement sourceDeviceManagement) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceManagement newDeviceManagement, @Nonnull final ICallback<? super DeviceManagement> callback) {
        send(HttpMethod.POST, callback, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the new object to create
     * @return the created DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement post(@Nonnull final DeviceManagement newDeviceManagement) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceManagement newDeviceManagement, @Nonnull final ICallback<? super DeviceManagement> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagement);
    }

    /**
     * Creates a DeviceManagement with a new object
     *
     * @param newDeviceManagement the object to create/update
     * @return the created DeviceManagement
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagement put(@Nonnull final DeviceManagement newDeviceManagement) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagement);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

