// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceShellScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Assignment Collection Request.
 */
public class DeviceManagementScriptAssignmentCollectionRequest extends BaseCollectionRequest<DeviceManagementScriptAssignmentCollectionResponse, IDeviceManagementScriptAssignmentCollectionPage> implements IDeviceManagementScriptAssignmentCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementScriptAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScriptAssignmentCollectionResponse.class, IDeviceManagementScriptAssignmentCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceManagementScriptAssignmentCollectionPage> callback) {
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

    public IDeviceManagementScriptAssignmentCollectionPage get() throws ClientException {
        final DeviceManagementScriptAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementScriptAssignment newDeviceManagementScriptAssignment, final ICallback<? super DeviceManagementScriptAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementScriptAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementScriptAssignment, callback);
    }

    public DeviceManagementScriptAssignment post(final DeviceManagementScriptAssignment newDeviceManagementScriptAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementScriptAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementScriptAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementScriptAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementScriptAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementScriptAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementScriptAssignmentCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceManagementScriptAssignmentCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceManagementScriptAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementScriptAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementScriptAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementScriptAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementScriptAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceManagementScriptAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceManagementScriptAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceManagementScriptAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceManagementScriptAssignmentCollectionRequest)this;
    }
    public IDeviceManagementScriptAssignmentCollectionPage buildFromResponse(final DeviceManagementScriptAssignmentCollectionResponse response) {
        final IDeviceManagementScriptAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementScriptAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementScriptAssignmentCollectionPage page = new DeviceManagementScriptAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
