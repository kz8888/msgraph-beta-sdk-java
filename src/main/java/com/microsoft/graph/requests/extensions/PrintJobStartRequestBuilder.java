// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrintJobStartRequest;
import com.microsoft.graph.requests.extensions.PrintJobStartRequest;
import com.microsoft.graph.models.extensions.PrintJobStatus;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job Start Request Builder.
 */
public class PrintJobStartRequestBuilder extends BaseActionRequestBuilder implements IPrintJobStartRequestBuilder {

    /**
     * The request builder for this PrintJobStart
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintJobStartRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IPrintJobStartRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobStartRequest instance
     */
    public IPrintJobStartRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPrintJobStartRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobStartRequest instance
     */
    public IPrintJobStartRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrintJobStartRequest request = new PrintJobStartRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
