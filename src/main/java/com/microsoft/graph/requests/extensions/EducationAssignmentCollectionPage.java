// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationAssignment;
import com.microsoft.graph.requests.extensions.IEducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.EducationAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.EducationAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Collection Page.
 */
public class EducationAssignmentCollectionPage extends BaseCollectionPage<EducationAssignment, IEducationAssignmentCollectionRequestBuilder> implements IEducationAssignmentCollectionPage {

    /**
     * A collection page for EducationAssignment
     *
     * @param response the serialized EducationAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationAssignmentCollectionPage(final EducationAssignmentCollectionResponse response, final IEducationAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
