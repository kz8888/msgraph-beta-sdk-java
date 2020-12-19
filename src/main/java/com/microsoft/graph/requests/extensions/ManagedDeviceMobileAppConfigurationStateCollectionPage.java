// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationState;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationStateCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedDeviceMobileAppConfigurationStateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration State Collection Page.
 */
public class ManagedDeviceMobileAppConfigurationStateCollectionPage extends BaseCollectionPage<ManagedDeviceMobileAppConfigurationState, IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder> implements IManagedDeviceMobileAppConfigurationStateCollectionPage {

    /**
     * A collection page for ManagedDeviceMobileAppConfigurationState
     *
     * @param response the serialized ManagedDeviceMobileAppConfigurationStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedDeviceMobileAppConfigurationStateCollectionPage(final ManagedDeviceMobileAppConfigurationStateCollectionResponse response, final IManagedDeviceMobileAppConfigurationStateCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
