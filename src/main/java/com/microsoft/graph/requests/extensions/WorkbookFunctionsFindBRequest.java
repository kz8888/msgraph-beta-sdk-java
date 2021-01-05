// Template Source: BaseMethodBodyRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookFunctionsFindBBody;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFindBRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFindBRequest;

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
 * The class for the Workbook Functions Find BRequest.
 */
public class WorkbookFunctionsFindBRequest extends BaseRequest implements IWorkbookFunctionsFindBRequest {
    protected final WorkbookFunctionsFindBBody body;

    /**
     * The request for this WorkbookFunctionsFindB
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsFindBRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookFunctionResult.class);
        body = new WorkbookFunctionsFindBBody();
    }

    public void post(final ICallback<? super WorkbookFunctionResult> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public WorkbookFunctionResult post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWorkbookFunctionsFindBRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WorkbookFunctionsFindBRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWorkbookFunctionsFindBRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (WorkbookFunctionsFindBRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWorkbookFunctionsFindBRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WorkbookFunctionsFindBRequest)this;
    }

}
