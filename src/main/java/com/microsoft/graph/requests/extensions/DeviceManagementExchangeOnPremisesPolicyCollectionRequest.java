// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementExchangeOnPremisesPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange On Premises Policy Collection Request.
 */
public class DeviceManagementExchangeOnPremisesPolicyCollectionRequest extends BaseCollectionRequest<DeviceManagementExchangeOnPremisesPolicyCollectionResponse, IDeviceManagementExchangeOnPremisesPolicyCollectionPage> implements IDeviceManagementExchangeOnPremisesPolicyCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementExchangeOnPremisesPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementExchangeOnPremisesPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementExchangeOnPremisesPolicyCollectionResponse.class, IDeviceManagementExchangeOnPremisesPolicyCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementExchangeOnPremisesPolicyCollectionPage> callback) {
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

    public IDeviceManagementExchangeOnPremisesPolicyCollectionPage get() throws ClientException {
        final DeviceManagementExchangeOnPremisesPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy, final ICallback<DeviceManagementExchangeOnPremisesPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementExchangeOnPremisesPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementExchangeOnPremisesPolicy, callback);
    }

    public DeviceManagementExchangeOnPremisesPolicy post(final DeviceManagementExchangeOnPremisesPolicy newDeviceManagementExchangeOnPremisesPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementExchangeOnPremisesPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementExchangeOnPremisesPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementExchangeOnPremisesPolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementExchangeOnPremisesPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementExchangeOnPremisesPolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementExchangeOnPremisesPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementExchangeOnPremisesPolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementExchangeOnPremisesPolicyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceManagementExchangeOnPremisesPolicyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceManagementExchangeOnPremisesPolicyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceManagementExchangeOnPremisesPolicyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceManagementExchangeOnPremisesPolicyCollectionRequest)this;
    }
    public IDeviceManagementExchangeOnPremisesPolicyCollectionPage buildFromResponse(final DeviceManagementExchangeOnPremisesPolicyCollectionResponse response) {
        final IDeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementExchangeOnPremisesPolicyCollectionPage page = new DeviceManagementExchangeOnPremisesPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
