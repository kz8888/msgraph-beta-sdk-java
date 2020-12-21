// Template Source: BaseEntityWithReferenceRequest.java.tt
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
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag With Reference Request.
 */
public class RoleScopeTagWithReferenceRequest extends BaseRequest implements IRoleScopeTagWithReferenceRequest {

    /**
     * The request for the RoleScopeTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleScopeTagWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoleScopeTag.class);
    }

    public void post(final RoleScopeTag newRoleScopeTag, final IJsonBackedObject payload, final ICallback<? super RoleScopeTag> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public RoleScopeTag post(final RoleScopeTag newRoleScopeTag, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newRoleScopeTag;
        }
        return null;
    }

    public void get(final ICallback<? super RoleScopeTag> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public RoleScopeTag get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<? super RoleScopeTag> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final RoleScopeTag sourceRoleScopeTag, final ICallback<? super RoleScopeTag> callback) {
		send(HttpMethod.PATCH, callback, sourceRoleScopeTag);
	}

	public RoleScopeTag patch(final RoleScopeTag sourceRoleScopeTag) throws ClientException {
		return send(HttpMethod.PATCH, sourceRoleScopeTag);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRoleScopeTagWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IRoleScopeTagWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRoleScopeTagWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (RoleScopeTagWithReferenceRequest)this;
    }
}
