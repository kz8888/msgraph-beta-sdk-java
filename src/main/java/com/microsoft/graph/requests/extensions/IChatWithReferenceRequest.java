// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.models.extensions.TeamworkActivityTopic;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.KeyValuePair;
import com.microsoft.graph.models.extensions.TeamworkNotificationRecipient;
import com.microsoft.graph.models.extensions.ChatMessage;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppInstallationRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IChatMessageRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.Chat;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Chat With Reference Request.
 */
public interface IChatWithReferenceRequest extends IHttpRequest {

    void post(final Chat newChat, final IJsonBackedObject payload, final ICallback<Chat> callback);

    Chat post(final Chat newChat, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<Chat> callback);

    Chat get() throws ClientException;

	void delete(final ICallback<Chat> callback);

	void delete() throws ClientException;

	void patch(final Chat sourceChat, final ICallback<Chat> callback);

	Chat patch(final Chat sourceChat) throws ClientException;

    IChatWithReferenceRequest select(final String value);

    IChatWithReferenceRequest expand(final String value);

}
