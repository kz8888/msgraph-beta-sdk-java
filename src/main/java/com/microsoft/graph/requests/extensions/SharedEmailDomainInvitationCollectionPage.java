// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SharedEmailDomainInvitation;
import com.microsoft.graph.requests.extensions.ISharedEmailDomainInvitationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SharedEmailDomainInvitationCollectionPage;
import com.microsoft.graph.requests.extensions.SharedEmailDomainInvitationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared Email Domain Invitation Collection Page.
 */
public class SharedEmailDomainInvitationCollectionPage extends BaseCollectionPage<SharedEmailDomainInvitation, ISharedEmailDomainInvitationCollectionRequestBuilder> implements ISharedEmailDomainInvitationCollectionPage {

    /**
     * A collection page for SharedEmailDomainInvitation
     *
     * @param response the serialized SharedEmailDomainInvitationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SharedEmailDomainInvitationCollectionPage(final SharedEmailDomainInvitationCollectionResponse response, final ISharedEmailDomainInvitationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
