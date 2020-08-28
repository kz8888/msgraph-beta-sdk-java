// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Collection Request.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyCollectionRequest extends BaseCollectionRequest<WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse, IWindowsDefenderApplicationControlSupplementalPolicyCollectionPage> implements IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequest {

    /**
     * The request builder for this collection of WindowsDefenderApplicationControlSupplementalPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDefenderApplicationControlSupplementalPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse.class, IWindowsDefenderApplicationControlSupplementalPolicyCollectionPage.class);
    }

    public void get(final ICallback<IWindowsDefenderApplicationControlSupplementalPolicyCollectionPage> callback) {
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

    public IWindowsDefenderApplicationControlSupplementalPolicyCollectionPage get() throws ClientException {
        final WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy, final ICallback<WindowsDefenderApplicationControlSupplementalPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsDefenderApplicationControlSupplementalPolicy, callback);
    }

    public WindowsDefenderApplicationControlSupplementalPolicy post(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsDefenderApplicationControlSupplementalPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsDefenderApplicationControlSupplementalPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsDefenderApplicationControlSupplementalPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WindowsDefenderApplicationControlSupplementalPolicyCollectionRequest)this;
    }

    public IWindowsDefenderApplicationControlSupplementalPolicyCollectionPage buildFromResponse(final WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse response) {
        final IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsDefenderApplicationControlSupplementalPolicyCollectionPage page = new WindowsDefenderApplicationControlSupplementalPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}