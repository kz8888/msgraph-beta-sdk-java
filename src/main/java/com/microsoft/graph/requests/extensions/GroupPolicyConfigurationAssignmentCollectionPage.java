// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyConfigurationAssignment;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Assignment Collection Page.
 */
public class GroupPolicyConfigurationAssignmentCollectionPage extends BaseCollectionPage<GroupPolicyConfigurationAssignment, IGroupPolicyConfigurationAssignmentCollectionRequestBuilder> implements IGroupPolicyConfigurationAssignmentCollectionPage {

    /**
     * A collection page for GroupPolicyConfigurationAssignment
     *
     * @param response the serialized GroupPolicyConfigurationAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyConfigurationAssignmentCollectionPage(final GroupPolicyConfigurationAssignmentCollectionResponse response, final IGroupPolicyConfigurationAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
