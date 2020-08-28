// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFvscheduleRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Fvschedule Request Builder.
 */
public interface IWorkbookFunctionsFvscheduleRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsFvscheduleRequest
     *
     * @return the IWorkbookFunctionsFvscheduleRequest instance
     */
    IWorkbookFunctionsFvscheduleRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsFvscheduleRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFvscheduleRequest instance
     */
    IWorkbookFunctionsFvscheduleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}