// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentityUpload;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityCollectionRequest;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Windows Autopilot Device Identity Collection Request Builder.
 */
public class ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder extends BaseRequestBuilder implements IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder {

    /**
     * The request builder for this collection of ImportedWindowsAutopilotDeviceIdentityUpload
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedWindowsAutopilotDeviceIdentityCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedWindowsAutopilotDeviceIdentityCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ImportedWindowsAutopilotDeviceIdentityCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IImportedWindowsAutopilotDeviceIdentityRequestBuilder byId(final String id) {
        return new ImportedWindowsAutopilotDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder msgraphImport(final java.util.List<ImportedWindowsAutopilotDeviceIdentity> importedWindowsAutopilotDeviceIdentities) {
        return new ImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.import"), getClient(), null, importedWindowsAutopilotDeviceIdentities);
    }
}
