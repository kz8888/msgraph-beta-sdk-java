// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppDependency;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Dependency Request.
 */
public class MobileAppDependencyRequest extends BaseRequest implements IMobileAppDependencyRequest {
	
    /**
     * The request for the MobileAppDependency
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppDependencyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppDependency.class);
    }

    /**
     * Gets the MobileAppDependency from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MobileAppDependency> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppDependency from the service
     *
     * @return the MobileAppDependency from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppDependency get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MobileAppDependency> callback) {
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
     * Patches this MobileAppDependency with a source
     *
     * @param sourceMobileAppDependency the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MobileAppDependency sourceMobileAppDependency, final ICallback<? super MobileAppDependency> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppDependency);
    }

    /**
     * Patches this MobileAppDependency with a source
     *
     * @param sourceMobileAppDependency the source object with updates
     * @return the updated MobileAppDependency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppDependency patch(final MobileAppDependency sourceMobileAppDependency) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppDependency);
    }

    /**
     * Creates a MobileAppDependency with a new object
     *
     * @param newMobileAppDependency the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MobileAppDependency newMobileAppDependency, final ICallback<? super MobileAppDependency> callback) {
        send(HttpMethod.POST, callback, newMobileAppDependency);
    }

    /**
     * Creates a MobileAppDependency with a new object
     *
     * @param newMobileAppDependency the new object to create
     * @return the created MobileAppDependency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppDependency post(final MobileAppDependency newMobileAppDependency) throws ClientException {
        return send(HttpMethod.POST, newMobileAppDependency);
    }

    /**
     * Creates a MobileAppDependency with a new object
     *
     * @param newMobileAppDependency the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MobileAppDependency newMobileAppDependency, final ICallback<? super MobileAppDependency> callback) {
        send(HttpMethod.PUT, callback, newMobileAppDependency);
    }

    /**
     * Creates a MobileAppDependency with a new object
     *
     * @param newMobileAppDependency the object to create/update
     * @return the created MobileAppDependency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppDependency put(final MobileAppDependency newMobileAppDependency) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppDependency);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMobileAppDependencyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MobileAppDependencyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMobileAppDependencyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MobileAppDependencyRequest)this;
     }

}

