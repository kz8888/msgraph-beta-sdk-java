// Template Source: IBaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.extensions.ManagementCondition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagementConditionGetManagementConditionsForPlatformCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Management Condition Get Management Conditions For Platform Collection Request Builder.
 */
public interface IManagementConditionGetManagementConditionsForPlatformCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IManagementConditionGetManagementConditionsForPlatformCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IManagementConditionGetManagementConditionsForPlatformCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
