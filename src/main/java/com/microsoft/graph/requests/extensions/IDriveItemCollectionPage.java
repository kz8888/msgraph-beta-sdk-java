// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import com.microsoft.graph.models.extensions.ItemReference;
import com.microsoft.graph.models.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.models.extensions.UploadSession;
import com.microsoft.graph.models.extensions.DriveRecipient;
import com.microsoft.graph.models.extensions.Permission;
import com.microsoft.graph.models.extensions.ItemPreviewInfo;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.microsoft.graph.requests.extensions.IDriveItemCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Drive Item Collection Page.
 */
public interface IDriveItemCollectionPage extends IBaseCollectionPage<DriveItem, IDriveItemCollectionRequestBuilder> {
}
