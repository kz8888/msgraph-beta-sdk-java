// Template Source: IBaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFindRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Find Request Builder.
 */
public interface IWorkbookFunctionsFindRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsFindRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFindRequest instance
     */
    IWorkbookFunctionsFindRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsFindRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFindRequest instance
     */
    IWorkbookFunctionsFindRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
