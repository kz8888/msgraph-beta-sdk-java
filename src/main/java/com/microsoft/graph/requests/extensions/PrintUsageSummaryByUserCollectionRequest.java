// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.PrintUsageSummaryByUser;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByUserCollectionPage;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByUserCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByUserCollectionRequest;
import com.microsoft.graph.requests.extensions.PrintUsageSummaryByUserCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Usage Summary By User Collection Request.
 */
public class PrintUsageSummaryByUserCollectionRequest extends BaseCollectionRequest<PrintUsageSummaryByUserCollectionResponse, IPrintUsageSummaryByUserCollectionPage> implements IPrintUsageSummaryByUserCollectionRequest {

    /**
     * The request builder for this collection of PrintUsageSummaryByUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintUsageSummaryByUserCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintUsageSummaryByUserCollectionResponse.class, IPrintUsageSummaryByUserCollectionPage.class);
    }

    public void get(final ICallback<? super IPrintUsageSummaryByUserCollectionPage> callback) {
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

    public IPrintUsageSummaryByUserCollectionPage get() throws ClientException {
        final PrintUsageSummaryByUserCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PrintUsageSummaryByUser newPrintUsageSummaryByUser, final ICallback<? super PrintUsageSummaryByUser> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrintUsageSummaryByUserRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrintUsageSummaryByUser, callback);
    }

    public PrintUsageSummaryByUser post(final PrintUsageSummaryByUser newPrintUsageSummaryByUser) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrintUsageSummaryByUserRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrintUsageSummaryByUser);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrintUsageSummaryByUserCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrintUsageSummaryByUserCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPrintUsageSummaryByUserCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PrintUsageSummaryByUserCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IPrintUsageSummaryByUserCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (PrintUsageSummaryByUserCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrintUsageSummaryByUserCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrintUsageSummaryByUserCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrintUsageSummaryByUserCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrintUsageSummaryByUserCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPrintUsageSummaryByUserCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PrintUsageSummaryByUserCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPrintUsageSummaryByUserCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPrintUsageSummaryByUserCollectionRequest)this;
    }
    public IPrintUsageSummaryByUserCollectionPage buildFromResponse(final PrintUsageSummaryByUserCollectionResponse response) {
        final IPrintUsageSummaryByUserCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrintUsageSummaryByUserCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrintUsageSummaryByUserCollectionPage page = new PrintUsageSummaryByUserCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
