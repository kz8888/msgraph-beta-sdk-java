// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ParticipantMuteRequest;
import com.microsoft.graph.models.extensions.Participant;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.ParticipantMuteParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Mute Request Builder.
 */
public class ParticipantMuteRequestBuilder extends BaseActionRequestBuilder<MuteParticipantOperation> {

    private ParticipantMuteParameterSet body;
    /**
     * The request builder for this ParticipantMute
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ParticipantMuteRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ParticipantMuteParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ParticipantMuteRequest
     *
     * @param requestOptions the options for the request
     * @return the ParticipantMuteRequest instance
     */
    @Nonnull
    public ParticipantMuteRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ParticipantMuteRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ParticipantMuteRequest instance
     */
    @Nonnull
    public ParticipantMuteRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ParticipantMuteRequest request = new ParticipantMuteRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
