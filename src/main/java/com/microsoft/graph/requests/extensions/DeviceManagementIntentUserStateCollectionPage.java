// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementIntentUserState;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentUserStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentUserStateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent User State Collection Page.
 */
public class DeviceManagementIntentUserStateCollectionPage extends BaseCollectionPage<DeviceManagementIntentUserState, IDeviceManagementIntentUserStateCollectionRequestBuilder> implements IDeviceManagementIntentUserStateCollectionPage {

    /**
     * A collection page for DeviceManagementIntentUserState
     *
     * @param response the serialized DeviceManagementIntentUserStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementIntentUserStateCollectionPage(final DeviceManagementIntentUserStateCollectionResponse response, final IDeviceManagementIntentUserStateCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
