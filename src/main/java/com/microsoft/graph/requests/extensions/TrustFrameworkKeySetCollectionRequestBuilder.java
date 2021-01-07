// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TrustFramework;
import com.microsoft.graph.models.extensions.TrustFrameworkKeySet;
import com.microsoft.graph.models.extensions.TrustFrameworkKey;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.TrustFrameworkKeySetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TrustFrameworkKeySetRequestBuilder;
import com.microsoft.graph.requests.extensions.TrustFrameworkKeySetCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.extensions.TrustFrameworkKeySetGenerateKeyParameterSet;
import com.microsoft.graph.models.extensions.TrustFrameworkKeySetUploadCertificateParameterSet;
import com.microsoft.graph.models.extensions.TrustFrameworkKeySetUploadPkcs12ParameterSet;
import com.microsoft.graph.models.extensions.TrustFrameworkKeySetUploadSecretParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Key Set Collection Request Builder.
 */
public class TrustFrameworkKeySetCollectionRequestBuilder extends BaseCollectionRequestBuilder<TrustFrameworkKeySet, TrustFrameworkKeySetRequestBuilder, TrustFrameworkKeySetCollectionResponse, TrustFrameworkKeySetCollectionPage, TrustFrameworkKeySetCollectionRequest> {

    /**
     * The request builder for this collection of TrustFramework
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkKeySetCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TrustFrameworkKeySetRequestBuilder.class, TrustFrameworkKeySetCollectionRequest.class);
    }



    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
