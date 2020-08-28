// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatActivityStatistics;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Activity Statistics Request.
 */
public class ChatActivityStatisticsRequest extends BaseRequest implements IChatActivityStatisticsRequest {
	
    /**
     * The request for the ChatActivityStatistics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatActivityStatisticsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChatActivityStatistics.class);
    }

    /**
     * Gets the ChatActivityStatistics from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ChatActivityStatistics> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ChatActivityStatistics from the service
     *
     * @return the ChatActivityStatistics from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatActivityStatistics get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ChatActivityStatistics> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ChatActivityStatistics with a source
     *
     * @param sourceChatActivityStatistics the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ChatActivityStatistics sourceChatActivityStatistics, final ICallback<ChatActivityStatistics> callback) {
        send(HttpMethod.PATCH, callback, sourceChatActivityStatistics);
    }

    /**
     * Patches this ChatActivityStatistics with a source
     *
     * @param sourceChatActivityStatistics the source object with updates
     * @return the updated ChatActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatActivityStatistics patch(final ChatActivityStatistics sourceChatActivityStatistics) throws ClientException {
        return send(HttpMethod.PATCH, sourceChatActivityStatistics);
    }

    /**
     * Creates a ChatActivityStatistics with a new object
     *
     * @param newChatActivityStatistics the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ChatActivityStatistics newChatActivityStatistics, final ICallback<ChatActivityStatistics> callback) {
        send(HttpMethod.POST, callback, newChatActivityStatistics);
    }

    /**
     * Creates a ChatActivityStatistics with a new object
     *
     * @param newChatActivityStatistics the new object to create
     * @return the created ChatActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ChatActivityStatistics post(final ChatActivityStatistics newChatActivityStatistics) throws ClientException {
        return send(HttpMethod.POST, newChatActivityStatistics);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IChatActivityStatisticsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ChatActivityStatisticsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IChatActivityStatisticsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ChatActivityStatisticsRequest)this;
     }

}
