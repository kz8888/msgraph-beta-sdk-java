// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Activity Counts Collection Request.
 */
public class ReportRootGetYammerActivityCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetYammerActivityCountsCollectionResponse, IReportRootGetYammerActivityCountsCollectionPage> implements IReportRootGetYammerActivityCountsCollectionRequest {


    /**
     * The request for this ReportRootGetYammerActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetYammerActivityCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetYammerActivityCountsCollectionResponse.class, IReportRootGetYammerActivityCountsCollectionPage.class);
    }


    public void get(final ICallback<? super IReportRootGetYammerActivityCountsCollectionPage> callback) {
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

    public IReportRootGetYammerActivityCountsCollectionPage get() throws ClientException {
        final ReportRootGetYammerActivityCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetYammerActivityCountsCollectionPage buildFromResponse(final ReportRootGetYammerActivityCountsCollectionResponse response) {
        final IReportRootGetYammerActivityCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetYammerActivityCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetYammerActivityCountsCollectionPage page = new ReportRootGetYammerActivityCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetYammerActivityCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetYammerActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetYammerActivityCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetYammerActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetYammerActivityCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetYammerActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetYammerActivityCountsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetYammerActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IReportRootGetYammerActivityCountsCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IReportRootGetYammerActivityCountsCollectionRequest)this;
    }

}
