// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Customer;
import com.microsoft.graph.requests.extensions.IPictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPictureRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PictureRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.CurrencyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.PaymentTermRequestBuilder;
import com.microsoft.graph.requests.extensions.IShipmentMethodRequestBuilder;
import com.microsoft.graph.requests.extensions.ShipmentMethodRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Customer Request Builder.
 */
public class CustomerRequestBuilder extends BaseRequestBuilder implements ICustomerRequestBuilder {

    /**
     * The request builder for the Customer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CustomerRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICustomerRequest instance
     */
    public ICustomerRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICustomerRequest instance
     */
    public ICustomerRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.CustomerRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Currency
     *
     * @return the ICurrencyRequestBuilder instance
     */
    public ICurrencyRequestBuilder currency() {
        return new CurrencyRequestBuilder(getRequestUrlWithAdditionalSegment("currency"), getClient(), null);
    }

    /**
     * Gets the request builder for PaymentMethod
     *
     * @return the IPaymentMethodRequestBuilder instance
     */
    public IPaymentMethodRequestBuilder paymentMethod() {
        return new PaymentMethodRequestBuilder(getRequestUrlWithAdditionalSegment("paymentMethod"), getClient(), null);
    }

    /**
     * Gets the request builder for PaymentTerm
     *
     * @return the IPaymentTermRequestBuilder instance
     */
    public IPaymentTermRequestBuilder paymentTerm() {
        return new PaymentTermRequestBuilder(getRequestUrlWithAdditionalSegment("paymentTerm"), getClient(), null);
    }
    public IPictureCollectionRequestBuilder picture() {
        return new PictureCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("picture"), getClient(), null);
    }

    public IPictureRequestBuilder picture(final String id) {
        return new PictureRequestBuilder(getRequestUrlWithAdditionalSegment("picture") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ShipmentMethod
     *
     * @return the IShipmentMethodRequestBuilder instance
     */
    public IShipmentMethodRequestBuilder shipmentMethod() {
        return new ShipmentMethodRequestBuilder(getRequestUrlWithAdditionalSegment("shipmentMethod"), getClient(), null);
    }
}
