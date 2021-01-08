// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppRelationshipState;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.MobileAppGetRelatedAppStatesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppGetRelatedAppStatesCollectionRequest;
import com.microsoft.graph.requests.extensions.MobileAppGetRelatedAppStatesCollectionResponse;
import com.microsoft.graph.models.extensions.MobileAppGetRelatedAppStatesParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Get Related App States Collection Request Builder.
 */
public class MobileAppGetRelatedAppStatesCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<MobileAppRelationshipState, MobileAppGetRelatedAppStatesCollectionRequestBuilder, MobileAppGetRelatedAppStatesCollectionResponse, MobileAppGetRelatedAppStatesCollectionPage, MobileAppGetRelatedAppStatesCollectionRequest> {

    /**
     * The request builder for this collection of MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public MobileAppGetRelatedAppStatesCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final MobileAppGetRelatedAppStatesParameterSet parameters) {
        super(requestUrl, client, requestOptions, MobileAppGetRelatedAppStatesCollectionRequestBuilder.class, MobileAppGetRelatedAppStatesCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the MobileAppGetRelatedAppStatesCollectionRequest instance
     */
    @Override
    @Nonnull
    public MobileAppGetRelatedAppStatesCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final MobileAppGetRelatedAppStatesCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
