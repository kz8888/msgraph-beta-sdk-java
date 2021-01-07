// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.BusinessFlowRecordDecisionsRequest;
import com.microsoft.graph.models.extensions.BusinessFlow;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.BusinessFlowRecordDecisionsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Business Flow Record Decisions Request Builder.
 */
public class BusinessFlowRecordDecisionsRequestBuilder extends BaseActionRequestBuilder<BusinessFlow> {

    private BusinessFlowRecordDecisionsParameterSet body;
    /**
     * The request builder for this BusinessFlowRecordDecisions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public BusinessFlowRecordDecisionsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final BusinessFlowRecordDecisionsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the BusinessFlowRecordDecisionsRequest
     *
     * @param requestOptions the options for the request
     * @return the BusinessFlowRecordDecisionsRequest instance
     */
    @Nonnull
    public BusinessFlowRecordDecisionsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the BusinessFlowRecordDecisionsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the BusinessFlowRecordDecisionsRequest instance
     */
    @Nonnull
    public BusinessFlowRecordDecisionsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        BusinessFlowRecordDecisionsRequest request = new BusinessFlowRecordDecisionsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
