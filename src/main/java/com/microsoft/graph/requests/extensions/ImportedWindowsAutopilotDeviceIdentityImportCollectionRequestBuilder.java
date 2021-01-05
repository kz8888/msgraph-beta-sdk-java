// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityImportCollectionRequest;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityImportCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Windows Autopilot Device Identity Import Collection Request Builder.
 */
public class ImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder extends BaseActionRequestBuilder implements IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder {

    /**
     * The request builder for this collection of ImportedWindowsAutopilotDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param importedWindowsAutopilotDeviceIdentities the importedWindowsAutopilotDeviceIdentities
     */
    public ImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<ImportedWindowsAutopilotDeviceIdentity> importedWindowsAutopilotDeviceIdentities) {
        super(requestUrl, client, requestOptions);
  	 if(importedWindowsAutopilotDeviceIdentities!=null){
			bodyParams.put("importedWindowsAutopilotDeviceIdentities", importedWindowsAutopilotDeviceIdentities);
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedWindowsAutopilotDeviceIdentityImportCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedWindowsAutopilotDeviceIdentityImportCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ImportedWindowsAutopilotDeviceIdentityImportCollectionRequest request = new ImportedWindowsAutopilotDeviceIdentityImportCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("importedWindowsAutopilotDeviceIdentities")) {
            request.body.importedWindowsAutopilotDeviceIdentities = getParameter("importedWindowsAutopilotDeviceIdentities");
        }
  
        return request;
    }
}
