// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementResourceAccessProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileBaseAssignCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementResourceAccessProfileBaseAssignCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Resource Access Profile Base Assign Collection Page.
 */
public class DeviceManagementResourceAccessProfileBaseAssignCollectionPage extends BaseCollectionPage<DeviceManagementResourceAccessProfileAssignment, IDeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder> implements IDeviceManagementResourceAccessProfileBaseAssignCollectionPage {

    /**
     * A collection page for DeviceManagementResourceAccessProfileAssignment.
     *
     * @param response The serialized DeviceManagementResourceAccessProfileBaseAssignCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceManagementResourceAccessProfileBaseAssignCollectionPage(final DeviceManagementResourceAccessProfileBaseAssignCollectionResponse response, final IDeviceManagementResourceAccessProfileBaseAssignCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
