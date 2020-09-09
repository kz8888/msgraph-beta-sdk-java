// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TrustFrameworkKeySet;
import com.microsoft.graph.models.extensions.TrustFrameworkKey;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Key Set Request Builder.
 */
public class TrustFrameworkKeySetRequestBuilder extends BaseRequestBuilder implements ITrustFrameworkKeySetRequestBuilder {

    /**
     * The request builder for the TrustFrameworkKeySet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkKeySetRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITrustFrameworkKeySetRequest instance
     */
    public ITrustFrameworkKeySetRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITrustFrameworkKeySetRequest instance
     */
    public ITrustFrameworkKeySetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TrustFrameworkKeySetRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public ITrustFrameworkKeySetGenerateKeyRequestBuilder generateKey(final String use, final String kty, final Long nbf, final Long exp) {
        return new TrustFrameworkKeySetGenerateKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.generateKey"), getClient(), null, use, kty, nbf, exp);
    }

    public ITrustFrameworkKeySetUploadCertificateRequestBuilder uploadCertificate(final String key) {
        return new TrustFrameworkKeySetUploadCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.uploadCertificate"), getClient(), null, key);
    }

    public ITrustFrameworkKeySetUploadPkcs12RequestBuilder uploadPkcs12(final String key, final String password) {
        return new TrustFrameworkKeySetUploadPkcs12RequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.uploadPkcs12"), getClient(), null, key, password);
    }

    public ITrustFrameworkKeySetUploadSecretRequestBuilder uploadSecret(final String use, final String k, final Long nbf, final Long exp) {
        return new TrustFrameworkKeySetUploadSecretRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.uploadSecret"), getClient(), null, use, k, nbf, exp);
    }

    public ITrustFrameworkKeySetGetActiveKeyRequestBuilder getActiveKey() {
        return new TrustFrameworkKeySetGetActiveKeyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActiveKey"), getClient(), null);
    }
}
