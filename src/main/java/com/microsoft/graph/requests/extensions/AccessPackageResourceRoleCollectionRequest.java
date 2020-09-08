// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResource;
import com.microsoft.graph.models.extensions.AccessPackageResourceRole;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleCollectionResponse;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleCollectionRequest;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Role Collection Request.
 */
public class AccessPackageResourceRoleCollectionRequest extends BaseCollectionRequest<AccessPackageResourceRoleCollectionResponse, IAccessPackageResourceRoleCollectionPage> implements IAccessPackageResourceRoleCollectionRequest {

    /**
     * The request builder for this collection of AccessPackageResourceRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceRoleCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResourceRoleCollectionResponse.class, IAccessPackageResourceRoleCollectionPage.class);
    }

    public void get(final ICallback<IAccessPackageResourceRoleCollectionPage> callback) {
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

    public IAccessPackageResourceRoleCollectionPage get() throws ClientException {
        final AccessPackageResourceRoleCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AccessPackageResourceRole newAccessPackageResourceRole, final ICallback<AccessPackageResourceRole> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AccessPackageResourceRoleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAccessPackageResourceRole, callback);
    }

    public AccessPackageResourceRole post(final AccessPackageResourceRole newAccessPackageResourceRole) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AccessPackageResourceRoleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAccessPackageResourceRole);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessPackageResourceRoleCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessPackageResourceRoleCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessPackageResourceRoleCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AccessPackageResourceRoleCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAccessPackageResourceRoleCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AccessPackageResourceRoleCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAccessPackageResourceRoleCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AccessPackageResourceRoleCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAccessPackageResourceRoleCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAccessPackageResourceRoleCollectionRequest)this;
    }
    public IAccessPackageResourceRoleCollectionPage buildFromResponse(final AccessPackageResourceRoleCollectionResponse response) {
        final IAccessPackageResourceRoleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AccessPackageResourceRoleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AccessPackageResourceRoleCollectionPage page = new AccessPackageResourceRoleCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
