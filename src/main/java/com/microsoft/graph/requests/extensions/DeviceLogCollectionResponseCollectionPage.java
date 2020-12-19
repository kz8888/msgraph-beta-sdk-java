// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceLogCollectionResponseCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceLogCollectionResponseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceLogCollectionResponseCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Log Collection Response Collection Page.
 */
public class DeviceLogCollectionResponseCollectionPage extends BaseCollectionPage<DeviceLogCollectionResponse, IDeviceLogCollectionResponseCollectionRequestBuilder> implements IDeviceLogCollectionResponseCollectionPage {

    /**
     * A collection page for DeviceLogCollectionResponse
     *
     * @param response the serialized DeviceLogCollectionResponseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceLogCollectionResponseCollectionPage(final DeviceLogCollectionResponseCollectionResponse response, final IDeviceLogCollectionResponseCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
