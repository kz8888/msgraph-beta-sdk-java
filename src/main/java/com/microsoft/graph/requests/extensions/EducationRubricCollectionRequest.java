// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.models.extensions.EducationRubric;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IEducationRubricCollectionPage;
import com.microsoft.graph.requests.extensions.EducationRubricCollectionResponse;
import com.microsoft.graph.requests.extensions.IEducationRubricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRubricCollectionRequest;
import com.microsoft.graph.requests.extensions.EducationRubricCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Rubric Collection Request.
 */
public class EducationRubricCollectionRequest extends BaseCollectionRequest<EducationRubricCollectionResponse, IEducationRubricCollectionPage> implements IEducationRubricCollectionRequest {

    /**
     * The request builder for this collection of EducationRubric
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationRubricCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationRubricCollectionResponse.class, IEducationRubricCollectionPage.class);
    }

    public void get(final ICallback<IEducationRubricCollectionPage> callback) {
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

    public IEducationRubricCollectionPage get() throws ClientException {
        final EducationRubricCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EducationRubric newEducationRubric, final ICallback<EducationRubric> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EducationRubricRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationRubric, callback);
    }

    public EducationRubric post(final EducationRubric newEducationRubric) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EducationRubricRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationRubric);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationRubricCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationRubricCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationRubricCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationRubricCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEducationRubricCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EducationRubricCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IEducationRubricCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (EducationRubricCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IEducationRubricCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IEducationRubricCollectionRequest)this;
    }
    public IEducationRubricCollectionPage buildFromResponse(final EducationRubricCollectionResponse response) {
        final IEducationRubricCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationRubricCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationRubricCollectionPage page = new EducationRubricCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
