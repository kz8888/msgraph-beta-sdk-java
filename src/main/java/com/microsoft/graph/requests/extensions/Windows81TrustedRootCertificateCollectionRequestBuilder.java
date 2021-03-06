// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsWifiEnterpriseEAPConfiguration;
import com.microsoft.graph.models.extensions.Windows81TrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindows81TrustedRootCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindows81TrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindows81TrustedRootCertificateCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Trusted Root Certificate Collection Request Builder.
 */
public class Windows81TrustedRootCertificateCollectionRequestBuilder extends BaseRequestBuilder implements IWindows81TrustedRootCertificateCollectionRequestBuilder {

    /**
     * The request builder for this collection of WindowsWifiEnterpriseEAPConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81TrustedRootCertificateCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWindows81TrustedRootCertificateCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWindows81TrustedRootCertificateCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new Windows81TrustedRootCertificateCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindows81TrustedRootCertificateRequestBuilder byId(final String id) {
        return new Windows81TrustedRootCertificateRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
