// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppPolicySetItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Policy Set Item Request.
 */
public class MobileAppPolicySetItemRequest extends BaseRequest implements IMobileAppPolicySetItemRequest {
	
    /**
     * The request for the MobileAppPolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppPolicySetItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppPolicySetItem.class);
    }

    /**
     * Gets the MobileAppPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MobileAppPolicySetItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppPolicySetItem from the service
     *
     * @return the MobileAppPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppPolicySetItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MobileAppPolicySetItem> callback) {
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
     * Patches this MobileAppPolicySetItem with a source
     *
     * @param sourceMobileAppPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MobileAppPolicySetItem sourceMobileAppPolicySetItem, final ICallback<MobileAppPolicySetItem> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppPolicySetItem);
    }

    /**
     * Patches this MobileAppPolicySetItem with a source
     *
     * @param sourceMobileAppPolicySetItem the source object with updates
     * @return the updated MobileAppPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppPolicySetItem patch(final MobileAppPolicySetItem sourceMobileAppPolicySetItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppPolicySetItem);
    }

    /**
     * Creates a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MobileAppPolicySetItem newMobileAppPolicySetItem, final ICallback<MobileAppPolicySetItem> callback) {
        send(HttpMethod.POST, callback, newMobileAppPolicySetItem);
    }

    /**
     * Creates a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the new object to create
     * @return the created MobileAppPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppPolicySetItem post(final MobileAppPolicySetItem newMobileAppPolicySetItem) throws ClientException {
        return send(HttpMethod.POST, newMobileAppPolicySetItem);
    }

    /**
     * Creates a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MobileAppPolicySetItem newMobileAppPolicySetItem, final ICallback<MobileAppPolicySetItem> callback) {
        send(HttpMethod.PUT, callback, newMobileAppPolicySetItem);
    }

    /**
     * Creates a MobileAppPolicySetItem with a new object
     *
     * @param newMobileAppPolicySetItem the object to create/update
     * @return the created MobileAppPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppPolicySetItem put(final MobileAppPolicySetItem newMobileAppPolicySetItem) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppPolicySetItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMobileAppPolicySetItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MobileAppPolicySetItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMobileAppPolicySetItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MobileAppPolicySetItemRequest)this;
     }

}

