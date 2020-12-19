// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeClientConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationAssignCollectionRequest;
import com.microsoft.graph.requests.extensions.OfficeClientConfigurationAssignCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Configuration Assign Collection Request Builder.
 */
public class OfficeClientConfigurationAssignCollectionRequestBuilder extends BaseActionRequestBuilder implements IOfficeClientConfigurationAssignCollectionRequestBuilder {

    /**
     * The request builder for this collection of OfficeClientConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param officeConfigurationAssignments the officeConfigurationAssignments
     */
    public OfficeClientConfigurationAssignCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<OfficeClientConfigurationAssignment> officeConfigurationAssignments) {
        super(requestUrl, client, requestOptions);
  	 if(officeConfigurationAssignments!=null){
			bodyParams.put("officeConfigurationAssignments", officeConfigurationAssignments);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOfficeClientConfigurationAssignCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOfficeClientConfigurationAssignCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        OfficeClientConfigurationAssignCollectionRequest request = new OfficeClientConfigurationAssignCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("officeConfigurationAssignments")) {
            request.body.officeConfigurationAssignments = getParameter("officeConfigurationAssignments");
        }
  
        return request;
    }
}
