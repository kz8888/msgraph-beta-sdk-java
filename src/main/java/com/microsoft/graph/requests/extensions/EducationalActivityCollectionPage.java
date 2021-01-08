// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationalActivity;
import com.microsoft.graph.requests.extensions.EducationalActivityCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.EducationalActivityCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Educational Activity Collection Page.
 */
public class EducationalActivityCollectionPage extends BaseCollectionPage<EducationalActivity, EducationalActivityCollectionRequestBuilder> {

    /**
     * A collection page for EducationalActivity
     *
     * @param response the serialized EducationalActivityCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationalActivityCollectionPage(@Nonnull final EducationalActivityCollectionResponse response, @Nonnull final EducationalActivityCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for EducationalActivity
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EducationalActivityCollectionPage(@Nonnull final java.util.List<EducationalActivity> pageContents, @Nullable final EducationalActivityCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
