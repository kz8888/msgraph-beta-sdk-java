// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsAssignedAccessProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Assigned Access Profile Request.
 */
public class WindowsAssignedAccessProfileRequest extends BaseRequest implements IWindowsAssignedAccessProfileRequest {
	
    /**
     * The request for the WindowsAssignedAccessProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAssignedAccessProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsAssignedAccessProfile.class);
    }

    /**
     * Gets the WindowsAssignedAccessProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsAssignedAccessProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsAssignedAccessProfile from the service
     *
     * @return the WindowsAssignedAccessProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAssignedAccessProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsAssignedAccessProfile> callback) {
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
     * Patches this WindowsAssignedAccessProfile with a source
     *
     * @param sourceWindowsAssignedAccessProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsAssignedAccessProfile sourceWindowsAssignedAccessProfile, final ICallback<WindowsAssignedAccessProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsAssignedAccessProfile);
    }

    /**
     * Patches this WindowsAssignedAccessProfile with a source
     *
     * @param sourceWindowsAssignedAccessProfile the source object with updates
     * @return the updated WindowsAssignedAccessProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAssignedAccessProfile patch(final WindowsAssignedAccessProfile sourceWindowsAssignedAccessProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsAssignedAccessProfile);
    }

    /**
     * Creates a WindowsAssignedAccessProfile with a new object
     *
     * @param newWindowsAssignedAccessProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsAssignedAccessProfile newWindowsAssignedAccessProfile, final ICallback<WindowsAssignedAccessProfile> callback) {
        send(HttpMethod.POST, callback, newWindowsAssignedAccessProfile);
    }

    /**
     * Creates a WindowsAssignedAccessProfile with a new object
     *
     * @param newWindowsAssignedAccessProfile the new object to create
     * @return the created WindowsAssignedAccessProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAssignedAccessProfile post(final WindowsAssignedAccessProfile newWindowsAssignedAccessProfile) throws ClientException {
        return send(HttpMethod.POST, newWindowsAssignedAccessProfile);
    }

    /**
     * Creates a WindowsAssignedAccessProfile with a new object
     *
     * @param newWindowsAssignedAccessProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsAssignedAccessProfile newWindowsAssignedAccessProfile, final ICallback<WindowsAssignedAccessProfile> callback) {
        send(HttpMethod.PUT, callback, newWindowsAssignedAccessProfile);
    }

    /**
     * Creates a WindowsAssignedAccessProfile with a new object
     *
     * @param newWindowsAssignedAccessProfile the object to create/update
     * @return the created WindowsAssignedAccessProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAssignedAccessProfile put(final WindowsAssignedAccessProfile newWindowsAssignedAccessProfile) throws ClientException {
        return send(HttpMethod.PUT, newWindowsAssignedAccessProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsAssignedAccessProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsAssignedAccessProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsAssignedAccessProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsAssignedAccessProfileRequest)this;
     }

}

