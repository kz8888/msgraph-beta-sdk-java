// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Derived Credential Settings Collection Request.
 */
public class DeviceManagementDerivedCredentialSettingsCollectionRequest extends BaseCollectionRequest<DeviceManagementDerivedCredentialSettingsCollectionResponse, IDeviceManagementDerivedCredentialSettingsCollectionPage> implements IDeviceManagementDerivedCredentialSettingsCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementDerivedCredentialSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementDerivedCredentialSettingsCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementDerivedCredentialSettingsCollectionResponse.class, IDeviceManagementDerivedCredentialSettingsCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementDerivedCredentialSettingsCollectionPage> callback) {
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

    public IDeviceManagementDerivedCredentialSettingsCollectionPage get() throws ClientException {
        final DeviceManagementDerivedCredentialSettingsCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings, final ICallback<DeviceManagementDerivedCredentialSettings> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementDerivedCredentialSettingsRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementDerivedCredentialSettings, callback);
    }

    public DeviceManagementDerivedCredentialSettings post(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementDerivedCredentialSettingsRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementDerivedCredentialSettingsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementDerivedCredentialSettingsCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementDerivedCredentialSettingsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementDerivedCredentialSettingsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementDerivedCredentialSettingsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementDerivedCredentialSettingsCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceManagementDerivedCredentialSettingsCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceManagementDerivedCredentialSettingsCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceManagementDerivedCredentialSettingsCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceManagementDerivedCredentialSettingsCollectionRequest)this;
    }
    public IDeviceManagementDerivedCredentialSettingsCollectionPage buildFromResponse(final DeviceManagementDerivedCredentialSettingsCollectionResponse response) {
        final IDeviceManagementDerivedCredentialSettingsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementDerivedCredentialSettingsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementDerivedCredentialSettingsCollectionPage page = new DeviceManagementDerivedCredentialSettingsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
