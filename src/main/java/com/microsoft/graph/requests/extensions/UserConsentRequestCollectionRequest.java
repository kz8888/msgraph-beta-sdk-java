// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppConsentRequest;
import com.microsoft.graph.models.extensions.UserConsentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUserConsentRequestCollectionPage;
import com.microsoft.graph.requests.extensions.UserConsentRequestCollectionResponse;
import com.microsoft.graph.requests.extensions.IUserConsentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserConsentRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.UserConsentRequestCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Consent Request Collection Request.
 */
public class UserConsentRequestCollectionRequest extends BaseCollectionRequest<UserConsentRequestCollectionResponse, IUserConsentRequestCollectionPage> implements IUserConsentRequestCollectionRequest {

    /**
     * The request builder for this collection of UserConsentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserConsentRequestCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserConsentRequestCollectionResponse.class, IUserConsentRequestCollectionPage.class);
    }

    public void get(final ICallback<IUserConsentRequestCollectionPage> callback) {
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

    public IUserConsentRequestCollectionPage get() throws ClientException {
        final UserConsentRequestCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UserConsentRequest newUserConsentRequest, final ICallback<UserConsentRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserConsentRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserConsentRequest, callback);
    }

    public UserConsentRequest post(final UserConsentRequest newUserConsentRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserConsentRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserConsentRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserConsentRequestCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserConsentRequestCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserConsentRequestCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserConsentRequestCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserConsentRequestCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UserConsentRequestCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUserConsentRequestCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UserConsentRequestCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUserConsentRequestCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUserConsentRequestCollectionRequest)this;
    }
    public IUserConsentRequestCollectionPage buildFromResponse(final UserConsentRequestCollectionResponse response) {
        final IUserConsentRequestCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserConsentRequestCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserConsentRequestCollectionPage page = new UserConsentRequestCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
