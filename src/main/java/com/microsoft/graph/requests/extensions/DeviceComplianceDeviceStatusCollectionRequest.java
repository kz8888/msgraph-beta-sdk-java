// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceComplianceDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Device Status Collection Request.
 */
public class DeviceComplianceDeviceStatusCollectionRequest extends BaseCollectionRequest<DeviceComplianceDeviceStatusCollectionResponse, IDeviceComplianceDeviceStatusCollectionPage> implements IDeviceComplianceDeviceStatusCollectionRequest {

    /**
     * The request builder for this collection of DeviceComplianceDeviceStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceDeviceStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceDeviceStatusCollectionResponse.class, IDeviceComplianceDeviceStatusCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceComplianceDeviceStatusCollectionPage> callback) {
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

    public IDeviceComplianceDeviceStatusCollectionPage get() throws ClientException {
        final DeviceComplianceDeviceStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus, final ICallback<? super DeviceComplianceDeviceStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceComplianceDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceComplianceDeviceStatus, callback);
    }

    public DeviceComplianceDeviceStatus post(final DeviceComplianceDeviceStatus newDeviceComplianceDeviceStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceComplianceDeviceStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceComplianceDeviceStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceComplianceDeviceStatusCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceComplianceDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceComplianceDeviceStatusCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceComplianceDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceComplianceDeviceStatusCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceComplianceDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceComplianceDeviceStatusCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceComplianceDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceComplianceDeviceStatusCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceComplianceDeviceStatusCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceComplianceDeviceStatusCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceComplianceDeviceStatusCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceComplianceDeviceStatusCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceComplianceDeviceStatusCollectionRequest)this;
    }
    public IDeviceComplianceDeviceStatusCollectionPage buildFromResponse(final DeviceComplianceDeviceStatusCollectionResponse response) {
        final IDeviceComplianceDeviceStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceComplianceDeviceStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceComplianceDeviceStatusCollectionPage page = new DeviceComplianceDeviceStatusCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
