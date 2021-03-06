// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceHealthScript;
import com.microsoft.graph.models.extensions.DeviceHealthScriptDeviceState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptDeviceStateCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptDeviceStateCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptDeviceStateCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptDeviceStateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Device State Collection Request.
 */
public class DeviceHealthScriptDeviceStateCollectionRequest extends BaseCollectionRequest<DeviceHealthScriptDeviceStateCollectionResponse, IDeviceHealthScriptDeviceStateCollectionPage> implements IDeviceHealthScriptDeviceStateCollectionRequest {

    /**
     * The request builder for this collection of DeviceHealthScriptDeviceState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceHealthScriptDeviceStateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceHealthScriptDeviceStateCollectionResponse.class, IDeviceHealthScriptDeviceStateCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceHealthScriptDeviceStateCollectionPage> callback) {
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

    public IDeviceHealthScriptDeviceStateCollectionPage get() throws ClientException {
        final DeviceHealthScriptDeviceStateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState, final ICallback<? super DeviceHealthScriptDeviceState> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceHealthScriptDeviceStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceHealthScriptDeviceState, callback);
    }

    public DeviceHealthScriptDeviceState post(final DeviceHealthScriptDeviceState newDeviceHealthScriptDeviceState) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceHealthScriptDeviceStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceHealthScriptDeviceState);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceHealthScriptDeviceStateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceHealthScriptDeviceStateCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceHealthScriptDeviceStateCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceHealthScriptDeviceStateCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceHealthScriptDeviceStateCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceHealthScriptDeviceStateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceHealthScriptDeviceStateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceHealthScriptDeviceStateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceHealthScriptDeviceStateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceHealthScriptDeviceStateCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceHealthScriptDeviceStateCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceHealthScriptDeviceStateCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceHealthScriptDeviceStateCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceHealthScriptDeviceStateCollectionRequest)this;
    }
    public IDeviceHealthScriptDeviceStateCollectionPage buildFromResponse(final DeviceHealthScriptDeviceStateCollectionResponse response) {
        final IDeviceHealthScriptDeviceStateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceHealthScriptDeviceStateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceHealthScriptDeviceStateCollectionPage page = new DeviceHealthScriptDeviceStateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
