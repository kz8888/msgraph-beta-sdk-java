// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AgreementAcceptance;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionPage;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionResponse;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequest;
import com.microsoft.graph.requests.extensions.AgreementAcceptanceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement Acceptance Collection Request.
 */
public class AgreementAcceptanceCollectionRequest extends BaseCollectionRequest<AgreementAcceptanceCollectionResponse, IAgreementAcceptanceCollectionPage> implements IAgreementAcceptanceCollectionRequest {

    /**
     * The request builder for this collection of AgreementAcceptance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementAcceptanceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AgreementAcceptanceCollectionResponse.class, IAgreementAcceptanceCollectionPage.class);
    }

    public void get(final ICallback<? super IAgreementAcceptanceCollectionPage> callback) {
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

    public IAgreementAcceptanceCollectionPage get() throws ClientException {
        final AgreementAcceptanceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AgreementAcceptance newAgreementAcceptance, final ICallback<? super AgreementAcceptance> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AgreementAcceptanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAgreementAcceptance, callback);
    }

    public AgreementAcceptance post(final AgreementAcceptance newAgreementAcceptance) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AgreementAcceptanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAgreementAcceptance);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAgreementAcceptanceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AgreementAcceptanceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAgreementAcceptanceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AgreementAcceptanceCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAgreementAcceptanceCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (AgreementAcceptanceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAgreementAcceptanceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AgreementAcceptanceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAgreementAcceptanceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AgreementAcceptanceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAgreementAcceptanceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AgreementAcceptanceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAgreementAcceptanceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAgreementAcceptanceCollectionRequest)this;
    }
    public IAgreementAcceptanceCollectionPage buildFromResponse(final AgreementAcceptanceCollectionResponse response) {
        final IAgreementAcceptanceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AgreementAcceptanceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AgreementAcceptanceCollectionPage page = new AgreementAcceptanceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
