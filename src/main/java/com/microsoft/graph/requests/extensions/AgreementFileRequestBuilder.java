// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AgreementFile;
import com.microsoft.graph.requests.extensions.IAgreementFileLocalizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementFileLocalizationRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementFileLocalizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AgreementFileLocalizationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File Request Builder.
 */
public class AgreementFileRequestBuilder extends BaseRequestBuilder implements IAgreementFileRequestBuilder {

    /**
     * The request builder for the AgreementFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementFileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAgreementFileRequest instance
     */
    public IAgreementFileRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAgreementFileRequest instance
     */
    public IAgreementFileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.AgreementFileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAgreementFileLocalizationCollectionRequestBuilder localizations() {
        return new AgreementFileLocalizationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("localizations"), getClient(), null);
    }

    public IAgreementFileLocalizationRequestBuilder localizations(final String id) {
        return new AgreementFileLocalizationRequestBuilder(getRequestUrlWithAdditionalSegment("localizations") + "/" + id, getClient(), null);
    }
}
