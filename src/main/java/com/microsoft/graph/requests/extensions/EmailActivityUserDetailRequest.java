// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailActivityUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email Activity User Detail Request.
 */
public class EmailActivityUserDetailRequest extends BaseRequest implements IEmailActivityUserDetailRequest {
	
    /**
     * The request for the EmailActivityUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmailActivityUserDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmailActivityUserDetail.class);
    }

    /**
     * Gets the EmailActivityUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EmailActivityUserDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EmailActivityUserDetail from the service
     *
     * @return the EmailActivityUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailActivityUserDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EmailActivityUserDetail> callback) {
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
     * Patches this EmailActivityUserDetail with a source
     *
     * @param sourceEmailActivityUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EmailActivityUserDetail sourceEmailActivityUserDetail, final ICallback<EmailActivityUserDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceEmailActivityUserDetail);
    }

    /**
     * Patches this EmailActivityUserDetail with a source
     *
     * @param sourceEmailActivityUserDetail the source object with updates
     * @return the updated EmailActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailActivityUserDetail patch(final EmailActivityUserDetail sourceEmailActivityUserDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceEmailActivityUserDetail);
    }

    /**
     * Creates a EmailActivityUserDetail with a new object
     *
     * @param newEmailActivityUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EmailActivityUserDetail newEmailActivityUserDetail, final ICallback<EmailActivityUserDetail> callback) {
        send(HttpMethod.POST, callback, newEmailActivityUserDetail);
    }

    /**
     * Creates a EmailActivityUserDetail with a new object
     *
     * @param newEmailActivityUserDetail the new object to create
     * @return the created EmailActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailActivityUserDetail post(final EmailActivityUserDetail newEmailActivityUserDetail) throws ClientException {
        return send(HttpMethod.POST, newEmailActivityUserDetail);
    }

    /**
     * Creates a EmailActivityUserDetail with a new object
     *
     * @param newEmailActivityUserDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EmailActivityUserDetail newEmailActivityUserDetail, final ICallback<EmailActivityUserDetail> callback) {
        send(HttpMethod.PUT, callback, newEmailActivityUserDetail);
    }

    /**
     * Creates a EmailActivityUserDetail with a new object
     *
     * @param newEmailActivityUserDetail the object to create/update
     * @return the created EmailActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailActivityUserDetail put(final EmailActivityUserDetail newEmailActivityUserDetail) throws ClientException {
        return send(HttpMethod.PUT, newEmailActivityUserDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEmailActivityUserDetailRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EmailActivityUserDetailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEmailActivityUserDetailRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EmailActivityUserDetailRequest)this;
     }

}

