// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementSettingCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Setting Category Collection Request.
 */
public class DeviceManagementSettingCategoryCollectionRequest extends BaseCollectionRequest<DeviceManagementSettingCategoryCollectionResponse, IDeviceManagementSettingCategoryCollectionPage> implements IDeviceManagementSettingCategoryCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementSettingCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementSettingCategoryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementSettingCategoryCollectionResponse.class, IDeviceManagementSettingCategoryCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementSettingCategoryCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceManagementSettingCategoryCollectionPage get() throws ClientException {
        final DeviceManagementSettingCategoryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementSettingCategory newDeviceManagementSettingCategory, final ICallback<DeviceManagementSettingCategory> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementSettingCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementSettingCategory, callback);
    }

    public DeviceManagementSettingCategory post(final DeviceManagementSettingCategory newDeviceManagementSettingCategory) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementSettingCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementSettingCategory);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementSettingCategoryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementSettingCategoryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementSettingCategoryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementSettingCategoryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementSettingCategoryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementSettingCategoryCollectionRequest)this;
    }

    public IDeviceManagementSettingCategoryCollectionPage buildFromResponse(final DeviceManagementSettingCategoryCollectionResponse response) {
        final IDeviceManagementSettingCategoryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementSettingCategoryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementSettingCategoryCollectionPage page = new DeviceManagementSettingCategoryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}