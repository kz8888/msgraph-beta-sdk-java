// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AgreementFileLocalization;
import com.microsoft.graph.models.extensions.AgreementFileVersion;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAgreementFileVersionCollectionPage;
import com.microsoft.graph.requests.extensions.AgreementFileVersionCollectionResponse;
import com.microsoft.graph.requests.extensions.IAgreementFileVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementFileVersionCollectionRequest;
import com.microsoft.graph.requests.extensions.AgreementFileVersionCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File Version Collection Request.
 */
public class AgreementFileVersionCollectionRequest extends BaseCollectionRequest<AgreementFileVersionCollectionResponse, IAgreementFileVersionCollectionPage> implements IAgreementFileVersionCollectionRequest {

    /**
     * The request builder for this collection of AgreementFileVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementFileVersionCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AgreementFileVersionCollectionResponse.class, IAgreementFileVersionCollectionPage.class);
    }

    public void get(final ICallback<? super IAgreementFileVersionCollectionPage> callback) {
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

    public IAgreementFileVersionCollectionPage get() throws ClientException {
        final AgreementFileVersionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AgreementFileVersion newAgreementFileVersion, final ICallback<? super AgreementFileVersion> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AgreementFileVersionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAgreementFileVersion, callback);
    }

    public AgreementFileVersion post(final AgreementFileVersion newAgreementFileVersion) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AgreementFileVersionRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAgreementFileVersion);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAgreementFileVersionCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AgreementFileVersionCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAgreementFileVersionCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AgreementFileVersionCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAgreementFileVersionCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (AgreementFileVersionCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAgreementFileVersionCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AgreementFileVersionCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAgreementFileVersionCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AgreementFileVersionCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAgreementFileVersionCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AgreementFileVersionCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAgreementFileVersionCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAgreementFileVersionCollectionRequest)this;
    }
    public IAgreementFileVersionCollectionPage buildFromResponse(final AgreementFileVersionCollectionResponse response) {
        final IAgreementFileVersionCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AgreementFileVersionCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AgreementFileVersionCollectionPage page = new AgreementFileVersionCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
