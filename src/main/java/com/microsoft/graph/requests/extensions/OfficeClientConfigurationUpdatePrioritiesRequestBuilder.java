// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationUpdatePrioritiesRequest;
import com.microsoft.graph.models.extensions.OfficeClientConfiguration;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.OfficeClientConfigurationUpdatePrioritiesParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Configuration Update Priorities Request Builder.
 */
public class OfficeClientConfigurationUpdatePrioritiesRequestBuilder extends BaseActionRequestBuilder<OfficeClientConfiguration> {

    private OfficeClientConfigurationUpdatePrioritiesParameterSet body;
    /**
     * The request builder for this OfficeClientConfigurationUpdatePriorities
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public OfficeClientConfigurationUpdatePrioritiesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final OfficeClientConfigurationUpdatePrioritiesParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the OfficeClientConfigurationUpdatePrioritiesRequest
     *
     * @param requestOptions the options for the request
     * @return the OfficeClientConfigurationUpdatePrioritiesRequest instance
     */
    @Nonnull
    public OfficeClientConfigurationUpdatePrioritiesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the OfficeClientConfigurationUpdatePrioritiesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the OfficeClientConfigurationUpdatePrioritiesRequest instance
     */
    @Nonnull
    public OfficeClientConfigurationUpdatePrioritiesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        OfficeClientConfigurationUpdatePrioritiesRequest request = new OfficeClientConfigurationUpdatePrioritiesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
