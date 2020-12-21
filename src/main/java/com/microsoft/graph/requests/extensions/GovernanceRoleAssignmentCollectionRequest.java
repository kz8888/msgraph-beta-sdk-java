// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment Collection Request.
 */
public class GovernanceRoleAssignmentCollectionRequest extends BaseCollectionRequest<GovernanceRoleAssignmentCollectionResponse, IGovernanceRoleAssignmentCollectionPage> implements IGovernanceRoleAssignmentCollectionRequest {

    /**
     * The request builder for this collection of GovernanceRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceRoleAssignmentCollectionResponse.class, IGovernanceRoleAssignmentCollectionPage.class);
    }

    public void get(final ICallback<? super IGovernanceRoleAssignmentCollectionPage> callback) {
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

    public IGovernanceRoleAssignmentCollectionPage get() throws ClientException {
        final GovernanceRoleAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GovernanceRoleAssignment newGovernanceRoleAssignment, final ICallback<? super GovernanceRoleAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GovernanceRoleAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGovernanceRoleAssignment, callback);
    }

    public GovernanceRoleAssignment post(final GovernanceRoleAssignment newGovernanceRoleAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GovernanceRoleAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGovernanceRoleAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGovernanceRoleAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GovernanceRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IGovernanceRoleAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (GovernanceRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IGovernanceRoleAssignmentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (GovernanceRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGovernanceRoleAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GovernanceRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGovernanceRoleAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GovernanceRoleAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IGovernanceRoleAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (GovernanceRoleAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IGovernanceRoleAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IGovernanceRoleAssignmentCollectionRequest)this;
    }
    public IGovernanceRoleAssignmentCollectionPage buildFromResponse(final GovernanceRoleAssignmentCollectionResponse response) {
        final IGovernanceRoleAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GovernanceRoleAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GovernanceRoleAssignmentCollectionPage page = new GovernanceRoleAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
