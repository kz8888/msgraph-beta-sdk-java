// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyCategory;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Category Reference Request.
 */
public class GroupPolicyCategoryReferenceRequest extends BaseReferenceRequest<GroupPolicyCategory> {

    /**
     * The request for the GroupPolicyCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyCategoryReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyCategory.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public GroupPolicyCategoryReferenceRequest select(@Nonnull final String value) {
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
    public GroupPolicyCategoryReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the GroupPolicyCategory
     *
     * @param srcGroupPolicyCategory the GroupPolicyCategory reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final GroupPolicyCategory srcGroupPolicyCategory, @Nonnull final ICallback<? super GroupPolicyCategory> callback) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/deviceManagement/groupPolicyCategories/" + srcGroupPolicyCategory.id));
        send(HttpMethod.PUT, callback, payload);
    }

    /**
     * Puts the GroupPolicyCategory
     *
     * @param srcGroupPolicyCategory the GroupPolicyCategory reference to PUT
     * @return the GroupPolicyCategory
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public GroupPolicyCategory put(@Nonnull final GroupPolicyCategory srcGroupPolicyCategory) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/deviceManagement/groupPolicyCategories/" + srcGroupPolicyCategory.id));
        return send(HttpMethod.PUT, payload);
    }
}
