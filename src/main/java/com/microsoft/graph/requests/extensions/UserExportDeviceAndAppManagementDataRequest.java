// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementData;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.requests.extensions.UserExportDeviceAndAppManagementDataRequest;

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
 * The class for the User Export Device And App Management Data Request.
 */
public class UserExportDeviceAndAppManagementDataRequest extends BaseRequest<DeviceAndAppManagementData> {
    /**
     * The request for this UserExportDeviceAndAppManagementData
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExportDeviceAndAppManagementDataRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementData.class);
    }

    /**
     * Gets the DeviceAndAppManagementData
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceAndAppManagementData> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceAndAppManagementData
     *
     * @return the DeviceAndAppManagementData
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public DeviceAndAppManagementData get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public UserExportDeviceAndAppManagementDataRequest select(@Nonnull final String value) {
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
    public UserExportDeviceAndAppManagementDataRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
