// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SearchRequest;
import com.microsoft.graph.models.extensions.SearchResponse;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISearchQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SearchQueryCollectionPage;
import com.microsoft.graph.requests.extensions.SearchQueryCollectionResponse;
import com.microsoft.graph.models.extensions.SearchQueryBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Search Query Collection Request.
 */
public class SearchQueryCollectionRequest extends BaseCollectionRequest<SearchQueryCollectionResponse, ISearchQueryCollectionPage> implements ISearchQueryCollectionRequest {


    protected final SearchQueryBody body;


    /**
     * The request for this SearchQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SearchQueryCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SearchQueryCollectionResponse.class, ISearchQueryCollectionPage.class);
        body = new SearchQueryBody();
    }


    public void post(final ICallback<ISearchQueryCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ISearchQueryCollectionPage post() throws ClientException {
        final SearchQueryCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public ISearchQueryCollectionPage buildFromResponse(final SearchQueryCollectionResponse response) {
        final ISearchQueryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SearchQueryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<SearchRequest>) null);
        } else {
            builder = null;
        }
        final ISearchQueryCollectionPage page = new SearchQueryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISearchQueryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ISearchQueryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISearchQueryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ISearchQueryCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISearchQueryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ISearchQueryCollectionRequest)this;
    }

}