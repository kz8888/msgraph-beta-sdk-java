// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.SynchronizationJobPauseRequest;
import com.microsoft.graph.models.extensions.SynchronizationJob;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Job Pause Request Builder.
 */
public class SynchronizationJobPauseRequestBuilder extends BaseActionRequestBuilder<SynchronizationJob> {

    /**
     * The request builder for this SynchronizationJobPause
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationJobPauseRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the SynchronizationJobPauseRequest
     *
     * @param requestOptions the options for the request
     * @return the SynchronizationJobPauseRequest instance
     */
    @Nonnull
    public SynchronizationJobPauseRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SynchronizationJobPauseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SynchronizationJobPauseRequest instance
     */
    @Nonnull
    public SynchronizationJobPauseRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        SynchronizationJobPauseRequest request = new SynchronizationJobPauseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
