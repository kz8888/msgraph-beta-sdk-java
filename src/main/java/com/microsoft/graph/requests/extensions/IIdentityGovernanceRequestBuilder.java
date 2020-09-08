// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityGovernance;
import com.microsoft.graph.requests.extensions.IAccessReviewSetRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsOfUseContainerRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntitlementManagementRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Identity Governance Request Builder.
 */
public interface IIdentityGovernanceRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IIdentityGovernanceRequest instance
     */
    IIdentityGovernanceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IIdentityGovernanceRequest instance
     */
    IIdentityGovernanceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for AccessReviewSet
     *
     * @return the IAccessReviewSetRequestBuilder instance
     */
    IAccessReviewSetRequestBuilder accessReviews();

    /**
     * Gets the request builder for TermsOfUseContainer
     *
     * @return the ITermsOfUseContainerRequestBuilder instance
     */
    ITermsOfUseContainerRequestBuilder termsOfUse();

    /**
     * Gets the request builder for EntitlementManagement
     *
     * @return the IEntitlementManagementRequestBuilder instance
     */
    IEntitlementManagementRequestBuilder entitlementManagement();

}