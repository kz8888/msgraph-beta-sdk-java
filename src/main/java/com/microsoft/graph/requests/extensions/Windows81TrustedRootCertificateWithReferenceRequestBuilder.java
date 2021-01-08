// Template Source: BaseEntityWithReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows81TrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Trusted Root Certificate With Reference Request Builder.
 */
public class Windows81TrustedRootCertificateWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<Windows81TrustedRootCertificate, Windows81TrustedRootCertificateWithReferenceRequest, Windows81TrustedRootCertificateReferenceRequestBuilder> {

    /**
     * The request builder for the Windows81TrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81TrustedRootCertificateWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81TrustedRootCertificateWithReferenceRequest.class, Windows81TrustedRootCertificateReferenceRequestBuilder.class);
    }
}
