// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MicrosoftTunnelServer;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelServerCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelServerCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelServerCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Collection Page.
 */
public class MicrosoftTunnelServerCollectionPage extends BaseCollectionPage<MicrosoftTunnelServer, IMicrosoftTunnelServerCollectionRequestBuilder> implements IMicrosoftTunnelServerCollectionPage {

    /**
     * A collection page for MicrosoftTunnelServer
     *
     * @param response the serialized MicrosoftTunnelServerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MicrosoftTunnelServerCollectionPage(final MicrosoftTunnelServerCollectionResponse response, final IMicrosoftTunnelServerCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
