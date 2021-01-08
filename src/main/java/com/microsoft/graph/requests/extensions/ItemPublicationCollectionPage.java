// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemPublication;
import com.microsoft.graph.requests.extensions.ItemPublicationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ItemPublicationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Publication Collection Page.
 */
public class ItemPublicationCollectionPage extends BaseCollectionPage<ItemPublication, ItemPublicationCollectionRequestBuilder> {

    /**
     * A collection page for ItemPublication
     *
     * @param response the serialized ItemPublicationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ItemPublicationCollectionPage(@Nonnull final ItemPublicationCollectionResponse response, @Nonnull final ItemPublicationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ItemPublication
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ItemPublicationCollectionPage(@Nonnull final java.util.List<ItemPublication> pageContents, @Nullable final ItemPublicationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
