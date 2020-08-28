// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Notification;
import com.microsoft.graph.requests.extensions.INotificationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.NotificationCollectionPage;
import com.microsoft.graph.requests.extensions.NotificationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notification Collection Page.
 */
public class NotificationCollectionPage extends BaseCollectionPage<Notification, INotificationCollectionRequestBuilder> implements INotificationCollectionPage {

    /**
     * A collection page for Notification
     *
     * @param response the serialized NotificationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public NotificationCollectionPage(final NotificationCollectionResponse response, final INotificationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}