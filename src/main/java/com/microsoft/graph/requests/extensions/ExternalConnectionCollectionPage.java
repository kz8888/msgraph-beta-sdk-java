// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExternalConnection;
import com.microsoft.graph.requests.extensions.IExternalConnectionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ExternalConnectionCollectionPage;
import com.microsoft.graph.requests.extensions.ExternalConnectionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Connection Collection Page.
 */
public class ExternalConnectionCollectionPage extends BaseCollectionPage<ExternalConnection, IExternalConnectionCollectionRequestBuilder> implements IExternalConnectionCollectionPage {

    /**
     * A collection page for ExternalConnection
     *
     * @param response the serialized ExternalConnectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExternalConnectionCollectionPage(final ExternalConnectionCollectionResponse response, final IExternalConnectionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
