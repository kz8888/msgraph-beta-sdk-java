// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyAssignCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyAssignCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Assign Collection Request Builder.
 */
public class DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder extends BaseActionRequestBuilder implements IDeviceManagementConfigurationPolicyAssignCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagementConfigurationPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public DeviceManagementConfigurationPolicyAssignCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<DeviceManagementConfigurationPolicyAssignment> assignments) {
        super(requestUrl, client, requestOptions);
  	 if(assignments!=null){
			bodyParams.put("assignments", assignments);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceManagementConfigurationPolicyAssignCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceManagementConfigurationPolicyAssignCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementConfigurationPolicyAssignCollectionRequest request = new DeviceManagementConfigurationPolicyAssignCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }
  
        return request;
    }
}
