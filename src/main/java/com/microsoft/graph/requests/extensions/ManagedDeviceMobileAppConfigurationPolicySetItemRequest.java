// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationPolicySetItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Policy Set Item Request.
 */
public class ManagedDeviceMobileAppConfigurationPolicySetItemRequest extends BaseRequest implements IManagedDeviceMobileAppConfigurationPolicySetItemRequest {
	
    /**
     * The request for the ManagedDeviceMobileAppConfigurationPolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationPolicySetItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationPolicySetItem.class);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationPolicySetItem from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationPolicySetItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback) {
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
     * Patches this ManagedDeviceMobileAppConfigurationPolicySetItem with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedDeviceMobileAppConfigurationPolicySetItem sourceManagedDeviceMobileAppConfigurationPolicySetItem, final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDeviceMobileAppConfigurationPolicySetItem);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationPolicySetItem with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationPolicySetItem the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationPolicySetItem patch(final ManagedDeviceMobileAppConfigurationPolicySetItem sourceManagedDeviceMobileAppConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationPolicySetItem);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationPolicySetItem with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedDeviceMobileAppConfigurationPolicySetItem newManagedDeviceMobileAppConfigurationPolicySetItem, final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback) {
        send(HttpMethod.POST, callback, newManagedDeviceMobileAppConfigurationPolicySetItem);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationPolicySetItem with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationPolicySetItem the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationPolicySetItem post(final ManagedDeviceMobileAppConfigurationPolicySetItem newManagedDeviceMobileAppConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfigurationPolicySetItem);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationPolicySetItem with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ManagedDeviceMobileAppConfigurationPolicySetItem newManagedDeviceMobileAppConfigurationPolicySetItem, final ICallback<? super ManagedDeviceMobileAppConfigurationPolicySetItem> callback) {
        send(HttpMethod.PUT, callback, newManagedDeviceMobileAppConfigurationPolicySetItem);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationPolicySetItem with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationPolicySetItem the object to create/update
     * @return the created ManagedDeviceMobileAppConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationPolicySetItem put(final ManagedDeviceMobileAppConfigurationPolicySetItem newManagedDeviceMobileAppConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.PUT, newManagedDeviceMobileAppConfigurationPolicySetItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationPolicySetItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ManagedDeviceMobileAppConfigurationPolicySetItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationPolicySetItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ManagedDeviceMobileAppConfigurationPolicySetItemRequest)this;
     }

}

