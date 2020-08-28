// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSubmission;
import com.microsoft.graph.models.extensions.EducationOutcome;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEducationOutcomeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationOutcomeRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationOutcomeCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Outcome Collection Request Builder.
 */
public class EducationOutcomeCollectionRequestBuilder extends BaseRequestBuilder implements IEducationOutcomeCollectionRequestBuilder {

    /**
     * The request builder for this collection of EducationSubmission
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationOutcomeCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IEducationOutcomeCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IEducationOutcomeCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new EducationOutcomeCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationOutcomeRequestBuilder byId(final String id) {
        return new EducationOutcomeRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}