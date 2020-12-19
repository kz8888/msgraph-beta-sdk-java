// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDefinition;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingDefinitionCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingDefinitionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Setting Definition Collection Page.
 */
public class DeviceManagementConfigurationSettingDefinitionCollectionPage extends BaseCollectionPage<DeviceManagementConfigurationSettingDefinition, IDeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder> implements IDeviceManagementConfigurationSettingDefinitionCollectionPage {

    /**
     * A collection page for DeviceManagementConfigurationSettingDefinition
     *
     * @param response the serialized DeviceManagementConfigurationSettingDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementConfigurationSettingDefinitionCollectionPage(final DeviceManagementConfigurationSettingDefinitionCollectionResponse response, final IDeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
