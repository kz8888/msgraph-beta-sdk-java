// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeClientConfiguration;
import com.microsoft.graph.models.extensions.OfficeClientConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Configuration Request Builder.
 */
public class OfficeClientConfigurationRequestBuilder extends BaseRequestBuilder implements IOfficeClientConfigurationRequestBuilder {

    /**
     * The request builder for the OfficeClientConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OfficeClientConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IOfficeClientConfigurationRequest instance
     */
    public IOfficeClientConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IOfficeClientConfigurationRequest instance
     */
    public IOfficeClientConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.OfficeClientConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IOfficeClientConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new OfficeClientConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IOfficeClientConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new OfficeClientConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public IOfficeClientConfigurationPolicyPayloadStreamRequestBuilder policyPayload() {
        return new OfficeClientConfigurationPolicyPayloadStreamRequestBuilder(getRequestUrlWithAdditionalSegment("policyPayload"), getClient(), null);
    }

    public IOfficeClientConfigurationUserPreferencePayloadStreamRequestBuilder userPreferencePayload() {
        return new OfficeClientConfigurationUserPreferencePayloadStreamRequestBuilder(getRequestUrlWithAdditionalSegment("userPreferencePayload"), getClient(), null);
    }

    public IOfficeClientConfigurationAssignCollectionRequestBuilder assign(final java.util.List<OfficeClientConfigurationAssignment> officeConfigurationAssignments) {
        return new OfficeClientConfigurationAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, officeConfigurationAssignments);
    }
}
