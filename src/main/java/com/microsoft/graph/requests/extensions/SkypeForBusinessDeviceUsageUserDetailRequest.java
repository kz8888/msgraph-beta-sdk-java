// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Device Usage User Detail Request.
 */
public class SkypeForBusinessDeviceUsageUserDetailRequest extends BaseRequest implements ISkypeForBusinessDeviceUsageUserDetailRequest {
	
    /**
     * The request for the SkypeForBusinessDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessDeviceUsageUserDetailRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessDeviceUsageUserDetail.class);
    }

    /**
     * Gets the SkypeForBusinessDeviceUsageUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SkypeForBusinessDeviceUsageUserDetail> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SkypeForBusinessDeviceUsageUserDetail from the service
     *
     * @return the SkypeForBusinessDeviceUsageUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessDeviceUsageUserDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SkypeForBusinessDeviceUsageUserDetail> callback) {
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
     * Patches this SkypeForBusinessDeviceUsageUserDetail with a source
     *
     * @param sourceSkypeForBusinessDeviceUsageUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SkypeForBusinessDeviceUsageUserDetail sourceSkypeForBusinessDeviceUsageUserDetail, final ICallback<SkypeForBusinessDeviceUsageUserDetail> callback) {
        send(HttpMethod.PATCH, callback, sourceSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Patches this SkypeForBusinessDeviceUsageUserDetail with a source
     *
     * @param sourceSkypeForBusinessDeviceUsageUserDetail the source object with updates
     * @return the updated SkypeForBusinessDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessDeviceUsageUserDetail patch(final SkypeForBusinessDeviceUsageUserDetail sourceSkypeForBusinessDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserDetail with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SkypeForBusinessDeviceUsageUserDetail newSkypeForBusinessDeviceUsageUserDetail, final ICallback<SkypeForBusinessDeviceUsageUserDetail> callback) {
        send(HttpMethod.POST, callback, newSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserDetail with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserDetail the new object to create
     * @return the created SkypeForBusinessDeviceUsageUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessDeviceUsageUserDetail post(final SkypeForBusinessDeviceUsageUserDetail newSkypeForBusinessDeviceUsageUserDetail) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessDeviceUsageUserDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISkypeForBusinessDeviceUsageUserDetailRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SkypeForBusinessDeviceUsageUserDetailRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISkypeForBusinessDeviceUsageUserDetailRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SkypeForBusinessDeviceUsageUserDetailRequest)this;
     }

}
