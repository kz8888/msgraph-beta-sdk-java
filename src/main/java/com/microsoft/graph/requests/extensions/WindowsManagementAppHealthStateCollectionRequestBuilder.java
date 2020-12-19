// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsManagementApp;
import com.microsoft.graph.models.extensions.WindowsManagementAppHealthState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindowsManagementAppHealthStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppHealthStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppHealthStateCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Management App Health State Collection Request Builder.
 */
public class WindowsManagementAppHealthStateCollectionRequestBuilder extends BaseRequestBuilder implements IWindowsManagementAppHealthStateCollectionRequestBuilder {

    /**
     * The request builder for this collection of WindowsManagementApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsManagementAppHealthStateCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWindowsManagementAppHealthStateCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWindowsManagementAppHealthStateCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WindowsManagementAppHealthStateCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindowsManagementAppHealthStateRequestBuilder byId(final String id) {
        return new WindowsManagementAppHealthStateRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
