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

import com.microsoft.graph.requests.extensions.IUserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetManagedDevicesWithFailedOrPendingAppsCollectionPage;
import com.microsoft.graph.requests.extensions.UserGetManagedDevicesWithFailedOrPendingAppsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Managed Devices With Failed Or Pending Apps Collection Page.
 */
public class UserGetManagedDevicesWithFailedOrPendingAppsCollectionPage extends BaseCollectionPage<ManagedDeviceSummarizedAppState, IUserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder> implements IUserGetManagedDevicesWithFailedOrPendingAppsCollectionPage {

    /**
     * A collection page for ManagedDeviceSummarizedAppState.
     *
     * @param response The serialized UserGetManagedDevicesWithFailedOrPendingAppsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserGetManagedDevicesWithFailedOrPendingAppsCollectionPage(final UserGetManagedDevicesWithFailedOrPendingAppsCollectionResponse response, final IUserGetManagedDevicesWithFailedOrPendingAppsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
