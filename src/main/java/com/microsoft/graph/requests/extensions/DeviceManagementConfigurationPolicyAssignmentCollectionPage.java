// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignment;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyAssignmentCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Assignment Collection Page.
 */
public class DeviceManagementConfigurationPolicyAssignmentCollectionPage extends BaseCollectionPage<DeviceManagementConfigurationPolicyAssignment, DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementConfigurationPolicyAssignment
     *
     * @param response the serialized DeviceManagementConfigurationPolicyAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementConfigurationPolicyAssignmentCollectionPage(@Nonnull final DeviceManagementConfigurationPolicyAssignmentCollectionResponse response, @Nonnull final DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceManagementConfigurationPolicyAssignment
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementConfigurationPolicyAssignmentCollectionPage(@Nonnull final java.util.List<DeviceManagementConfigurationPolicyAssignment> pageContents, @Nullable final DeviceManagementConfigurationPolicyAssignmentCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
