// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.models.extensions.ItemPreviewInfo;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import com.microsoft.graph.requests.extensions.ItemActivityOLDCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemActivityOLDRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PermissionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SubscriptionRequestBuilder;
import com.microsoft.graph.requests.extensions.ThumbnailSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ThumbnailSetRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemVersionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemVersionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAnalyticsRequestBuilder;
import com.microsoft.graph.requests.extensions.ListItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Request.
 */
public class DriveItemRequest extends BaseRequest<DriveItem> {
	
    /**
     * The request for the DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItem.class);
    }

    /**
     * Gets the DriveItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DriveItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DriveItem from the service
     *
     * @return the DriveItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DriveItem> callback) {
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
     * Patches this DriveItem with a source
     *
     * @param sourceDriveItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DriveItem sourceDriveItem, @Nonnull final ICallback<? super DriveItem> callback) {
        send(HttpMethod.PATCH, callback, sourceDriveItem);
    }

    /**
     * Patches this DriveItem with a source
     *
     * @param sourceDriveItem the source object with updates
     * @return the updated DriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItem patch(@Nonnull final DriveItem sourceDriveItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     *
     * @param newDriveItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DriveItem newDriveItem, @Nonnull final ICallback<? super DriveItem> callback) {
        send(HttpMethod.POST, callback, newDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     *
     * @param newDriveItem the new object to create
     * @return the created DriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItem post(@Nonnull final DriveItem newDriveItem) throws ClientException {
        return send(HttpMethod.POST, newDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     *
     * @param newDriveItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DriveItem newDriveItem, @Nonnull final ICallback<? super DriveItem> callback) {
        send(HttpMethod.PUT, callback, newDriveItem);
    }

    /**
     * Creates a DriveItem with a new object
     *
     * @param newDriveItem the object to create/update
     * @return the created DriveItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DriveItem put(@Nonnull final DriveItem newDriveItem) throws ClientException {
        return send(HttpMethod.PUT, newDriveItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DriveItemRequest select(@Nonnull final String value) {
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
     public DriveItemRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

