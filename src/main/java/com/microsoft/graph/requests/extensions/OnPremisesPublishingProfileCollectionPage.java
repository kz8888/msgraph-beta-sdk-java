// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OnPremisesPublishingProfile;
import com.microsoft.graph.requests.extensions.IOnPremisesPublishingProfileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OnPremisesPublishingProfileCollectionPage;
import com.microsoft.graph.requests.extensions.OnPremisesPublishingProfileCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Publishing Profile Collection Page.
 */
public class OnPremisesPublishingProfileCollectionPage extends BaseCollectionPage<OnPremisesPublishingProfile, IOnPremisesPublishingProfileCollectionRequestBuilder> implements IOnPremisesPublishingProfileCollectionPage {

    /**
     * A collection page for OnPremisesPublishingProfile
     *
     * @param response the serialized OnPremisesPublishingProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OnPremisesPublishingProfileCollectionPage(final OnPremisesPublishingProfileCollectionResponse response, final IOnPremisesPublishingProfileCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
