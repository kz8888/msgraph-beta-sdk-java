// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ProfileCardProperty;
import com.microsoft.graph.requests.extensions.IProfileCardPropertyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ProfileCardPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.ProfileCardPropertyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Profile Card Property Collection Page.
 */
public class ProfileCardPropertyCollectionPage extends BaseCollectionPage<ProfileCardProperty, IProfileCardPropertyCollectionRequestBuilder> implements IProfileCardPropertyCollectionPage {

    /**
     * A collection page for ProfileCardProperty
     *
     * @param response the serialized ProfileCardPropertyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ProfileCardPropertyCollectionPage(final ProfileCardPropertyCollectionResponse response, final IProfileCardPropertyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
