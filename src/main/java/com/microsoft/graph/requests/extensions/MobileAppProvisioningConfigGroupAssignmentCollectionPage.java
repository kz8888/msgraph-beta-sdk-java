// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppProvisioningConfigGroupAssignment;
import com.microsoft.graph.requests.extensions.MobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.MobileAppProvisioningConfigGroupAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Provisioning Config Group Assignment Collection Page.
 */
public class MobileAppProvisioningConfigGroupAssignmentCollectionPage extends BaseCollectionPage<MobileAppProvisioningConfigGroupAssignment, MobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for MobileAppProvisioningConfigGroupAssignment
     *
     * @param response the serialized MobileAppProvisioningConfigGroupAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppProvisioningConfigGroupAssignmentCollectionPage(@Nonnull final MobileAppProvisioningConfigGroupAssignmentCollectionResponse response, @Nonnull final MobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MobileAppProvisioningConfigGroupAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MobileAppProvisioningConfigGroupAssignmentCollectionPage(@Nonnull final java.util.List<MobileAppProvisioningConfigGroupAssignment> pageContents, @Nullable final MobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
