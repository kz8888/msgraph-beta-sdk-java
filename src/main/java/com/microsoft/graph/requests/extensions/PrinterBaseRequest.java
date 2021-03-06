// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrinterBase;
import com.microsoft.graph.requests.extensions.IPrintJobCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintJobRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintJobCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintJobRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Base Request.
 */
public class PrinterBaseRequest extends BaseRequest implements IPrinterBaseRequest {
	
    /**
     * The request for the PrinterBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public PrinterBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends PrinterBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the PrinterBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrinterBase.class);
    }

    /**
     * Gets the PrinterBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PrinterBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrinterBase from the service
     *
     * @return the PrinterBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrinterBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PrinterBase> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PrinterBase with a source
     *
     * @param sourcePrinterBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrinterBase sourcePrinterBase, final ICallback<? super PrinterBase> callback) {
        send(HttpMethod.PATCH, callback, sourcePrinterBase);
    }

    /**
     * Patches this PrinterBase with a source
     *
     * @param sourcePrinterBase the source object with updates
     * @return the updated PrinterBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrinterBase patch(final PrinterBase sourcePrinterBase) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrinterBase);
    }

    /**
     * Creates a PrinterBase with a new object
     *
     * @param newPrinterBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrinterBase newPrinterBase, final ICallback<? super PrinterBase> callback) {
        send(HttpMethod.POST, callback, newPrinterBase);
    }

    /**
     * Creates a PrinterBase with a new object
     *
     * @param newPrinterBase the new object to create
     * @return the created PrinterBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrinterBase post(final PrinterBase newPrinterBase) throws ClientException {
        return send(HttpMethod.POST, newPrinterBase);
    }

    /**
     * Creates a PrinterBase with a new object
     *
     * @param newPrinterBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrinterBase newPrinterBase, final ICallback<? super PrinterBase> callback) {
        send(HttpMethod.PUT, callback, newPrinterBase);
    }

    /**
     * Creates a PrinterBase with a new object
     *
     * @param newPrinterBase the object to create/update
     * @return the created PrinterBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrinterBase put(final PrinterBase newPrinterBase) throws ClientException {
        return send(HttpMethod.PUT, newPrinterBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrinterBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrinterBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrinterBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrinterBaseRequest)this;
     }

}

