// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationCategoryCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationCategoryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Category Collection Request.
 */
public class DeviceManagementConfigurationCategoryCollectionRequest extends BaseCollectionRequest<DeviceManagementConfigurationCategoryCollectionResponse, IDeviceManagementConfigurationCategoryCollectionPage> implements IDeviceManagementConfigurationCategoryCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementConfigurationCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationCategoryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationCategoryCollectionResponse.class, IDeviceManagementConfigurationCategoryCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceManagementConfigurationCategoryCollectionPage> callback) {
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

    public IDeviceManagementConfigurationCategoryCollectionPage get() throws ClientException {
        final DeviceManagementConfigurationCategoryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementConfigurationCategory newDeviceManagementConfigurationCategory, final ICallback<? super DeviceManagementConfigurationCategory> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementConfigurationCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementConfigurationCategory, callback);
    }

    public DeviceManagementConfigurationCategory post(final DeviceManagementConfigurationCategory newDeviceManagementConfigurationCategory) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementConfigurationCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementConfigurationCategory);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationCategoryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementConfigurationCategoryCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationCategoryCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementConfigurationCategoryCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationCategoryCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceManagementConfigurationCategoryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationCategoryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementConfigurationCategoryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementConfigurationCategoryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementConfigurationCategoryCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceManagementConfigurationCategoryCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceManagementConfigurationCategoryCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceManagementConfigurationCategoryCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceManagementConfigurationCategoryCollectionRequest)this;
    }
    public IDeviceManagementConfigurationCategoryCollectionPage buildFromResponse(final DeviceManagementConfigurationCategoryCollectionResponse response) {
        final IDeviceManagementConfigurationCategoryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementConfigurationCategoryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementConfigurationCategoryCollectionPage page = new DeviceManagementConfigurationCategoryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
