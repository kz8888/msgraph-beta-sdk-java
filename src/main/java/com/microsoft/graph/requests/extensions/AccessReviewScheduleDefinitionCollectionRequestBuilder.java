// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReviewSet;
import com.microsoft.graph.models.extensions.AccessReviewScheduleDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAccessReviewScheduleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewScheduleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewScheduleDefinitionCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Schedule Definition Collection Request Builder.
 */
public class AccessReviewScheduleDefinitionCollectionRequestBuilder extends BaseRequestBuilder implements IAccessReviewScheduleDefinitionCollectionRequestBuilder {

    /**
     * The request builder for this collection of AccessReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewScheduleDefinitionCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAccessReviewScheduleDefinitionCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAccessReviewScheduleDefinitionCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AccessReviewScheduleDefinitionCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAccessReviewScheduleDefinitionRequestBuilder byId(final String id) {
        return new AccessReviewScheduleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
