// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppRelationship;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Relationship Request.
 */
public class MobileAppRelationshipRequest extends BaseRequest<MobileAppRelationship> {
	
    /**
     * The request for the MobileAppRelationship
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public MobileAppRelationshipRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends MobileAppRelationship> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the MobileAppRelationship
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppRelationshipRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppRelationship.class);
    }

    /**
     * Gets the MobileAppRelationship from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MobileAppRelationship> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppRelationship from the service
     *
     * @return the MobileAppRelationship from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppRelationship get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MobileAppRelationship> callback) {
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
     * Patches this MobileAppRelationship with a source
     *
     * @param sourceMobileAppRelationship the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MobileAppRelationship sourceMobileAppRelationship, @Nonnull final ICallback<? super MobileAppRelationship> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppRelationship);
    }

    /**
     * Patches this MobileAppRelationship with a source
     *
     * @param sourceMobileAppRelationship the source object with updates
     * @return the updated MobileAppRelationship
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppRelationship patch(@Nonnull final MobileAppRelationship sourceMobileAppRelationship) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppRelationship);
    }

    /**
     * Creates a MobileAppRelationship with a new object
     *
     * @param newMobileAppRelationship the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MobileAppRelationship newMobileAppRelationship, @Nonnull final ICallback<? super MobileAppRelationship> callback) {
        send(HttpMethod.POST, callback, newMobileAppRelationship);
    }

    /**
     * Creates a MobileAppRelationship with a new object
     *
     * @param newMobileAppRelationship the new object to create
     * @return the created MobileAppRelationship
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppRelationship post(@Nonnull final MobileAppRelationship newMobileAppRelationship) throws ClientException {
        return send(HttpMethod.POST, newMobileAppRelationship);
    }

    /**
     * Creates a MobileAppRelationship with a new object
     *
     * @param newMobileAppRelationship the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MobileAppRelationship newMobileAppRelationship, @Nonnull final ICallback<? super MobileAppRelationship> callback) {
        send(HttpMethod.PUT, callback, newMobileAppRelationship);
    }

    /**
     * Creates a MobileAppRelationship with a new object
     *
     * @param newMobileAppRelationship the object to create/update
     * @return the created MobileAppRelationship
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppRelationship put(@Nonnull final MobileAppRelationship newMobileAppRelationship) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppRelationship);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppRelationshipRequest select(@Nonnull final String value) {
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
     public MobileAppRelationshipRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

