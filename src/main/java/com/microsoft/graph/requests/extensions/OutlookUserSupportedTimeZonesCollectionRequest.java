// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TimeZoneInformation;
import com.microsoft.graph.models.generated.TimeZoneStandard;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOutlookUserSupportedTimeZonesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedTimeZonesCollectionPage;
import com.microsoft.graph.requests.extensions.OutlookUserSupportedTimeZonesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Supported Time Zones Collection Request.
 */
public class OutlookUserSupportedTimeZonesCollectionRequest extends BaseCollectionRequest<OutlookUserSupportedTimeZonesCollectionResponse, IOutlookUserSupportedTimeZonesCollectionPage> implements IOutlookUserSupportedTimeZonesCollectionRequest {


    /**
     * The request for this OutlookUserSupportedTimeZones
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserSupportedTimeZonesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OutlookUserSupportedTimeZonesCollectionResponse.class, IOutlookUserSupportedTimeZonesCollectionPage.class);
    }


    public void get(final ICallback<? super IOutlookUserSupportedTimeZonesCollectionPage> callback) {
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

    public IOutlookUserSupportedTimeZonesCollectionPage get() throws ClientException {
        final OutlookUserSupportedTimeZonesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IOutlookUserSupportedTimeZonesCollectionPage buildFromResponse(final OutlookUserSupportedTimeZonesCollectionResponse response) {
        final IOutlookUserSupportedTimeZonesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OutlookUserSupportedTimeZonesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IOutlookUserSupportedTimeZonesCollectionPage page = new OutlookUserSupportedTimeZonesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOutlookUserSupportedTimeZonesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IOutlookUserSupportedTimeZonesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOutlookUserSupportedTimeZonesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IOutlookUserSupportedTimeZonesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOutlookUserSupportedTimeZonesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IOutlookUserSupportedTimeZonesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IOutlookUserSupportedTimeZonesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IOutlookUserSupportedTimeZonesCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IOutlookUserSupportedTimeZonesCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IOutlookUserSupportedTimeZonesCollectionRequest)this;
    }

}
