// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppTroubleshootingEvent;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Troubleshooting Event Collection Page.
 */
public class MobileAppTroubleshootingEventCollectionPage extends BaseCollectionPage<MobileAppTroubleshootingEvent, MobileAppTroubleshootingEventCollectionRequestBuilder> {

    /**
     * A collection page for MobileAppTroubleshootingEvent
     *
     * @param response the serialized MobileAppTroubleshootingEventCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppTroubleshootingEventCollectionPage(@Nonnull final MobileAppTroubleshootingEventCollectionResponse response, @Nonnull final MobileAppTroubleshootingEventCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MobileAppTroubleshootingEvent
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MobileAppTroubleshootingEventCollectionPage(@Nonnull final java.util.List<MobileAppTroubleshootingEvent> pageContents, @Nullable final MobileAppTroubleshootingEventCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
