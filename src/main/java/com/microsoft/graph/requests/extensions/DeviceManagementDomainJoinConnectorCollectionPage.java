// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementDomainJoinConnector;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Domain Join Connector Collection Page.
 */
public class DeviceManagementDomainJoinConnectorCollectionPage extends BaseCollectionPage<DeviceManagementDomainJoinConnector, DeviceManagementDomainJoinConnectorCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementDomainJoinConnector
     *
     * @param response the serialized DeviceManagementDomainJoinConnectorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementDomainJoinConnectorCollectionPage(@Nonnull final DeviceManagementDomainJoinConnectorCollectionResponse response, @Nonnull final DeviceManagementDomainJoinConnectorCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceManagementDomainJoinConnector
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementDomainJoinConnectorCollectionPage(@Nonnull final java.util.List<DeviceManagementDomainJoinConnector> pageContents, @Nullable final DeviceManagementDomainJoinConnectorCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
