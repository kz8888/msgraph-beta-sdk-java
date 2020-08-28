// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Term;
import com.microsoft.graph.termstore.requests.extensions.ITermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ITermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Term Request Builder.
 */
public interface ITermRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ITermRequest instance
     */
    ITermRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ITermRequest instance
     */
    ITermRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ITermCollectionRequestBuilder children();

    ITermRequestBuilder children(final String id);

    IRelationCollectionRequestBuilder relations();

    IRelationRequestBuilder relations(final String id);

    /**
     * Gets the request builder for Set
     *
     * @return the ISetWithReferenceRequestBuilder instance
     */
    ISetWithReferenceRequestBuilder set();

}