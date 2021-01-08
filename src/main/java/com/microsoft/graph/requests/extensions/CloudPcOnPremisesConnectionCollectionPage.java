// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CloudPcOnPremisesConnection;
import com.microsoft.graph.requests.extensions.CloudPcOnPremisesConnectionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.CloudPcOnPremisesConnectionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc On Premises Connection Collection Page.
 */
public class CloudPcOnPremisesConnectionCollectionPage extends BaseCollectionPage<CloudPcOnPremisesConnection, CloudPcOnPremisesConnectionCollectionRequestBuilder> {

    /**
     * A collection page for CloudPcOnPremisesConnection
     *
     * @param response the serialized CloudPcOnPremisesConnectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CloudPcOnPremisesConnectionCollectionPage(@Nonnull final CloudPcOnPremisesConnectionCollectionResponse response, @Nonnull final CloudPcOnPremisesConnectionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CloudPcOnPremisesConnection
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CloudPcOnPremisesConnectionCollectionPage(@Nonnull final java.util.List<CloudPcOnPremisesConnection> pageContents, @Nullable final CloudPcOnPremisesConnectionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
