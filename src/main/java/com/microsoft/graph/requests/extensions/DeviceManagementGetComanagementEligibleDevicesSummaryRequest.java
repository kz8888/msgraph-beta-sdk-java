// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ComanagementEligibleDevicesSummary;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.requests.extensions.DeviceManagementGetComanagementEligibleDevicesSummaryRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Get Comanagement Eligible Devices Summary Request.
 */
public class DeviceManagementGetComanagementEligibleDevicesSummaryRequest extends BaseRequest<ComanagementEligibleDevicesSummary> {
    /**
     * The request for this DeviceManagementGetComanagementEligibleDevicesSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementGetComanagementEligibleDevicesSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ComanagementEligibleDevicesSummary.class);
    }

    /**
     * Gets the ComanagementEligibleDevicesSummary
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ComanagementEligibleDevicesSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ComanagementEligibleDevicesSummary
     *
     * @return the ComanagementEligibleDevicesSummary
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public ComanagementEligibleDevicesSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementGetComanagementEligibleDevicesSummaryRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementGetComanagementEligibleDevicesSummaryRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
