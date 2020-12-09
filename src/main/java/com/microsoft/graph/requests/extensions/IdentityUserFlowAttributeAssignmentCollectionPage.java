// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Assignment Collection Page.
 */
public class IdentityUserFlowAttributeAssignmentCollectionPage extends BaseCollectionPage<IdentityUserFlowAttributeAssignment, IIdentityUserFlowAttributeAssignmentCollectionRequestBuilder> implements IIdentityUserFlowAttributeAssignmentCollectionPage {

    /**
     * A collection page for IdentityUserFlowAttributeAssignment
     *
     * @param response the serialized IdentityUserFlowAttributeAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IdentityUserFlowAttributeAssignmentCollectionPage(final IdentityUserFlowAttributeAssignmentCollectionResponse response, final IIdentityUserFlowAttributeAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}