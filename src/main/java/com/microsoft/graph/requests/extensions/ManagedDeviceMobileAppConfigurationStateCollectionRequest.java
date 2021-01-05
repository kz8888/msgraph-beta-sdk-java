// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationStateCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationStateCollectionResponse;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationStateCollectionRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationStateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration State Collection Request.
 */
public class ManagedDeviceMobileAppConfigurationStateCollectionRequest extends BaseCollectionRequest<ManagedDeviceMobileAppConfigurationStateCollectionResponse, IManagedDeviceMobileAppConfigurationStateCollectionPage> implements IManagedDeviceMobileAppConfigurationStateCollectionRequest {

    /**
     * The request builder for this collection of ManagedDeviceMobileAppConfigurationState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationStateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationStateCollectionResponse.class, IManagedDeviceMobileAppConfigurationStateCollectionPage.class);
    }

    public void get(final ICallback<? super IManagedDeviceMobileAppConfigurationStateCollectionPage> callback) {
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

    public IManagedDeviceMobileAppConfigurationStateCollectionPage get() throws ClientException {
        final ManagedDeviceMobileAppConfigurationStateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ManagedDeviceMobileAppConfigurationState newManagedDeviceMobileAppConfigurationState, final ICallback<? super ManagedDeviceMobileAppConfigurationState> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedDeviceMobileAppConfigurationStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationState, callback);
    }

    public ManagedDeviceMobileAppConfigurationState post(final ManagedDeviceMobileAppConfigurationState newManagedDeviceMobileAppConfigurationState) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedDeviceMobileAppConfigurationStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newManagedDeviceMobileAppConfigurationState);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationStateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceMobileAppConfigurationStateCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationStateCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ManagedDeviceMobileAppConfigurationStateCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationStateCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ManagedDeviceMobileAppConfigurationStateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationStateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceMobileAppConfigurationStateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationStateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ManagedDeviceMobileAppConfigurationStateCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationStateCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ManagedDeviceMobileAppConfigurationStateCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IManagedDeviceMobileAppConfigurationStateCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IManagedDeviceMobileAppConfigurationStateCollectionRequest)this;
    }
    public IManagedDeviceMobileAppConfigurationStateCollectionPage buildFromResponse(final ManagedDeviceMobileAppConfigurationStateCollectionResponse response) {
        final IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedDeviceMobileAppConfigurationStateCollectionPage page = new ManagedDeviceMobileAppConfigurationStateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
