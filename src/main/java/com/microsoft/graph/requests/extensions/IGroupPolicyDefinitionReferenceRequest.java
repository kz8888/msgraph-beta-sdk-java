// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinition;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GroupPolicyDefinition;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Definition Reference Request.
 */
public interface IGroupPolicyDefinitionReferenceRequest extends IHttpRequest {

    void delete(final ICallback<GroupPolicyDefinition> callback);

    GroupPolicyDefinition delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyDefinitionReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyDefinitionReferenceRequest expand(final String value);

    /**
     * Puts the GroupPolicyDefinition
     *
     * @param srcGroupPolicyDefinition the GroupPolicyDefinition to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(GroupPolicyDefinition srcGroupPolicyDefinition, final ICallback<GroupPolicyDefinition> callback);

    /**
     * Puts the GroupPolicyDefinition
     *
     * @param srcGroupPolicyDefinition the GroupPolicyDefinition to PUT
     * @return the GroupPolicyDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    GroupPolicyDefinition put(GroupPolicyDefinition srcGroupPolicyDefinition) throws ClientException;
}
