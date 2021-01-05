// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IdentityUserFlowAttribute;
import com.microsoft.graph.requests.extensions.IIdentityUserFlowAttributeCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeCollectionPage;
import com.microsoft.graph.requests.extensions.IdentityUserFlowAttributeCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Collection Page.
 */
public class IdentityUserFlowAttributeCollectionPage extends BaseCollectionPage<IdentityUserFlowAttribute, IIdentityUserFlowAttributeCollectionRequestBuilder> implements IIdentityUserFlowAttributeCollectionPage {

    /**
     * A collection page for IdentityUserFlowAttribute
     *
     * @param response the serialized IdentityUserFlowAttributeCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IdentityUserFlowAttributeCollectionPage(final IdentityUserFlowAttributeCollectionResponse response, final IIdentityUserFlowAttributeCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
