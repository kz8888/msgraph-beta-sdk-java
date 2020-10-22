// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplicationMultiple;
import com.microsoft.graph.models.extensions.UnifiedRbacResourceNamespace;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUnifiedRbacResourceNamespaceCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRbacResourceNamespaceCollectionResponse;
import com.microsoft.graph.requests.extensions.IUnifiedRbacResourceNamespaceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRbacResourceNamespaceCollectionRequest;
import com.microsoft.graph.requests.extensions.UnifiedRbacResourceNamespaceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Rbac Resource Namespace Collection Request.
 */
public class UnifiedRbacResourceNamespaceCollectionRequest extends BaseCollectionRequest<UnifiedRbacResourceNamespaceCollectionResponse, IUnifiedRbacResourceNamespaceCollectionPage> implements IUnifiedRbacResourceNamespaceCollectionRequest {

    /**
     * The request builder for this collection of UnifiedRbacResourceNamespace
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRbacResourceNamespaceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRbacResourceNamespaceCollectionResponse.class, IUnifiedRbacResourceNamespaceCollectionPage.class);
    }

    public void get(final ICallback<? super IUnifiedRbacResourceNamespaceCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IUnifiedRbacResourceNamespaceCollectionPage get() throws ClientException {
        final UnifiedRbacResourceNamespaceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UnifiedRbacResourceNamespace newUnifiedRbacResourceNamespace, final ICallback<? super UnifiedRbacResourceNamespace> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UnifiedRbacResourceNamespaceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRbacResourceNamespace, callback);
    }

    public UnifiedRbacResourceNamespace post(final UnifiedRbacResourceNamespace newUnifiedRbacResourceNamespace) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UnifiedRbacResourceNamespaceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRbacResourceNamespace);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRbacResourceNamespaceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRbacResourceNamespaceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUnifiedRbacResourceNamespaceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UnifiedRbacResourceNamespaceCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IUnifiedRbacResourceNamespaceCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (UnifiedRbacResourceNamespaceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRbacResourceNamespaceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UnifiedRbacResourceNamespaceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUnifiedRbacResourceNamespaceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UnifiedRbacResourceNamespaceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUnifiedRbacResourceNamespaceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UnifiedRbacResourceNamespaceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUnifiedRbacResourceNamespaceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUnifiedRbacResourceNamespaceCollectionRequest)this;
    }
    public IUnifiedRbacResourceNamespaceCollectionPage buildFromResponse(final UnifiedRbacResourceNamespaceCollectionResponse response) {
        final IUnifiedRbacResourceNamespaceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UnifiedRbacResourceNamespaceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UnifiedRbacResourceNamespaceCollectionPage page = new UnifiedRbacResourceNamespaceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}