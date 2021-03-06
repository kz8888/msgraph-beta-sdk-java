// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.FilterOperatorSchema;
import com.microsoft.graph.requests.extensions.IFilterOperatorSchemaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.FilterOperatorSchemaCollectionPage;
import com.microsoft.graph.requests.extensions.FilterOperatorSchemaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Filter Operator Schema Collection Page.
 */
public class FilterOperatorSchemaCollectionPage extends BaseCollectionPage<FilterOperatorSchema, IFilterOperatorSchemaCollectionRequestBuilder> implements IFilterOperatorSchemaCollectionPage {

    /**
     * A collection page for FilterOperatorSchema
     *
     * @param response the serialized FilterOperatorSchemaCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public FilterOperatorSchemaCollectionPage(final FilterOperatorSchemaCollectionResponse response, final IFilterOperatorSchemaCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
