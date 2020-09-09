// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.RetireScheduledManagedDevice;
import com.microsoft.graph.models.generated.ScheduledRetireState;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyScript;
import com.microsoft.graph.models.extensions.DeviceComplianceScriptValidationResult;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Compliance Policy Reference Request Builder.
 */
public interface IDeviceCompliancePolicyReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @return the IDeviceCompliancePolicyReferenceRequest instance
     */
    IDeviceCompliancePolicyReferenceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceCompliancePolicyReferenceRequest instance
     */
    IDeviceCompliancePolicyReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
