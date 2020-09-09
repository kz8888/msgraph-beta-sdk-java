// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuditLogRoot;
import com.microsoft.graph.models.extensions.RestrictedSignIn;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IRestrictedSignInCollectionPage;
import com.microsoft.graph.requests.extensions.RestrictedSignInCollectionResponse;
import com.microsoft.graph.requests.extensions.IRestrictedSignInCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedSignInCollectionRequest;
import com.microsoft.graph.requests.extensions.RestrictedSignInCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Restricted Sign In Collection Request.
 */
public class RestrictedSignInCollectionRequest extends BaseCollectionRequest<RestrictedSignInCollectionResponse, IRestrictedSignInCollectionPage> implements IRestrictedSignInCollectionRequest {

    /**
     * The request builder for this collection of RestrictedSignIn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RestrictedSignInCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RestrictedSignInCollectionResponse.class, IRestrictedSignInCollectionPage.class);
    }

    public void get(final ICallback<IRestrictedSignInCollectionPage> callback) {
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

    public IRestrictedSignInCollectionPage get() throws ClientException {
        final RestrictedSignInCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final RestrictedSignIn newRestrictedSignIn, final ICallback<RestrictedSignIn> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new RestrictedSignInRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newRestrictedSignIn, callback);
    }

    public RestrictedSignIn post(final RestrictedSignIn newRestrictedSignIn) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new RestrictedSignInRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newRestrictedSignIn);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRestrictedSignInCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (RestrictedSignInCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRestrictedSignInCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (RestrictedSignInCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IRestrictedSignInCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (RestrictedSignInCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IRestrictedSignInCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (RestrictedSignInCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IRestrictedSignInCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IRestrictedSignInCollectionRequest)this;
    }
    public IRestrictedSignInCollectionPage buildFromResponse(final RestrictedSignInCollectionResponse response) {
        final IRestrictedSignInCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new RestrictedSignInCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final RestrictedSignInCollectionPage page = new RestrictedSignInCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
