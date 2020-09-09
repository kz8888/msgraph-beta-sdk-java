// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.PersonAnniversary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPersonAnniversaryCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAnniversaryCollectionResponse;
import com.microsoft.graph.requests.extensions.IPersonAnniversaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonAnniversaryCollectionRequest;
import com.microsoft.graph.requests.extensions.PersonAnniversaryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Anniversary Collection Request.
 */
public class PersonAnniversaryCollectionRequest extends BaseCollectionRequest<PersonAnniversaryCollectionResponse, IPersonAnniversaryCollectionPage> implements IPersonAnniversaryCollectionRequest {

    /**
     * The request builder for this collection of PersonAnniversary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonAnniversaryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonAnniversaryCollectionResponse.class, IPersonAnniversaryCollectionPage.class);
    }

    public void get(final ICallback<IPersonAnniversaryCollectionPage> callback) {
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

    public IPersonAnniversaryCollectionPage get() throws ClientException {
        final PersonAnniversaryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PersonAnniversary newPersonAnniversary, final ICallback<PersonAnniversary> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PersonAnniversaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPersonAnniversary, callback);
    }

    public PersonAnniversary post(final PersonAnniversary newPersonAnniversary) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PersonAnniversaryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPersonAnniversary);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPersonAnniversaryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PersonAnniversaryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPersonAnniversaryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PersonAnniversaryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPersonAnniversaryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PersonAnniversaryCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPersonAnniversaryCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PersonAnniversaryCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPersonAnniversaryCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPersonAnniversaryCollectionRequest)this;
    }
    public IPersonAnniversaryCollectionPage buildFromResponse(final PersonAnniversaryCollectionResponse response) {
        final IPersonAnniversaryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PersonAnniversaryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PersonAnniversaryCollectionPage page = new PersonAnniversaryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
