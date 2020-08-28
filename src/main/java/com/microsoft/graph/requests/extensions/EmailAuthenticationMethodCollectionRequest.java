// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.models.extensions.EmailAuthenticationMethod;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IEmailAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.EmailAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.IEmailAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmailAuthenticationMethodCollectionRequest;
import com.microsoft.graph.requests.extensions.EmailAuthenticationMethodCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email Authentication Method Collection Request.
 */
public class EmailAuthenticationMethodCollectionRequest extends BaseCollectionRequest<EmailAuthenticationMethodCollectionResponse, IEmailAuthenticationMethodCollectionPage> implements IEmailAuthenticationMethodCollectionRequest {

    /**
     * The request builder for this collection of EmailAuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmailAuthenticationMethodCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmailAuthenticationMethodCollectionResponse.class, IEmailAuthenticationMethodCollectionPage.class);
    }

    public void get(final ICallback<IEmailAuthenticationMethodCollectionPage> callback) {
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

    public IEmailAuthenticationMethodCollectionPage get() throws ClientException {
        final EmailAuthenticationMethodCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EmailAuthenticationMethod newEmailAuthenticationMethod, final ICallback<EmailAuthenticationMethod> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EmailAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newEmailAuthenticationMethod, callback);
    }

    public EmailAuthenticationMethod post(final EmailAuthenticationMethod newEmailAuthenticationMethod) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EmailAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newEmailAuthenticationMethod);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEmailAuthenticationMethodCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EmailAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEmailAuthenticationMethodCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EmailAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEmailAuthenticationMethodCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EmailAuthenticationMethodCollectionRequest)this;
    }

    public IEmailAuthenticationMethodCollectionPage buildFromResponse(final EmailAuthenticationMethodCollectionResponse response) {
        final IEmailAuthenticationMethodCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EmailAuthenticationMethodCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EmailAuthenticationMethodCollectionPage page = new EmailAuthenticationMethodCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}