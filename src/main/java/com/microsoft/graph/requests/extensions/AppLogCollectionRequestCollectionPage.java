// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppLogCollectionRequest;
import com.microsoft.graph.requests.extensions.IAppLogCollectionRequestCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AppLogCollectionRequestCollectionPage;
import com.microsoft.graph.requests.extensions.AppLogCollectionRequestCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Log Collection Request Collection Page.
 */
public class AppLogCollectionRequestCollectionPage extends BaseCollectionPage<AppLogCollectionRequest, IAppLogCollectionRequestCollectionRequestBuilder> implements IAppLogCollectionRequestCollectionPage {

    /**
     * A collection page for AppLogCollectionRequest
     *
     * @param response the serialized AppLogCollectionRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AppLogCollectionRequestCollectionPage(final AppLogCollectionRequestCollectionResponse response, final IAppLogCollectionRequestCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}