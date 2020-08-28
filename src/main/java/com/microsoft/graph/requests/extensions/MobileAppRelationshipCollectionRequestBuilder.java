// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.MobileAppRelationship;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMobileAppRelationshipCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRelationshipCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Relationship Collection Request Builder.
 */
public class MobileAppRelationshipCollectionRequestBuilder extends BaseRequestBuilder implements IMobileAppRelationshipCollectionRequestBuilder {

    /**
     * The request builder for this collection of MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppRelationshipCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IMobileAppRelationshipCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IMobileAppRelationshipCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new MobileAppRelationshipCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IMobileAppRelationshipRequestBuilder byId(final String id) {
        return new MobileAppRelationshipRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}