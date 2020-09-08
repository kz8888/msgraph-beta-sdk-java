// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentResourceRole;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleCollectionResponse;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequest;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentResourceRoleCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Resource Role Collection Request.
 */
public class AccessPackageAssignmentResourceRoleCollectionRequest extends BaseCollectionRequest<AccessPackageAssignmentResourceRoleCollectionResponse, IAccessPackageAssignmentResourceRoleCollectionPage> implements IAccessPackageAssignmentResourceRoleCollectionRequest {

    /**
     * The request builder for this collection of AccessPackageAssignmentResourceRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentResourceRoleCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageAssignmentResourceRoleCollectionResponse.class, IAccessPackageAssignmentResourceRoleCollectionPage.class);
    }

    public void get(final ICallback<IAccessPackageAssignmentResourceRoleCollectionPage> callback) {
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

    public IAccessPackageAssignmentResourceRoleCollectionPage get() throws ClientException {
        final AccessPackageAssignmentResourceRoleCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole, final ICallback<AccessPackageAssignmentResourceRole> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AccessPackageAssignmentResourceRoleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAccessPackageAssignmentResourceRole, callback);
    }

    public AccessPackageAssignmentResourceRole post(final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AccessPackageAssignmentResourceRoleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAccessPackageAssignmentResourceRole);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessPackageAssignmentResourceRoleCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessPackageAssignmentResourceRoleCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessPackageAssignmentResourceRoleCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AccessPackageAssignmentResourceRoleCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAccessPackageAssignmentResourceRoleCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AccessPackageAssignmentResourceRoleCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAccessPackageAssignmentResourceRoleCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AccessPackageAssignmentResourceRoleCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAccessPackageAssignmentResourceRoleCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAccessPackageAssignmentResourceRoleCollectionRequest)this;
    }
    public IAccessPackageAssignmentResourceRoleCollectionPage buildFromResponse(final AccessPackageAssignmentResourceRoleCollectionResponse response) {
        final IAccessPackageAssignmentResourceRoleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AccessPackageAssignmentResourceRoleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AccessPackageAssignmentResourceRoleCollectionPage page = new AccessPackageAssignmentResourceRoleCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
