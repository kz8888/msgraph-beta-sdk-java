// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Detected App Collection Page.
 */
public class DetectedAppCollectionPage extends BaseCollectionPage<DetectedApp, DetectedAppCollectionRequestBuilder> {

    /**
     * A collection page for DetectedApp
     *
     * @param response the serialized DetectedAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DetectedAppCollectionPage(@Nonnull final DetectedAppCollectionResponse response, @Nonnull final DetectedAppCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DetectedApp
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DetectedAppCollectionPage(@Nonnull final java.util.List<DetectedApp> pageContents, @Nullable final DetectedAppCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
