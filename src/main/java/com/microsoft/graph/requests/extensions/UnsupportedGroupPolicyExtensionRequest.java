// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnsupportedGroupPolicyExtension;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unsupported Group Policy Extension Request.
 */
public class UnsupportedGroupPolicyExtensionRequest extends BaseRequest implements IUnsupportedGroupPolicyExtensionRequest {
	
    /**
     * The request for the UnsupportedGroupPolicyExtension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnsupportedGroupPolicyExtensionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnsupportedGroupPolicyExtension.class);
    }

    /**
     * Gets the UnsupportedGroupPolicyExtension from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UnsupportedGroupPolicyExtension> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnsupportedGroupPolicyExtension from the service
     *
     * @return the UnsupportedGroupPolicyExtension from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnsupportedGroupPolicyExtension get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UnsupportedGroupPolicyExtension> callback) {
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
     * Patches this UnsupportedGroupPolicyExtension with a source
     *
     * @param sourceUnsupportedGroupPolicyExtension the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnsupportedGroupPolicyExtension sourceUnsupportedGroupPolicyExtension, final ICallback<UnsupportedGroupPolicyExtension> callback) {
        send(HttpMethod.PATCH, callback, sourceUnsupportedGroupPolicyExtension);
    }

    /**
     * Patches this UnsupportedGroupPolicyExtension with a source
     *
     * @param sourceUnsupportedGroupPolicyExtension the source object with updates
     * @return the updated UnsupportedGroupPolicyExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnsupportedGroupPolicyExtension patch(final UnsupportedGroupPolicyExtension sourceUnsupportedGroupPolicyExtension) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnsupportedGroupPolicyExtension);
    }

    /**
     * Creates a UnsupportedGroupPolicyExtension with a new object
     *
     * @param newUnsupportedGroupPolicyExtension the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnsupportedGroupPolicyExtension newUnsupportedGroupPolicyExtension, final ICallback<UnsupportedGroupPolicyExtension> callback) {
        send(HttpMethod.POST, callback, newUnsupportedGroupPolicyExtension);
    }

    /**
     * Creates a UnsupportedGroupPolicyExtension with a new object
     *
     * @param newUnsupportedGroupPolicyExtension the new object to create
     * @return the created UnsupportedGroupPolicyExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnsupportedGroupPolicyExtension post(final UnsupportedGroupPolicyExtension newUnsupportedGroupPolicyExtension) throws ClientException {
        return send(HttpMethod.POST, newUnsupportedGroupPolicyExtension);
    }

    /**
     * Creates a UnsupportedGroupPolicyExtension with a new object
     *
     * @param newUnsupportedGroupPolicyExtension the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UnsupportedGroupPolicyExtension newUnsupportedGroupPolicyExtension, final ICallback<UnsupportedGroupPolicyExtension> callback) {
        send(HttpMethod.PUT, callback, newUnsupportedGroupPolicyExtension);
    }

    /**
     * Creates a UnsupportedGroupPolicyExtension with a new object
     *
     * @param newUnsupportedGroupPolicyExtension the object to create/update
     * @return the created UnsupportedGroupPolicyExtension
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnsupportedGroupPolicyExtension put(final UnsupportedGroupPolicyExtension newUnsupportedGroupPolicyExtension) throws ClientException {
        return send(HttpMethod.PUT, newUnsupportedGroupPolicyExtension);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnsupportedGroupPolicyExtensionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnsupportedGroupPolicyExtensionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnsupportedGroupPolicyExtensionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnsupportedGroupPolicyExtensionRequest)this;
     }

}

