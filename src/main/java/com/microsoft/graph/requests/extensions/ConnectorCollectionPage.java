// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Connector;
import com.microsoft.graph.requests.extensions.ConnectorCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ConnectorCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connector Collection Page.
 */
public class ConnectorCollectionPage extends BaseCollectionPage<Connector, ConnectorCollectionRequestBuilder> {

    /**
     * A collection page for Connector
     *
     * @param response the serialized ConnectorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ConnectorCollectionPage(@Nonnull final ConnectorCollectionResponse response, @Nonnull final ConnectorCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Connector
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ConnectorCollectionPage(@Nonnull final java.util.List<Connector> pageContents, @Nullable final ConnectorCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
