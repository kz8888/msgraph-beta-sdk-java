// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemEmail;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Email Collection Page.
 */
public class ItemEmailCollectionPage extends BaseCollectionPage<ItemEmail, ItemEmailCollectionRequestBuilder> {

    /**
     * A collection page for ItemEmail
     *
     * @param response the serialized ItemEmailCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ItemEmailCollectionPage(@Nonnull final ItemEmailCollectionResponse response, @Nonnull final ItemEmailCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ItemEmail
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ItemEmailCollectionPage(@Nonnull final java.util.List<ItemEmail> pageContents, @Nullable final ItemEmailCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
