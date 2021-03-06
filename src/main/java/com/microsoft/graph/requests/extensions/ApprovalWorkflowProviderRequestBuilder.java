// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ApprovalWorkflowProvider;
import com.microsoft.graph.requests.extensions.IBusinessFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.BusinessFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BusinessFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernancePolicyTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernancePolicyTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernancePolicyTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernancePolicyTemplateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Workflow Provider Request Builder.
 */
public class ApprovalWorkflowProviderRequestBuilder extends BaseRequestBuilder implements IApprovalWorkflowProviderRequestBuilder {

    /**
     * The request builder for the ApprovalWorkflowProvider
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApprovalWorkflowProviderRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IApprovalWorkflowProviderRequest instance
     */
    public IApprovalWorkflowProviderRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IApprovalWorkflowProviderRequest instance
     */
    public IApprovalWorkflowProviderRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ApprovalWorkflowProviderRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IBusinessFlowCollectionRequestBuilder businessFlows() {
        return new BusinessFlowCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("businessFlows"), getClient(), null);
    }

    public IBusinessFlowRequestBuilder businessFlows(final String id) {
        return new BusinessFlowRequestBuilder(getRequestUrlWithAdditionalSegment("businessFlows") + "/" + id, getClient(), null);
    }
    public IBusinessFlowCollectionRequestBuilder businessFlowsWithRequestsAwaitingMyDecision() {
        return new BusinessFlowCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("businessFlowsWithRequestsAwaitingMyDecision"), getClient(), null);
    }

    public IBusinessFlowRequestBuilder businessFlowsWithRequestsAwaitingMyDecision(final String id) {
        return new BusinessFlowRequestBuilder(getRequestUrlWithAdditionalSegment("businessFlowsWithRequestsAwaitingMyDecision") + "/" + id, getClient(), null);
    }
    public IGovernancePolicyTemplateCollectionRequestBuilder policyTemplates() {
        return new GovernancePolicyTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("policyTemplates"), getClient(), null);
    }

    public IGovernancePolicyTemplateRequestBuilder policyTemplates(final String id) {
        return new GovernancePolicyTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("policyTemplates") + "/" + id, getClient(), null);
    }
}
