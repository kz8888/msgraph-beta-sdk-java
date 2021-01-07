// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PaymentMethod;
import com.microsoft.graph.requests.extensions.PaymentMethodCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.PaymentMethodCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Payment Method Collection Page.
 */
public class PaymentMethodCollectionPage extends BaseCollectionPage<PaymentMethod, PaymentMethodCollectionRequestBuilder> {

    /**
     * A collection page for PaymentMethod
     *
     * @param response the serialized PaymentMethodCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PaymentMethodCollectionPage(@Nonnull final PaymentMethodCollectionResponse response, @Nonnull final PaymentMethodCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PaymentMethod
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PaymentMethodCollectionPage(@Nonnull final java.util.List<PaymentMethod> pageContents, @Nullable final PaymentMethodCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
