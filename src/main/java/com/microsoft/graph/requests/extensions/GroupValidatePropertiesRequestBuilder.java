// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.GroupValidatePropertiesRequest;
import com.microsoft.graph.models.extensions.Group;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.extensions.GroupValidatePropertiesParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Validate Properties Request Builder.
 */
public class GroupValidatePropertiesRequestBuilder extends BaseActionRequestBuilder<Group> {

    private GroupValidatePropertiesParameterSet body;
    /**
     * The request builder for this GroupValidateProperties
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public GroupValidatePropertiesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final GroupValidatePropertiesParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the GroupValidatePropertiesRequest
     *
     * @param requestOptions the options for the request
     * @return the GroupValidatePropertiesRequest instance
     */
    @Nonnull
    public GroupValidatePropertiesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the GroupValidatePropertiesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the GroupValidatePropertiesRequest instance
     */
    @Nonnull
    public GroupValidatePropertiesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupValidatePropertiesRequest request = new GroupValidatePropertiesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions,
                this.body
        );

            return request;
    }
}
