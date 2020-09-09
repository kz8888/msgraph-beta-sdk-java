// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request Collection Request.
 */
public class PrivilegedRoleAssignmentRequestCollectionRequest extends BaseCollectionRequest<PrivilegedRoleAssignmentRequestCollectionResponse, IPrivilegedRoleAssignmentRequestCollectionPage> implements IPrivilegedRoleAssignmentRequestCollectionRequest {

    /**
     * The request builder for this collection of PrivilegedRoleAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentRequestCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleAssignmentRequestCollectionResponse.class, IPrivilegedRoleAssignmentRequestCollectionPage.class);
    }

    public void get(final ICallback<IPrivilegedRoleAssignmentRequestCollectionPage> callback) {
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

    public IPrivilegedRoleAssignmentRequestCollectionPage get() throws ClientException {
        final PrivilegedRoleAssignmentRequestCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final ICallback<PrivilegedRoleAssignmentRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrivilegedRoleAssignmentRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrivilegedRoleAssignmentRequest, callback);
    }

    public PrivilegedRoleAssignmentRequest post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrivilegedRoleAssignmentRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrivilegedRoleAssignmentRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrivilegedRoleAssignmentRequestCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrivilegedRoleAssignmentRequestCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrivilegedRoleAssignmentRequestCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PrivilegedRoleAssignmentRequestCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentRequestCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPrivilegedRoleAssignmentRequestCollectionRequest)this;
    }
    public IPrivilegedRoleAssignmentRequestCollectionPage buildFromResponse(final PrivilegedRoleAssignmentRequestCollectionResponse response) {
        final IPrivilegedRoleAssignmentRequestCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrivilegedRoleAssignmentRequestCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrivilegedRoleAssignmentRequestCollectionPage page = new PrivilegedRoleAssignmentRequestCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
