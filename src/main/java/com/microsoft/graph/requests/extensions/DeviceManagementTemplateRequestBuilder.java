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
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.extensions.DeviceManagementTemplateCreateInstanceParameterSet;
import com.microsoft.graph.models.extensions.DeviceManagementTemplateCompareParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Template Request Builder.
 */
public class DeviceManagementTemplateRequestBuilder extends BaseRequestBuilder<DeviceManagementTemplate> {

    /**
     * The request builder for the DeviceManagementTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementTemplateRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementTemplateRequest instance
     */
    @Nonnull
    public DeviceManagementTemplateRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DeviceManagementTemplateRequest instance
     */
    @Nonnull
    public DeviceManagementTemplateRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementTemplateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceManagementTemplateSettingCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementTemplateSettingCategoryCollectionRequestBuilder categories() {
        return new DeviceManagementTemplateSettingCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementTemplateSettingCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementTemplateSettingCategoryRequestBuilder categories(@Nonnull final String id) {
        return new DeviceManagementTemplateSettingCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementTemplate collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementTemplateCollectionRequestBuilder migratableTo() {
        return new DeviceManagementTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("migratableTo"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementTemplate item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementTemplateRequestBuilder migratableTo(@Nonnull final String id) {
        return new DeviceManagementTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("migratableTo") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceManagementSettingInstance collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceManagementSettingInstanceCollectionRequestBuilder settings() {
        return new DeviceManagementSettingInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceManagementSettingInstance item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceManagementSettingInstanceRequestBuilder settings(@Nonnull final String id) {
        return new DeviceManagementSettingInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("settings") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementTemplateCreateInstanceRequestBuilder createInstance(@Nonnull final DeviceManagementTemplateCreateInstanceParameterSet parameters) {
        return new DeviceManagementTemplateCreateInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createInstance"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceManagementTemplateCompareCollectionRequestBuilder compare(@Nonnull final DeviceManagementTemplateCompareParameterSet parameters) {
        return new DeviceManagementTemplateCompareCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.compare"), getClient(), null, parameters);
    }
}
