// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SynchronizationTemplate;
import com.microsoft.graph.requests.extensions.SynchronizationTemplateCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.SynchronizationTemplateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Template Collection Page.
 */
public class SynchronizationTemplateCollectionPage extends BaseCollectionPage<SynchronizationTemplate, SynchronizationTemplateCollectionRequestBuilder> {

    /**
     * A collection page for SynchronizationTemplate
     *
     * @param response the serialized SynchronizationTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SynchronizationTemplateCollectionPage(@Nonnull final SynchronizationTemplateCollectionResponse response, @Nonnull final SynchronizationTemplateCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for SynchronizationTemplate
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SynchronizationTemplateCollectionPage(@Nonnull final java.util.List<SynchronizationTemplate> pageContents, @Nullable final SynchronizationTemplateCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
