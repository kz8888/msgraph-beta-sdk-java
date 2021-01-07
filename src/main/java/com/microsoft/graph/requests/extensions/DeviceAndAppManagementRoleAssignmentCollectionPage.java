// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementRoleAssignment;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Role Assignment Collection Page.
 */
public class DeviceAndAppManagementRoleAssignmentCollectionPage extends BaseCollectionPage<DeviceAndAppManagementRoleAssignment, DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for DeviceAndAppManagementRoleAssignment
     *
     * @param response the serialized DeviceAndAppManagementRoleAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceAndAppManagementRoleAssignmentCollectionPage(@Nonnull final DeviceAndAppManagementRoleAssignmentCollectionResponse response, @Nonnull final DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceAndAppManagementRoleAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceAndAppManagementRoleAssignmentCollectionPage(@Nonnull final java.util.List<DeviceAndAppManagementRoleAssignment> pageContents, @Nullable final DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
