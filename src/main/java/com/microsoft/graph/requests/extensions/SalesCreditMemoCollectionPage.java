// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SalesCreditMemo;
import com.microsoft.graph.requests.extensions.ISalesCreditMemoCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SalesCreditMemoCollectionPage;
import com.microsoft.graph.requests.extensions.SalesCreditMemoCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Credit Memo Collection Page.
 */
public class SalesCreditMemoCollectionPage extends BaseCollectionPage<SalesCreditMemo, ISalesCreditMemoCollectionRequestBuilder> implements ISalesCreditMemoCollectionPage {

    /**
     * A collection page for SalesCreditMemo
     *
     * @param response the serialized SalesCreditMemoCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SalesCreditMemoCollectionPage(final SalesCreditMemoCollectionResponse response, final ISalesCreditMemoCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
