// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ProjectParticipation;
import com.microsoft.graph.requests.extensions.IProjectParticipationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ProjectParticipationCollectionPage;
import com.microsoft.graph.requests.extensions.ProjectParticipationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Project Participation Collection Page.
 */
public class ProjectParticipationCollectionPage extends BaseCollectionPage<ProjectParticipation, IProjectParticipationCollectionRequestBuilder> implements IProjectParticipationCollectionPage {

    /**
     * A collection page for ProjectParticipation
     *
     * @param response the serialized ProjectParticipationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ProjectParticipationCollectionPage(final ProjectParticipationCollectionResponse response, final IProjectParticipationCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
