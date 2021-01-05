// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyConfiguration;
import com.microsoft.graph.models.extensions.GroupPolicyConfigurationAssignment;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionValue;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionValueRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionValueRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Request.
 */
public class GroupPolicyConfigurationRequest extends BaseRequest implements IGroupPolicyConfigurationRequest {
	
    /**
     * The request for the GroupPolicyConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyConfiguration.class);
    }

    /**
     * Gets the GroupPolicyConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super GroupPolicyConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyConfiguration from the service
     *
     * @return the GroupPolicyConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super GroupPolicyConfiguration> callback) {
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
     * Patches this GroupPolicyConfiguration with a source
     *
     * @param sourceGroupPolicyConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyConfiguration sourceGroupPolicyConfiguration, final ICallback<? super GroupPolicyConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyConfiguration);
    }

    /**
     * Patches this GroupPolicyConfiguration with a source
     *
     * @param sourceGroupPolicyConfiguration the source object with updates
     * @return the updated GroupPolicyConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyConfiguration patch(final GroupPolicyConfiguration sourceGroupPolicyConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyConfiguration);
    }

    /**
     * Creates a GroupPolicyConfiguration with a new object
     *
     * @param newGroupPolicyConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyConfiguration newGroupPolicyConfiguration, final ICallback<? super GroupPolicyConfiguration> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyConfiguration);
    }

    /**
     * Creates a GroupPolicyConfiguration with a new object
     *
     * @param newGroupPolicyConfiguration the new object to create
     * @return the created GroupPolicyConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyConfiguration post(final GroupPolicyConfiguration newGroupPolicyConfiguration) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyConfiguration);
    }

    /**
     * Creates a GroupPolicyConfiguration with a new object
     *
     * @param newGroupPolicyConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GroupPolicyConfiguration newGroupPolicyConfiguration, final ICallback<? super GroupPolicyConfiguration> callback) {
        send(HttpMethod.PUT, callback, newGroupPolicyConfiguration);
    }

    /**
     * Creates a GroupPolicyConfiguration with a new object
     *
     * @param newGroupPolicyConfiguration the object to create/update
     * @return the created GroupPolicyConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyConfiguration put(final GroupPolicyConfiguration newGroupPolicyConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyConfigurationRequest)this;
     }

}

