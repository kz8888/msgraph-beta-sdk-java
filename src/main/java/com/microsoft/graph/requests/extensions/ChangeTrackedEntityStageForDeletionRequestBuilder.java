// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ChangeTrackedEntityStageForDeletionRequest;
import com.microsoft.graph.models.extensions.ChangeTrackedEntity;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Change Tracked Entity Stage For Deletion Request Builder.
 */
public class ChangeTrackedEntityStageForDeletionRequestBuilder extends BaseActionRequestBuilder<ChangeTrackedEntity> {

    /**
     * The request builder for this ChangeTrackedEntityStageForDeletion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChangeTrackedEntityStageForDeletionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ChangeTrackedEntityStageForDeletionRequest
     *
     * @param requestOptions the options for the request
     * @return the ChangeTrackedEntityStageForDeletionRequest instance
     */
    @Nonnull
    public ChangeTrackedEntityStageForDeletionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ChangeTrackedEntityStageForDeletionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ChangeTrackedEntityStageForDeletionRequest instance
     */
    @Nonnull
    public ChangeTrackedEntityStageForDeletionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ChangeTrackedEntityStageForDeletionRequest request = new ChangeTrackedEntityStageForDeletionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
