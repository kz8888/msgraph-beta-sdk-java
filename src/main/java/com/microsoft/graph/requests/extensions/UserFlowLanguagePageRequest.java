// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserFlowLanguagePage;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Flow Language Page Request.
 */
public class UserFlowLanguagePageRequest extends BaseRequest implements IUserFlowLanguagePageRequest {
	
    /**
     * The request for the UserFlowLanguagePage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserFlowLanguagePageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserFlowLanguagePage.class);
    }

    /**
     * Gets the UserFlowLanguagePage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserFlowLanguagePage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserFlowLanguagePage from the service
     *
     * @return the UserFlowLanguagePage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserFlowLanguagePage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserFlowLanguagePage> callback) {
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
     * Patches this UserFlowLanguagePage with a source
     *
     * @param sourceUserFlowLanguagePage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserFlowLanguagePage sourceUserFlowLanguagePage, final ICallback<? super UserFlowLanguagePage> callback) {
        send(HttpMethod.PATCH, callback, sourceUserFlowLanguagePage);
    }

    /**
     * Patches this UserFlowLanguagePage with a source
     *
     * @param sourceUserFlowLanguagePage the source object with updates
     * @return the updated UserFlowLanguagePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserFlowLanguagePage patch(final UserFlowLanguagePage sourceUserFlowLanguagePage) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserFlowLanguagePage);
    }

    /**
     * Creates a UserFlowLanguagePage with a new object
     *
     * @param newUserFlowLanguagePage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserFlowLanguagePage newUserFlowLanguagePage, final ICallback<? super UserFlowLanguagePage> callback) {
        send(HttpMethod.POST, callback, newUserFlowLanguagePage);
    }

    /**
     * Creates a UserFlowLanguagePage with a new object
     *
     * @param newUserFlowLanguagePage the new object to create
     * @return the created UserFlowLanguagePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserFlowLanguagePage post(final UserFlowLanguagePage newUserFlowLanguagePage) throws ClientException {
        return send(HttpMethod.POST, newUserFlowLanguagePage);
    }

    /**
     * Creates a UserFlowLanguagePage with a new object
     *
     * @param newUserFlowLanguagePage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserFlowLanguagePage newUserFlowLanguagePage, final ICallback<? super UserFlowLanguagePage> callback) {
        send(HttpMethod.PUT, callback, newUserFlowLanguagePage);
    }

    /**
     * Creates a UserFlowLanguagePage with a new object
     *
     * @param newUserFlowLanguagePage the object to create/update
     * @return the created UserFlowLanguagePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserFlowLanguagePage put(final UserFlowLanguagePage newUserFlowLanguagePage) throws ClientException {
        return send(HttpMethod.PUT, newUserFlowLanguagePage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserFlowLanguagePageRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserFlowLanguagePageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserFlowLanguagePageRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserFlowLanguagePageRequest)this;
     }

}

