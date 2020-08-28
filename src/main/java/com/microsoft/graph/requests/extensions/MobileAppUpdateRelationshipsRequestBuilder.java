// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMobileAppUpdateRelationshipsRequest;
import com.microsoft.graph.requests.extensions.MobileAppUpdateRelationshipsRequest;
import com.microsoft.graph.models.extensions.MobileAppRelationship;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Update Relationships Request Builder.
 */
public class MobileAppUpdateRelationshipsRequestBuilder extends BaseActionRequestBuilder implements IMobileAppUpdateRelationshipsRequestBuilder {

    /**
     * The request builder for this MobileAppUpdateRelationships
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param relationships the relationships
     */
    public MobileAppUpdateRelationshipsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<MobileAppRelationship> relationships) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("relationships", relationships);
    }

    /**
     * Creates the IMobileAppUpdateRelationshipsRequest
     *
     * @return the IMobileAppUpdateRelationshipsRequest instance
     */
    public IMobileAppUpdateRelationshipsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IMobileAppUpdateRelationshipsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMobileAppUpdateRelationshipsRequest instance
     */
    public IMobileAppUpdateRelationshipsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MobileAppUpdateRelationshipsRequest request = new MobileAppUpdateRelationshipsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("relationships")) {
            request.body.relationships = getParameter("relationships");
        }

        return request;
    }
}