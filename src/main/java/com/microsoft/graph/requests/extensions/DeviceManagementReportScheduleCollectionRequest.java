// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementReports;
import com.microsoft.graph.models.extensions.DeviceManagementReportSchedule;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportScheduleCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementReportScheduleCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportScheduleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportScheduleCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementReportScheduleCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Report Schedule Collection Request.
 */
public class DeviceManagementReportScheduleCollectionRequest extends BaseCollectionRequest<DeviceManagementReportScheduleCollectionResponse, IDeviceManagementReportScheduleCollectionPage> implements IDeviceManagementReportScheduleCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementReportSchedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportScheduleCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementReportScheduleCollectionResponse.class, IDeviceManagementReportScheduleCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementReportScheduleCollectionPage> callback) {
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

    public IDeviceManagementReportScheduleCollectionPage get() throws ClientException {
        final DeviceManagementReportScheduleCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementReportSchedule newDeviceManagementReportSchedule, final ICallback<DeviceManagementReportSchedule> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementReportScheduleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementReportSchedule, callback);
    }

    public DeviceManagementReportSchedule post(final DeviceManagementReportSchedule newDeviceManagementReportSchedule) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementReportScheduleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementReportSchedule);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementReportScheduleCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementReportScheduleCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementReportScheduleCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementReportScheduleCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementReportScheduleCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementReportScheduleCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceManagementReportScheduleCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceManagementReportScheduleCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceManagementReportScheduleCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceManagementReportScheduleCollectionRequest)this;
    }
    public IDeviceManagementReportScheduleCollectionPage buildFromResponse(final DeviceManagementReportScheduleCollectionResponse response) {
        final IDeviceManagementReportScheduleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementReportScheduleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementReportScheduleCollectionPage page = new DeviceManagementReportScheduleCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
