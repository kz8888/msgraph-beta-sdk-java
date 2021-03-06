// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Bitlocker;
import com.microsoft.graph.requests.extensions.IBitlockerRecoveryKeyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBitlockerRecoveryKeyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Bitlocker Request Builder.
 */
public interface IBitlockerRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IBitlockerRequest instance
     */
    IBitlockerRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IBitlockerRequest instance
     */
    IBitlockerRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IBitlockerRecoveryKeyCollectionRequestBuilder recoveryKeys();

    IBitlockerRecoveryKeyRequestBuilder recoveryKeys(final String id);

}