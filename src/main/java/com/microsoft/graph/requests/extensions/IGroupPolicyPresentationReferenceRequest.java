// Template Source: IBaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyPresentation;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GroupPolicyPresentation;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Presentation Reference Request.
 */
public interface IGroupPolicyPresentationReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super GroupPolicyPresentation> callback);

    GroupPolicyPresentation delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyPresentationReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyPresentationReferenceRequest expand(final String value);

    /**
     * Puts the GroupPolicyPresentation
     *
     * @param srcGroupPolicyPresentation the GroupPolicyPresentation to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(GroupPolicyPresentation srcGroupPolicyPresentation, final ICallback<? super GroupPolicyPresentation> callback);

    /**
     * Puts the GroupPolicyPresentation
     *
     * @param srcGroupPolicyPresentation the GroupPolicyPresentation to PUT
     * @return the GroupPolicyPresentation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    GroupPolicyPresentation put(GroupPolicyPresentation srcGroupPolicyPresentation) throws ClientException;
}
