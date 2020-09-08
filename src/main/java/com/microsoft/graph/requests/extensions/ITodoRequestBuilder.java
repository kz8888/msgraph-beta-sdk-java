// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Todo;
import com.microsoft.graph.requests.extensions.ITodoTaskListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITodoTaskListRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Todo Request Builder.
 */
public interface ITodoRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ITodoRequest instance
     */
    ITodoRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ITodoRequest instance
     */
    ITodoRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ITodoTaskListCollectionRequestBuilder lists();

    ITodoTaskListRequestBuilder lists(final String id);

}