// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReview;
import com.microsoft.graph.models.extensions.AccessReviewReviewer;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAccessReviewReviewerCollectionPage;
import com.microsoft.graph.requests.extensions.AccessReviewReviewerCollectionResponse;
import com.microsoft.graph.requests.extensions.IAccessReviewReviewerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewReviewerCollectionRequest;
import com.microsoft.graph.requests.extensions.AccessReviewReviewerCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Reviewer Collection Request.
 */
public class AccessReviewReviewerCollectionRequest extends BaseCollectionRequest<AccessReviewReviewerCollectionResponse, IAccessReviewReviewerCollectionPage> implements IAccessReviewReviewerCollectionRequest {

    /**
     * The request builder for this collection of AccessReviewReviewer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewReviewerCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewReviewerCollectionResponse.class, IAccessReviewReviewerCollectionPage.class);
    }

    public void get(final ICallback<? super IAccessReviewReviewerCollectionPage> callback) {
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

    public IAccessReviewReviewerCollectionPage get() throws ClientException {
        final AccessReviewReviewerCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AccessReviewReviewer newAccessReviewReviewer, final ICallback<? super AccessReviewReviewer> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AccessReviewReviewerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAccessReviewReviewer, callback);
    }

    public AccessReviewReviewer post(final AccessReviewReviewer newAccessReviewReviewer) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AccessReviewReviewerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAccessReviewReviewer);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAccessReviewReviewerCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AccessReviewReviewerCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAccessReviewReviewerCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AccessReviewReviewerCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAccessReviewReviewerCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (AccessReviewReviewerCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAccessReviewReviewerCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AccessReviewReviewerCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAccessReviewReviewerCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AccessReviewReviewerCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAccessReviewReviewerCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AccessReviewReviewerCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAccessReviewReviewerCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAccessReviewReviewerCollectionRequest)this;
    }
    public IAccessReviewReviewerCollectionPage buildFromResponse(final AccessReviewReviewerCollectionResponse response) {
        final IAccessReviewReviewerCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AccessReviewReviewerCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AccessReviewReviewerCollectionPage page = new AccessReviewReviewerCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
