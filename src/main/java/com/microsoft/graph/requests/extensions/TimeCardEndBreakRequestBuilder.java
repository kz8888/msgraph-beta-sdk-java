// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.TimeCardEndBreakRequest;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.TimeCard;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.TimeCardEndBreakParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Card End Break Request Builder.
 */
public class TimeCardEndBreakRequestBuilder extends BaseActionRequestBuilder<TimeCard> {

    private TimeCardEndBreakParameterSet body;
    /**
     * The request builder for this TimeCardEndBreak
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public TimeCardEndBreakRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final TimeCardEndBreakParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the TimeCardEndBreakRequest
     *
     * @param requestOptions the options for the request
     * @return the TimeCardEndBreakRequest instance
     */
    @Nonnull
    public TimeCardEndBreakRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TimeCardEndBreakRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TimeCardEndBreakRequest instance
     */
    @Nonnull
    public TimeCardEndBreakRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TimeCardEndBreakRequest request = new TimeCardEndBreakRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
