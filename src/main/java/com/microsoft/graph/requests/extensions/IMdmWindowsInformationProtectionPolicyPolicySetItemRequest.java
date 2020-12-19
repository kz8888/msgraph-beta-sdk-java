// Template Source: IBaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MdmWindowsInformationProtectionPolicyPolicySetItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mdm Windows Information Protection Policy Policy Set Item Request.
 */
public interface IMdmWindowsInformationProtectionPolicyPolicySetItemRequest extends IHttpRequest {

    /**
     * Gets the MdmWindowsInformationProtectionPolicyPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super MdmWindowsInformationProtectionPolicyPolicySetItem> callback);

    /**
     * Gets the MdmWindowsInformationProtectionPolicyPolicySetItem from the service
     *
     * @return the MdmWindowsInformationProtectionPolicyPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MdmWindowsInformationProtectionPolicyPolicySetItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super MdmWindowsInformationProtectionPolicyPolicySetItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MdmWindowsInformationProtectionPolicyPolicySetItem with a source
     *
     * @param sourceMdmWindowsInformationProtectionPolicyPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MdmWindowsInformationProtectionPolicyPolicySetItem sourceMdmWindowsInformationProtectionPolicyPolicySetItem, final ICallback<? super MdmWindowsInformationProtectionPolicyPolicySetItem> callback);

    /**
     * Patches this MdmWindowsInformationProtectionPolicyPolicySetItem with a source
     *
     * @param sourceMdmWindowsInformationProtectionPolicyPolicySetItem the source object with updates
     * @return the updated MdmWindowsInformationProtectionPolicyPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MdmWindowsInformationProtectionPolicyPolicySetItem patch(final MdmWindowsInformationProtectionPolicyPolicySetItem sourceMdmWindowsInformationProtectionPolicyPolicySetItem) throws ClientException;

    /**
     * Posts a MdmWindowsInformationProtectionPolicyPolicySetItem with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicyPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MdmWindowsInformationProtectionPolicyPolicySetItem newMdmWindowsInformationProtectionPolicyPolicySetItem, final ICallback<? super MdmWindowsInformationProtectionPolicyPolicySetItem> callback);

    /**
     * Posts a MdmWindowsInformationProtectionPolicyPolicySetItem with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicyPolicySetItem the new object to create
     * @return the created MdmWindowsInformationProtectionPolicyPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MdmWindowsInformationProtectionPolicyPolicySetItem post(final MdmWindowsInformationProtectionPolicyPolicySetItem newMdmWindowsInformationProtectionPolicyPolicySetItem) throws ClientException;

    /**
     * Posts a MdmWindowsInformationProtectionPolicyPolicySetItem with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicyPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MdmWindowsInformationProtectionPolicyPolicySetItem newMdmWindowsInformationProtectionPolicyPolicySetItem, final ICallback<? super MdmWindowsInformationProtectionPolicyPolicySetItem> callback);

    /**
     * Posts a MdmWindowsInformationProtectionPolicyPolicySetItem with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicyPolicySetItem the object to create/update
     * @return the created MdmWindowsInformationProtectionPolicyPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MdmWindowsInformationProtectionPolicyPolicySetItem put(final MdmWindowsInformationProtectionPolicyPolicySetItem newMdmWindowsInformationProtectionPolicyPolicySetItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMdmWindowsInformationProtectionPolicyPolicySetItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMdmWindowsInformationProtectionPolicyPolicySetItemRequest expand(final String value);

}

