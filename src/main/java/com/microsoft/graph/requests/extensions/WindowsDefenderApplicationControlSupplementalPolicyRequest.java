// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyDeploymentSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Request.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyRequest extends BaseRequest implements IWindowsDefenderApplicationControlSupplementalPolicyRequest {
	
    /**
     * The request for the WindowsDefenderApplicationControlSupplementalPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDefenderApplicationControlSupplementalPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsDefenderApplicationControlSupplementalPolicy.class);
    }

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsDefenderApplicationControlSupplementalPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicy from the service
     *
     * @return the WindowsDefenderApplicationControlSupplementalPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsDefenderApplicationControlSupplementalPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsDefenderApplicationControlSupplementalPolicy> callback) {
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
     * Patches this WindowsDefenderApplicationControlSupplementalPolicy with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsDefenderApplicationControlSupplementalPolicy sourceWindowsDefenderApplicationControlSupplementalPolicy, final ICallback<WindowsDefenderApplicationControlSupplementalPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsDefenderApplicationControlSupplementalPolicy);
    }

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicy with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicy the source object with updates
     * @return the updated WindowsDefenderApplicationControlSupplementalPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsDefenderApplicationControlSupplementalPolicy patch(final WindowsDefenderApplicationControlSupplementalPolicy sourceWindowsDefenderApplicationControlSupplementalPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsDefenderApplicationControlSupplementalPolicy);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicy with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy, final ICallback<WindowsDefenderApplicationControlSupplementalPolicy> callback) {
        send(HttpMethod.POST, callback, newWindowsDefenderApplicationControlSupplementalPolicy);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicy with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicy the new object to create
     * @return the created WindowsDefenderApplicationControlSupplementalPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsDefenderApplicationControlSupplementalPolicy post(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy) throws ClientException {
        return send(HttpMethod.POST, newWindowsDefenderApplicationControlSupplementalPolicy);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicy with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy, final ICallback<WindowsDefenderApplicationControlSupplementalPolicy> callback) {
        send(HttpMethod.PUT, callback, newWindowsDefenderApplicationControlSupplementalPolicy);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicy with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicy the object to create/update
     * @return the created WindowsDefenderApplicationControlSupplementalPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsDefenderApplicationControlSupplementalPolicy put(final WindowsDefenderApplicationControlSupplementalPolicy newWindowsDefenderApplicationControlSupplementalPolicy) throws ClientException {
        return send(HttpMethod.PUT, newWindowsDefenderApplicationControlSupplementalPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsDefenderApplicationControlSupplementalPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsDefenderApplicationControlSupplementalPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsDefenderApplicationControlSupplementalPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsDefenderApplicationControlSupplementalPolicyRequest)this;
     }

}

