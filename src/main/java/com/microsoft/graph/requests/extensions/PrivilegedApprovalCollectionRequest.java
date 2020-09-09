// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedApproval;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalCollectionRequest;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Approval Collection Request.
 */
public class PrivilegedApprovalCollectionRequest extends BaseCollectionRequest<PrivilegedApprovalCollectionResponse, IPrivilegedApprovalCollectionPage> implements IPrivilegedApprovalCollectionRequest {

    /**
     * The request builder for this collection of PrivilegedApproval
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedApprovalCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedApprovalCollectionResponse.class, IPrivilegedApprovalCollectionPage.class);
    }

    public void get(final ICallback<IPrivilegedApprovalCollectionPage> callback) {
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

    public IPrivilegedApprovalCollectionPage get() throws ClientException {
        final PrivilegedApprovalCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrivilegedApproval newPrivilegedApproval, final ICallback<PrivilegedApproval> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrivilegedApprovalRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrivilegedApproval, callback);
    }

    public PrivilegedApproval post(final PrivilegedApproval newPrivilegedApproval) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrivilegedApprovalRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrivilegedApproval);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrivilegedApprovalCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrivilegedApprovalCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrivilegedApprovalCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrivilegedApprovalCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrivilegedApprovalCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrivilegedApprovalCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPrivilegedApprovalCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PrivilegedApprovalCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPrivilegedApprovalCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPrivilegedApprovalCollectionRequest)this;
    }
    public IPrivilegedApprovalCollectionPage buildFromResponse(final PrivilegedApprovalCollectionResponse response) {
        final IPrivilegedApprovalCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrivilegedApprovalCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrivilegedApprovalCollectionPage page = new PrivilegedApprovalCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
