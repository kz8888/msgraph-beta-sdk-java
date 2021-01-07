// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.UserGetManagedAppBlockedUsersCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedAppBlockedUsersCollectionRequest;
import com.microsoft.graph.requests.extensions.UserGetManagedAppBlockedUsersCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Managed App Blocked Users Collection Request Builder.
 */
public class UserGetManagedAppBlockedUsersCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<String, UserGetManagedAppBlockedUsersCollectionRequestBuilder, UserGetManagedAppBlockedUsersCollectionResponse, UserGetManagedAppBlockedUsersCollectionPage, UserGetManagedAppBlockedUsersCollectionRequest> {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserGetManagedAppBlockedUsersCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserGetManagedAppBlockedUsersCollectionRequestBuilder.class, UserGetManagedAppBlockedUsersCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the UserGetManagedAppBlockedUsersCollectionRequest instance
     */
    @Override
    @Nonnull
    public UserGetManagedAppBlockedUsersCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final UserGetManagedAppBlockedUsersCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}
