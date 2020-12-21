// Template Source: IBaseEntityCollectionWithReferencesRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSetting;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Configuration Setting Definition Collection With References Request.
 */
public interface IDeviceManagementConfigurationSettingDefinitionCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IDeviceManagementConfigurationSettingDefinitionCollectionWithReferencesPage> callback);

    IDeviceManagementConfigurationSettingDefinitionCollectionWithReferencesPage get() throws ClientException;

    IDeviceManagementConfigurationSettingDefinitionCollectionWithReferencesRequest expand(final String value);
    
    IDeviceManagementConfigurationSettingDefinitionCollectionWithReferencesRequest select(final String value);

    IDeviceManagementConfigurationSettingDefinitionCollectionWithReferencesRequest top(final int value);

}
