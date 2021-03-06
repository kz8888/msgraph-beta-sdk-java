// Template Source: IBaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExactMatchDataStore;
import com.microsoft.graph.requests.extensions.IExactMatchSessionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchSessionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Exact Match Data Store Request Builder.
 */
public interface IExactMatchDataStoreRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IExactMatchDataStoreRequest instance
     */
    IExactMatchDataStoreRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IExactMatchDataStoreRequest instance
     */
    IExactMatchDataStoreRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IExactMatchSessionCollectionRequestBuilder sessions();

    IExactMatchSessionRequestBuilder sessions(final String id);

    IExactMatchDataStoreLookupCollectionRequestBuilder lookup(final String key, final java.util.List<String> values, final java.util.List<String> resultColumnNames);

}