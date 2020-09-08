// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Request;
import com.microsoft.graph.requests.extensions.IApprovalRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Request Request Builder.
 */
public interface IRequestRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IRequestRequest instance
     */
    IRequestRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IRequestRequest instance
     */
    IRequestRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for Approval
     *
     * @return the IApprovalRequestBuilder instance
     */
    IApprovalRequestBuilder approval();
    IRequestRecordDecisionsRequestBuilder recordDecisions(final String reviewResult, final String justification);
    IRequestStopRequestBuilder stop();

}