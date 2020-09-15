// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TodoTask;
import com.microsoft.graph.models.extensions.LinkedResource;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ILinkedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILinkedResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.ILinkedResourceCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Linked Resource Collection Request Builder.
 */
public class LinkedResourceCollectionRequestBuilder extends BaseRequestBuilder implements ILinkedResourceCollectionRequestBuilder {

    /**
     * The request builder for this collection of TodoTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LinkedResourceCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ILinkedResourceCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ILinkedResourceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new LinkedResourceCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ILinkedResourceRequestBuilder byId(final String id) {
        return new LinkedResourceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
