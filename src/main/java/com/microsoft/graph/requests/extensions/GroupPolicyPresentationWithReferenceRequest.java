// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyPresentation;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation With Reference Request.
 */
public class GroupPolicyPresentationWithReferenceRequest extends BaseRequest implements IGroupPolicyPresentationWithReferenceRequest {

    /**
     * The request for the GroupPolicyPresentation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentation.class);
    }

    public void post(final GroupPolicyPresentation newGroupPolicyPresentation, final IJsonBackedObject payload, final ICallback<GroupPolicyPresentation> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public GroupPolicyPresentation post(final GroupPolicyPresentation newGroupPolicyPresentation, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newGroupPolicyPresentation;
        }
        return null;
    }

    public void get(final ICallback<GroupPolicyPresentation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public GroupPolicyPresentation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<GroupPolicyPresentation> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final GroupPolicyPresentation sourceGroupPolicyPresentation, final ICallback<GroupPolicyPresentation> callback) {
		send(HttpMethod.PATCH, callback, sourceGroupPolicyPresentation);
	}

	public GroupPolicyPresentation patch(final GroupPolicyPresentation sourceGroupPolicyPresentation) throws ClientException {
		return send(HttpMethod.PATCH, sourceGroupPolicyPresentation);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyPresentationWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IGroupPolicyPresentationWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyPresentationWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyPresentationWithReferenceRequest)this;
    }
}