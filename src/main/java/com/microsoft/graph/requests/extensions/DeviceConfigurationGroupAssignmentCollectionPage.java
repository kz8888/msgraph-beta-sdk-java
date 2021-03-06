// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceConfigurationGroupAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Group Assignment Collection Page.
 */
public class DeviceConfigurationGroupAssignmentCollectionPage extends BaseCollectionPage<DeviceConfigurationGroupAssignment, IDeviceConfigurationGroupAssignmentCollectionRequestBuilder> implements IDeviceConfigurationGroupAssignmentCollectionPage {

    /**
     * A collection page for DeviceConfigurationGroupAssignment
     *
     * @param response the serialized DeviceConfigurationGroupAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationGroupAssignmentCollectionPage(final DeviceConfigurationGroupAssignmentCollectionResponse response, final IDeviceConfigurationGroupAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
