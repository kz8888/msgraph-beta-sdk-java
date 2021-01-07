// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ParticipantMuteAllRequest;
import com.microsoft.graph.models.extensions.Participant;
import com.microsoft.graph.models.extensions.MuteParticipantsOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.ParticipantMuteAllParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Mute All Request Builder.
 */
public class ParticipantMuteAllRequestBuilder extends BaseActionRequestBuilder<MuteParticipantsOperation> {

    private ParticipantMuteAllParameterSet body;
    /**
     * The request builder for this ParticipantMuteAll
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ParticipantMuteAllRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ParticipantMuteAllParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ParticipantMuteAllRequest
     *
     * @param requestOptions the options for the request
     * @return the ParticipantMuteAllRequest instance
     */
    @Nonnull
    public ParticipantMuteAllRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ParticipantMuteAllRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ParticipantMuteAllRequest instance
     */
    @Nonnull
    public ParticipantMuteAllRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ParticipantMuteAllRequest request = new ParticipantMuteAllRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
