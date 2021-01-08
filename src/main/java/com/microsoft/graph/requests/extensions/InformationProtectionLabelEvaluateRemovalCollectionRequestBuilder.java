// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.DowngradeJustification;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateRemovalCollectionRequest;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateRemovalCollectionResponse;
import com.microsoft.graph.models.extensions.InformationProtectionLabelEvaluateRemovalParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Evaluate Removal Collection Request Builder.
 */
public class InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<InformationProtectionAction, InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder, InformationProtectionLabelEvaluateRemovalCollectionResponse, InformationProtectionLabelEvaluateRemovalCollectionPage, InformationProtectionLabelEvaluateRemovalCollectionRequest> {

    private InformationProtectionLabelEvaluateRemovalParameterSet body;
    /**
     * The request builder for this collection of InformationProtectionLabel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final InformationProtectionLabelEvaluateRemovalParameterSet parameters) {
        super(requestUrl, client, requestOptions, InformationProtectionLabelEvaluateRemovalCollectionRequestBuilder.class, InformationProtectionLabelEvaluateRemovalCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the InformationProtectionLabelEvaluateRemovalCollectionRequest instance
     */
    @Override
    @Nonnull
    public InformationProtectionLabelEvaluateRemovalCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final InformationProtectionLabelEvaluateRemovalCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
