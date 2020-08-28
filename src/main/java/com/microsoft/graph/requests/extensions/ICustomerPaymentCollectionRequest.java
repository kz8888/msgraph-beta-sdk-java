// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CustomerPaymentJournal;
import com.microsoft.graph.models.extensions.CustomerPayment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Customer Payment Collection Request.
 */
public interface ICustomerPaymentCollectionRequest {

    void get(final ICallback<ICustomerPaymentCollectionPage> callback);

    ICustomerPaymentCollectionPage get() throws ClientException;

    void post(final CustomerPayment newCustomerPayment, final ICallback<CustomerPayment> callback);

    CustomerPayment post(final CustomerPayment newCustomerPayment) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICustomerPaymentCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICustomerPaymentCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ICustomerPaymentCollectionRequest top(final int value);

}