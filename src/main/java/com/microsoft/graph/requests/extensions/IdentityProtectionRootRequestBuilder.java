// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IdentityProtectionRoot;
import com.microsoft.graph.requests.extensions.IRiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskDetectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskDetectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskyUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RiskyUserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Protection Root Request Builder.
 */
public class IdentityProtectionRootRequestBuilder extends BaseRequestBuilder implements IIdentityProtectionRootRequestBuilder {

    /**
     * The request builder for the IdentityProtectionRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityProtectionRootRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IIdentityProtectionRootRequest instance
     */
    public IIdentityProtectionRootRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIdentityProtectionRootRequest instance
     */
    public IIdentityProtectionRootRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.IdentityProtectionRootRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IRiskDetectionCollectionRequestBuilder riskDetections() {
        return new RiskDetectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("riskDetections"), getClient(), null);
    }

    public IRiskDetectionRequestBuilder riskDetections(final String id) {
        return new RiskDetectionRequestBuilder(getRequestUrlWithAdditionalSegment("riskDetections") + "/" + id, getClient(), null);
    }
    public IRiskyUserCollectionRequestBuilder riskyUsers() {
        return new RiskyUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("riskyUsers"), getClient(), null);
    }

    public IRiskyUserRequestBuilder riskyUsers(final String id) {
        return new RiskyUserRequestBuilder(getRequestUrlWithAdditionalSegment("riskyUsers") + "/" + id, getClient(), null);
    }
}
