// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SiteSource;
import com.microsoft.graph.requests.extensions.ISiteSourceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SiteSourceCollectionPage;
import com.microsoft.graph.requests.extensions.SiteSourceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Source Collection Page.
 */
public class SiteSourceCollectionPage extends BaseCollectionPage<SiteSource, ISiteSourceCollectionRequestBuilder> implements ISiteSourceCollectionPage {

    /**
     * A collection page for SiteSource
     *
     * @param response the serialized SiteSourceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SiteSourceCollectionPage(final SiteSourceCollectionResponse response, final ISiteSourceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
