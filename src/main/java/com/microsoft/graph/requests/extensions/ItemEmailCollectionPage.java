// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemEmail;
import com.microsoft.graph.requests.extensions.IItemEmailCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionPage;
import com.microsoft.graph.requests.extensions.ItemEmailCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Email Collection Page.
 */
public class ItemEmailCollectionPage extends BaseCollectionPage<ItemEmail, IItemEmailCollectionRequestBuilder> implements IItemEmailCollectionPage {

    /**
     * A collection page for ItemEmail
     *
     * @param response the serialized ItemEmailCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ItemEmailCollectionPage(final ItemEmailCollectionResponse response, final IItemEmailCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
