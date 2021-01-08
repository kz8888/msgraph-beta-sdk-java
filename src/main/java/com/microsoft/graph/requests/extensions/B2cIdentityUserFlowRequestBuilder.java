// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.B2cIdentityUserFlow;
import com.microsoft.graph.requests.extensions.IdentityProviderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityProviderRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2c Identity User Flow Request Builder.
 */
public class B2cIdentityUserFlowRequestBuilder extends BaseRequestBuilder<B2cIdentityUserFlow> {

    /**
     * The request builder for the B2cIdentityUserFlow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public B2cIdentityUserFlowRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the B2cIdentityUserFlowRequest instance
     */
    @Nonnull
    public B2cIdentityUserFlowRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the B2cIdentityUserFlowRequest instance
     */
    @Nonnull
    public B2cIdentityUserFlowRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.B2cIdentityUserFlowRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the IdentityProvider collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IdentityProviderCollectionWithReferencesRequestBuilder identityProviders() {
        return new IdentityProviderCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("identityProviders"), getClient(), null);
    }

    /**
     * Gets a request builder for the IdentityProvider item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IdentityProviderWithReferenceRequestBuilder identityProviders(@Nonnull final String id) {
        return new IdentityProviderWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("identityProviders") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the IdentityUserFlowAttributeAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public IdentityUserFlowAttributeAssignmentCollectionRequestBuilder userAttributeAssignments() {
        return new IdentityUserFlowAttributeAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userAttributeAssignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the IdentityUserFlowAttributeAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public IdentityUserFlowAttributeAssignmentRequestBuilder userAttributeAssignments(@Nonnull final String id) {
        return new IdentityUserFlowAttributeAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("userAttributeAssignments") + "/" + id, getClient(), null);
    }
}
