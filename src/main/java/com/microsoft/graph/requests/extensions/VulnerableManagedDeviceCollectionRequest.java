// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityConfigurationTask;
import com.microsoft.graph.models.extensions.VulnerableManagedDevice;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceCollectionResponse;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vulnerable Managed Device Collection Request.
 */
public class VulnerableManagedDeviceCollectionRequest extends BaseEntityCollectionRequest<VulnerableManagedDevice, VulnerableManagedDeviceCollectionResponse, VulnerableManagedDeviceCollectionPage> {

    /**
     * The request builder for this collection of VulnerableManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public VulnerableManagedDeviceCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, VulnerableManagedDeviceCollectionResponse.class, VulnerableManagedDeviceCollectionPage.class, VulnerableManagedDeviceCollectionRequestBuilder.class);
    }

    /**
     * Creates a new VulnerableManagedDevice
     * @param newVulnerableManagedDevice the VulnerableManagedDevice to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final VulnerableManagedDevice newVulnerableManagedDevice, @Nonnull final ICallback<? super VulnerableManagedDevice> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new VulnerableManagedDeviceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newVulnerableManagedDevice, callback);
    }

    /**
     * Creates a new VulnerableManagedDevice
     * @param newVulnerableManagedDevice the VulnerableManagedDevice to create
     * @return the newly created object
     */
    @Nonnull
    public VulnerableManagedDevice post(@Nonnull final VulnerableManagedDevice newVulnerableManagedDevice) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new VulnerableManagedDeviceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newVulnerableManagedDevice);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public VulnerableManagedDeviceCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public VulnerableManagedDeviceCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public VulnerableManagedDeviceCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public VulnerableManagedDeviceCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public VulnerableManagedDeviceCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public VulnerableManagedDeviceCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public VulnerableManagedDeviceCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public VulnerableManagedDeviceCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public VulnerableManagedDeviceCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

