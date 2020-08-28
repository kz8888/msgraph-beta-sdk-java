// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Collection Page.
 */
public class DeviceCompliancePolicyCollectionPage extends BaseCollectionPage<DeviceCompliancePolicy, IDeviceCompliancePolicyCollectionRequestBuilder> implements IDeviceCompliancePolicyCollectionPage {

    /**
     * A collection page for DeviceCompliancePolicy
     *
     * @param response the serialized DeviceCompliancePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCompliancePolicyCollectionPage(final DeviceCompliancePolicyCollectionResponse response, final IDeviceCompliancePolicyCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}