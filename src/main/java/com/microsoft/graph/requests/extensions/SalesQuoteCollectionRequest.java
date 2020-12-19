// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.SalesQuote;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISalesQuoteCollectionPage;
import com.microsoft.graph.requests.extensions.SalesQuoteCollectionResponse;
import com.microsoft.graph.requests.extensions.ISalesQuoteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesQuoteCollectionRequest;
import com.microsoft.graph.requests.extensions.SalesQuoteCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Quote Collection Request.
 */
public class SalesQuoteCollectionRequest extends BaseCollectionRequest<SalesQuoteCollectionResponse, ISalesQuoteCollectionPage> implements ISalesQuoteCollectionRequest {

    /**
     * The request builder for this collection of SalesQuote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesQuoteCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SalesQuoteCollectionResponse.class, ISalesQuoteCollectionPage.class);
    }

    public void get(final ICallback<? super ISalesQuoteCollectionPage> callback) {
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

    public ISalesQuoteCollectionPage get() throws ClientException {
        final SalesQuoteCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SalesQuote newSalesQuote, final ICallback<? super SalesQuote> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SalesQuoteRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSalesQuote, callback);
    }

    public SalesQuote post(final SalesQuote newSalesQuote) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SalesQuoteRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSalesQuote);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISalesQuoteCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SalesQuoteCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISalesQuoteCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SalesQuoteCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ISalesQuoteCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (SalesQuoteCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISalesQuoteCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SalesQuoteCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISalesQuoteCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SalesQuoteCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISalesQuoteCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SalesQuoteCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISalesQuoteCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISalesQuoteCollectionRequest)this;
    }
    public ISalesQuoteCollectionPage buildFromResponse(final SalesQuoteCollectionResponse response) {
        final ISalesQuoteCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SalesQuoteCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SalesQuoteCollectionPage page = new SalesQuoteCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
