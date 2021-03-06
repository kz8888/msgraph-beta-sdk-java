// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TermsAndConditionsGroupAssignment;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TermsAndConditionsGroupAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.TermsAndConditionsGroupAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Group Assignment Collection Page.
 */
public class TermsAndConditionsGroupAssignmentCollectionPage extends BaseCollectionPage<TermsAndConditionsGroupAssignment, ITermsAndConditionsGroupAssignmentCollectionRequestBuilder> implements ITermsAndConditionsGroupAssignmentCollectionPage {

    /**
     * A collection page for TermsAndConditionsGroupAssignment
     *
     * @param response the serialized TermsAndConditionsGroupAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TermsAndConditionsGroupAssignmentCollectionPage(final TermsAndConditionsGroupAssignmentCollectionResponse response, final ITermsAndConditionsGroupAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
