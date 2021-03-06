// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationCategory;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationCategoryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationCategoryCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Category Collection Page.
 */
public class DeviceManagementConfigurationCategoryCollectionPage extends BaseCollectionPage<DeviceManagementConfigurationCategory, IDeviceManagementConfigurationCategoryCollectionRequestBuilder> implements IDeviceManagementConfigurationCategoryCollectionPage {

    /**
     * A collection page for DeviceManagementConfigurationCategory
     *
     * @param response the serialized DeviceManagementConfigurationCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementConfigurationCategoryCollectionPage(final DeviceManagementConfigurationCategoryCollectionResponse response, final IDeviceManagementConfigurationCategoryCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
