// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppContentFile;
import com.microsoft.graph.models.extensions.FileEncryptionInfo;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File Request.
 */
public class MobileAppContentFileRequest extends BaseRequest<MobileAppContentFile> {
	
    /**
     * The request for the MobileAppContentFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppContentFileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppContentFile.class);
    }

    /**
     * Gets the MobileAppContentFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MobileAppContentFile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppContentFile from the service
     *
     * @return the MobileAppContentFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContentFile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MobileAppContentFile> callback) {
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
     * Patches this MobileAppContentFile with a source
     *
     * @param sourceMobileAppContentFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MobileAppContentFile sourceMobileAppContentFile, @Nonnull final ICallback<? super MobileAppContentFile> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppContentFile);
    }

    /**
     * Patches this MobileAppContentFile with a source
     *
     * @param sourceMobileAppContentFile the source object with updates
     * @return the updated MobileAppContentFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContentFile patch(@Nonnull final MobileAppContentFile sourceMobileAppContentFile) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppContentFile);
    }

    /**
     * Creates a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MobileAppContentFile newMobileAppContentFile, @Nonnull final ICallback<? super MobileAppContentFile> callback) {
        send(HttpMethod.POST, callback, newMobileAppContentFile);
    }

    /**
     * Creates a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the new object to create
     * @return the created MobileAppContentFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContentFile post(@Nonnull final MobileAppContentFile newMobileAppContentFile) throws ClientException {
        return send(HttpMethod.POST, newMobileAppContentFile);
    }

    /**
     * Creates a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MobileAppContentFile newMobileAppContentFile, @Nonnull final ICallback<? super MobileAppContentFile> callback) {
        send(HttpMethod.PUT, callback, newMobileAppContentFile);
    }

    /**
     * Creates a MobileAppContentFile with a new object
     *
     * @param newMobileAppContentFile the object to create/update
     * @return the created MobileAppContentFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MobileAppContentFile put(@Nonnull final MobileAppContentFile newMobileAppContentFile) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppContentFile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppContentFileRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public MobileAppContentFileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

