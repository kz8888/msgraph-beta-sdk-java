// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExactMatchDataStore;
import com.microsoft.graph.requests.extensions.IExactMatchDataStoreCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ExactMatchDataStoreCollectionPage;
import com.microsoft.graph.requests.extensions.ExactMatchDataStoreCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Data Store Collection Page.
 */
public class ExactMatchDataStoreCollectionPage extends BaseCollectionPage<ExactMatchDataStore, IExactMatchDataStoreCollectionRequestBuilder> implements IExactMatchDataStoreCollectionPage {

    /**
     * A collection page for ExactMatchDataStore
     *
     * @param response the serialized ExactMatchDataStoreCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExactMatchDataStoreCollectionPage(final ExactMatchDataStoreCollectionResponse response, final IExactMatchDataStoreCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
