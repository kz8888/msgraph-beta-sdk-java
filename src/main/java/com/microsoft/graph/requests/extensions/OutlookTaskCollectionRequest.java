// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookTaskFolder;
import com.microsoft.graph.models.extensions.OutlookTask;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IOutlookTaskCollectionPage;
import com.microsoft.graph.requests.extensions.OutlookTaskCollectionResponse;
import com.microsoft.graph.requests.extensions.IOutlookTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskCollectionRequest;
import com.microsoft.graph.requests.extensions.OutlookTaskCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Task Collection Request.
 */
public class OutlookTaskCollectionRequest extends BaseCollectionRequest<OutlookTaskCollectionResponse, IOutlookTaskCollectionPage> implements IOutlookTaskCollectionRequest {

    /**
     * The request builder for this collection of OutlookTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookTaskCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OutlookTaskCollectionResponse.class, IOutlookTaskCollectionPage.class);
    }

    public void get(final ICallback<IOutlookTaskCollectionPage> callback) {
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

    public IOutlookTaskCollectionPage get() throws ClientException {
        final OutlookTaskCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OutlookTask newOutlookTask, final ICallback<OutlookTask> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OutlookTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOutlookTask, callback);
    }

    public OutlookTask post(final OutlookTask newOutlookTask) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OutlookTaskRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newOutlookTask);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOutlookTaskCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OutlookTaskCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOutlookTaskCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (OutlookTaskCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOutlookTaskCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (OutlookTaskCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IOutlookTaskCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (OutlookTaskCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IOutlookTaskCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IOutlookTaskCollectionRequest)this;
    }
    public IOutlookTaskCollectionPage buildFromResponse(final OutlookTaskCollectionResponse response) {
        final IOutlookTaskCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OutlookTaskCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OutlookTaskCollectionPage page = new OutlookTaskCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
