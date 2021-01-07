// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExactMatchSession;
import com.microsoft.graph.requests.extensions.ExactMatchUploadAgentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Session Request Builder.
 */
public class ExactMatchSessionRequestBuilder extends BaseRequestBuilder<ExactMatchSession> {

    /**
     * The request builder for the ExactMatchSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExactMatchSessionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ExactMatchSessionRequest instance
     */
    @Nonnull
    public ExactMatchSessionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ExactMatchSessionRequest instance
     */
    @Nonnull
    public ExactMatchSessionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ExactMatchSessionRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for ExactMatchUploadAgent
     *
     * @return the ExactMatchUploadAgentRequestBuilder instance
     */
    @Nonnull
    public ExactMatchUploadAgentRequestBuilder uploadAgent() {
        return new ExactMatchUploadAgentRequestBuilder(getRequestUrlWithAdditionalSegment("uploadAgent"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ExactMatchSessionCancelRequestBuilder cancel() {
        return new ExactMatchSessionCancelRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancel"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ExactMatchSessionRenewRequestBuilder renew() {
        return new ExactMatchSessionRenewRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.renew"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ExactMatchSessionCommitRequestBuilder commit() {
        return new ExactMatchSessionCommitRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.commit"), getClient(), null);
    }
}
