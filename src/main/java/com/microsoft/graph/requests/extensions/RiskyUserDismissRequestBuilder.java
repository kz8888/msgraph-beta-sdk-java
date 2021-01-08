// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.RiskyUserDismissRequest;
import com.microsoft.graph.models.extensions.RiskyUser;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.RiskyUserDismissParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Risky User Dismiss Request Builder.
 */
public class RiskyUserDismissRequestBuilder extends BaseActionRequestBuilder<RiskyUser> {

    private RiskyUserDismissParameterSet body;
    /**
     * The request builder for this RiskyUserDismiss
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public RiskyUserDismissRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final RiskyUserDismissParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the RiskyUserDismissRequest
     *
     * @param requestOptions the options for the request
     * @return the RiskyUserDismissRequest instance
     */
    @Nonnull
    public RiskyUserDismissRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the RiskyUserDismissRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the RiskyUserDismissRequest instance
     */
    @Nonnull
    public RiskyUserDismissRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        RiskyUserDismissRequest request = new RiskyUserDismissRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
