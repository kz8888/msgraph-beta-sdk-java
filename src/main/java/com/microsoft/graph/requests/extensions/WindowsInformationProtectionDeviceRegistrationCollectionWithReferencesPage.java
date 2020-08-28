// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationCollectionResponse;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration Collection With References Page.
 */
public class WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesPage extends BaseCollectionPage<WindowsInformationProtectionDeviceRegistration, IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder> implements IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesPage {

    /**
     * A collection page for WindowsInformationProtectionDeviceRegistration
     *
     * @param response the serialized WindowsInformationProtectionDeviceRegistrationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsInformationProtectionDeviceRegistrationCollectionWithReferencesPage(final WindowsInformationProtectionDeviceRegistrationCollectionResponse response, final IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder);
    }
}