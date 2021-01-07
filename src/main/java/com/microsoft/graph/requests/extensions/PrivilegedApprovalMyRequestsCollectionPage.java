// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedApproval;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalMyRequestsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalMyRequestsCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalMyRequestsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Approval My Requests Collection Page.
 */
public class PrivilegedApprovalMyRequestsCollectionPage extends BaseCollectionPage<PrivilegedApproval, PrivilegedApprovalMyRequestsCollectionRequestBuilder> {

    /**
     * A collection page for PrivilegedApproval.
     *
     * @param response The serialized PrivilegedApprovalMyRequestsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public PrivilegedApprovalMyRequestsCollectionPage(@Nonnull final PrivilegedApprovalMyRequestsCollectionResponse response, @Nonnull final PrivilegedApprovalMyRequestsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for PrivilegedApprovalMyRequests
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrivilegedApprovalMyRequestsCollectionPage(@Nonnull final java.util.List<PrivilegedApproval> pageContents, @Nullable final PrivilegedApprovalMyRequestsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
