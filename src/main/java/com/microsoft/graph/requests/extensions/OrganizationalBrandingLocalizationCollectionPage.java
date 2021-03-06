// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OrganizationalBrandingLocalization;
import com.microsoft.graph.requests.extensions.IOrganizationalBrandingLocalizationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingLocalizationCollectionPage;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingLocalizationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organizational Branding Localization Collection Page.
 */
public class OrganizationalBrandingLocalizationCollectionPage extends BaseCollectionPage<OrganizationalBrandingLocalization, IOrganizationalBrandingLocalizationCollectionRequestBuilder> implements IOrganizationalBrandingLocalizationCollectionPage {

    /**
     * A collection page for OrganizationalBrandingLocalization
     *
     * @param response the serialized OrganizationalBrandingLocalizationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OrganizationalBrandingLocalizationCollectionPage(final OrganizationalBrandingLocalizationCollectionResponse response, final IOrganizationalBrandingLocalizationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
