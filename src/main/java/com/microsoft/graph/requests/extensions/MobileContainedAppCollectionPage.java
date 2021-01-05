// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileContainedApp;
import com.microsoft.graph.requests.extensions.IMobileContainedAppCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MobileContainedAppCollectionPage;
import com.microsoft.graph.requests.extensions.MobileContainedAppCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile Contained App Collection Page.
 */
public class MobileContainedAppCollectionPage extends BaseCollectionPage<MobileContainedApp, IMobileContainedAppCollectionRequestBuilder> implements IMobileContainedAppCollectionPage {

    /**
     * A collection page for MobileContainedApp
     *
     * @param response the serialized MobileContainedAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileContainedAppCollectionPage(final MobileContainedAppCollectionResponse response, final IMobileContainedAppCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
