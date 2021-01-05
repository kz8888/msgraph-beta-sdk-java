// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementTemplate;
import com.microsoft.graph.models.extensions.DeviceManagementSettingInstance;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.models.extensions.DeviceManagementSettingComparison;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Template Request Builder.
 */
public class DeviceManagementTemplateRequestBuilder extends BaseRequestBuilder implements IDeviceManagementTemplateRequestBuilder {

    /**
     * The request builder for the DeviceManagementTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementTemplateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementTemplateRequest instance
     */
    public IDeviceManagementTemplateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementTemplateRequest instance
     */
    public IDeviceManagementTemplateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementTemplateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceManagementTemplateSettingCategoryCollectionRequestBuilder categories() {
        return new DeviceManagementTemplateSettingCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    public IDeviceManagementTemplateSettingCategoryRequestBuilder categories(final String id) {
        return new DeviceManagementTemplateSettingCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    public IDeviceManagementTemplateCollectionRequestBuilder migratableTo() {
        return new DeviceManagementTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("migratableTo"), getClient(), null);
    }

    public IDeviceManagementTemplateRequestBuilder migratableTo(final String id) {
        return new DeviceManagementTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("migratableTo") + "/" + id, getClient(), null);
    }
    public IDeviceManagementSettingInstanceCollectionRequestBuilder settings() {
        return new DeviceManagementSettingInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    public IDeviceManagementSettingInstanceRequestBuilder settings(final String id) {
        return new DeviceManagementSettingInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("settings") + "/" + id, getClient(), null);
    }

    public IDeviceManagementTemplateCreateInstanceRequestBuilder createInstance(final String displayName, final String description, final java.util.List<DeviceManagementSettingInstance> settingsDelta, final java.util.List<String> roleScopeTagIds) {
        return new DeviceManagementTemplateCreateInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createInstance"), getClient(), null, displayName, description, settingsDelta, roleScopeTagIds);
    }

    public IDeviceManagementTemplateCompareCollectionRequestBuilder compare(final String templateId) {
        return new DeviceManagementTemplateCompareCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.compare"), getClient(), null, templateId);
    }
}
