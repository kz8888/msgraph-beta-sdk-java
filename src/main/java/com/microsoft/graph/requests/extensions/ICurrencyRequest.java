// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Currency;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Currency Request.
 */
public interface ICurrencyRequest extends IHttpRequest {

    /**
     * Gets the Currency from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Currency> callback);

    /**
     * Gets the Currency from the service
     *
     * @return the Currency from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Currency get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Currency> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Currency with a source
     *
     * @param sourceCurrency the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Currency sourceCurrency, final ICallback<Currency> callback);

    /**
     * Patches this Currency with a source
     *
     * @param sourceCurrency the source object with updates
     * @return the updated Currency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Currency patch(final Currency sourceCurrency) throws ClientException;

    /**
     * Posts a Currency with a new object
     *
     * @param newCurrency the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Currency newCurrency, final ICallback<Currency> callback);

    /**
     * Posts a Currency with a new object
     *
     * @param newCurrency the new object to create
     * @return the created Currency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Currency post(final Currency newCurrency) throws ClientException;

    /**
     * Posts a Currency with a new object
     *
     * @param newCurrency the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Currency newCurrency, final ICallback<Currency> callback);

    /**
     * Posts a Currency with a new object
     *
     * @param newCurrency the object to create/update
     * @return the created Currency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Currency put(final Currency newCurrency) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICurrencyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICurrencyRequest expand(final String value);

}

