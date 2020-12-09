// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CloudPcProvisioningPolicy;
import com.microsoft.graph.models.extensions.CloudPcProvisioningPolicyAssignment;
import com.microsoft.graph.requests.extensions.ICloudPcProvisioningPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudPcProvisioningPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudPcProvisioningPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudPcProvisioningPolicyAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc Provisioning Policy Request Builder.
 */
public class CloudPcProvisioningPolicyRequestBuilder extends BaseRequestBuilder implements ICloudPcProvisioningPolicyRequestBuilder {

    /**
     * The request builder for the CloudPcProvisioningPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPcProvisioningPolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICloudPcProvisioningPolicyRequest instance
     */
    public ICloudPcProvisioningPolicyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICloudPcProvisioningPolicyRequest instance
     */
    public ICloudPcProvisioningPolicyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.CloudPcProvisioningPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ICloudPcProvisioningPolicyAssignmentCollectionRequestBuilder assignments() {
        return new CloudPcProvisioningPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public ICloudPcProvisioningPolicyAssignmentRequestBuilder assignments(final String id) {
        return new CloudPcProvisioningPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public ICloudPcProvisioningPolicyAssignRequestBuilder assign(final java.util.List<CloudPcProvisioningPolicyAssignment> assignments) {
        return new CloudPcProvisioningPolicyAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }
}