// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationValueList;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Value List Request.
 */
public class GroupPolicyPresentationValueListRequest extends BaseRequest<GroupPolicyPresentationValueList> {
	
    /**
     * The request for the GroupPolicyPresentationValueList
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationValueListRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationValueList.class);
    }

    /**
     * Gets the GroupPolicyPresentationValueList from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super GroupPolicyPresentationValueList> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyPresentationValueList from the service
     *
     * @return the GroupPolicyPresentationValueList from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationValueList get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super GroupPolicyPresentationValueList> callback) {
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
     * Patches this GroupPolicyPresentationValueList with a source
     *
     * @param sourceGroupPolicyPresentationValueList the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final GroupPolicyPresentationValueList sourceGroupPolicyPresentationValueList, @Nonnull final ICallback<? super GroupPolicyPresentationValueList> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyPresentationValueList);
    }

    /**
     * Patches this GroupPolicyPresentationValueList with a source
     *
     * @param sourceGroupPolicyPresentationValueList the source object with updates
     * @return the updated GroupPolicyPresentationValueList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationValueList patch(@Nonnull final GroupPolicyPresentationValueList sourceGroupPolicyPresentationValueList) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationValueList);
    }

    /**
     * Creates a GroupPolicyPresentationValueList with a new object
     *
     * @param newGroupPolicyPresentationValueList the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final GroupPolicyPresentationValueList newGroupPolicyPresentationValueList, @Nonnull final ICallback<? super GroupPolicyPresentationValueList> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyPresentationValueList);
    }

    /**
     * Creates a GroupPolicyPresentationValueList with a new object
     *
     * @param newGroupPolicyPresentationValueList the new object to create
     * @return the created GroupPolicyPresentationValueList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationValueList post(@Nonnull final GroupPolicyPresentationValueList newGroupPolicyPresentationValueList) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationValueList);
    }

    /**
     * Creates a GroupPolicyPresentationValueList with a new object
     *
     * @param newGroupPolicyPresentationValueList the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final GroupPolicyPresentationValueList newGroupPolicyPresentationValueList, @Nonnull final ICallback<? super GroupPolicyPresentationValueList> callback) {
        send(HttpMethod.PUT, callback, newGroupPolicyPresentationValueList);
    }

    /**
     * Creates a GroupPolicyPresentationValueList with a new object
     *
     * @param newGroupPolicyPresentationValueList the object to create/update
     * @return the created GroupPolicyPresentationValueList
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public GroupPolicyPresentationValueList put(@Nonnull final GroupPolicyPresentationValueList newGroupPolicyPresentationValueList) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyPresentationValueList);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public GroupPolicyPresentationValueListRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public GroupPolicyPresentationValueListRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

