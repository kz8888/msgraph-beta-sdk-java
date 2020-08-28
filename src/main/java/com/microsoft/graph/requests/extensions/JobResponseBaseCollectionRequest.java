// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.JobResponseBase;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IJobResponseBaseCollectionPage;
import com.microsoft.graph.requests.extensions.JobResponseBaseCollectionResponse;
import com.microsoft.graph.requests.extensions.IJobResponseBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJobResponseBaseCollectionRequest;
import com.microsoft.graph.requests.extensions.JobResponseBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Job Response Base Collection Request.
 */
public class JobResponseBaseCollectionRequest extends BaseCollectionRequest<JobResponseBaseCollectionResponse, IJobResponseBaseCollectionPage> implements IJobResponseBaseCollectionRequest {

    /**
     * The request builder for this collection of JobResponseBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public JobResponseBaseCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, JobResponseBaseCollectionResponse.class, IJobResponseBaseCollectionPage.class);
    }

    public void get(final ICallback<IJobResponseBaseCollectionPage> callback) {
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

    public IJobResponseBaseCollectionPage get() throws ClientException {
        final JobResponseBaseCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final JobResponseBase newJobResponseBase, final ICallback<JobResponseBase> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new JobResponseBaseRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newJobResponseBase, callback);
    }

    public JobResponseBase post(final JobResponseBase newJobResponseBase) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new JobResponseBaseRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newJobResponseBase);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IJobResponseBaseCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (JobResponseBaseCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IJobResponseBaseCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (JobResponseBaseCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IJobResponseBaseCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (JobResponseBaseCollectionRequest)this;
    }

    public IJobResponseBaseCollectionPage buildFromResponse(final JobResponseBaseCollectionResponse response) {
        final IJobResponseBaseCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new JobResponseBaseCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final JobResponseBaseCollectionPage page = new JobResponseBaseCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}