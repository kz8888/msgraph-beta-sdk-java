// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITeamSendActivityNotificationRequest;
import com.microsoft.graph.requests.extensions.TeamSendActivityNotificationRequest;
import com.microsoft.graph.models.extensions.TeamworkActivityTopic;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.TeamworkNotificationRecipient;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Team Send Activity Notification Request Builder.
 */
public class TeamSendActivityNotificationRequestBuilder extends BaseActionRequestBuilder implements ITeamSendActivityNotificationRequestBuilder {

    /**
     * The request builder for this TeamSendActivityNotification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param topic the topic
     * @param activityType the activityType
     * @param chainId the chainId
     * @param previewText the previewText
     * @param templateParameters the templateParameters
     * @param recipient the recipient
     */
    public TeamSendActivityNotificationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final TeamworkActivityTopic topic, final String activityType, final Long chainId, final ItemBody previewText, final java.util.List<KeyValuePair> templateParameters, final TeamworkNotificationRecipient recipient) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("topic", topic);
        bodyParams.put("activityType", activityType);
        bodyParams.put("chainId", chainId);
        bodyParams.put("previewText", previewText);
        bodyParams.put("templateParameters", templateParameters);
        bodyParams.put("recipient", recipient);
    }

    /**
     * Creates the ITeamSendActivityNotificationRequest
     *
     * @return the ITeamSendActivityNotificationRequest instance
     */
    public ITeamSendActivityNotificationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the ITeamSendActivityNotificationRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITeamSendActivityNotificationRequest instance
     */
    public ITeamSendActivityNotificationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TeamSendActivityNotificationRequest request = new TeamSendActivityNotificationRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("topic")) {
            request.body.topic = getParameter("topic");
        }

        if (hasParameter("activityType")) {
            request.body.activityType = getParameter("activityType");
        }

        if (hasParameter("chainId")) {
            request.body.chainId = getParameter("chainId");
        }

        if (hasParameter("previewText")) {
            request.body.previewText = getParameter("previewText");
        }

        if (hasParameter("templateParameters")) {
            request.body.templateParameters = getParameter("templateParameters");
        }

        if (hasParameter("recipient")) {
            request.body.recipient = getParameter("recipient");
        }

        return request;
    }
}