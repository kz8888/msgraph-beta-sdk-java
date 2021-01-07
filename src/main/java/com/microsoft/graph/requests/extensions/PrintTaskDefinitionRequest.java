// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintTaskDefinition;
import com.microsoft.graph.requests.extensions.PrintTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Definition Request.
 */
public class PrintTaskDefinitionRequest extends BaseRequest<PrintTaskDefinition> {
	
    /**
     * The request for the PrintTaskDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintTaskDefinitionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintTaskDefinition.class);
    }

    /**
     * Gets the PrintTaskDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super PrintTaskDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrintTaskDefinition from the service
     *
     * @return the PrintTaskDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintTaskDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super PrintTaskDefinition> callback) {
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
     * Patches this PrintTaskDefinition with a source
     *
     * @param sourcePrintTaskDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final PrintTaskDefinition sourcePrintTaskDefinition, @Nonnull final ICallback<? super PrintTaskDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourcePrintTaskDefinition);
    }

    /**
     * Patches this PrintTaskDefinition with a source
     *
     * @param sourcePrintTaskDefinition the source object with updates
     * @return the updated PrintTaskDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintTaskDefinition patch(@Nonnull final PrintTaskDefinition sourcePrintTaskDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrintTaskDefinition);
    }

    /**
     * Creates a PrintTaskDefinition with a new object
     *
     * @param newPrintTaskDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final PrintTaskDefinition newPrintTaskDefinition, @Nonnull final ICallback<? super PrintTaskDefinition> callback) {
        send(HttpMethod.POST, callback, newPrintTaskDefinition);
    }

    /**
     * Creates a PrintTaskDefinition with a new object
     *
     * @param newPrintTaskDefinition the new object to create
     * @return the created PrintTaskDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintTaskDefinition post(@Nonnull final PrintTaskDefinition newPrintTaskDefinition) throws ClientException {
        return send(HttpMethod.POST, newPrintTaskDefinition);
    }

    /**
     * Creates a PrintTaskDefinition with a new object
     *
     * @param newPrintTaskDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final PrintTaskDefinition newPrintTaskDefinition, @Nonnull final ICallback<? super PrintTaskDefinition> callback) {
        send(HttpMethod.PUT, callback, newPrintTaskDefinition);
    }

    /**
     * Creates a PrintTaskDefinition with a new object
     *
     * @param newPrintTaskDefinition the object to create/update
     * @return the created PrintTaskDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintTaskDefinition put(@Nonnull final PrintTaskDefinition newPrintTaskDefinition) throws ClientException {
        return send(HttpMethod.PUT, newPrintTaskDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrintTaskDefinitionRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public PrintTaskDefinitionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

