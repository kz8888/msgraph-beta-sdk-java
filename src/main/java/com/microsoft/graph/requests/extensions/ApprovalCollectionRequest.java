// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Approval;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IApprovalCollectionPage;
import com.microsoft.graph.requests.extensions.ApprovalCollectionResponse;
import com.microsoft.graph.requests.extensions.IApprovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApprovalCollectionRequest;
import com.microsoft.graph.requests.extensions.ApprovalCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Approval Collection Request.
 */
public class ApprovalCollectionRequest extends BaseCollectionRequest<ApprovalCollectionResponse, IApprovalCollectionPage> implements IApprovalCollectionRequest {

    /**
     * The request builder for this collection of Approval
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApprovalCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApprovalCollectionResponse.class, IApprovalCollectionPage.class);
    }

    public void get(final ICallback<IApprovalCollectionPage> callback) {
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

    public IApprovalCollectionPage get() throws ClientException {
        final ApprovalCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Approval newApproval, final ICallback<Approval> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ApprovalRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newApproval, callback);
    }

    public Approval post(final Approval newApproval) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ApprovalRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newApproval);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IApprovalCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ApprovalCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IApprovalCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ApprovalCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IApprovalCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ApprovalCollectionRequest)this;
    }

    public IApprovalCollectionPage buildFromResponse(final ApprovalCollectionResponse response) {
        final IApprovalCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ApprovalCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ApprovalCollectionPage page = new ApprovalCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}