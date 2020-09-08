// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.models.extensions.TemporaryAccessPassAuthenticationMethod;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITemporaryAccessPassAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.TemporaryAccessPassAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.ITemporaryAccessPassAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITemporaryAccessPassAuthenticationMethodCollectionRequest;
import com.microsoft.graph.requests.extensions.TemporaryAccessPassAuthenticationMethodCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Temporary Access Pass Authentication Method Collection Request.
 */
public class TemporaryAccessPassAuthenticationMethodCollectionRequest extends BaseCollectionRequest<TemporaryAccessPassAuthenticationMethodCollectionResponse, ITemporaryAccessPassAuthenticationMethodCollectionPage> implements ITemporaryAccessPassAuthenticationMethodCollectionRequest {

    /**
     * The request builder for this collection of TemporaryAccessPassAuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TemporaryAccessPassAuthenticationMethodCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TemporaryAccessPassAuthenticationMethodCollectionResponse.class, ITemporaryAccessPassAuthenticationMethodCollectionPage.class);
    }

    public void get(final ICallback<ITemporaryAccessPassAuthenticationMethodCollectionPage> callback) {
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

    public ITemporaryAccessPassAuthenticationMethodCollectionPage get() throws ClientException {
        final TemporaryAccessPassAuthenticationMethodCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TemporaryAccessPassAuthenticationMethod newTemporaryAccessPassAuthenticationMethod, final ICallback<TemporaryAccessPassAuthenticationMethod> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TemporaryAccessPassAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTemporaryAccessPassAuthenticationMethod, callback);
    }

    public TemporaryAccessPassAuthenticationMethod post(final TemporaryAccessPassAuthenticationMethod newTemporaryAccessPassAuthenticationMethod) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TemporaryAccessPassAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTemporaryAccessPassAuthenticationMethod);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITemporaryAccessPassAuthenticationMethodCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TemporaryAccessPassAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITemporaryAccessPassAuthenticationMethodCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TemporaryAccessPassAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITemporaryAccessPassAuthenticationMethodCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TemporaryAccessPassAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ITemporaryAccessPassAuthenticationMethodCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (TemporaryAccessPassAuthenticationMethodCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ITemporaryAccessPassAuthenticationMethodCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ITemporaryAccessPassAuthenticationMethodCollectionRequest)this;
    }
    public ITemporaryAccessPassAuthenticationMethodCollectionPage buildFromResponse(final TemporaryAccessPassAuthenticationMethodCollectionResponse response) {
        final ITemporaryAccessPassAuthenticationMethodCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TemporaryAccessPassAuthenticationMethodCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TemporaryAccessPassAuthenticationMethodCollectionPage page = new TemporaryAccessPassAuthenticationMethodCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
