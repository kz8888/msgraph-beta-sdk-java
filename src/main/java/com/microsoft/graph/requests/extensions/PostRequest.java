// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Post;
import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.requests.extensions.IAttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AttachmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMentionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMentionRequestBuilder;
import com.microsoft.graph.requests.extensions.MentionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MentionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.extensions.IPostRequestBuilder;
import com.microsoft.graph.requests.extensions.PostRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Post Request.
 */
public class PostRequest extends BaseRequest implements IPostRequest {
	
    /**
     * The request for the Post
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PostRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Post.class);
    }

    /**
     * Gets the Post from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Post> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Post from the service
     *
     * @return the Post from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Post get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Post> callback) {
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
     * Patches this Post with a source
     *
     * @param sourcePost the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Post sourcePost, final ICallback<Post> callback) {
        send(HttpMethod.PATCH, callback, sourcePost);
    }

    /**
     * Patches this Post with a source
     *
     * @param sourcePost the source object with updates
     * @return the updated Post
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Post patch(final Post sourcePost) throws ClientException {
        return send(HttpMethod.PATCH, sourcePost);
    }

    /**
     * Creates a Post with a new object
     *
     * @param newPost the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Post newPost, final ICallback<Post> callback) {
        send(HttpMethod.POST, callback, newPost);
    }

    /**
     * Creates a Post with a new object
     *
     * @param newPost the new object to create
     * @return the created Post
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Post post(final Post newPost) throws ClientException {
        return send(HttpMethod.POST, newPost);
    }

    /**
     * Creates a Post with a new object
     *
     * @param newPost the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Post newPost, final ICallback<Post> callback) {
        send(HttpMethod.PUT, callback, newPost);
    }

    /**
     * Creates a Post with a new object
     *
     * @param newPost the object to create/update
     * @return the created Post
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Post put(final Post newPost) throws ClientException {
        return send(HttpMethod.PUT, newPost);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPostRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PostRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPostRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PostRequest)this;
     }

}

