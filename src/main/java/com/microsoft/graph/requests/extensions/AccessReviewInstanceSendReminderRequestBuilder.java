// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceSendReminderRequest;
import com.microsoft.graph.models.extensions.AccessReviewInstance;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Send Reminder Request Builder.
 */
public class AccessReviewInstanceSendReminderRequestBuilder extends BaseActionRequestBuilder<AccessReviewInstance> {

    /**
     * The request builder for this AccessReviewInstanceSendReminder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceSendReminderRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the AccessReviewInstanceSendReminderRequest
     *
     * @param requestOptions the options for the request
     * @return the AccessReviewInstanceSendReminderRequest instance
     */
    @Nonnull
    public AccessReviewInstanceSendReminderRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the AccessReviewInstanceSendReminderRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the AccessReviewInstanceSendReminderRequest instance
     */
    @Nonnull
    public AccessReviewInstanceSendReminderRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AccessReviewInstanceSendReminderRequest request = new AccessReviewInstanceSendReminderRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
