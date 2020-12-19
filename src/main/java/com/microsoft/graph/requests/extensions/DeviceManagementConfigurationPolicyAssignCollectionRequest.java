// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyAssignCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyAssignCollectionResponse;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Assign Collection Request.
 */
public class DeviceManagementConfigurationPolicyAssignCollectionRequest extends BaseCollectionRequest<DeviceManagementConfigurationPolicyAssignCollectionResponse, IDeviceManagementConfigurationPolicyAssignCollectionPage> implements IDeviceManagementConfigurationPolicyAssignCollectionRequest {


    protected final DeviceManagementConfigurationPolicyAssignBody body;


    /**
     * The request for this DeviceManagementConfigurationPolicyAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationPolicyAssignCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationPolicyAssignCollectionResponse.class, IDeviceManagementConfigurationPolicyAssignCollectionPage.class);
        body = new DeviceManagementConfigurationPolicyAssignBody();
    }


    public void post(final ICallback<? super IDeviceManagementConfigurationPolicyAssignCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceManagementConfigurationPolicyAssignCollectionPage post() throws ClientException {
        final DeviceManagementConfigurationPolicyAssignCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IDeviceManagementConfigurationPolicyAssignCollectionPage buildFromResponse(final DeviceManagementConfigurationPolicyAssignCollectionResponse response) {
        final IDeviceManagementConfigurationPolicyAssignCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<DeviceManagementConfigurationPolicyAssignment>) null);
        } else {
            builder = null;
        }
        final IDeviceManagementConfigurationPolicyAssignCollectionPage page = new DeviceManagementConfigurationPolicyAssignCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceManagementConfigurationPolicyAssignCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IDeviceManagementConfigurationPolicyAssignCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IDeviceManagementConfigurationPolicyAssignCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IDeviceManagementConfigurationPolicyAssignCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyAssignCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IDeviceManagementConfigurationPolicyAssignCollectionRequest)this;
    }

}
