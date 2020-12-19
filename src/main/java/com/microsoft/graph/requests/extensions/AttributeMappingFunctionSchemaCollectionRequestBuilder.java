// Template Source: BaseEntityCollectionRequestBuilder.java.tt
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

import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttributeMappingFunctionSchemaCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attribute Mapping Function Schema Collection Request Builder.
 */
public class AttributeMappingFunctionSchemaCollectionRequestBuilder extends BaseRequestBuilder implements IAttributeMappingFunctionSchemaCollectionRequestBuilder {

    /**
     * The request builder for this collection of AttributeMappingFunctionSchema
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttributeMappingFunctionSchemaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAttributeMappingFunctionSchemaCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAttributeMappingFunctionSchemaCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AttributeMappingFunctionSchemaCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAttributeMappingFunctionSchemaRequestBuilder byId(final String id) {
        return new AttributeMappingFunctionSchemaRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
