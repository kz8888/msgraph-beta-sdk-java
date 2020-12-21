// Template Source: IBaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOAuth2PermissionGrantDeltaCollectionRequestBuilder;
import com.google.gson.JsonObject;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the OAuth2Permission Grant Delta Collection Page.
 */
public interface IOAuth2PermissionGrantDeltaCollectionPage extends IBaseCollectionPage<OAuth2PermissionGrant, IOAuth2PermissionGrantDeltaCollectionRequestBuilder> {
    /**
     * The deltaLink to make future delta requests
     *
     * @return String The deltaLink URL
     */
    public String deltaLink();
}
