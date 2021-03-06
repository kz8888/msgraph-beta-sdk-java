// Template Source: IBaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReviewSet;
import com.microsoft.graph.models.generated.ExportOptions;
import com.microsoft.graph.models.generated.ExportFileStructure;
import java.util.EnumSet;
import com.microsoft.graph.requests.extensions.IReviewSetQueryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetQueryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ReviewSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Review Set Reference Request Builder.
 */
public interface IReviewSetReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IReviewSetReferenceRequest instance
     */
    IReviewSetReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IReviewSetReferenceRequest instance
     */
    IReviewSetReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
