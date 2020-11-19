// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrintJobRedirectRequest;
import com.microsoft.graph.requests.extensions.PrintJobRedirectRequest;
import com.microsoft.graph.models.extensions.PrintJobConfiguration;
import com.microsoft.graph.models.extensions.PrintJob;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job Redirect Request Builder.
 */
public class PrintJobRedirectRequestBuilder extends BaseActionRequestBuilder implements IPrintJobRedirectRequestBuilder {

    /**
     * The request builder for this PrintJobRedirect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param destinationPrinterId the destinationPrinterId
     * @param configuration the configuration
     */
    public PrintJobRedirectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String destinationPrinterId, final PrintJobConfiguration configuration) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("destinationPrinterId", destinationPrinterId);
        bodyParams.put("configuration", configuration);
    }

    /**
     * Creates the IPrintJobRedirectRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobRedirectRequest instance
     */
    public IPrintJobRedirectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPrintJobRedirectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobRedirectRequest instance
     */
    public IPrintJobRedirectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrintJobRedirectRequest request = new PrintJobRedirectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("destinationPrinterId")) {
            request.body.destinationPrinterId = getParameter("destinationPrinterId");
        }

        if (hasParameter("configuration")) {
            request.body.configuration = getParameter("configuration");
        }

        return request;
    }
}
