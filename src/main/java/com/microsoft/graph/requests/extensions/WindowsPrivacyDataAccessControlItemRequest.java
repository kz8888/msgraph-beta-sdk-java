// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Privacy Data Access Control Item Request.
 */
public class WindowsPrivacyDataAccessControlItemRequest extends BaseRequest<WindowsPrivacyDataAccessControlItem> {
	
    /**
     * The request for the WindowsPrivacyDataAccessControlItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPrivacyDataAccessControlItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPrivacyDataAccessControlItem.class);
    }

    /**
     * Gets the WindowsPrivacyDataAccessControlItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WindowsPrivacyDataAccessControlItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPrivacyDataAccessControlItem from the service
     *
     * @return the WindowsPrivacyDataAccessControlItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPrivacyDataAccessControlItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WindowsPrivacyDataAccessControlItem> callback) {
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
     * Patches this WindowsPrivacyDataAccessControlItem with a source
     *
     * @param sourceWindowsPrivacyDataAccessControlItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WindowsPrivacyDataAccessControlItem sourceWindowsPrivacyDataAccessControlItem, @Nonnull final ICallback<? super WindowsPrivacyDataAccessControlItem> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPrivacyDataAccessControlItem);
    }

    /**
     * Patches this WindowsPrivacyDataAccessControlItem with a source
     *
     * @param sourceWindowsPrivacyDataAccessControlItem the source object with updates
     * @return the updated WindowsPrivacyDataAccessControlItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPrivacyDataAccessControlItem patch(@Nonnull final WindowsPrivacyDataAccessControlItem sourceWindowsPrivacyDataAccessControlItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPrivacyDataAccessControlItem);
    }

    /**
     * Creates a WindowsPrivacyDataAccessControlItem with a new object
     *
     * @param newWindowsPrivacyDataAccessControlItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WindowsPrivacyDataAccessControlItem newWindowsPrivacyDataAccessControlItem, @Nonnull final ICallback<? super WindowsPrivacyDataAccessControlItem> callback) {
        send(HttpMethod.POST, callback, newWindowsPrivacyDataAccessControlItem);
    }

    /**
     * Creates a WindowsPrivacyDataAccessControlItem with a new object
     *
     * @param newWindowsPrivacyDataAccessControlItem the new object to create
     * @return the created WindowsPrivacyDataAccessControlItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPrivacyDataAccessControlItem post(@Nonnull final WindowsPrivacyDataAccessControlItem newWindowsPrivacyDataAccessControlItem) throws ClientException {
        return send(HttpMethod.POST, newWindowsPrivacyDataAccessControlItem);
    }

    /**
     * Creates a WindowsPrivacyDataAccessControlItem with a new object
     *
     * @param newWindowsPrivacyDataAccessControlItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WindowsPrivacyDataAccessControlItem newWindowsPrivacyDataAccessControlItem, @Nonnull final ICallback<? super WindowsPrivacyDataAccessControlItem> callback) {
        send(HttpMethod.PUT, callback, newWindowsPrivacyDataAccessControlItem);
    }

    /**
     * Creates a WindowsPrivacyDataAccessControlItem with a new object
     *
     * @param newWindowsPrivacyDataAccessControlItem the object to create/update
     * @return the created WindowsPrivacyDataAccessControlItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WindowsPrivacyDataAccessControlItem put(@Nonnull final WindowsPrivacyDataAccessControlItem newWindowsPrivacyDataAccessControlItem) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPrivacyDataAccessControlItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WindowsPrivacyDataAccessControlItemRequest select(@Nonnull final String value) {
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
     public WindowsPrivacyDataAccessControlItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

