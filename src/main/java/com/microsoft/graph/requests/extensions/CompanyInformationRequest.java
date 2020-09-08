// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CompanyInformation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company Information Request.
 */
public class CompanyInformationRequest extends BaseRequest implements ICompanyInformationRequest {
	
    /**
     * The request for the CompanyInformation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CompanyInformationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CompanyInformation.class);
    }

    /**
     * Gets the CompanyInformation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<CompanyInformation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CompanyInformation from the service
     *
     * @return the CompanyInformation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CompanyInformation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<CompanyInformation> callback) {
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
     * Patches this CompanyInformation with a source
     *
     * @param sourceCompanyInformation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CompanyInformation sourceCompanyInformation, final ICallback<CompanyInformation> callback) {
        send(HttpMethod.PATCH, callback, sourceCompanyInformation);
    }

    /**
     * Patches this CompanyInformation with a source
     *
     * @param sourceCompanyInformation the source object with updates
     * @return the updated CompanyInformation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CompanyInformation patch(final CompanyInformation sourceCompanyInformation) throws ClientException {
        return send(HttpMethod.PATCH, sourceCompanyInformation);
    }

    /**
     * Creates a CompanyInformation with a new object
     *
     * @param newCompanyInformation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CompanyInformation newCompanyInformation, final ICallback<CompanyInformation> callback) {
        send(HttpMethod.POST, callback, newCompanyInformation);
    }

    /**
     * Creates a CompanyInformation with a new object
     *
     * @param newCompanyInformation the new object to create
     * @return the created CompanyInformation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CompanyInformation post(final CompanyInformation newCompanyInformation) throws ClientException {
        return send(HttpMethod.POST, newCompanyInformation);
    }

    /**
     * Creates a CompanyInformation with a new object
     *
     * @param newCompanyInformation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final CompanyInformation newCompanyInformation, final ICallback<CompanyInformation> callback) {
        send(HttpMethod.PUT, callback, newCompanyInformation);
    }

    /**
     * Creates a CompanyInformation with a new object
     *
     * @param newCompanyInformation the object to create/update
     * @return the created CompanyInformation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CompanyInformation put(final CompanyInformation newCompanyInformation) throws ClientException {
        return send(HttpMethod.PUT, newCompanyInformation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICompanyInformationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CompanyInformationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICompanyInformationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CompanyInformationRequest)this;
     }

}

