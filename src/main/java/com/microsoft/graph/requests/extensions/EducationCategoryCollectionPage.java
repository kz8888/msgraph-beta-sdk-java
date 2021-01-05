// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationCategory;
import com.microsoft.graph.requests.extensions.IEducationCategoryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.EducationCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.EducationCategoryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Category Collection Page.
 */
public class EducationCategoryCollectionPage extends BaseCollectionPage<EducationCategory, IEducationCategoryCollectionRequestBuilder> implements IEducationCategoryCollectionPage {

    /**
     * A collection page for EducationCategory
     *
     * @param response the serialized EducationCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationCategoryCollectionPage(final EducationCategoryCollectionResponse response, final IEducationCategoryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
