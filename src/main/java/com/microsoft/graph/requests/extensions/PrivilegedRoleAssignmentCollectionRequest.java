// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Collection Request.
 */
public class PrivilegedRoleAssignmentCollectionRequest extends BaseCollectionRequest<PrivilegedRoleAssignmentCollectionResponse, IPrivilegedRoleAssignmentCollectionPage> implements IPrivilegedRoleAssignmentCollectionRequest {

    /**
     * The request builder for this collection of PrivilegedRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedRoleAssignmentCollectionResponse.class, IPrivilegedRoleAssignmentCollectionPage.class);
    }

    public void get(final ICallback<IPrivilegedRoleAssignmentCollectionPage> callback) {
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

    public IPrivilegedRoleAssignmentCollectionPage get() throws ClientException {
        final PrivilegedRoleAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrivilegedRoleAssignment newPrivilegedRoleAssignment, final ICallback<PrivilegedRoleAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrivilegedRoleAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrivilegedRoleAssignment, callback);
    }

    public PrivilegedRoleAssignment post(final PrivilegedRoleAssignment newPrivilegedRoleAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrivilegedRoleAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrivilegedRoleAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrivilegedRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrivilegedRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrivilegedRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PrivilegedRoleAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPrivilegedRoleAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPrivilegedRoleAssignmentCollectionRequest)this;
    }
    public IPrivilegedRoleAssignmentCollectionPage buildFromResponse(final PrivilegedRoleAssignmentCollectionResponse response) {
        final IPrivilegedRoleAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrivilegedRoleAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrivilegedRoleAssignmentCollectionPage page = new PrivilegedRoleAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
