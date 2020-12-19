// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Definition Value With Reference Request.
 */
public interface IGroupPolicyDefinitionValueWithReferenceRequest extends IHttpRequest {

    void post(final GroupPolicyDefinitionValue newGroupPolicyDefinitionValue, final IJsonBackedObject payload, final ICallback<? super GroupPolicyDefinitionValue> callback);

    GroupPolicyDefinitionValue post(final GroupPolicyDefinitionValue newGroupPolicyDefinitionValue, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super GroupPolicyDefinitionValue> callback);

    GroupPolicyDefinitionValue get() throws ClientException;

	void delete(final ICallback<? super GroupPolicyDefinitionValue> callback);

	void delete() throws ClientException;

	void patch(final GroupPolicyDefinitionValue sourceGroupPolicyDefinitionValue, final ICallback<? super GroupPolicyDefinitionValue> callback);

	GroupPolicyDefinitionValue patch(final GroupPolicyDefinitionValue sourceGroupPolicyDefinitionValue) throws ClientException;

    IGroupPolicyDefinitionValueWithReferenceRequest select(final String value);

    IGroupPolicyDefinitionValueWithReferenceRequest expand(final String value);

}
