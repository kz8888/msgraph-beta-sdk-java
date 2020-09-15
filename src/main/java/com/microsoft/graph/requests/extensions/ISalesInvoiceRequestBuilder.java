// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SalesInvoice;
import com.microsoft.graph.requests.extensions.ISalesInvoiceLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesInvoiceLineRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sales Invoice Request Builder.
 */
public interface ISalesInvoiceRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISalesInvoiceRequest instance
     */
    ISalesInvoiceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISalesInvoiceRequest instance
     */
    ISalesInvoiceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for Currency
     *
     * @return the ICurrencyRequestBuilder instance
     */
    ICurrencyRequestBuilder currency();

    /**
     * Gets the request builder for Customer
     *
     * @return the ICustomerRequestBuilder instance
     */
    ICustomerRequestBuilder customer();

    /**
     * Gets the request builder for PaymentTerm
     *
     * @return the IPaymentTermRequestBuilder instance
     */
    IPaymentTermRequestBuilder paymentTerm();

    ISalesInvoiceLineCollectionRequestBuilder salesInvoiceLines();

    ISalesInvoiceLineRequestBuilder salesInvoiceLines(final String id);

    /**
     * Gets the request builder for ShipmentMethod
     *
     * @return the IShipmentMethodRequestBuilder instance
     */
    IShipmentMethodRequestBuilder shipmentMethod();
    ISalesInvoiceCancelRequestBuilder cancel();
    ISalesInvoiceSendRequestBuilder send();
    ISalesInvoiceCancelAndSendRequestBuilder cancelAndSend();
    ISalesInvoicePostRequestBuilder post();
    ISalesInvoicePostAndSendRequestBuilder postAndSend();

}