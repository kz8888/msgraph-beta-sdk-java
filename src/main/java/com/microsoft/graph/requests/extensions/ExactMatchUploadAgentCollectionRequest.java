// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.ExactMatchUploadAgent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentCollectionPage;
import com.microsoft.graph.requests.extensions.ExactMatchUploadAgentCollectionResponse;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentCollectionRequest;
import com.microsoft.graph.requests.extensions.ExactMatchUploadAgentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Upload Agent Collection Request.
 */
public class ExactMatchUploadAgentCollectionRequest extends BaseCollectionRequest<ExactMatchUploadAgentCollectionResponse, IExactMatchUploadAgentCollectionPage> implements IExactMatchUploadAgentCollectionRequest {

    /**
     * The request builder for this collection of ExactMatchUploadAgent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExactMatchUploadAgentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExactMatchUploadAgentCollectionResponse.class, IExactMatchUploadAgentCollectionPage.class);
    }

    public void get(final ICallback<? super IExactMatchUploadAgentCollectionPage> callback) {
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

    public IExactMatchUploadAgentCollectionPage get() throws ClientException {
        final ExactMatchUploadAgentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ExactMatchUploadAgent newExactMatchUploadAgent, final ICallback<? super ExactMatchUploadAgent> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ExactMatchUploadAgentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newExactMatchUploadAgent, callback);
    }

    public ExactMatchUploadAgent post(final ExactMatchUploadAgent newExactMatchUploadAgent) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ExactMatchUploadAgentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newExactMatchUploadAgent);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IExactMatchUploadAgentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ExactMatchUploadAgentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IExactMatchUploadAgentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ExactMatchUploadAgentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IExactMatchUploadAgentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ExactMatchUploadAgentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IExactMatchUploadAgentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ExactMatchUploadAgentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IExactMatchUploadAgentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ExactMatchUploadAgentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IExactMatchUploadAgentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ExactMatchUploadAgentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IExactMatchUploadAgentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IExactMatchUploadAgentCollectionRequest)this;
    }
    public IExactMatchUploadAgentCollectionPage buildFromResponse(final ExactMatchUploadAgentCollectionResponse response) {
        final IExactMatchUploadAgentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ExactMatchUploadAgentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ExactMatchUploadAgentCollectionPage page = new ExactMatchUploadAgentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
