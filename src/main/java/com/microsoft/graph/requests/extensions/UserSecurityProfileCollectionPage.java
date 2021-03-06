// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserSecurityProfile;
import com.microsoft.graph.requests.extensions.IUserSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.UserSecurityProfileCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Security Profile Collection Page.
 */
public class UserSecurityProfileCollectionPage extends BaseCollectionPage<UserSecurityProfile, IUserSecurityProfileCollectionRequestBuilder> implements IUserSecurityProfileCollectionPage {

    /**
     * A collection page for UserSecurityProfile
     *
     * @param response the serialized UserSecurityProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserSecurityProfileCollectionPage(final UserSecurityProfileCollectionResponse response, final IUserSecurityProfileCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
