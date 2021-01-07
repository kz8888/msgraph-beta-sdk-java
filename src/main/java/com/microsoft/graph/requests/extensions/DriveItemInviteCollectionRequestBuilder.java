// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionRequest;
import com.microsoft.graph.requests.extensions.DriveItemInviteCollectionResponse;
import com.microsoft.graph.models.extensions.DriveItemInviteParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Invite Collection Request Builder.
 */
public class DriveItemInviteCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<Permission, DriveItemInviteCollectionRequestBuilder, DriveItemInviteCollectionResponse, DriveItemInviteCollectionPage, DriveItemInviteCollectionRequest> {

    private DriveItemInviteParameterSet body;
    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DriveItemInviteCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DriveItemInviteParameterSet parameters) {
        super(requestUrl, client, requestOptions, DriveItemInviteCollectionRequestBuilder.class, DriveItemInviteCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DriveItemInviteCollectionRequest instance
     */
    @Override
    @Nonnull
    public DriveItemInviteCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DriveItemInviteCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
