// Template Source: IBaseEntityCollectionReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrinterShare;
import com.microsoft.graph.models.extensions.Group;
import com.microsoft.graph.models.extensions.AssignedLicense;
import com.microsoft.graph.models.extensions.ResourceSpecificPermissionGrant;
import com.microsoft.graph.models.extensions.EvaluateDynamicMembershipResult;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.Group;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Collection Reference Request.
 */
public interface IGroupCollectionReferenceRequest {

    void post(final Group newGroup, final ICallback<? super Group> callback);

    Group post(final Group newGroup) throws ClientException;

    IGroupCollectionReferenceRequest select(final String value);

    IGroupCollectionReferenceRequest top(final int value);

}
