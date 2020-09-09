// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidDeviceComplianceLocalActionBase;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Compliance Local Action Base Request.
 */
public class AndroidDeviceComplianceLocalActionBaseRequest extends BaseRequest implements IAndroidDeviceComplianceLocalActionBaseRequest {
	
    /**
     * The request for the AndroidDeviceComplianceLocalActionBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AndroidDeviceComplianceLocalActionBaseRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends AndroidDeviceComplianceLocalActionBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AndroidDeviceComplianceLocalActionBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceComplianceLocalActionBaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceComplianceLocalActionBase.class);
    }

    /**
     * Gets the AndroidDeviceComplianceLocalActionBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidDeviceComplianceLocalActionBase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidDeviceComplianceLocalActionBase from the service
     *
     * @return the AndroidDeviceComplianceLocalActionBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceComplianceLocalActionBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidDeviceComplianceLocalActionBase> callback) {
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
     * Patches this AndroidDeviceComplianceLocalActionBase with a source
     *
     * @param sourceAndroidDeviceComplianceLocalActionBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidDeviceComplianceLocalActionBase sourceAndroidDeviceComplianceLocalActionBase, final ICallback<AndroidDeviceComplianceLocalActionBase> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidDeviceComplianceLocalActionBase);
    }

    /**
     * Patches this AndroidDeviceComplianceLocalActionBase with a source
     *
     * @param sourceAndroidDeviceComplianceLocalActionBase the source object with updates
     * @return the updated AndroidDeviceComplianceLocalActionBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceComplianceLocalActionBase patch(final AndroidDeviceComplianceLocalActionBase sourceAndroidDeviceComplianceLocalActionBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidDeviceComplianceLocalActionBase);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionBase with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidDeviceComplianceLocalActionBase newAndroidDeviceComplianceLocalActionBase, final ICallback<AndroidDeviceComplianceLocalActionBase> callback) {
        send(HttpMethod.POST, callback, newAndroidDeviceComplianceLocalActionBase);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionBase with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionBase the new object to create
     * @return the created AndroidDeviceComplianceLocalActionBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceComplianceLocalActionBase post(final AndroidDeviceComplianceLocalActionBase newAndroidDeviceComplianceLocalActionBase) throws ClientException {
        return send(HttpMethod.POST, newAndroidDeviceComplianceLocalActionBase);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionBase with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionBase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidDeviceComplianceLocalActionBase newAndroidDeviceComplianceLocalActionBase, final ICallback<AndroidDeviceComplianceLocalActionBase> callback) {
        send(HttpMethod.PUT, callback, newAndroidDeviceComplianceLocalActionBase);
    }

    /**
     * Creates a AndroidDeviceComplianceLocalActionBase with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionBase the object to create/update
     * @return the created AndroidDeviceComplianceLocalActionBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidDeviceComplianceLocalActionBase put(final AndroidDeviceComplianceLocalActionBase newAndroidDeviceComplianceLocalActionBase) throws ClientException {
        return send(HttpMethod.PUT, newAndroidDeviceComplianceLocalActionBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidDeviceComplianceLocalActionBaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidDeviceComplianceLocalActionBaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidDeviceComplianceLocalActionBaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidDeviceComplianceLocalActionBaseRequest)this;
     }

}

