// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintTaskDefinition;
import com.microsoft.graph.requests.extensions.IPrintTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Definition With Reference Request Builder.
 */
public class PrintTaskDefinitionWithReferenceRequestBuilder extends BaseRequestBuilder implements IPrintTaskDefinitionWithReferenceRequestBuilder {

    /**
     * The request builder for the PrintTaskDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintTaskDefinitionWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IPrintTaskDefinitionWithReferenceRequest instance
     */
    public IPrintTaskDefinitionWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IPrintTaskDefinitionWithReferenceRequest instance
     */
    public IPrintTaskDefinitionWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrintTaskDefinitionWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrintTaskDefinitionReferenceRequestBuilder reference(){
        return new PrintTaskDefinitionReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}