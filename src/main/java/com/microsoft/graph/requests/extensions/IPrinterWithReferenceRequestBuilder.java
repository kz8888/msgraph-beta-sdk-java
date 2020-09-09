// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrintCertificateSigningRequest;
import com.microsoft.graph.models.extensions.PrinterCapabilities;
import com.microsoft.graph.requests.extensions.IPrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Printer With Reference Request Builder.
 */
public interface IPrinterWithReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @return the IPrinterWithReferenceRequest instance
     */
    IPrinterWithReferenceRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IPrinterWithReferenceRequest instance
     */
    IPrinterWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IPrinterReferenceRequestBuilder reference();

}
