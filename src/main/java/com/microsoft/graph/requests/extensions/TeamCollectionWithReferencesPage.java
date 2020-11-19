// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Team;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TeamworkActivityTopic;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.TeamworkNotificationRecipient;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITeamCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.TeamCollectionResponse;
import com.microsoft.graph.models.extensions.Team;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Collection With References Page.
 */
public class TeamCollectionWithReferencesPage extends BaseCollectionPage<Team, ITeamCollectionWithReferencesRequestBuilder> implements ITeamCollectionWithReferencesPage {

    /**
     * A collection page for Team
     *
     * @param response the serialized TeamCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TeamCollectionWithReferencesPage(final TeamCollectionResponse response, final ITeamCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
