// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileHasPayloadLinksCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileHasPayloadLinksCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Deployment Profile Has Payload Links Collection Page.
 */
public class WindowsAutopilotDeploymentProfileHasPayloadLinksCollectionPage extends BaseCollectionPage<HasPayloadLinkResultItem, IWindowsAutopilotDeploymentProfileHasPayloadLinksCollectionRequestBuilder> implements IWindowsAutopilotDeploymentProfileHasPayloadLinksCollectionPage {

    /**
     * A collection page for HasPayloadLinkResultItem.
     *
     * @param response The serialized WindowsAutopilotDeploymentProfileHasPayloadLinksCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public WindowsAutopilotDeploymentProfileHasPayloadLinksCollectionPage(final WindowsAutopilotDeploymentProfileHasPayloadLinksCollectionResponse response, final IWindowsAutopilotDeploymentProfileHasPayloadLinksCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
