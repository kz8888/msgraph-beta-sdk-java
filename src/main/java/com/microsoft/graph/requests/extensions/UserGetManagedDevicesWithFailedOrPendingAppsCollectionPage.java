// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceSummarizedAppState;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedDevicesWithFailedOrPendingAppsCollectionPage;
import com.microsoft.graph.requests.extensions.UserGetManagedDevicesWithFailedOrPendingAppsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Managed Devices With Failed Or Pending Apps Collection Page.
 */
public class UserGetManagedDevicesWithFailedOrPendingAppsCollectionPage extends BaseCollectionPage<ManagedDeviceSummarizedAppState, UserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder> {

    /**
     * A collection page for ManagedDeviceSummarizedAppState.
     *
     * @param response The serialized UserGetManagedDevicesWithFailedOrPendingAppsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserGetManagedDevicesWithFailedOrPendingAppsCollectionPage(@Nonnull final UserGetManagedDevicesWithFailedOrPendingAppsCollectionResponse response, @Nonnull final UserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for UserGetManagedDevicesWithFailedOrPendingApps
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserGetManagedDevicesWithFailedOrPendingAppsCollectionPage(@Nonnull final java.util.List<ManagedDeviceSummarizedAppState> pageContents, @Nullable final UserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
