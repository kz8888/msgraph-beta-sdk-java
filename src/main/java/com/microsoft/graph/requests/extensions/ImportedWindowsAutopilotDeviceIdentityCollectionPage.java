// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentity;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Windows Autopilot Device Identity Collection Page.
 */
public class ImportedWindowsAutopilotDeviceIdentityCollectionPage extends BaseCollectionPage<ImportedWindowsAutopilotDeviceIdentity, IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder> implements IImportedWindowsAutopilotDeviceIdentityCollectionPage {

    /**
     * A collection page for ImportedWindowsAutopilotDeviceIdentity
     *
     * @param response the serialized ImportedWindowsAutopilotDeviceIdentityCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ImportedWindowsAutopilotDeviceIdentityCollectionPage(final ImportedWindowsAutopilotDeviceIdentityCollectionResponse response, final IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
