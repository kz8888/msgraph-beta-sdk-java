// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.CartToClassAssociation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationCollectionPage;
import com.microsoft.graph.requests.extensions.CartToClassAssociationCollectionResponse;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationCollectionRequest;
import com.microsoft.graph.requests.extensions.CartToClassAssociationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cart To Class Association Collection Request.
 */
public class CartToClassAssociationCollectionRequest extends BaseCollectionRequest<CartToClassAssociationCollectionResponse, ICartToClassAssociationCollectionPage> implements ICartToClassAssociationCollectionRequest {

    /**
     * The request builder for this collection of CartToClassAssociation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CartToClassAssociationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CartToClassAssociationCollectionResponse.class, ICartToClassAssociationCollectionPage.class);
    }

    public void get(final ICallback<? super ICartToClassAssociationCollectionPage> callback) {
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

    public ICartToClassAssociationCollectionPage get() throws ClientException {
        final CartToClassAssociationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final CartToClassAssociation newCartToClassAssociation, final ICallback<? super CartToClassAssociation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CartToClassAssociationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCartToClassAssociation, callback);
    }

    public CartToClassAssociation post(final CartToClassAssociation newCartToClassAssociation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CartToClassAssociationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCartToClassAssociation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICartToClassAssociationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CartToClassAssociationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ICartToClassAssociationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (CartToClassAssociationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ICartToClassAssociationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (CartToClassAssociationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICartToClassAssociationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CartToClassAssociationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICartToClassAssociationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (CartToClassAssociationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ICartToClassAssociationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (CartToClassAssociationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ICartToClassAssociationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ICartToClassAssociationCollectionRequest)this;
    }
    public ICartToClassAssociationCollectionPage buildFromResponse(final CartToClassAssociationCollectionResponse response) {
        final ICartToClassAssociationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CartToClassAssociationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CartToClassAssociationCollectionPage page = new CartToClassAssociationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
