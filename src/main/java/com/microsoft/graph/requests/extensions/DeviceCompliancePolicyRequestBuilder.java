// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.RetireScheduledManagedDevice;
import com.microsoft.graph.models.generated.ScheduledRetireState;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyScript;
import com.microsoft.graph.models.extensions.DeviceComplianceScriptValidationResult;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignParameterSet;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyScheduleActionsForRulesParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Request Builder.
 */
public class DeviceCompliancePolicyRequestBuilder extends BaseRequestBuilder<DeviceCompliancePolicy> {

    /**
     * The request builder for the DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceCompliancePolicyRequest instance
     */
    @Nonnull
    public DeviceCompliancePolicyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceCompliancePolicyRequest instance
     */
    @Nonnull
    public DeviceCompliancePolicyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceCompliancePolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequestBuilder assignments() {
        return new DeviceCompliancePolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new DeviceCompliancePolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SettingStateDeviceSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the SettingStateDeviceSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(@Nonnull final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceComplianceDeviceStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceComplianceDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceComplianceDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceDeviceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceComplianceDeviceStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new DeviceComplianceDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceComplianceDeviceOverview
     *
     * @return the DeviceComplianceDeviceOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceComplianceDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceComplianceDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceComplianceScheduledActionForRule collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleCollectionRequestBuilder scheduledActionsForRule() {
        return new DeviceComplianceScheduledActionForRuleCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceScheduledActionForRule item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceComplianceScheduledActionForRuleRequestBuilder scheduledActionsForRule(@Nonnull final String id) {
        return new DeviceComplianceScheduledActionForRuleRequestBuilder(getRequestUrlWithAdditionalSegment("scheduledActionsForRule") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceComplianceUserStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceComplianceUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceComplianceUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceComplianceUserStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceComplianceUserStatusRequestBuilder userStatuses(@Nonnull final String id) {
        return new DeviceComplianceUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceComplianceUserOverview
     *
     * @return the DeviceComplianceUserOverviewRequestBuilder instance
     */
    @Nonnull
    public DeviceComplianceUserOverviewRequestBuilder userStatusOverview() {
        return new DeviceComplianceUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceCompliancePolicyAssignCollectionRequestBuilder assign(@Nonnull final DeviceCompliancePolicyAssignParameterSet parameters) {
        return new DeviceCompliancePolicyAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceCompliancePolicyScheduleActionsForRulesRequestBuilder scheduleActionsForRules(@Nonnull final DeviceCompliancePolicyScheduleActionsForRulesParameterSet parameters) {
        return new DeviceCompliancePolicyScheduleActionsForRulesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.scheduleActionsForRules"), getClient(), null, parameters);
    }
}
