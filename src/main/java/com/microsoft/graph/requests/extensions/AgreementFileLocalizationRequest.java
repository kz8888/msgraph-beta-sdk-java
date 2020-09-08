// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AgreementFileLocalization;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File Localization Request.
 */
public class AgreementFileLocalizationRequest extends BaseRequest implements IAgreementFileLocalizationRequest {
	
    /**
     * The request for the AgreementFileLocalization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementFileLocalizationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AgreementFileLocalization.class);
    }

    /**
     * Gets the AgreementFileLocalization from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AgreementFileLocalization> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AgreementFileLocalization from the service
     *
     * @return the AgreementFileLocalization from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgreementFileLocalization get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AgreementFileLocalization> callback) {
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
     * Patches this AgreementFileLocalization with a source
     *
     * @param sourceAgreementFileLocalization the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AgreementFileLocalization sourceAgreementFileLocalization, final ICallback<AgreementFileLocalization> callback) {
        send(HttpMethod.PATCH, callback, sourceAgreementFileLocalization);
    }

    /**
     * Patches this AgreementFileLocalization with a source
     *
     * @param sourceAgreementFileLocalization the source object with updates
     * @return the updated AgreementFileLocalization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgreementFileLocalization patch(final AgreementFileLocalization sourceAgreementFileLocalization) throws ClientException {
        return send(HttpMethod.PATCH, sourceAgreementFileLocalization);
    }

    /**
     * Creates a AgreementFileLocalization with a new object
     *
     * @param newAgreementFileLocalization the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AgreementFileLocalization newAgreementFileLocalization, final ICallback<AgreementFileLocalization> callback) {
        send(HttpMethod.POST, callback, newAgreementFileLocalization);
    }

    /**
     * Creates a AgreementFileLocalization with a new object
     *
     * @param newAgreementFileLocalization the new object to create
     * @return the created AgreementFileLocalization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgreementFileLocalization post(final AgreementFileLocalization newAgreementFileLocalization) throws ClientException {
        return send(HttpMethod.POST, newAgreementFileLocalization);
    }

    /**
     * Creates a AgreementFileLocalization with a new object
     *
     * @param newAgreementFileLocalization the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AgreementFileLocalization newAgreementFileLocalization, final ICallback<AgreementFileLocalization> callback) {
        send(HttpMethod.PUT, callback, newAgreementFileLocalization);
    }

    /**
     * Creates a AgreementFileLocalization with a new object
     *
     * @param newAgreementFileLocalization the object to create/update
     * @return the created AgreementFileLocalization
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AgreementFileLocalization put(final AgreementFileLocalization newAgreementFileLocalization) throws ClientException {
        return send(HttpMethod.PUT, newAgreementFileLocalization);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAgreementFileLocalizationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AgreementFileLocalizationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAgreementFileLocalizationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AgreementFileLocalizationRequest)this;
     }

}

