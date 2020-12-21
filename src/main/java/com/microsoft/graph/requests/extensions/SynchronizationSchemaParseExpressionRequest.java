// Template Source: BaseMethodBodyRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SynchronizationSchemaParseExpressionBody;
import com.microsoft.graph.models.extensions.ParseExpressionResponse;
import com.microsoft.graph.requests.extensions.ISynchronizationSchemaParseExpressionRequest;
import com.microsoft.graph.requests.extensions.SynchronizationSchemaParseExpressionRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Schema Parse Expression Request.
 */
public class SynchronizationSchemaParseExpressionRequest extends BaseRequest implements ISynchronizationSchemaParseExpressionRequest {
    protected final SynchronizationSchemaParseExpressionBody body;

    /**
     * The request for this SynchronizationSchemaParseExpression
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationSchemaParseExpressionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ParseExpressionResponse.class);
        body = new SynchronizationSchemaParseExpressionBody();
    }

    public void post(final ICallback<? super ParseExpressionResponse> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public ParseExpressionResponse post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISynchronizationSchemaParseExpressionRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SynchronizationSchemaParseExpressionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISynchronizationSchemaParseExpressionRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (SynchronizationSchemaParseExpressionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISynchronizationSchemaParseExpressionRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SynchronizationSchemaParseExpressionRequest)this;
    }

}
