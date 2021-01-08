// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookUser;
import com.microsoft.graph.models.extensions.LocaleInfo;
import com.microsoft.graph.models.extensions.TimeZoneInformation;
import com.microsoft.graph.models.generated.TimeZoneStandard;
import com.microsoft.graph.requests.extensions.OutlookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OutlookTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook User Request.
 */
public class OutlookUserRequest extends BaseRequest<OutlookUser> {
	
    /**
     * The request for the OutlookUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookUserRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OutlookUser.class);
    }

    /**
     * Gets the OutlookUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super OutlookUser> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OutlookUser from the service
     *
     * @return the OutlookUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookUser get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super OutlookUser> callback) {
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
     * Patches this OutlookUser with a source
     *
     * @param sourceOutlookUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final OutlookUser sourceOutlookUser, @Nonnull final ICallback<? super OutlookUser> callback) {
        send(HttpMethod.PATCH, callback, sourceOutlookUser);
    }

    /**
     * Patches this OutlookUser with a source
     *
     * @param sourceOutlookUser the source object with updates
     * @return the updated OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookUser patch(@Nonnull final OutlookUser sourceOutlookUser) throws ClientException {
        return send(HttpMethod.PATCH, sourceOutlookUser);
    }

    /**
     * Creates a OutlookUser with a new object
     *
     * @param newOutlookUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final OutlookUser newOutlookUser, @Nonnull final ICallback<? super OutlookUser> callback) {
        send(HttpMethod.POST, callback, newOutlookUser);
    }

    /**
     * Creates a OutlookUser with a new object
     *
     * @param newOutlookUser the new object to create
     * @return the created OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookUser post(@Nonnull final OutlookUser newOutlookUser) throws ClientException {
        return send(HttpMethod.POST, newOutlookUser);
    }

    /**
     * Creates a OutlookUser with a new object
     *
     * @param newOutlookUser the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final OutlookUser newOutlookUser, @Nonnull final ICallback<? super OutlookUser> callback) {
        send(HttpMethod.PUT, callback, newOutlookUser);
    }

    /**
     * Creates a OutlookUser with a new object
     *
     * @param newOutlookUser the object to create/update
     * @return the created OutlookUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OutlookUser put(@Nonnull final OutlookUser newOutlookUser) throws ClientException {
        return send(HttpMethod.PUT, newOutlookUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OutlookUserRequest select(@Nonnull final String value) {
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
     public OutlookUserRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

