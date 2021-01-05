// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Agreement;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementAcceptanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementFileLocalizationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementFileLocalizationRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgreementFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Agreement Request Builder.
 */
public interface IAgreementRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAgreementRequest instance
     */
    IAgreementRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAgreementRequest instance
     */
    IAgreementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IAgreementAcceptanceCollectionRequestBuilder acceptances();

    IAgreementAcceptanceRequestBuilder acceptances(final String id);

    /**
     * Gets the request builder for AgreementFile
     *
     * @return the IAgreementFileRequestBuilder instance
     */
    IAgreementFileRequestBuilder file();

    IAgreementFileLocalizationCollectionRequestBuilder files();

    IAgreementFileLocalizationRequestBuilder files(final String id);

}