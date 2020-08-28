// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequest;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Multi Value Legacy Extended Property Collection Request.
 */
public class MultiValueLegacyExtendedPropertyCollectionRequest extends BaseCollectionRequest<MultiValueLegacyExtendedPropertyCollectionResponse, IMultiValueLegacyExtendedPropertyCollectionPage> implements IMultiValueLegacyExtendedPropertyCollectionRequest {

    /**
     * The request builder for this collection of MultiValueLegacyExtendedProperty
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MultiValueLegacyExtendedPropertyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MultiValueLegacyExtendedPropertyCollectionResponse.class, IMultiValueLegacyExtendedPropertyCollectionPage.class);
    }

    public void get(final ICallback<IMultiValueLegacyExtendedPropertyCollectionPage> callback) {
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

    public IMultiValueLegacyExtendedPropertyCollectionPage get() throws ClientException {
        final MultiValueLegacyExtendedPropertyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty, final ICallback<MultiValueLegacyExtendedProperty> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MultiValueLegacyExtendedPropertyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMultiValueLegacyExtendedProperty, callback);
    }

    public MultiValueLegacyExtendedProperty post(final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MultiValueLegacyExtendedPropertyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMultiValueLegacyExtendedProperty);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMultiValueLegacyExtendedPropertyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MultiValueLegacyExtendedPropertyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMultiValueLegacyExtendedPropertyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MultiValueLegacyExtendedPropertyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMultiValueLegacyExtendedPropertyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MultiValueLegacyExtendedPropertyCollectionRequest)this;
    }

    public IMultiValueLegacyExtendedPropertyCollectionPage buildFromResponse(final MultiValueLegacyExtendedPropertyCollectionResponse response) {
        final IMultiValueLegacyExtendedPropertyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MultiValueLegacyExtendedPropertyCollectionPage page = new MultiValueLegacyExtendedPropertyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}