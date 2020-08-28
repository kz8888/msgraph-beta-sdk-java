// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsHyperlinkRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Hyperlink Request Builder.
 */
public interface IWorkbookFunctionsHyperlinkRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest
     *
     * @return the IWorkbookFunctionsHyperlinkRequest instance
     */
    IWorkbookFunctionsHyperlinkRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsHyperlinkRequest instance
     */
    IWorkbookFunctionsHyperlinkRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}