// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivilegedApproval;
import com.microsoft.graph.requests.extensions.IPrivilegedApprovalCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedApprovalCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Approval Collection Page.
 */
public class PrivilegedApprovalCollectionPage extends BaseCollectionPage<PrivilegedApproval, IPrivilegedApprovalCollectionRequestBuilder> implements IPrivilegedApprovalCollectionPage {

    /**
     * A collection page for PrivilegedApproval
     *
     * @param response the serialized PrivilegedApprovalCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedApprovalCollectionPage(final PrivilegedApprovalCollectionResponse response, final IPrivilegedApprovalCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
