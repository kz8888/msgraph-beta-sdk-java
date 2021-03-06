// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetUserOwnedObjectsRequest;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetUserOwnedObjectsRequest;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Get User Owned Objects Request Builder.
 */
public class DirectoryObjectGetUserOwnedObjectsRequestBuilder extends BaseActionRequestBuilder implements IDirectoryObjectGetUserOwnedObjectsRequestBuilder {

    /**
     * The request builder for this DirectoryObjectGetUserOwnedObjects
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param userId the userId
     * @param type the type
     */
    public DirectoryObjectGetUserOwnedObjectsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String userId, final String type) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("userId", userId);
        bodyParams.put("type", type);
    }

    /**
     * Creates the IDirectoryObjectGetUserOwnedObjectsRequest
     *
     * @param requestOptions the options for the request
     * @return the IDirectoryObjectGetUserOwnedObjectsRequest instance
     */
    public IDirectoryObjectGetUserOwnedObjectsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDirectoryObjectGetUserOwnedObjectsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDirectoryObjectGetUserOwnedObjectsRequest instance
     */
    public IDirectoryObjectGetUserOwnedObjectsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DirectoryObjectGetUserOwnedObjectsRequest request = new DirectoryObjectGetUserOwnedObjectsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("userId")) {
            request.body.userId = getParameter("userId");
        }

        if (hasParameter("type")) {
            request.body.type = getParameter("type");
        }

        return request;
    }
}
