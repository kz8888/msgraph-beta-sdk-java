// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ApplicationTemplate;
import com.microsoft.graph.models.extensions.ApplicationServicePrincipal;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IApplicationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationTemplateCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Template Collection Request Builder.
 */
public class ApplicationTemplateCollectionRequestBuilder extends BaseRequestBuilder implements IApplicationTemplateCollectionRequestBuilder {

    /**
     * The request builder for this collection of ApplicationTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationTemplateCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IApplicationTemplateCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IApplicationTemplateCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ApplicationTemplateCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IApplicationTemplateRequestBuilder byId(final String id) {
        return new ApplicationTemplateRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
