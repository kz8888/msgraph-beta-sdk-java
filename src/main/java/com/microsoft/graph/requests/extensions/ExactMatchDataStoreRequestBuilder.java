// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExactMatchDataStore;
import com.microsoft.graph.requests.extensions.ExactMatchSessionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchSessionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.ExactMatchDataStoreLookupParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Data Store Request Builder.
 */
public class ExactMatchDataStoreRequestBuilder extends BaseRequestBuilder<ExactMatchDataStore> {

    /**
     * The request builder for the ExactMatchDataStore
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExactMatchDataStoreRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ExactMatchDataStoreRequest instance
     */
    @Nonnull
    public ExactMatchDataStoreRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ExactMatchDataStoreRequest instance
     */
    @Nonnull
    public ExactMatchDataStoreRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ExactMatchDataStoreRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ExactMatchSession collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ExactMatchSessionCollectionRequestBuilder sessions() {
        return new ExactMatchSessionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions"), getClient(), null);
    }

    /**
     * Gets a request builder for the ExactMatchSession item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ExactMatchSessionRequestBuilder sessions(@Nonnull final String id) {
        return new ExactMatchSessionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ExactMatchDataStoreLookupCollectionRequestBuilder lookup(@Nonnull final ExactMatchDataStoreLookupParameterSet parameters) {
        return new ExactMatchDataStoreLookupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lookup"), getClient(), null, parameters);
    }
}
