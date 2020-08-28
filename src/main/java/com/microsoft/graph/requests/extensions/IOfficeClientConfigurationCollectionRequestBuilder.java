// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeConfiguration;
import com.microsoft.graph.models.extensions.OfficeClientConfiguration;
import com.microsoft.graph.models.extensions.OfficeClientConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationCollectionRequest;
import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationUpdatePrioritiesRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office Client Configuration Collection Request Builder.
 */
public interface IOfficeClientConfigurationCollectionRequestBuilder extends IRequestBuilder {

    IOfficeClientConfigurationCollectionRequest buildRequest();

    IOfficeClientConfigurationCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IOfficeClientConfigurationRequestBuilder byId(final String id);

    IOfficeClientConfigurationUpdatePrioritiesRequestBuilder updatePriorities(final java.util.List<String> officeConfigurationPolicyIds, final java.util.List<Integer> officeConfigurationPriorities);
}