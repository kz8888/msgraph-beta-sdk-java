// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.EducationalActivity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IEducationalActivityCollectionPage;
import com.microsoft.graph.requests.extensions.EducationalActivityCollectionResponse;
import com.microsoft.graph.requests.extensions.IEducationalActivityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationalActivityCollectionRequest;
import com.microsoft.graph.requests.extensions.EducationalActivityCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Educational Activity Collection Request.
 */
public class EducationalActivityCollectionRequest extends BaseCollectionRequest<EducationalActivityCollectionResponse, IEducationalActivityCollectionPage> implements IEducationalActivityCollectionRequest {

    /**
     * The request builder for this collection of EducationalActivity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationalActivityCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationalActivityCollectionResponse.class, IEducationalActivityCollectionPage.class);
    }

    public void get(final ICallback<IEducationalActivityCollectionPage> callback) {
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

    public IEducationalActivityCollectionPage get() throws ClientException {
        final EducationalActivityCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EducationalActivity newEducationalActivity, final ICallback<EducationalActivity> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EducationalActivityRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationalActivity, callback);
    }

    public EducationalActivity post(final EducationalActivity newEducationalActivity) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EducationalActivityRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationalActivity);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationalActivityCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationalActivityCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationalActivityCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationalActivityCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEducationalActivityCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EducationalActivityCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IEducationalActivityCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (EducationalActivityCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IEducationalActivityCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IEducationalActivityCollectionRequest)this;
    }
    public IEducationalActivityCollectionPage buildFromResponse(final EducationalActivityCollectionResponse response) {
        final IEducationalActivityCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationalActivityCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationalActivityCollectionPage page = new EducationalActivityCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
