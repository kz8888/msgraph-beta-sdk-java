
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplicationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConnectorRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connector Group Reference Request Builder.
 */
public class ConnectorGroupReferenceRequestBuilder extends BaseRequestBuilder implements IConnectorGroupReferenceRequestBuilder {

    /**
     * The request builder for the ConnectorGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConnectorGroupReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return The IConnectorGroupReferenceRequest instance
     */
    public IConnectorGroupReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IConnectorGroupReferenceRequest instance
     */
    public IConnectorGroupReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ConnectorGroupReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}
