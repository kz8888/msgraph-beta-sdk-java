// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.WorkPosition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWorkPositionCollectionPage;
import com.microsoft.graph.requests.extensions.WorkPositionCollectionResponse;
import com.microsoft.graph.requests.extensions.IWorkPositionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkPositionCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkPositionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Work Position Collection Request.
 */
public class WorkPositionCollectionRequest extends BaseCollectionRequest<WorkPositionCollectionResponse, IWorkPositionCollectionPage> implements IWorkPositionCollectionRequest {

    /**
     * The request builder for this collection of WorkPosition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkPositionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkPositionCollectionResponse.class, IWorkPositionCollectionPage.class);
    }

    public void get(final ICallback<? super IWorkPositionCollectionPage> callback) {
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

    public IWorkPositionCollectionPage get() throws ClientException {
        final WorkPositionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WorkPosition newWorkPosition, final ICallback<? super WorkPosition> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WorkPositionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkPosition, callback);
    }

    public WorkPosition post(final WorkPosition newWorkPosition) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WorkPositionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWorkPosition);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkPositionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkPositionCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IWorkPositionCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (WorkPositionCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IWorkPositionCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (WorkPositionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkPositionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkPositionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkPositionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WorkPositionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWorkPositionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WorkPositionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWorkPositionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWorkPositionCollectionRequest)this;
    }
    public IWorkPositionCollectionPage buildFromResponse(final WorkPositionCollectionResponse response) {
        final IWorkPositionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WorkPositionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WorkPositionCollectionPage page = new WorkPositionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
