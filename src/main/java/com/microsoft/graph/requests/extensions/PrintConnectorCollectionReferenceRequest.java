// Template Source: BaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrintConnector;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.PrintConnectorWithReferenceRequest;
import com.microsoft.graph.requests.extensions.PrintConnectorReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionWithReferencesRequest;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.models.extensions.PrintConnector;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequest;
import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.http.ReferenceRequestBody;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Connector Collection Reference Request.
 */
public class PrintConnectorCollectionReferenceRequest extends BaseCollectionWithReferencesRequest<PrintConnector, PrintConnectorWithReferenceRequest, PrintConnectorReferenceRequestBuilder, PrintConnectorWithReferenceRequestBuilder, PrintConnectorCollectionResponse, PrintConnectorCollectionWithReferencesPage, PrintConnectorCollectionWithReferencesRequest> {

    /**
     * The request builder for this collection of PrintConnector
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintConnectorCollectionReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintConnectorCollectionResponse.class, PrintConnectorCollectionWithReferencesPage.class, PrintConnectorCollectionWithReferencesRequestBuilder.class);
    }

    /**
     * Creates a new PrintConnector
     * @param newPrintConnector the PrintConnector to create
     * @param callback the callback to invoke once the object has been created
     */
    public void post(@Nonnull final PrintConnector newPrintConnector, @Nonnull final ICallback<? super PrintConnector> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/print/connectors/" + newPrintConnector.id);
        new PrintConnectorWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrintConnector, body, callback);
    }

    /**
     * Creates a new PrintConnector
     * @param newPrintConnector the PrintConnector to create
     * @return the newly created object
     */
    @Nonnull
    public PrintConnector post(@Nonnull final PrintConnector newPrintConnector) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/print/connectors/" + newPrintConnector.id);
        return new PrintConnectorWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newPrintConnector, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public PrintConnectorCollectionReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public PrintConnectorCollectionReferenceRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    @Nonnull
    public PrintConnectorCollectionReferenceRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public PrintConnectorCollectionReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public PrintConnectorCollectionReferenceRequest top(final int value) {
        addTopOption(value);
        return this;
    }
    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public PrintConnectorCollectionReferenceRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public PrintConnectorCollectionReferenceRequest count() {
        addCountOption(true);
        return this;
    }
}
