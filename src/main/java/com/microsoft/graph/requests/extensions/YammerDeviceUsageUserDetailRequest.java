// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Yammer Device Usage User Detail Request.
 */
public class YammerDeviceUsageUserDetailRequest extends BaseRequest implements IYammerDeviceUsageUserDetailRequest {
	
    /**
     * The request for the YammerDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public YammerDeviceUsageUserDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, YammerDeviceUsageUserDetail.class);
    }

    /**
     * Gets the YammerDeviceUsageUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super YammerDeviceUsageUserDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the YammerDeviceUsageUserDetail from the service
     *
     * @return the YammerDeviceUsageUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerDeviceUsageUserDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super YammerDeviceUsageUserDetail> callback) {
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
     * Patches this YammerDeviceUsageUserDetail with a source
     *
     * @param sourceYammerDeviceUsageUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final YammerDeviceUsageUserDetail sourceYammerDeviceUsageUserDetail, final ICallback<? super YammerDeviceUsageUserDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceYammerDeviceUsageUserDetail);
    }

    /**
     * Patches this YammerDeviceUsageUserDetail with a source
     *
     * @param sourceYammerDeviceUsageUserDetail the source object with updates
     * @return the updated YammerDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerDeviceUsageUserDetail patch(final YammerDeviceUsageUserDetail sourceYammerDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceYammerDeviceUsageUserDetail);
    }

    /**
     * Creates a YammerDeviceUsageUserDetail with a new object
     *
     * @param newYammerDeviceUsageUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final YammerDeviceUsageUserDetail newYammerDeviceUsageUserDetail, final ICallback<? super YammerDeviceUsageUserDetail> callback) {
        send(HttpMethod.POST, callback, newYammerDeviceUsageUserDetail);
    }

    /**
     * Creates a YammerDeviceUsageUserDetail with a new object
     *
     * @param newYammerDeviceUsageUserDetail the new object to create
     * @return the created YammerDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerDeviceUsageUserDetail post(final YammerDeviceUsageUserDetail newYammerDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.POST, newYammerDeviceUsageUserDetail);
    }

    /**
     * Creates a YammerDeviceUsageUserDetail with a new object
     *
     * @param newYammerDeviceUsageUserDetail the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final YammerDeviceUsageUserDetail newYammerDeviceUsageUserDetail, final ICallback<? super YammerDeviceUsageUserDetail> callback) {
        send(HttpMethod.PUT, callback, newYammerDeviceUsageUserDetail);
    }

    /**
     * Creates a YammerDeviceUsageUserDetail with a new object
     *
     * @param newYammerDeviceUsageUserDetail the object to create/update
     * @return the created YammerDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerDeviceUsageUserDetail put(final YammerDeviceUsageUserDetail newYammerDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.PUT, newYammerDeviceUsageUserDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IYammerDeviceUsageUserDetailRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (YammerDeviceUsageUserDetailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IYammerDeviceUsageUserDetailRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (YammerDeviceUsageUserDetailRequest)this;
     }

}

