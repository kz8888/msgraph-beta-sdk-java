// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceCustomAttributeShellScriptAssignRequest;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptAssignRequest;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Custom Attribute Shell Script Assign Request Builder.
 */
public class DeviceCustomAttributeShellScriptAssignRequestBuilder extends BaseActionRequestBuilder implements IDeviceCustomAttributeShellScriptAssignRequestBuilder {

    /**
     * The request builder for this DeviceCustomAttributeShellScriptAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param deviceManagementScriptGroupAssignments the deviceManagementScriptGroupAssignments
     * @param deviceManagementScriptAssignments the deviceManagementScriptAssignments
     */
    public DeviceCustomAttributeShellScriptAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<DeviceManagementScriptGroupAssignment> deviceManagementScriptGroupAssignments, final java.util.List<DeviceManagementScriptAssignment> deviceManagementScriptAssignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("deviceManagementScriptGroupAssignments", deviceManagementScriptGroupAssignments);
        bodyParams.put("deviceManagementScriptAssignments", deviceManagementScriptAssignments);
    }

    /**
     * Creates the IDeviceCustomAttributeShellScriptAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceCustomAttributeShellScriptAssignRequest instance
     */
    public IDeviceCustomAttributeShellScriptAssignRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDeviceCustomAttributeShellScriptAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceCustomAttributeShellScriptAssignRequest instance
     */
    public IDeviceCustomAttributeShellScriptAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceCustomAttributeShellScriptAssignRequest request = new DeviceCustomAttributeShellScriptAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("deviceManagementScriptGroupAssignments")) {
            request.body.deviceManagementScriptGroupAssignments = getParameter("deviceManagementScriptGroupAssignments");
        }

        if (hasParameter("deviceManagementScriptAssignments")) {
            request.body.deviceManagementScriptAssignments = getParameter("deviceManagementScriptAssignments");
        }

        return request;
    }
}
