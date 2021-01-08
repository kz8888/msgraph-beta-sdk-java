// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailFileAssessmentRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email File Assessment Request Request Builder.
 */
public class EmailFileAssessmentRequestRequestBuilder extends BaseRequestBuilder<EmailFileAssessmentRequest> {

    /**
     * The request builder for the EmailFileAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmailFileAssessmentRequestRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EmailFileAssessmentRequestRequest instance
     */
    @Nonnull
    public EmailFileAssessmentRequestRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EmailFileAssessmentRequestRequest instance
     */
    @Nonnull
    public EmailFileAssessmentRequestRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.EmailFileAssessmentRequestRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ThreatAssessmentResult collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ThreatAssessmentResultCollectionRequestBuilder results() {
        return new ThreatAssessmentResultCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("results"), getClient(), null);
    }

    /**
     * Gets a request builder for the ThreatAssessmentResult item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ThreatAssessmentResultRequestBuilder results(@Nonnull final String id) {
        return new ThreatAssessmentResultRequestBuilder(getRequestUrlWithAdditionalSegment("results") + "/" + id, getClient(), null);
    }
}
