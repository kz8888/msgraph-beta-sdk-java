// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosVppAppAssignedUserLicense;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp App Assigned User License Request.
 */
public class IosVppAppAssignedUserLicenseRequest extends BaseRequest<IosVppAppAssignedUserLicense> {
	
    /**
     * The request for the IosVppAppAssignedUserLicense
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVppAppAssignedUserLicenseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosVppAppAssignedUserLicense.class);
    }

    /**
     * Gets the IosVppAppAssignedUserLicense from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super IosVppAppAssignedUserLicense> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosVppAppAssignedUserLicense from the service
     *
     * @return the IosVppAppAssignedUserLicense from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppAppAssignedUserLicense get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super IosVppAppAssignedUserLicense> callback) {
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
     * Patches this IosVppAppAssignedUserLicense with a source
     *
     * @param sourceIosVppAppAssignedUserLicense the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final IosVppAppAssignedUserLicense sourceIosVppAppAssignedUserLicense, @Nonnull final ICallback<? super IosVppAppAssignedUserLicense> callback) {
        send(HttpMethod.PATCH, callback, sourceIosVppAppAssignedUserLicense);
    }

    /**
     * Patches this IosVppAppAssignedUserLicense with a source
     *
     * @param sourceIosVppAppAssignedUserLicense the source object with updates
     * @return the updated IosVppAppAssignedUserLicense
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppAppAssignedUserLicense patch(@Nonnull final IosVppAppAssignedUserLicense sourceIosVppAppAssignedUserLicense) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosVppAppAssignedUserLicense);
    }

    /**
     * Creates a IosVppAppAssignedUserLicense with a new object
     *
     * @param newIosVppAppAssignedUserLicense the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final IosVppAppAssignedUserLicense newIosVppAppAssignedUserLicense, @Nonnull final ICallback<? super IosVppAppAssignedUserLicense> callback) {
        send(HttpMethod.POST, callback, newIosVppAppAssignedUserLicense);
    }

    /**
     * Creates a IosVppAppAssignedUserLicense with a new object
     *
     * @param newIosVppAppAssignedUserLicense the new object to create
     * @return the created IosVppAppAssignedUserLicense
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppAppAssignedUserLicense post(@Nonnull final IosVppAppAssignedUserLicense newIosVppAppAssignedUserLicense) throws ClientException {
        return send(HttpMethod.POST, newIosVppAppAssignedUserLicense);
    }

    /**
     * Creates a IosVppAppAssignedUserLicense with a new object
     *
     * @param newIosVppAppAssignedUserLicense the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final IosVppAppAssignedUserLicense newIosVppAppAssignedUserLicense, @Nonnull final ICallback<? super IosVppAppAssignedUserLicense> callback) {
        send(HttpMethod.PUT, callback, newIosVppAppAssignedUserLicense);
    }

    /**
     * Creates a IosVppAppAssignedUserLicense with a new object
     *
     * @param newIosVppAppAssignedUserLicense the object to create/update
     * @return the created IosVppAppAssignedUserLicense
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosVppAppAssignedUserLicense put(@Nonnull final IosVppAppAssignedUserLicense newIosVppAppAssignedUserLicense) throws ClientException {
        return send(HttpMethod.PUT, newIosVppAppAssignedUserLicense);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosVppAppAssignedUserLicenseRequest select(@Nonnull final String value) {
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
     public IosVppAppAssignedUserLicenseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

