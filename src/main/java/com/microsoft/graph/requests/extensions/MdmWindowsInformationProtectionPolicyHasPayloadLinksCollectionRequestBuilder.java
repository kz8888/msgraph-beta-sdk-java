// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequest;
import com.microsoft.graph.requests.extensions.MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionResponse;
import com.microsoft.graph.models.extensions.MdmWindowsInformationProtectionPolicyHasPayloadLinksParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mdm Windows Information Protection Policy Has Payload Links Collection Request Builder.
 */
public class MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<HasPayloadLinkResultItem, MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequestBuilder, MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionResponse, MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionPage, MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequest> {

    private MdmWindowsInformationProtectionPolicyHasPayloadLinksParameterSet body;
    /**
     * The request builder for this collection of MdmWindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final MdmWindowsInformationProtectionPolicyHasPayloadLinksParameterSet parameters) {
        super(requestUrl, client, requestOptions, MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequestBuilder.class, MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequest instance
     */
    @Override
    @Nonnull
    public MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final MdmWindowsInformationProtectionPolicyHasPayloadLinksCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
