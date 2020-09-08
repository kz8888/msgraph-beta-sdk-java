// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Print;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrintCertificateSigningRequest;
import com.microsoft.graph.models.extensions.PrinterCapabilities;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPrinterCollectionPage;
import com.microsoft.graph.requests.extensions.PrinterCollectionResponse;
import com.microsoft.graph.requests.extensions.IPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterCollectionRequest;
import com.microsoft.graph.requests.extensions.PrinterCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Collection Request.
 */
public class PrinterCollectionRequest extends BaseCollectionRequest<PrinterCollectionResponse, IPrinterCollectionPage> implements IPrinterCollectionRequest {

    /**
     * The request builder for this collection of Printer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrinterCollectionResponse.class, IPrinterCollectionPage.class);
    }

    public void get(final ICallback<IPrinterCollectionPage> callback) {
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

    public IPrinterCollectionPage get() throws ClientException {
        final PrinterCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Printer newPrinter, final ICallback<Printer> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PrinterRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrinter, callback);
    }

    public Printer post(final Printer newPrinter) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PrinterRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPrinter);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrinterCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrinterCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrinterCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrinterCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPrinterCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PrinterCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPrinterCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PrinterCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPrinterCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPrinterCollectionRequest)this;
    }
    public IPrinterCollectionPage buildFromResponse(final PrinterCollectionResponse response) {
        final IPrinterCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PrinterCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PrinterCollectionPage page = new PrinterCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
