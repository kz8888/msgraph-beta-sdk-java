// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCustomAttributeShellScript;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DeviceCustomAttributeShellScriptCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Custom Attribute Shell Script Collection Page.
 */
public class DeviceCustomAttributeShellScriptCollectionPage extends BaseCollectionPage<DeviceCustomAttributeShellScript, DeviceCustomAttributeShellScriptCollectionRequestBuilder> {

    /**
     * A collection page for DeviceCustomAttributeShellScript
     *
     * @param response the serialized DeviceCustomAttributeShellScriptCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCustomAttributeShellScriptCollectionPage(@Nonnull final DeviceCustomAttributeShellScriptCollectionResponse response, @Nonnull final DeviceCustomAttributeShellScriptCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceCustomAttributeShellScript
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceCustomAttributeShellScriptCollectionPage(@Nonnull final java.util.List<DeviceCustomAttributeShellScript> pageContents, @Nullable final DeviceCustomAttributeShellScriptCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
