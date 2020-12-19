// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GovernancePolicyTemplate;
import com.microsoft.graph.requests.extensions.IGovernancePolicyTemplateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.GovernancePolicyTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.GovernancePolicyTemplateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Policy Template Collection Page.
 */
public class GovernancePolicyTemplateCollectionPage extends BaseCollectionPage<GovernancePolicyTemplate, IGovernancePolicyTemplateCollectionRequestBuilder> implements IGovernancePolicyTemplateCollectionPage {

    /**
     * A collection page for GovernancePolicyTemplate
     *
     * @param response the serialized GovernancePolicyTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GovernancePolicyTemplateCollectionPage(final GovernancePolicyTemplateCollectionResponse response, final IGovernancePolicyTemplateCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
