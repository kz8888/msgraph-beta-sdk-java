// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.SalesCreditMemo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoCollectionPage;
import com.microsoft.graph.requests.extensions.SalesCreditMemoCollectionResponse;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoCollectionRequest;
import com.microsoft.graph.requests.extensions.SalesCreditMemoCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Credit Memo Collection Request.
 */
public class SalesCreditMemoCollectionRequest extends BaseCollectionRequest<SalesCreditMemoCollectionResponse, ISalesCreditMemoCollectionPage> implements ISalesCreditMemoCollectionRequest {

    /**
     * The request builder for this collection of SalesCreditMemo
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SalesCreditMemoCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SalesCreditMemoCollectionResponse.class, ISalesCreditMemoCollectionPage.class);
    }

    public void get(final ICallback<ISalesCreditMemoCollectionPage> callback) {
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

    public ISalesCreditMemoCollectionPage get() throws ClientException {
        final SalesCreditMemoCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SalesCreditMemo newSalesCreditMemo, final ICallback<SalesCreditMemo> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SalesCreditMemoRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSalesCreditMemo, callback);
    }

    public SalesCreditMemo post(final SalesCreditMemo newSalesCreditMemo) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SalesCreditMemoRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSalesCreditMemo);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISalesCreditMemoCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SalesCreditMemoCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISalesCreditMemoCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SalesCreditMemoCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISalesCreditMemoCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SalesCreditMemoCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISalesCreditMemoCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SalesCreditMemoCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISalesCreditMemoCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISalesCreditMemoCollectionRequest)this;
    }
    public ISalesCreditMemoCollectionPage buildFromResponse(final SalesCreditMemoCollectionResponse response) {
        final ISalesCreditMemoCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SalesCreditMemoCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SalesCreditMemoCollectionPage page = new SalesCreditMemoCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
