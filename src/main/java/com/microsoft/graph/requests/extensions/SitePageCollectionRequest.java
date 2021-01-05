// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.SitePage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISitePageCollectionPage;
import com.microsoft.graph.requests.extensions.SitePageCollectionResponse;
import com.microsoft.graph.requests.extensions.ISitePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISitePageCollectionRequest;
import com.microsoft.graph.requests.extensions.SitePageCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Page Collection Request.
 */
public class SitePageCollectionRequest extends BaseCollectionRequest<SitePageCollectionResponse, ISitePageCollectionPage> implements ISitePageCollectionRequest {

    /**
     * The request builder for this collection of SitePage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SitePageCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SitePageCollectionResponse.class, ISitePageCollectionPage.class);
    }

    public void get(final ICallback<? super ISitePageCollectionPage> callback) {
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

    public ISitePageCollectionPage get() throws ClientException {
        final SitePageCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SitePage newSitePage, final ICallback<? super SitePage> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SitePageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSitePage, callback);
    }

    public SitePage post(final SitePage newSitePage) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SitePageRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSitePage);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISitePageCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SitePageCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISitePageCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SitePageCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ISitePageCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (SitePageCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISitePageCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SitePageCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISitePageCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SitePageCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISitePageCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SitePageCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISitePageCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISitePageCollectionRequest)this;
    }
    public ISitePageCollectionPage buildFromResponse(final SitePageCollectionResponse response) {
        final ISitePageCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SitePageCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SitePageCollectionPage page = new SitePageCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
