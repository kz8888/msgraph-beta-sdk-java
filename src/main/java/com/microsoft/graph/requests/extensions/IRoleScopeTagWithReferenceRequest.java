// Template Source: IBaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAutoAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Role Scope Tag With Reference Request.
 */
public interface IRoleScopeTagWithReferenceRequest extends IHttpRequest {

    void post(final RoleScopeTag newRoleScopeTag, final IJsonBackedObject payload, final ICallback<? super RoleScopeTag> callback);

    RoleScopeTag post(final RoleScopeTag newRoleScopeTag, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super RoleScopeTag> callback);

    RoleScopeTag get() throws ClientException;

	void delete(final ICallback<? super RoleScopeTag> callback);

	void delete() throws ClientException;

	void patch(final RoleScopeTag sourceRoleScopeTag, final ICallback<? super RoleScopeTag> callback);

	RoleScopeTag patch(final RoleScopeTag sourceRoleScopeTag) throws ClientException;

    IRoleScopeTagWithReferenceRequest select(final String value);

    IRoleScopeTagWithReferenceRequest expand(final String value);

}
