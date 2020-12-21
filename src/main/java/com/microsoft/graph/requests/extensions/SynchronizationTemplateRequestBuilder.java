// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SynchronizationTemplate;
import com.microsoft.graph.requests.extensions.ISynchronizationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.SynchronizationSchemaRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Template Request Builder.
 */
public class SynchronizationTemplateRequestBuilder extends BaseRequestBuilder implements ISynchronizationTemplateRequestBuilder {

    /**
     * The request builder for the SynchronizationTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationTemplateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISynchronizationTemplateRequest instance
     */
    public ISynchronizationTemplateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISynchronizationTemplateRequest instance
     */
    public ISynchronizationTemplateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SynchronizationTemplateRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for SynchronizationSchema
     *
     * @return the ISynchronizationSchemaRequestBuilder instance
     */
    public ISynchronizationSchemaRequestBuilder schema() {
        return new SynchronizationSchemaRequestBuilder(getRequestUrlWithAdditionalSegment("schema"), getClient(), null);
    }
}
