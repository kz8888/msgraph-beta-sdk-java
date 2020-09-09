// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MacOSCompliancePolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSCompliance Policy Request.
 */
public interface IMacOSCompliancePolicyRequest extends IHttpRequest {

    /**
     * Gets the MacOSCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MacOSCompliancePolicy> callback);

    /**
     * Gets the MacOSCompliancePolicy from the service
     *
     * @return the MacOSCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCompliancePolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MacOSCompliancePolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MacOSCompliancePolicy with a source
     *
     * @param sourceMacOSCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MacOSCompliancePolicy sourceMacOSCompliancePolicy, final ICallback<MacOSCompliancePolicy> callback);

    /**
     * Patches this MacOSCompliancePolicy with a source
     *
     * @param sourceMacOSCompliancePolicy the source object with updates
     * @return the updated MacOSCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCompliancePolicy patch(final MacOSCompliancePolicy sourceMacOSCompliancePolicy) throws ClientException;

    /**
     * Posts a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MacOSCompliancePolicy newMacOSCompliancePolicy, final ICallback<MacOSCompliancePolicy> callback);

    /**
     * Posts a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the new object to create
     * @return the created MacOSCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCompliancePolicy post(final MacOSCompliancePolicy newMacOSCompliancePolicy) throws ClientException;

    /**
     * Posts a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MacOSCompliancePolicy newMacOSCompliancePolicy, final ICallback<MacOSCompliancePolicy> callback);

    /**
     * Posts a MacOSCompliancePolicy with a new object
     *
     * @param newMacOSCompliancePolicy the object to create/update
     * @return the created MacOSCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MacOSCompliancePolicy put(final MacOSCompliancePolicy newMacOSCompliancePolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMacOSCompliancePolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMacOSCompliancePolicyRequest expand(final String value);

}

