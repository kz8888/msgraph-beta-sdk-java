// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagedEBookAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookAssignmentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Assignment Collection Request Builder.
 */
public class ManagedEBookAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements IManagedEBookAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of ManagedEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedEBookAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagedEBookAssignmentCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IManagedEBookAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ManagedEBookAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedEBookAssignmentRequestBuilder byId(final String id) {
        return new ManagedEBookAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
