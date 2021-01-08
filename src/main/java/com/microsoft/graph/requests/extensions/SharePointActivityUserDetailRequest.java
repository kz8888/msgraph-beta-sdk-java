// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SharePointActivityUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Share Point Activity User Detail Request.
 */
public class SharePointActivityUserDetailRequest extends BaseRequest<SharePointActivityUserDetail> {
	
    /**
     * The request for the SharePointActivityUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharePointActivityUserDetailRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SharePointActivityUserDetail.class);
    }

    /**
     * Gets the SharePointActivityUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super SharePointActivityUserDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SharePointActivityUserDetail from the service
     *
     * @return the SharePointActivityUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SharePointActivityUserDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super SharePointActivityUserDetail> callback) {
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
     * Patches this SharePointActivityUserDetail with a source
     *
     * @param sourceSharePointActivityUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final SharePointActivityUserDetail sourceSharePointActivityUserDetail, @Nonnull final ICallback<? super SharePointActivityUserDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceSharePointActivityUserDetail);
    }

    /**
     * Patches this SharePointActivityUserDetail with a source
     *
     * @param sourceSharePointActivityUserDetail the source object with updates
     * @return the updated SharePointActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SharePointActivityUserDetail patch(@Nonnull final SharePointActivityUserDetail sourceSharePointActivityUserDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceSharePointActivityUserDetail);
    }

    /**
     * Creates a SharePointActivityUserDetail with a new object
     *
     * @param newSharePointActivityUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final SharePointActivityUserDetail newSharePointActivityUserDetail, @Nonnull final ICallback<? super SharePointActivityUserDetail> callback) {
        send(HttpMethod.POST, callback, newSharePointActivityUserDetail);
    }

    /**
     * Creates a SharePointActivityUserDetail with a new object
     *
     * @param newSharePointActivityUserDetail the new object to create
     * @return the created SharePointActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SharePointActivityUserDetail post(@Nonnull final SharePointActivityUserDetail newSharePointActivityUserDetail) throws ClientException {
        return send(HttpMethod.POST, newSharePointActivityUserDetail);
    }

    /**
     * Creates a SharePointActivityUserDetail with a new object
     *
     * @param newSharePointActivityUserDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final SharePointActivityUserDetail newSharePointActivityUserDetail, @Nonnull final ICallback<? super SharePointActivityUserDetail> callback) {
        send(HttpMethod.PUT, callback, newSharePointActivityUserDetail);
    }

    /**
     * Creates a SharePointActivityUserDetail with a new object
     *
     * @param newSharePointActivityUserDetail the object to create/update
     * @return the created SharePointActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public SharePointActivityUserDetail put(@Nonnull final SharePointActivityUserDetail newSharePointActivityUserDetail) throws ClientException {
        return send(HttpMethod.PUT, newSharePointActivityUserDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SharePointActivityUserDetailRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public SharePointActivityUserDetailRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

