// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SynchronizationJob;
import com.microsoft.graph.requests.extensions.SynchronizationJobCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.SynchronizationJobCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Job Collection Page.
 */
public class SynchronizationJobCollectionPage extends BaseCollectionPage<SynchronizationJob, SynchronizationJobCollectionRequestBuilder> {

    /**
     * A collection page for SynchronizationJob
     *
     * @param response the serialized SynchronizationJobCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SynchronizationJobCollectionPage(@Nonnull final SynchronizationJobCollectionResponse response, @Nonnull final SynchronizationJobCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SynchronizationJob
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SynchronizationJobCollectionPage(@Nonnull final java.util.List<SynchronizationJob> pageContents, @Nullable final SynchronizationJobCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
