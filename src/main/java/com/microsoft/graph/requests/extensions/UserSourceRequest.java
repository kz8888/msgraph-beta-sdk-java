// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserSource;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Source Request.
 */
public class UserSourceRequest extends BaseRequest implements IUserSourceRequest {
	
    /**
     * The request for the UserSource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserSourceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserSource.class);
    }

    /**
     * Gets the UserSource from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserSource> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserSource from the service
     *
     * @return the UserSource from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserSource get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserSource> callback) {
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
     * Patches this UserSource with a source
     *
     * @param sourceUserSource the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserSource sourceUserSource, final ICallback<? super UserSource> callback) {
        send(HttpMethod.PATCH, callback, sourceUserSource);
    }

    /**
     * Patches this UserSource with a source
     *
     * @param sourceUserSource the source object with updates
     * @return the updated UserSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserSource patch(final UserSource sourceUserSource) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserSource);
    }

    /**
     * Creates a UserSource with a new object
     *
     * @param newUserSource the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserSource newUserSource, final ICallback<? super UserSource> callback) {
        send(HttpMethod.POST, callback, newUserSource);
    }

    /**
     * Creates a UserSource with a new object
     *
     * @param newUserSource the new object to create
     * @return the created UserSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserSource post(final UserSource newUserSource) throws ClientException {
        return send(HttpMethod.POST, newUserSource);
    }

    /**
     * Creates a UserSource with a new object
     *
     * @param newUserSource the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserSource newUserSource, final ICallback<? super UserSource> callback) {
        send(HttpMethod.PUT, callback, newUserSource);
    }

    /**
     * Creates a UserSource with a new object
     *
     * @param newUserSource the object to create/update
     * @return the created UserSource
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserSource put(final UserSource newUserSource) throws ClientException {
        return send(HttpMethod.PUT, newUserSource);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserSourceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserSourceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserSourceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserSourceRequest)this;
     }

}

