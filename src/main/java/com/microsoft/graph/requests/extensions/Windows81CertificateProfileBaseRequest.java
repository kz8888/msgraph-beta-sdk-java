// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows81CertificateProfileBase;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows81Certificate Profile Base Request.
 */
public class Windows81CertificateProfileBaseRequest extends BaseRequest implements IWindows81CertificateProfileBaseRequest {
	
    /**
     * The request for the Windows81CertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public Windows81CertificateProfileBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends Windows81CertificateProfileBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Windows81CertificateProfileBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows81CertificateProfileBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Windows81CertificateProfileBase.class);
    }

    /**
     * Gets the Windows81CertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Windows81CertificateProfileBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Windows81CertificateProfileBase from the service
     *
     * @return the Windows81CertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81CertificateProfileBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Windows81CertificateProfileBase> callback) {
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
     * Patches this Windows81CertificateProfileBase with a source
     *
     * @param sourceWindows81CertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Windows81CertificateProfileBase sourceWindows81CertificateProfileBase, final ICallback<Windows81CertificateProfileBase> callback) {
        send(HttpMethod.PATCH, callback, sourceWindows81CertificateProfileBase);
    }

    /**
     * Patches this Windows81CertificateProfileBase with a source
     *
     * @param sourceWindows81CertificateProfileBase the source object with updates
     * @return the updated Windows81CertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81CertificateProfileBase patch(final Windows81CertificateProfileBase sourceWindows81CertificateProfileBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindows81CertificateProfileBase);
    }

    /**
     * Creates a Windows81CertificateProfileBase with a new object
     *
     * @param newWindows81CertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Windows81CertificateProfileBase newWindows81CertificateProfileBase, final ICallback<Windows81CertificateProfileBase> callback) {
        send(HttpMethod.POST, callback, newWindows81CertificateProfileBase);
    }

    /**
     * Creates a Windows81CertificateProfileBase with a new object
     *
     * @param newWindows81CertificateProfileBase the new object to create
     * @return the created Windows81CertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81CertificateProfileBase post(final Windows81CertificateProfileBase newWindows81CertificateProfileBase) throws ClientException {
        return send(HttpMethod.POST, newWindows81CertificateProfileBase);
    }

    /**
     * Creates a Windows81CertificateProfileBase with a new object
     *
     * @param newWindows81CertificateProfileBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Windows81CertificateProfileBase newWindows81CertificateProfileBase, final ICallback<Windows81CertificateProfileBase> callback) {
        send(HttpMethod.PUT, callback, newWindows81CertificateProfileBase);
    }

    /**
     * Creates a Windows81CertificateProfileBase with a new object
     *
     * @param newWindows81CertificateProfileBase the object to create/update
     * @return the created Windows81CertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Windows81CertificateProfileBase put(final Windows81CertificateProfileBase newWindows81CertificateProfileBase) throws ClientException {
        return send(HttpMethod.PUT, newWindows81CertificateProfileBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindows81CertificateProfileBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Windows81CertificateProfileBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindows81CertificateProfileBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Windows81CertificateProfileBaseRequest)this;
     }

}

