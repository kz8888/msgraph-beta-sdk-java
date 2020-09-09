// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionWipeAction;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionWipeActionCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionWipeActionCollectionResponse;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionWipeActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionWipeActionCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionWipeActionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Wipe Action Collection Request.
 */
public class WindowsInformationProtectionWipeActionCollectionRequest extends BaseCollectionRequest<WindowsInformationProtectionWipeActionCollectionResponse, IWindowsInformationProtectionWipeActionCollectionPage> implements IWindowsInformationProtectionWipeActionCollectionRequest {

    /**
     * The request builder for this collection of WindowsInformationProtectionWipeAction
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionWipeActionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionWipeActionCollectionResponse.class, IWindowsInformationProtectionWipeActionCollectionPage.class);
    }

    public void get(final ICallback<IWindowsInformationProtectionWipeActionCollectionPage> callback) {
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

    public IWindowsInformationProtectionWipeActionCollectionPage get() throws ClientException {
        final WindowsInformationProtectionWipeActionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsInformationProtectionWipeAction newWindowsInformationProtectionWipeAction, final ICallback<WindowsInformationProtectionWipeAction> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsInformationProtectionWipeActionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsInformationProtectionWipeAction, callback);
    }

    public WindowsInformationProtectionWipeAction post(final WindowsInformationProtectionWipeAction newWindowsInformationProtectionWipeAction) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsInformationProtectionWipeActionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newWindowsInformationProtectionWipeAction);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsInformationProtectionWipeActionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsInformationProtectionWipeActionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsInformationProtectionWipeActionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsInformationProtectionWipeActionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsInformationProtectionWipeActionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WindowsInformationProtectionWipeActionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IWindowsInformationProtectionWipeActionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (WindowsInformationProtectionWipeActionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IWindowsInformationProtectionWipeActionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IWindowsInformationProtectionWipeActionCollectionRequest)this;
    }
    public IWindowsInformationProtectionWipeActionCollectionPage buildFromResponse(final WindowsInformationProtectionWipeActionCollectionResponse response) {
        final IWindowsInformationProtectionWipeActionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsInformationProtectionWipeActionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsInformationProtectionWipeActionCollectionPage page = new WindowsInformationProtectionWipeActionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
