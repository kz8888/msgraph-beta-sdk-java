// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AttributeMappingFunctionSchema;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISynchronizationSchemaFunctionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SynchronizationSchemaFunctionsCollectionPage;
import com.microsoft.graph.requests.extensions.SynchronizationSchemaFunctionsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Schema Functions Collection Request.
 */
public class SynchronizationSchemaFunctionsCollectionRequest extends BaseCollectionRequest<SynchronizationSchemaFunctionsCollectionResponse, ISynchronizationSchemaFunctionsCollectionPage> implements ISynchronizationSchemaFunctionsCollectionRequest {


    /**
     * The request for this SynchronizationSchemaFunctions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationSchemaFunctionsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SynchronizationSchemaFunctionsCollectionResponse.class, ISynchronizationSchemaFunctionsCollectionPage.class);
    }


    public void get(final ICallback<? super ISynchronizationSchemaFunctionsCollectionPage> callback) {
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

    public ISynchronizationSchemaFunctionsCollectionPage get() throws ClientException {
        final SynchronizationSchemaFunctionsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public ISynchronizationSchemaFunctionsCollectionPage buildFromResponse(final SynchronizationSchemaFunctionsCollectionResponse response) {
        final ISynchronizationSchemaFunctionsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SynchronizationSchemaFunctionsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ISynchronizationSchemaFunctionsCollectionPage page = new SynchronizationSchemaFunctionsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISynchronizationSchemaFunctionsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ISynchronizationSchemaFunctionsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISynchronizationSchemaFunctionsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ISynchronizationSchemaFunctionsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISynchronizationSchemaFunctionsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ISynchronizationSchemaFunctionsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISynchronizationSchemaFunctionsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ISynchronizationSchemaFunctionsCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ISynchronizationSchemaFunctionsCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ISynchronizationSchemaFunctionsCollectionRequest)this;
    }

}
