// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicySettingMapping;
import com.microsoft.graph.requests.extensions.IGroupPolicySettingMappingCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicySettingMappingCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicySettingMappingCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Setting Mapping Collection Page.
 */
public class GroupPolicySettingMappingCollectionPage extends BaseCollectionPage<GroupPolicySettingMapping, IGroupPolicySettingMappingCollectionRequestBuilder> implements IGroupPolicySettingMappingCollectionPage {

    /**
     * A collection page for GroupPolicySettingMapping
     *
     * @param response the serialized GroupPolicySettingMappingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicySettingMappingCollectionPage(final GroupPolicySettingMappingCollectionResponse response, final IGroupPolicySettingMappingCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
