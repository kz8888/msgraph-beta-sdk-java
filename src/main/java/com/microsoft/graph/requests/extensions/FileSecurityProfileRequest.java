// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.FileSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Security Profile Request.
 */
public class FileSecurityProfileRequest extends BaseRequest implements IFileSecurityProfileRequest {
	
    /**
     * The request for the FileSecurityProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileSecurityProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, FileSecurityProfile.class);
    }

    /**
     * Gets the FileSecurityProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super FileSecurityProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the FileSecurityProfile from the service
     *
     * @return the FileSecurityProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FileSecurityProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super FileSecurityProfile> callback) {
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
     * Patches this FileSecurityProfile with a source
     *
     * @param sourceFileSecurityProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final FileSecurityProfile sourceFileSecurityProfile, final ICallback<? super FileSecurityProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceFileSecurityProfile);
    }

    /**
     * Patches this FileSecurityProfile with a source
     *
     * @param sourceFileSecurityProfile the source object with updates
     * @return the updated FileSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FileSecurityProfile patch(final FileSecurityProfile sourceFileSecurityProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceFileSecurityProfile);
    }

    /**
     * Creates a FileSecurityProfile with a new object
     *
     * @param newFileSecurityProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final FileSecurityProfile newFileSecurityProfile, final ICallback<? super FileSecurityProfile> callback) {
        send(HttpMethod.POST, callback, newFileSecurityProfile);
    }

    /**
     * Creates a FileSecurityProfile with a new object
     *
     * @param newFileSecurityProfile the new object to create
     * @return the created FileSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FileSecurityProfile post(final FileSecurityProfile newFileSecurityProfile) throws ClientException {
        return send(HttpMethod.POST, newFileSecurityProfile);
    }

    /**
     * Creates a FileSecurityProfile with a new object
     *
     * @param newFileSecurityProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final FileSecurityProfile newFileSecurityProfile, final ICallback<? super FileSecurityProfile> callback) {
        send(HttpMethod.PUT, callback, newFileSecurityProfile);
    }

    /**
     * Creates a FileSecurityProfile with a new object
     *
     * @param newFileSecurityProfile the object to create/update
     * @return the created FileSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FileSecurityProfile put(final FileSecurityProfile newFileSecurityProfile) throws ClientException {
        return send(HttpMethod.PUT, newFileSecurityProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IFileSecurityProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (FileSecurityProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IFileSecurityProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (FileSecurityProfileRequest)this;
     }

}

