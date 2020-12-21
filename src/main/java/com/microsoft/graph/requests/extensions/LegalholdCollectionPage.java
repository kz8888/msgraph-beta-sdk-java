// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Legalhold;
import com.microsoft.graph.requests.extensions.ILegalholdCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.LegalholdCollectionPage;
import com.microsoft.graph.requests.extensions.LegalholdCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Legalhold Collection Page.
 */
public class LegalholdCollectionPage extends BaseCollectionPage<Legalhold, ILegalholdCollectionRequestBuilder> implements ILegalholdCollectionPage {

    /**
     * A collection page for Legalhold
     *
     * @param response the serialized LegalholdCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public LegalholdCollectionPage(final LegalholdCollectionResponse response, final ILegalholdCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
