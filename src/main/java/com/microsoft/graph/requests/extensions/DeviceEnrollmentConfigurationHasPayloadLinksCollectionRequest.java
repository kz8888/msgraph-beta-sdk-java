// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationHasPayloadLinksCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationHasPayloadLinksCollectionResponse;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfigurationHasPayloadLinksBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Has Payload Links Collection Request.
 */
public class DeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest extends BaseCollectionRequest<DeviceEnrollmentConfigurationHasPayloadLinksCollectionResponse, IDeviceEnrollmentConfigurationHasPayloadLinksCollectionPage> implements IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest {


    protected final DeviceEnrollmentConfigurationHasPayloadLinksBody body;


    /**
     * The request for this DeviceEnrollmentConfigurationHasPayloadLinks
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceEnrollmentConfigurationHasPayloadLinksCollectionResponse.class, IDeviceEnrollmentConfigurationHasPayloadLinksCollectionPage.class);
        body = new DeviceEnrollmentConfigurationHasPayloadLinksBody();
    }


    public void post(final ICallback<? super IDeviceEnrollmentConfigurationHasPayloadLinksCollectionPage> callback) {
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

    public IDeviceEnrollmentConfigurationHasPayloadLinksCollectionPage post() throws ClientException {
        final DeviceEnrollmentConfigurationHasPayloadLinksCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IDeviceEnrollmentConfigurationHasPayloadLinksCollectionPage buildFromResponse(final DeviceEnrollmentConfigurationHasPayloadLinksCollectionResponse response) {
        final IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceEnrollmentConfigurationHasPayloadLinksCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<String>) null);
        } else {
            builder = null;
        }
        final IDeviceEnrollmentConfigurationHasPayloadLinksCollectionPage page = new DeviceEnrollmentConfigurationHasPayloadLinksCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IDeviceEnrollmentConfigurationHasPayloadLinksCollectionRequest)this;
    }

}
