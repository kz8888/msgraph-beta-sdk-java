// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.UserAccountInformation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserAccountInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAccountInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAccountInformationCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Account Information Collection Request Builder.
 */
public class UserAccountInformationCollectionRequestBuilder extends BaseRequestBuilder implements IUserAccountInformationCollectionRequestBuilder {

    /**
     * The request builder for this collection of Profile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserAccountInformationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IUserAccountInformationCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserAccountInformationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new UserAccountInformationCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IUserAccountInformationRequestBuilder byId(final String id) {
        return new UserAccountInformationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}