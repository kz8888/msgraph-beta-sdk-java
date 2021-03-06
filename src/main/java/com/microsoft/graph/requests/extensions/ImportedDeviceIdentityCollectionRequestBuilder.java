// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ImportedDeviceIdentity;
import com.microsoft.graph.models.extensions.ImportedDeviceIdentityResult;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityCollectionRequest;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityImportDeviceIdentityListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Device Identity Collection Request Builder.
 */
public class ImportedDeviceIdentityCollectionRequestBuilder extends BaseRequestBuilder implements IImportedDeviceIdentityCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedDeviceIdentityCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedDeviceIdentityCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedDeviceIdentityCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ImportedDeviceIdentityCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IImportedDeviceIdentityRequestBuilder byId(final String id) {
        return new ImportedDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IImportedDeviceIdentityImportDeviceIdentityListCollectionRequestBuilder importDeviceIdentityList(final java.util.List<ImportedDeviceIdentity> importedDeviceIdentities, final Boolean overwriteImportedDeviceIdentities) {
        return new ImportedDeviceIdentityImportDeviceIdentityListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.importDeviceIdentityList"), getClient(), null, importedDeviceIdentities, overwriteImportedDeviceIdentities);
    }

    public IImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder searchExistingIdentities(final java.util.List<ImportedDeviceIdentity> importedDeviceIdentities) {
        return new ImportedDeviceIdentitySearchExistingIdentitiesCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.searchExistingIdentities"), getClient(), null, importedDeviceIdentities);
    }
}
