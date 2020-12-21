// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
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
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy With Reference Request Builder.
 */
public class DeviceCompliancePolicyWithReferenceRequestBuilder extends BaseRequestBuilder implements IDeviceCompliancePolicyWithReferenceRequestBuilder {

    /**
     * The request builder for the DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceCompliancePolicyWithReferenceRequest instance
     */
    public IDeviceCompliancePolicyWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IDeviceCompliancePolicyWithReferenceRequest instance
     */
    public IDeviceCompliancePolicyWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceCompliancePolicyWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceCompliancePolicyReferenceRequestBuilder reference(){
        return new DeviceCompliancePolicyReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
